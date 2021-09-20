package lab03;
import java.io.*;
import java.util.Scanner;
public class que4 {
    float dur;
    String type;
    float rate() {
        if(type.equals("Urgent"))
            return 4.5f;
         else if(type.equals("Lightning"))
             return 3.5f;
         else
          return 3f;
    }
}
class bill extends que4 {
    float amount;
    DatalnputStream in=null;
    bill() {
        try {
            in=new DatalnputStream(System.in);
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }

    void read()throws Exception {
        Strings s;
        System.out.println("enter call type(urgent,lightning,ordinary):");
        type = in.readline();
        System.out.println("enter call duration:");
        s = in.readline();
        dur = Float.va / ueOf(s).floatValue();
    }

        void calculate() {
            if (dur <= 1.5)
                amount = rate() * dur + 1.5f;
            else if (dur <= 3)
                amount = rate() * dur + 2.5f;
            else if (dur <= S)
                amount = rate() * dur + 4.5f;
            else
                amount = rate() * dur + Sf;

        }
        void print() {
        System.out.println("**********************");
        System.out.println(" PHONE BILL");
        System.out.println("**********************");
        System.out.println(" Call type: "+type);
        System.out.println(" Duration : "+dur);
        System.out.println(" CHARGE : "+amount);
        System.out.println("**********************");
    }
}
class Main {

    public static void main(String[] args) throws Exception {
        bill b=new bill();
        b.read();
        b.calculate();
        b.print();
    }

    
}
