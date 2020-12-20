package com.luming.web.controller.company;


import com.luming.domain.company.Company;
import com.luming.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/find")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/allCompany")
    public String findAll(Model model){

        List<Company> companyList = companyService.finAll();
        model.addAttribute("companyList",companyList);

        return "/company/company-list";

    }

    @RequestMapping("/date")

    public String date(Date date){
        System.out.println(date);
        return "success";

    }

}
