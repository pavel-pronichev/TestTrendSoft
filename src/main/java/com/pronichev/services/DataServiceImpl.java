package com.pronichev.services;


import com.pronichev.dao.DataDao;
import com.pronichev.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DataServiceImpl implements DataService {

    @Autowired
    DataDao dataDao;

    @Override
    public int addEmployee(Employee employee) {
        return dataDao.addEmployee(employee);
    }

    @Override
    public List<Employee> getList() {
        return dataDao.getList();
    }

    @Override
    public List<Employee> getSearchList(Employee employee) {
        return dataDao.getSearchList(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return dataDao.getEmployee(id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return dataDao.updateEmployee(employee);
    }

    @Override
    public int deleteEmployee(int id) {
        return dataDao.deleteEmployee(id);
    }
}
