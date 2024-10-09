/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 10/09/2024 
 * File Name: EmailTypes.java 
 * Description: This enum class represent the different types of emails
 */

package edu.bu.met.cs665.email;

/**
 * This enum class include all different types of emails for customer.
 */
public enum EmailTypes {
    BUSINESS(new BusinessEmail()),
    FREQUENT(new FrequentEmail()),
    NEW(new NewEmail()),
    RETURNING(new ReturningEmail()),
    VIP(new VIPEmail());

    private EmailInterface email;

    private EmailTypes(EmailInterface email) {
        this.email = email;
    }

    /**
     * getter method for email.
     * 
     * @return an email class that generate email
     */
    public EmailInterface getEmail() {
        return email;
    }
}
