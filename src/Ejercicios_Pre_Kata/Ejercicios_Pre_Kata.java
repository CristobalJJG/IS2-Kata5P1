package Ejercicios_Pre_Kata;

public class Ejercicios_Pre_Kata {
    public static void main(String[] args) {
        //e1();
        //e2();
        //e3();
        //e4();
        e5();
    }
    
    private static void e1(){ new Ejercicio_1().connect(); }
    
    private static void e2(){ new Ejercicio_2().selectAll(); }
    
    private static void e3(){ Ejercicio_3.createNewDatabase("mail.db"); }
    
    private static void e4(){ Ejercicio_4.createNewTable(); }
    
    private static void e5(){ 
        Ejercicio_5 idt = new Ejercicio_5();
        // Se insertar 3 nuevas líneas
        idt.insert("abc@ulpgc.es");
        idt.insert("xyz@ull.es");
        idt.insert("def123@gmail.com"); 
    }

}