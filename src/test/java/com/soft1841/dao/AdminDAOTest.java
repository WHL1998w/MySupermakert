package com.soft1841.dao;

import com.soft1841.entity.Admin;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdminDAOTest {
    private AdminDAO adminDAO = (AdminDAO) DAOFactory.getAdminDAOInstance();

    @Test
    public void getAdminByNumber()throws SQLException {
        Admin admin = adminDAO.getAdminByNumber("2345898");
        System.out.println(admin);
    }


}