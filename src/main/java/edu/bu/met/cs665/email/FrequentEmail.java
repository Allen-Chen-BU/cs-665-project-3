/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/09/2024 
 * File Name: FrequentEmail.java 
 * Description: This class is responsible for the email for frequent customer
 */

package edu.bu.met.cs665.email;

/**
 * This class is responsible to create email for frequent customer.
 */
public class FrequentEmail implements EmailInterface {
  /**
   * generate email for frequent customer.
   */
  @Override
  public String generateEmail() {
    return "Dear our loyal customers...";
  }
}