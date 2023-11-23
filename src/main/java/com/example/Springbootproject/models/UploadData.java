package com.example.Springbootproject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UploadData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String GEID;
    private String reimbursementFor;
    private String anotherPersonGeid;
    private String anotherPersonName;
    private String category;
    private String fileName;

    public UploadData() {
    }

    public UploadData(Integer id, String name, String GEID, String reimbursementFor, String anotherPersonGeid, String anotherPersonName, String category, String fileName) {
        this.id = id;
        this.name = name;
        this.GEID = GEID;
        this.reimbursementFor = reimbursementFor;
        this.anotherPersonGeid = anotherPersonGeid;
        this.anotherPersonName = anotherPersonName;
        this.category = category;
        this.fileName = fileName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGEID() {
        return GEID;
    }

    public void setGEID(String GEID) {
        this.GEID = GEID;
    }

    public String getReimbursementFor() {
        return reimbursementFor;
    }

    public void setReimbursementFor(String reimbursementFor) {
        this.reimbursementFor = reimbursementFor;
    }

    public String getAnotherPersonGeid() {
        return anotherPersonGeid;
    }

    public void setAnotherPersonGeid(String anotherPersonGeid) {
        this.anotherPersonGeid = anotherPersonGeid;
    }

    public String getAnotherPersonName() {
        return anotherPersonName;
    }

    public void setAnotherPersonName(String anotherPersonName) {
        this.anotherPersonName = anotherPersonName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "UploadData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", GEID='" + GEID + '\'' +
                ", reimbursementFor='" + reimbursementFor + '\'' +
                ", anotherPersonGeid='" + anotherPersonGeid + '\'' +
                ", anotherPersonName='" + anotherPersonName + '\'' +
                ", category='" + category + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
