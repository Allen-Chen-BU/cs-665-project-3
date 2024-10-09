/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/09/2024 
 * File Name: VIPEmail.java 
 * Description: This class is responsible for the email for VIP customer
 */

 package edu.bu.met.cs665.email;

 /**
  * This class is responsible to create email for VIP customer.
  */
 public class VIPEmail implements EmailInterface {
 
     /**
      * generate email for VIP customer.
      */
     @Override
     public String generateEmail() {
         return "Dear our valued customers...";
     }
     
 }
 