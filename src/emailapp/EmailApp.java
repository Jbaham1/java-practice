package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Tessica", "Brown");
        em1.setAlternateEmail("tessB4455@icloud.com");
        System.out.println(em1.showInfo() +"\nAlternate Email: "+ em1.getAlternateEmail());

        Email em2 = new Email("Calvin", "Clien");
        em1.setAlternateEmail("CC22114@icloud.com");
        System.out.println(em1.showInfo() +"\nAlternate Email: "+ em2.getAlternateEmail());

    }
}
