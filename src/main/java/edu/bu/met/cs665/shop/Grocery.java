/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 09/28/2024 
 * File Name: Grocery.java 
 * Description: This class is responsible for the grocery stores
 */

package edu.bu.met.cs665.shop;

import edu.bu.met.cs665.deliveryrequest.DeliveryRequest;
import edu.bu.met.cs665.driver.DriverInterface;
import java.util.ArrayList;

/**
 * This class is responsible for representing a grocery store.
 */
public class Grocery implements ShopInterface {
  private String name;
  private ArrayList<DriverInterface> drivers = new ArrayList<>();

  public Grocery(String name) {
    this.name = name;
  }

  /**
   * Getter method for name.
   * 
   * @return grocery name
   */
  public String getName() {
    return name;
  }

  /**
   * Setter method for name.
   * 
   * @param name name for a grocery store
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void registerDriver(DriverInterface driver) {
    drivers.add(driver);
  }

  @Override
  public void removeDriver(DriverInterface driver) {
    drivers.remove(driver);
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
