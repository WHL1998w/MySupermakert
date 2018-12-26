package com.soft1841.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.dao.SellerDAO;
import com.soft1841.entity.Seller;

import java.sql.SQLException;

/**收银员DAO实现
 *
 */
public class SellerDAOImpl implements SellerDAO {
    @Override
    public Seller getSellerByNumber(String number) throws SQLException {
        Entity entity = Db.use().queryOne("SELECT * FROM t_cashier WHERE number = ?",number);
        return convertSeller(entity);
    }
    private Seller convertSeller(Entity entity){
        Seller seller = new Seller(entity.getLong("id"),entity.getStr("number"),
                entity.getStr("name"),entity.getStr("passwore"),entity.getStr("avatar"));
        return seller;
    }
}
