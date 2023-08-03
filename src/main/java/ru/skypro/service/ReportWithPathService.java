package ru.skypro.service;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import ru.skypro.DTO.ReportWithPathDTO;

public interface ReportWithPathService {
    Integer addReportWithPath();
    ResponseEntity<Resource> getReportWithPathById(Integer id);
}