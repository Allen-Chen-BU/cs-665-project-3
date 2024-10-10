/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/09/2024 
 * File Name: Macrosoft.java 
 * Description: This is an example class that extends from the company class
 */

package edu.bu.met.cs665.company;

import edu.bu.met.cs665.email.EmailTypes;

/**
 * A class that represent a company called Macrosoft.
 */
public class Macrosoft extends Company {
  public Macrosoft() {
    emailType = EmailTypes.FREQUENT.getEmail();
  }
}
