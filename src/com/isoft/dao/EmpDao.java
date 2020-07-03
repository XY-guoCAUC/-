package com.isoft.dao;

import com.isoft.po.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDao {
    public static int addEmp(Connection con, Emp emp){
        int x=0;
        String sql="insert into emp values (UUID(),?,?,?,0,1,now())";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,emp.getEmpName());
            ps.setString(2,emp.getEmpLoginName());
            ps.setString(3,emp.getEmpLoginPassword());
            x=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return x;
    }
}
