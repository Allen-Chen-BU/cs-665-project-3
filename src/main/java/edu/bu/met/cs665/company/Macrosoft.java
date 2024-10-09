package edu.bu.met.cs665.company;

import edu.bu.met.cs665.email.EmailTypes;

public class Macrosoft extends Company {

    public Macrosoft() {
        emailType = EmailTypes.FREQUENT.getEmail();
    }
}
