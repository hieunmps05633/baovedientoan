/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Mailer;
import java.io.File;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/mailer2/")
public class Mailer2 {

    @Autowired
    Mailer mailer;

    @RequestMapping("form")
    public String index() {
        return "formmailer";
    }
    @Autowired
	ServletContext context;


    @RequestMapping("send")
    public String send(ModelMap model,
            @RequestParam("from") String from,
            @RequestParam("to") String to,
            @RequestParam("subject") String subject,
            @RequestParam("body") String body,
            @RequestParam("attach") MultipartFile attach) {
        
        try {
// Gửi mail
                    String fileName = attach.getOriginalFilename();
                    String path = context.getRealPath("/files/" + fileName);
                    attach.transferTo(new File(path));
             mailer.send(from, to, subject, body, path, fileName);
            model.addAttribute("message", "Gửi email thành công !");
        } catch (Exception ex) {
            model.addAttribute("message", "Gửi email thất bại !");
        }
        return "formmailer";
    }
}
