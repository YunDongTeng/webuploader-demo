package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by admin on 2018/2/23.
 */
@RestController
@RequestMapping("/web")
public class FileController {


    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file")MultipartFile[] files, HttpServletRequest request, HttpServletResponse response){

        for(MultipartFile file:files){
            System.out.println(file.getOriginalFilename());

        }
        System.out.println("----------------"+request.getAttributeNames());

        return "success";
    }

    @RequestMapping(value = "/upload2",method = RequestMethod.GET)
    public String upload2(){

        System.out.println("file upload...");

        return "success";
    }
}
