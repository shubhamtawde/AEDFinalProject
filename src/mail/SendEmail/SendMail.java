/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail.SendEmail;

/**
 *
 * @author shubham
 */
// using SendGrid's Java Library
// https://github.com/sendgrid/sendgrid-java
import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import java.io.IOException;

public class SendMail {

    private static final String SENDGRID_API_KEY = "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";

    public static void main(String[] args) throws IOException {
        Email from = new Email("grubitapp@outlook.com");
        String subject = "Sending with SendGrid is Fun";
        Email to = new Email("tawde.s@northeastern.edu");
        Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(SENDGRID_API_KEY);
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            throw ex;
        }
    }
}
