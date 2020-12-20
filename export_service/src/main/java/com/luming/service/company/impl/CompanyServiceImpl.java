package com.luming.service.company.impl;

import com.luming.dao.company.CompanyDao;
import com.luming.domain.company.Company;
import com.luming.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {


    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> finAll() {
        return companyDao.finAll();
    }
}
