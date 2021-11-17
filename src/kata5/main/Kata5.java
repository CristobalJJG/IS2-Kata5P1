package kata5.main;

import kata5.main.DB.DBQuerys;

public class Kata5 {
    public static void main(String[] args){
        //execute_1();
        execute_2();
    }
    
    private static void execute_1(){
        DBQuerys dbq = new DBQuerys();
        dbq.selectAll();
    }
    
    private static void execute_2(){
        DBQuerys dbq = new DBQuerys();
        dbq.createTable();
    }

}
