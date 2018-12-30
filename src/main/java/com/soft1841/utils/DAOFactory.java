package com.soft1841.utils;

import com.soft1841.dao.AdminDAO;
import com.soft1841.dao.GoodsDAO;
import com.soft1841.dao.SellerDAO;
import com.soft1841.dao.TypeDAO;
import com.soft1841.dao.impl.AdminDAOImpl;
import com.soft1841.dao.impl.GoodsDAOImpl;
import com.soft1841.dao.impl.SellerDAOImpl;
import com.soft1841.dao.impl.TypeDAOImpl;
import com.soft1841.entity.Admin;
import com.soft1841.entity.Type;

import java.sql.SQLException;
import java.util.List;

public class DAOFactory {
    public static AdminDAO getAdminDAOInstance() {
        return new AdminDAOImpl();
    }
    public static SellerDAO getSellerDAOInstance(){
        return new SellerDAOImpl();
    }

    public static GoodsDAO getGoodsDAOInstance(){
        return new GoodsDAOImpl();
    }
}
