/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/09/2024 
 * File Name: BusinessEmail.java 
 * Description: This class is responsible for the email for business customer
 */

package edu.bu.met.cs665.email;

/**
 * This class is responsible to create email for business customer.
 */
public class BusinessEmail implements EmailInterface {
  /**
   * generate email for business customer.
   */
  @Override
  public String generateEmail() {
    return "Dear our partners...";
  }
}
