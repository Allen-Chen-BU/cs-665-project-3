/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 09/28/2024 
 * File Name: DriverInterface.java 
 * Description: This interface is responsible for the driver and observer in observer pattern
 */

package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.deliveryrequest.DeliveryRequest;

/**
 * This is the driver interface. This class is responsible for representing a driver.
 */
public interface DriverInterface {
  /**
   * Receive delievery request from a shop.
   * 
   * @param deliveryRequest delivery request to be notified
   */
  public void receiveNotify(DeliveryRequest deliveryRequest);

  /**
   * Attempt to take a request from the received requests.
   * 
   * @param deliveryRequest request
   * @return true if succesfully taken the request, false if the request is already taken
   */
  public Boolean takeDeliveryRequest(DeliveryRequest deliveryRequest);

  /**
   * String to represent a driver.
   * 
   * @return a string that represent a driver
   */
  @Override
  public String toString();
}
