/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 09/28/2024 
 * File Name: DelieveryRequest.java 
 * Description: This interface is responsible for the delivery request
 */

package edu.bu.met.cs665.deliveryrequest;

import edu.bu.met.cs665.driver.DriverInterface;
import edu.bu.met.cs665.shop.ShopInterface;

/**
 * This class is responsible for delievery request.
 */
public class DeliveryRequest {
  private ShopInterface shop;
  private DriverInterface driver;
  private String address;

  /**
   * Constructor for deliveryrequest.
   */
  public DeliveryRequest(ShopInterface shop, String address) {
    this(shop, null, address);
  }

  /**
   * Constructor for deliveryrequest.
   */
  public DeliveryRequest(ShopInterface shop, DriverInterface driver, String address) {
    this.shop = shop;
    this.driver = driver;
    this.address = address;
  }

  /**
   * Getter method for address.
   * 
   * @return the adress
   */
  public String getAddress() {
    return address;
  }

  /**
   * Setter method for address.
   *
   * @param address adress for delievery
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Getter method for driver.
   * 
   * @return the driver
   */
  public DriverInterface getDriver() {
    return driver;
  }

  /**
   * Setter method for driver.
   * 
   * @param driver driver who is taking the request
   */
  public void setDriver(DriverInterface driver) {
    this.driver = driver;
  }

  /**
   * Getter method for shop.
   * 
   * @return the shop
   */
  public ShopInterface getShop() {
    return shop;
  }

  /**
   * Setter method for shop.
   * 
   * @param shop shop that is sending out the request
   */
  public void setShop(ShopInterface shop) {
    this.shop = shop;
  }

  @Override
  public String toString() {
    return "Deliver to " + address + " from " + shop + " by " + driver;
  }
}
