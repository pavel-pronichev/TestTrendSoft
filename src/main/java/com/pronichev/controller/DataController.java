package com.pronichev.controller;

import com.pronichev.domain.Employee;
import com.pronichev.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DataController {

    @Autowired
    DataService dataService;

    @RequestMapping("start_form")
    public ModelAndView getForm(@ModelAttribute Employee employee){
        return new ModelAndView("start_form");
    }

    @RequestMapping("search_form")
    public ModelAndView getSearchForm(@ModelAttribute Employee employee){
        return new ModelAndView("search_form");
    }

    @RequestMapping("register")
    public ModelAndView registerUser(@ModelAttribute Employee employee){
        dataService.addEmployee(employee);
        return new ModelAndView("redirect:list");
    }

    @RequestMapping("list")
    public ModelAndView getList(){
        List employeeList = dataService.getList();
        return new ModelAndView("list","employeeList" ,employeeList);
    }

    @RequestMapping("search")
    public ModelAndView getSearchList(@ModelAttribute Employee employee){
        List employeeSearchList = dataService.getSearchList(employee);
        return new ModelAndView("search_list","employeeSearchList",employeeSearchList);
    }

    @RequestMapping("delete")
    public ModelAndView deleteUser(@RequestParam int id){
        dataService.deleteEmployee(id);
        return new ModelAndView("redirect:list");
    }

    @RequestMapping("edit")
    public  ModelAndView editUser(@RequestParam int id, @ModelAttribute Employee employee){
        Employee employee1 = dataService.getEmployee(id);
        return new ModelAndView("edit","employee1", employee1);
    }

    @RequestMapping("update")
    public ModelAndView updateUser(@ModelAttribute Employee employee){
        dataService.updateEmployee(employee);
        return new ModelAndView("redirect:list");
    }
}
