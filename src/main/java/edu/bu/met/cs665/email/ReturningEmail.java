/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/09/2024 
 * File Name: ReturningEmail.java 
 * Description: This class is responsible for the email for returning customer
 */

package edu.bu.met.cs665.email;

/**
 * This class is responsible to create email for returning customer.
 */
public class ReturningEmail implements EmailInterface {
  /**
   * generate email for returning customer.
   */
  @Override
  public String generateEmail() {
    return "Welcome back...";
  }
}
 