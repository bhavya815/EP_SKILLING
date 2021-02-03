package com.klu.main;
import com.klu.Bean.studentBean;
import com.klu.insert.StudentInsertion;
import java.sql.SQLException;
import java.util.Scanner;
public class Studentmain {

  public static void main(String[] args) throws SQLException ,ClassNotFoundException{
    Scanner sc=new Scanner(System.in);
    StudentInsertion si=new StudentInsertion();
    studentBean sb=new studentBean();
    while(true) {
      System.out.println("select an CURD Operation");
      System.out.println("1.Insertion\n2.Deletion\n3.Updation\n4.Display\n5.Exit");
      int ob=sc.nextInt();
      switch(ob) {
        case 1: System.out.println("Enter Regno");
            int id=sc.nextInt();
            sb.setRegno(id);
            System.out.println("Enter Name");
            String n=sc.next();
            sb.setName(n);
            System.out.println("Enter email");
            String e= sc.next();
            sb.setEmail(e);
            int i=si.StudentInsert(sb);
              if(i>0)
              {
                System.out.println("insertion is successfull");
              }
              else
              {
                System.out.println("fail");
              }
              break;
        case 2:System.out.println("Enter Regno");
            int Regno=sc.nextInt();
            sb.setRegno(Regno);
            int j=si.StudentDelete(sb);
            
              if(j>0)
              {
                System.out.println("deletion is successfull");
              }
              else
              {
                System.out.println("fail");
              }
              break;
        case 3:System.out.println("Enter email");
            String em=sc.next();
            sb.setEmail(em);
            System.out.println("Enter Regno");
            int r=sc.nextInt();
            sb.setRegno(r);  
            int k=si.StudentUpdate(sb);
              if(k>0)
              {
                System.out.println("updation is successfull");
              }
              else
              {
                System.out.println("fail");
              }
              break;
        case 4: si.StudentDisplay(sb);
              break;
        case 5: System.exit(0);
      }
    }
  }
}
