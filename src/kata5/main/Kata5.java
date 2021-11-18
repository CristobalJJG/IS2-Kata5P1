package kata5.main;

import java.util.List;
import kata5.main.DB.DBQuerys;

public class Kata5 {
    public static void main(String[] args){
        //execute_1();
        //execute_2();
        execute_3();
    }
    
    private static void execute_1(){
        DBQuerys dbq = new DBQuerys();
        dbq.selectAll();
    }
    
    private static void execute_2(){
        DBQuerys dbq = new DBQuerys();
        dbq.createTable();
    }
    
    private static void execute_3(){
        DBQuerys dbq = new DBQuerys();
        MailListReader rd = new MailListReader("email.txt");
        List<String> mails = rd.getList();
           
        dbq.insert(mails);
    }
}
