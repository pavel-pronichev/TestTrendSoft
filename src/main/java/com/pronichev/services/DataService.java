package com.pronichev.services;


import com.pronichev.domain.Employee;

import java.util.List;

public interface DataService {

    int addEmployee(Employee employee);

    List<Employee> getList();

    List<Employee> getSearchList(Employee employee);

    Employee getEmployee(int id);

    int updateEmployee(Employee employee);

    int deleteEmployee(int id);
}
