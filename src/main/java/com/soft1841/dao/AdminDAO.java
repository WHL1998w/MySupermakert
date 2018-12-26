package com.soft1841.dao;
/**管理员
 *
 */

import com.soft1841.entity.Admin;

import java.sql.SQLException;

public interface AdminDAO {
    /**根据工号查询管理员
     *
     * @param number
     * @return
     * @throws SQLException
     */
    Admin getAdminByNumber(String number) throws SQLException;
}
