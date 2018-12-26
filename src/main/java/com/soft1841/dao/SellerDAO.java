package com.soft1841.dao;
/**收银员
 *
 */

import com.soft1841.entity.Seller;

import java.sql.SQLException;

public interface SellerDAO {
    /**根据工号查询
     *
     * @param number
     * @return
     * @throws SQLException
     */
    Seller getSellerByNumber(String number) throws SQLException;
}
