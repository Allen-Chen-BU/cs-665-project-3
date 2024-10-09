package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.company.Macrosoft;
import edu.bu.met.cs665.email.EmailTypes;

/**
 * Write some Unit tests for your program like the examples below.
 */
public class TestEmail {
    public TestEmail() {
    }

    @Test
    public void testEmail() {
        Macrosoft macrosoft = new Macrosoft();
        assertEquals(EmailTypes.FREQUENT.getEmail().generateEmail(), macrosoft.generateEmail());
    }

    @Test
    public void testChangeEmail() {
        Macrosoft macrosoft = new Macrosoft();
        macrosoft.changeCustomerGroup(EmailTypes.BUSINESS.getEmail());
        assertEquals(EmailTypes.BUSINESS.getEmail().generateEmail(), macrosoft.generateEmail());
    }

    @Test
    public void testCraetingAllEmail() {
        Macrosoft macrosoft = new Macrosoft();
        assertEquals(EmailTypes.FREQUENT.getEmail().generateEmail(), macrosoft.generateEmail());

        macrosoft.changeCustomerGroup(EmailTypes.BUSINESS.getEmail());
        assertEquals(EmailTypes.BUSINESS.getEmail().generateEmail(), macrosoft.generateEmail());

        macrosoft.changeCustomerGroup(EmailTypes.NEW.getEmail());
        assertEquals(EmailTypes.NEW.getEmail().generateEmail(), macrosoft.generateEmail());

        macrosoft.changeCustomerGroup(EmailTypes.RETURNING.getEmail());
        assertEquals(EmailTypes.RETURNING.getEmail().generateEmail(), macrosoft.generateEmail());

        macrosoft.changeCustomerGroup(EmailTypes.VIP.getEmail());
        assertEquals(EmailTypes.VIP.getEmail().generateEmail(), macrosoft.generateEmail());
    }
}
