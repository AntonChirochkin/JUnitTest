package ru.skypro.service;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.DTO.EmployeeDTO;
import ru.skypro.DTO.EmployeeFullInfo;
import ru.skypro.DTO.EmployeeReport;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeFullInfo> getAllEmployees();

    int getSumSalary();

    EmployeeFullInfo getMaxSalary();

    EmployeeFullInfo getMinSalary();

    List<EmployeeFullInfo> getEmployeeWithSalaryAboveAverage();

    EmployeeDTO getEmployeeById(Integer id);

    List<EmployeeFullInfo> getEmployeesWithSalaryHigherThan(Integer compareSalary);

    void deleteEmployeeById(Integer id);

    void editEmployee(EmployeeDTO employeeDTO);
    void addEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO getTheHighestSalary();

    List<EmployeeFullInfo> getEmployeeByPosition(Integer position);

    List<EmployeeDTO> getEmployeeWithPaging(Integer page);
    EmployeeFullInfo getEmployeeByIdFullInfo(Integer id);

    List<EmployeeReport> getReport();

    EmployeeDTO uploadEmployeeFromFile(MultipartFile file);

    void addEmployeeFromFile(MultipartFile file);
}
