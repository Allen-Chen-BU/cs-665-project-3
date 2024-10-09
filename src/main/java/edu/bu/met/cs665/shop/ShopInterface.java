/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 09/28/2024 
 * File Name: ShopInterface.java 
 * Description: This interface is responsible for the shop and subject in observer pattern
 */

package edu.bu.met.cs665.shop;

import edu.bu.met.cs665.deliveryrequest.DeliveryRequest;
import edu.bu.met.cs665.driver.DriverInterface;

/**
 * This is the shop interface. This class is responsible for representing a shop.
 */
public interface ShopInterface {
  /**
   * Register to a shop to listen to its notify.
   * 
   * @param driver a driver that listen for the delivery request
   */
  public void registerDriver(DriverInterface driver);

  /**
   * Stop listening the notification from the shop.
   * 
   * @param driver a driver that no longer listen for the delivery request
   */
  public void removeDriver(DriverInterface driver);

  /**
   * Notify the driver the incoming delievery request.
   * 
   * @param deliveryRequest delivery request to be notified
   */
  public void notifyDrivers(DeliveryRequest deliveryRequest);

  /**
   * Represent a shop in String.
   * 
   * @return a string that represent a shop
   */
  @Override
  public String toString();
}
