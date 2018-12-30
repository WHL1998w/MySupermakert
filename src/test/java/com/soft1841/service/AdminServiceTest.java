package com.soft1841.service;
import com.soft1841.utils.ServiceFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminServiceTest {
    private AdminService adminService = ServiceFactory.getAdminServiceInstance();

    @Test
    public void login(){
        boolean flag = adminService.login("2345689","ni2598");
        assertEquals(true,flag);
    }
}