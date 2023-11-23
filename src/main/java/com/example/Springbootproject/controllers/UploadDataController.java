package com.example.Springbootproject.controllers;

import com.example.Springbootproject.models.UploadData;
import com.example.Springbootproject.models.UserFile;
import com.example.Springbootproject.serviceImpl.UploadDataServiceImpl;
import com.example.Springbootproject.services.FileService;
import com.example.Springbootproject.services.UploadDataService;
import com.google.gson.Gson;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin("*")
public class UploadDataController {

    @Value("${project.image}")
    private String filePath;

    @Autowired
    private UploadDataService uploadDataService;

    @Autowired
    private FileService fileService;

    @PostMapping("/uploadData")
    public ResponseEntity<UploadData> uploadDataResponseEntity(HttpServletResponse httpServletResponse,
                                                               @RequestParam("file") MultipartFile file,
                                                               @RequestParam("uploadData") String data
                                                               ) throws IOException {

//        UploadData uploadData = new UploadData();
        Gson gson = new Gson();
        UploadData uploadData
                = gson.fromJson(data,
                UploadData.class);
//        uploadData.setName(name);
//        uploadData.setCategory(category);
//        uploadData.setGGID(ggid);
//        uploadData.setReimbursementFor(reimbursementFor);
//        uploadData.setAnotherPersonName(anotherPersonName);
//        uploadData.setAnotherPersonGeid(anotherPersonGeid);

        String fileName = this.fileService.uploadImageFile(filePath, file);
        System.out.println("FileName : "+ fileName);

        uploadData.setFileName(fileName);
        System.out.println("Upload Data : " + uploadData);

        UploadData uploadedData = this.uploadDataService.uploadData(uploadData);
        return new ResponseEntity<>(uploadedData, HttpStatus.CREATED);
    }

}
