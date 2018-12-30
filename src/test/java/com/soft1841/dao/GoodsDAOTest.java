package com.soft1841.dao;

import com.soft1841.entity.Goods;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class GoodsDAOTest {
    private GoodsDAO goodsDAO = DAOFactory.getGoodsDAOInstance();

    @Test
    public void selectGoods() throws SQLException {
        List<Goods> goodsList = goodsDAO.selectGoods();
        goodsList.forEach(entity -> System.out.println(entity));
    }

    @Test
    public void insertGoods() throws SQLException {
    }

    @Test
    public void deleteGoodsByID() throws SQLException {
        goodsDAO.deleteGoodsByID(2);
    }

    @Test
    public void getGoodsById() throws SQLException {
        goodsDAO.getGoodsById(3);
        System.out.println();
    }

    @Test
    public void updateGoods() {
    }

    @Test
    public void getGoodsByTypeId() throws SQLException {
        List<Goods> count = goodsDAO.getGoodsByTypeId(2);
        System.out.println(count);
    }
}