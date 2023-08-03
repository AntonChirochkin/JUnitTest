package ru.skypro.repository;

import ru.skypro.pojo.Employee;

public interface PagingAndSortingRepository extends org.springframework.data.repository.PagingAndSortingRepository<Employee, Integer> {
}