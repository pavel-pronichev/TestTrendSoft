package com.pronichev.dao;


import com.pronichev.domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Query;

import java.io.Serializable;
import java.util.List;

public class DataDaoImpl implements DataDao{
   @Autowired
    SessionFactory sessionFactory;


    @Override
    @Transactional
    public int addEmployee(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(employee);
        tx.commit();
        Serializable id = session.getIdentifier(employee);
        session.close();

        return (Integer) id;
    }

    @Override
    public List<Employee> getList() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchaked")
                List<Employee> employeeList = session.createQuery("from Employee").list();
        session.close();
        return employeeList;
    }
    @Override
    public List<Employee> getSearchList(Employee employee){
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchaked")
        String paramFirstName = employee.getFirstName();
        String paramLastName = employee.getLastName();
        String paramSecondName = employee.getSecondName();
        int paramAge = employee.getAge();
        String paramExperience = employee.getExperience();
        String paramDescription = employee.getDescription();
        Query query;


        if(paramAge == 0){
            query = session.createQuery("from Employee where first_name like :paramFirstName and last_name like :paramLastName and second_name like :paramSecondName and experience like :paramExperience and description like :paramDescription");
            query.setParameter("paramFirstName", "%" + paramFirstName + "%");
            query.setParameter("paramLastName", "%" + paramLastName + "%");
            query.setParameter("paramSecondName", "%" + paramSecondName + "%");
            query.setParameter("paramExperience", "%" + paramExperience + "%");
            query.setParameter("paramDescription", "%" + paramDescription + "%");
        }else {
            query = session.createQuery("from Employee where first_name like :paramFirstName and last_name like :paramLastName and second_name like :paramSecondName and age like :paramAge and experience like :paramExperience and description like :paramDescription");
            query.setParameter("paramFirstName", "%" + paramFirstName + "%");
            query.setParameter("paramLastName", "%" + paramLastName + "%");
            query.setParameter("paramSecondName", "%" + paramSecondName + "%");
            query.setParameter("paramAge", paramAge);
            query.setParameter("paramExperience", "%" + paramExperience + "%");
            query.setParameter("paramDescription", "%" + paramDescription + "%");
        }

                List<Employee> employeeSearchList = query.list();
        session.close();
        return employeeSearchList;
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = sessionFactory.openSession();
        Employee employee = (Employee)session.load(Employee.class, id);
        return employee;
    }

    @Override
    public int updateEmployee(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(employee);
        tx.commit();
        Serializable id = session.getIdentifier(employee);
        session.close();
        return (Integer)id;

    }

    @Override
    public int deleteEmployee(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Employee employee = (Employee)session.load(Employee.class, id);
        session.delete(employee);
        tx.commit();
        Serializable ids = session.getIdentifier(employee);
        session.close();
        return (Integer)ids;
    }
}
