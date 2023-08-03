package ru.skypro.service;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import ru.skypro.DTO.ReportDTO;


public interface ReportService {
    Integer addReport();
    ResponseEntity<Resource> getReportById(Integer id);
}
