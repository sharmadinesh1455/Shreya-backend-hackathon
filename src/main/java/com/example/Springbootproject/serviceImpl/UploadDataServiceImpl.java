package com.example.Springbootproject.serviceImpl;

import com.example.Springbootproject.models.UploadData;
import com.example.Springbootproject.repositories.UploadDataRepository;
import com.example.Springbootproject.services.UploadDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadDataServiceImpl implements UploadDataService {

    @Autowired
    private UploadDataRepository uploadDataRepository;

    @Override
    public UploadData uploadData(UploadData data) {

        UploadData uploadedData = this.uploadDataRepository.save(data);
        return uploadedData;
    }
}
