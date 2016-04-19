package Rental_System;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Flagg
 */
public class Mail {

    final private String username = "Simmigon.flagg@gmail.com";
    final private String password = "CabbageNjc92";

    private Properties myMailProp = new Properties();

    public boolean email(String validateEmail) {
        if (true) {

            return true;
        } else {
            return false;
        }
    }

public void mailReport(String email, String FullName ,String location ,String aptNumber) {
        final String username = "Simmigonflagg@gmail.com";
        final String password = "CabbageNjc92";

        Properties myMailProp = new Properties();
        myMailProp.put("mail.smtp.auth", "true");
        myMailProp.put("mail.smtp.starttls.enable", "true");
        myMailProp.put("mail.smtp.host", "smtp.gmail.com");
        myMailProp.put("mail.smtp.port", "587");
        Session session = Session.getDefaultInstance(myMailProp,
                new javax.mail.Authenticator() {
                    //   @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);

                    }

                });
        try {
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress("Simmigonflagg@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    //This is hardcoded 
                    //but of course it won't be in the final
                    //version of this app
                    InternetAddress.parse(email));

            message.setSubject("This was done with java code.");
            message.setContent("<h1>From Google!</h1>", "text/html; charset=utf-8");
            message.setText("Congrats,\nName:\t"+ FullName +"\n" +"Location:\t"+ location +"\nUnit:\t"+ aptNumber);

            Transport.send(message);

            System.out.println("The code ran.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
