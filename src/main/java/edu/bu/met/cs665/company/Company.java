/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/09/2024 
 * File Name: Company.java 
 * Description: This abstract class is responsible for the company that generates the email
 */

package edu.bu.met.cs665.company;

import edu.bu.met.cs665.email.EmailInterface;

/**
 * This is an abstract class for company.
 */
public abstract class Company {
  public EmailInterface emailType;

  /**
   * Generate email template based on the target customer group.
   */
  public String generateEmail() {
    return emailType.generateEmail();
  }

  /**
   * Switch customer group to generate email template fot the customer group.
   * 
   * @param newEmailType the email type that generate the email for the customer
   */
  public void changeCustomerGroup(EmailInterface newEmailType) {
    emailType = newEmailType;
  }
}
