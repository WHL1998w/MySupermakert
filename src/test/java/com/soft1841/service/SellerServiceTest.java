package com.soft1841.service;

import com.soft1841.utils.ServiceFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class SellerServiceTest {
    private SellerService sellerService = ServiceFactory.getSellerServiceInstance();

    @Test
    public void login() {
        boolean flag = sellerService.login("184134","whl945");
        assertEquals(true,flag);
    }
}