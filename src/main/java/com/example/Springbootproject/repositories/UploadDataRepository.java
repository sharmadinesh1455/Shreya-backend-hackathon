package com.example.Springbootproject.repositories;

import com.example.Springbootproject.models.UploadData;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadDataRepository extends JpaRepository<UploadData, Integer> {
}
