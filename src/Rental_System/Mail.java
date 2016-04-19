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

    public void mailReportAccpected(String email, String FullName, String location, String aptNumber) {
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

            message.setSubject("Subject: Welcome to the Luxe Family!");
            message.setContent("<h1>From Google!</h1>", "text/html; charset=utf-8");

            message.setText(
              
                   
                    "\n"
                    + "Email content:\n"
                    + " \n"
                    + " \n"
                    + "Dear: " + FullName + "\n"
                    + " \n"
                    + "We are please to inform you that your application to Luxe Properties Atlanta has been approved."
                    + " We hope you are just as excited as us to make Luxe your new home! "
                    + "Please review your assignments below\n"
                    + " \n"
                    + "Property Location:\t" + location + " \n"
                    + "Unit:\t" + aptNumber + " \n"
                    + " \n"
                    + "A leasing representative will be in contact with you shortly to discuss the details of your lease and move in date and to also answer any questions or concerns you may have.\n"
                    + " \n"
                    + "Thank you for choosing Luxe; We look forward to having you as one of our valued residents.\n"
                    + " \n"
                    + " \n"
                    + " \n"
                    + " \n"
                    + "Regards,\n"
                    + " \n"
                    + " \n"
                    + "Leasing Office\n"
                    + "Luxe Properties Atlanta\n"
                    + "<a href=\"http://apartmentrental.azurewebsites.net/\">Luxepropertiesatlanta.com</a>");

            Transport.send(message);

            System.out.println("The code ran.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void mailReportDeClin(String email, String FullName, String location, String aptNumber) {
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

            message.setSubject("LUXE Decision");
            message.setContent("<h1>LUXE Decision</h1>", "text/html; charset=utf-8");

            message.setText(
                    
                    "<h1>" + FullName + "</h1>\n"
                    + "\n"
                    + "We regret to inform you that your application to Luxe Properties Atlanta could not be approved at this time. \n"
                    + "\n"
                    + "For any inquires regarding this decision please contact us via email at leasing@luxeatl.com. One of our representatives will be more than happy to answer any questions you may have."
                    + " \n"
                    + " \n"
                    + " \n"
                    + " \n"
                    + "Regards,\n"
                    + " \n"
                    + " \n"
                    + "Leasing Office\n"
                    + "Luxe Properties Atlanta\n"
                    + "<a href=\"http://apartmentrental.azurewebsites.net/\">Luxepropertiesatlanta.com</a>");

//                message.setText("Congrats,\nName:\t" + FullName + "\n" + "Location:\t" + location + "\nUnit:\t" + aptNumber);
// 
// 
// 
// 
// 
// 
// 
//Regards,
// 
// 
//Leasing Office
//Luxe Properties Atlanta
//leasing@luxeatl.com
//Luxepropertiesatlanta.com
            Transport.send(message);

            System.out.println("The code ran.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
