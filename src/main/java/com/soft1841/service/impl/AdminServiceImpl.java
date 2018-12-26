package com.soft1841.service.impl;

import com.soft1841.dao.AdminDAO;
import com.soft1841.entity.Admin;
import com.soft1841.service.AdminService;
import com.soft1841.utils.DAOFactory;

import java.sql.SQLException;

public class AdminServiceImpl implements AdminService {
    private AdminDAO adminDAO = DAOFactory.getAdminDAOInstance();

    @Override
    public boolean login(String number, String password) {
        Admin admin = null;
        try {
            admin = adminDAO.getAdminByNumber(number);
        }catch (SQLException e){
            e.printStackTrace();
        }catch (NullPointerException e){

        }
        //根据总好查找成功
        if (admin != null){
            //比较密码
            if (password.equals(admin.getPassword())){
                return true;
            }
        }
        return false;
    }
}
