/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/job/")
public class JobController {

    @Autowired
    ServletContext context;

    @RequestMapping("form")
    public String form() {
        return "form";
    }

    @RequestMapping("apply")
    public String apply(ModelMap model,
            @RequestParam("fullname") String fullname,
            @RequestParam("image") MultipartFile image) {
        if (image.isEmpty()) {
            model.addAttribute("message", "Vui lòng chọn file !");
        } else {
            try {
                String path = context.getRealPath("/files/" + image.getOriginalFilename());
                image.transferTo(new File(path));
                System.out.println(path);
                model.addAttribute("name", image.getOriginalFilename());
                model.addAttribute("type", image.getContentType());
                model.addAttribute("size", image.getSize());
                return "apply";
            } catch (Exception e) {
                model.addAttribute("message", "Lỗi lưu file !");
            }
        }
        return "form";

    }

}
