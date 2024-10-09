package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.deliveryrequest.DeliveryRequest;
import edu.bu.met.cs665.driver.Driver;
import edu.bu.met.cs665.shop.Grocery;
import edu.bu.met.cs665.shop.Restaurant;

/**
 * Write some Unit tests for your program like the examples below.
 */
public class TestShop {
    public TestShop() {
    }

    @Test
    public void testNotify() {
        Restaurant damino = new Restaurant("damino");
        Grocery targot = new Grocery("targot");

        Driver driver1 = new Driver("driver1");
        Driver driver2 = new Driver("driver2");
        Driver driver3 = new Driver("driver3");
        Driver driver4 = new Driver("driver4");
        Driver driver5 = new Driver("driver5");

        damino.registerDriver(driver1);
        damino.registerDriver(driver2);
        damino.registerDriver(driver3);
        damino.registerDriver(driver4);
        damino.registerDriver(driver5);

        targot.registerDriver(driver1);
        targot.registerDriver(driver3);

        DeliveryRequest pizza = new DeliveryRequest(damino, "target st.");
        damino.notifyDrivers(pizza);
        assertEquals(driver1.getDeliveryRequests().get(0), pizza);
        assertEquals(driver2.getDeliveryRequests().get(0), pizza);
        assertEquals(driver3.getDeliveryRequests().get(0), pizza);
        assertEquals(driver4.getDeliveryRequests().get(0), pizza);
        assertEquals(driver5.getDeliveryRequests().get(0), pizza);
        
        DeliveryRequest gift = new DeliveryRequest(targot, "Suprise Dr.");
        targot.notifyDrivers(gift);
        assertEquals(driver1.getDeliveryRequests().size(), 2);
        assertEquals(driver2.getDeliveryRequests().size(), 1);
        assertEquals(driver3.getDeliveryRequests().size(), 2);
        assertEquals(driver1.getDeliveryRequests().get(0), pizza);
        assertEquals(driver1.getDeliveryRequests().get(1), gift);
        assertEquals(driver3.getDeliveryRequests().get(1), gift);
    }

    @Test
    public void testTakeRequest() {
        Restaurant damino = new Restaurant("damino");

        Driver driver1 = new Driver("driver1");
        Driver driver2 = new Driver("driver2");

        damino.registerDriver(driver1);
        damino.registerDriver(driver2);

        DeliveryRequest pizza = new DeliveryRequest(damino, "target st.");
        damino.notifyDrivers(pizza);

        driver1.takeDeliveryRequest(pizza);
        assertEquals(pizza.getDriver(), driver1);
        driver2.takeDeliveryRequest(pizza);
        assertEquals(pizza.getDriver(), driver1);
    }

    @Test
    public void testRemoveDriver() {
        Restaurant damino = new Restaurant("damino");

        Driver driver1 = new Driver("driver1");
        Driver driver2 = new Driver("driver2");

        damino.registerDriver(driver1);
        damino.registerDriver(driver2);

        DeliveryRequest pizza = new DeliveryRequest(damino, "target st.");
        damino.notifyDrivers(pizza);

        damino.removeDriver(driver2);
        DeliveryRequest chicken = new DeliveryRequest(damino, "kfc st.");
        damino.notifyDrivers(chicken);

        assertEquals(driver1.getDeliveryRequests().size(), 2);
        assertEquals(driver2.getDeliveryRequests().size(), 1);
        assertEquals(driver1.getDeliveryRequests().get(1), chicken);
    }
}
