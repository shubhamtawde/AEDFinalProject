/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail.SendMail;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import java.io.IOException;

/**
 *
 * @author siddharthvaghela
 */
public class SendMail {
    private  final String SENDGRID_API_KEY = "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";

    public  void sendMail(String toEmail) throws IOException {
        Email from = new Email("tesseract221@outlook.com");
        String subject = "Tesseract";
        Email to = new Email(toEmail);
        Content content = new Content("text/plain", "Welcome to subscribing to Tesseract Application!");
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
