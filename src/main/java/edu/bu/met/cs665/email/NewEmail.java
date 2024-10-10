/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/09/2024 
 * File Name: NewEmail.java 
 * Description: This class is responsible for the email for new customer
 */

package edu.bu.met.cs665.email;

/**
 * This class is responsible to create email for new customer.
 */
public class NewEmail implements EmailInterface {
  /**
   * generate email for new customer.
   */
  @Override
  public String generateEmail() {
    return "Nice to meet you...";
  }
}
 