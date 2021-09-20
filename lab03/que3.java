package lab03;

public class que3 {
    String name;
    int empno;
    que3(int no,String n) {
        empno = no;
        name = n;
    }
        void  show()  {
            System.out.println("\n ");
            System.out.println("Employee number: "+empno);
            System.out.println("Employee name: "+name);
        }
}
class dailyworker extends que3 { int rate;
    dailyworker(int no,String n,int r) {
        super(no,n); rate=r;
    }

    void compay(int h) {
        show();
        System.out.println("Salary : "+rate*h);
    }
}
class salariedworker extends que3 {
    int rate;
    salariedworker(int no,String n,int r) {
        super(no, n);
        rate = r;
    }

    int hour=40; void compay() {
        show();
        System.out.println("Salary : "+rate*hour);
    }
}
class Main {
    public static void main(String[] args) {
        dailyworker d=new dailyworker(500086651,"Aryan Tayal",789); 
        salariedworker s=new salariedworker(500086652 ,"Sartak Gupta",123); 
        d.compay(36);
        s.compay();
    }

    
}
