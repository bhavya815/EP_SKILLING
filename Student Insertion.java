package com.klu.insert;

import com.klu.Bean.studentBean;
import com.klu.Connections.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class StudentInsertion {
  public int StudentInsert(studentBean student) throws SQLException, ClassNotFoundException {
    Connection con=DBUtil.DBConnection();
    PreparedStatement ps1=con.prepareStatement("insert into Student values(?,?,?)");
    ps1.setInt(1,student.getRegno());
    ps1.setString(2,student.getName());
    ps1.setString(3,student.getEmail());
    int i=ps1.executeUpdate();
    con.close();
    return i;
  }
  
  public int StudentDelete(studentBean student)throws SQLException, ClassNotFoundException{
    Connection con=DBUtil.DBConnection();
    PreparedStatement ps2=con.prepareStatement("delete from Student where regno=?");
    ps2.setInt(1, student.getRegno());
    int j=ps2.executeUpdate();
    con.close();
    return j;
  }
  
  public int StudentUpdate(studentBean student)throws SQLException, ClassNotFoundException{
    Connection con=DBUtil.DBConnection();
    PreparedStatement ps3=con.prepareStatement("update Student set email='?' where regno=?");
    ps3.setString(1,student.getEmail());
    ps3.setInt(2,student.getRegno());
    int k=ps3.executeUpdate();
    con.close();
    return k;
  }
  
  public void StudentDisplay(studentBean student)throws SQLException, ClassNotFoundException{
    Connection con=DBUtil.DBConnection();
    PreparedStatement ps4=con.prepareStatement("select * from Student");
    ResultSet rs;
    rs=ps4.executeQuery();
    System.out.println("Reg no\t\tName\t\temail\t\t");
    while(rs.next()) {
      System.out.print(rs.getInt(1));
      System.out.print("\t\t"+rs.getString(2));
      System.out.print("\t\t"+rs.getString(3));
      System.out.println();
    }
    rs.close();
    con.close();
    
  }

}
