/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 09/28/2024 
 * File Name: Driver.java 
 * Description: This class is responsible for the driver
 */

package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.deliveryrequest.DeliveryRequest;
import java.util.ArrayList;

/**
 * This class is responsible for representing a driver.
 */
public class Driver implements DriverInterface {
  private String name;
  private ArrayList<DeliveryRequest> deliveryRequests = new ArrayList<>();
  private DeliveryRequest requestTaking;

  public Driver(String name) {
    this.name = name;
  }

  /**
   * Getter method for name.
   * 
   * @return driver name
   */
  public String getName() {
    return name;
  }

  /**
   * Setter method for name.
   * 
   * @param name name for a driver
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void receiveNotify(DeliveryRequest deliveryRequest) {
    deliveryRequests.add(deliveryRequest);
  }

  /**
   * Getter method for requests received.
   * 
   * @return list of requests
   */
  public ArrayList<DeliveryRequest> getDeliveryRequests() {
    return deliveryRequests;
  }

  /**
   * Getter method for the request taking.
   * 
   * @return request taking
   */
  public DeliveryRequest getRequestTaking() {
    return requestTaking;
  }

  @Override
  public Boolean takeDeliveryRequest(DeliveryRequest deliveryRequest) {
    if (deliveryRequest.getDriver() == null) {
      deliveryRequest.setDriver(this);
      requestTaking = deliveryRequest;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return name;
  }
}
