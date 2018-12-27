package com.soft1841.utils;

import com.soft1841.service.AdminService;
import com.soft1841.service.SellerService;
import com.soft1841.service.impl.AdminServiceImpl;
import com.soft1841.service.impl.SellerServiceImpl;

public class ServiceFactory {
    public static AdminService getAdminServiceInstance(){
        return new AdminServiceImpl();
    }

    public static SellerService getSellerServiceInstance() {
        return new SellerServiceImpl();

    }


}
