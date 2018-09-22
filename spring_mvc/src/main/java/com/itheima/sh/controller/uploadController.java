package com.itheima.sh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class uploadController {
    /**
     *
     * @param file 表示接收文件参数,类型是MultipartFile;
     * @return
     * @throws IOException
     */
    @RequestMapping("upload")
    public String upload(@RequestParam("file")MultipartFile file) throws IllegalStateException, IOException {
        if(file != null)
        {
           //复制文件到某个目录
            file.transferTo(new File("D:/IdeaProjects/spring-parent/spring_mvc/src/main/webapp/WEB-INF/upload/"+
                    file.getOriginalFilename()));
        }
        return "redirect:/success.html";
    }
}
