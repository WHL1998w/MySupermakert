package com.soft1841.utils;

import com.soft1841.dao.AdminDAO;
import com.soft1841.dao.SellerDAO;
import com.soft1841.dao.impl.AdminDAOImpl;
import com.soft1841.dao.impl.SellerDAOImpl;
import com.soft1841.entity.Admin;

import java.sql.SQLException;

public class DAOFactory {
    public static AdminDAO getAdminDAOInstance() {
        return new AdminDAOImpl();
    }
    public static SellerDAO getSellerDAOInstance(){
        return new SellerDAOImpl();
    }
}
