package com.soft1841.service.impl;

import com.soft1841.dao.SellerDAO;
import com.soft1841.entity.Seller;
import com.soft1841.service.SellerService;
import com.soft1841.utils.DAOFactory;

import java.sql.SQLException;

/**收银员业务逻辑的实现
 *
 */
public class SellerServiceImpl implements SellerService {
    private SellerDAO sellerDAO = DAOFactory.getSellerDAOInstance();
    @Override
    public boolean login(String number, String password) {
        Seller seller = null;
        try{
            seller = sellerDAO.getSellerByNumber(number);
        }catch (SQLException e){
            e.printStackTrace();
        }catch (NullPointerException e){

        }
        //根据工号查找成功
        if (seller != null){
            //比较密码
            if (password.equals(seller.getPassword())){
                return true;
            }
        }
        return false;
    }
}
