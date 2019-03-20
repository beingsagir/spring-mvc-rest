package com.dolovers.springmvcrest.controllers;


import com.dolovers.springmvcrest.services.FileManagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.util.List;

@RequestMapping(FileManagingController.BASE_URL)
public class FileManagingController {

    public static final String BASE_URL = "/api/v1/files";

    @Autowired
    FileManagingService fileManagingService;

    @PostMapping
    Boolean uploadFiles(){
        File file = new File("");
        return fileManagingService.uploadFile(file);
    }

}
