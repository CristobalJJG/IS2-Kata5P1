package kata5.main;

import kata5.main.DB.DBQuerys;

public class Kata5 {
    public static void main(String[] args){
        execute();
    }
    
    private static void execute(){
        DBQuerys dbq = new DBQuerys();
        dbq.selectAll();
    }

}
