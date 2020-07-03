package com.isoft;

import com.isoft.dao.EmpDao;
import com.isoft.po.Emp;
import com.isoft.util.DBConnection;
import com.isoft.util.PropertiesUtil;

import java.util.UUID;

public class Main {
    public static  void main(String[] args){
        System.out.println(UUID.randomUUID().toString());
        System.out.println(PropertiesUtil.getValue("url"));
        Emp emp=new Emp();
        emp.setEmpName("公孙韭菜");
        emp.setEmpLoginName("bill");
        emp.setEmpLoginPassword("111");
        int x= EmpDao.addEmp(DBConnection.getConnection(),emp);
        System.out.println(x);

    }
}
