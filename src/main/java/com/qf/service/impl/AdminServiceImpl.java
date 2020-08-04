package com.qf.service.impl;

import com.qf.dao.AdminMapper;
import com.qf.pojo.Admin;
import com.qf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin selectAdminByUsernameAndPassword(Admin admin) {
        return adminMapper.selectAdminByUsernameAndPassword(admin);
    }
}
