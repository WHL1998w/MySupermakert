package com.soft1841.dao;

import com.soft1841.entity.Seller;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class SellerDAOTest {
    private SellerDAO sellerDAO = (SellerDAO) DAOFactory.getSellerDAOInstance();

    @Test
    public void getSellerByNumber() throws SQLException {
        Seller seller = sellerDAO.getSellerByNumber("184128");
        System.out.println(seller);
    }
}