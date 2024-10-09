/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 09/28/2024 
 * File Name: Restaurant.java 
 * Description: This class is responsible for the restaurants
 */

package edu.bu.met.cs665.shop;

import edu.bu.met.cs665.deliveryrequest.DeliveryRequest;
import edu.bu.met.cs665.driver.DriverInterface;
import java.util.ArrayList;

/**
 * This class is responsible for representing a restaurant.
 */
public class Restaurant implements ShopInterface {
  private String name;
  private ArrayList<DriverInterface> drivers = new ArrayList<>();

  public Restaurant(String name) {
    this.name = name;
  }

  /**
   * Getter method for name.
   * 
   * @return restaurant name
   */
  public String getName() {
    return name;
  }

  /**
   * Setter method for name.
   * 
   * @param name name for a restaurant
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void registerDriver(DriverInterface driver) {
    if (drivers.contains(driver)) {
      return;
    }
    drivers.add(driver);
  }

  @Override
  public void removeDriver(DriverInterface driver) {
    if (drivers.contains(driver)) {
      drivers.remove(driver);
    }
  }

  @Override
  public void notifyDrivers(DeliveryRequest deliveryRequest) {
    for (DriverInterface driver : drivers) {
      driver.receiveNotify(deliveryRequest);
    }
  }

  @Override
  public String toString() {
    return name;
  }
}
