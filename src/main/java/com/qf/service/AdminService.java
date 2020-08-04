package com.qf.service;

import com.qf.pojo.Admin;

public interface AdminService {
    Admin selectAdminByUsernameAndPassword(Admin admin);
}
