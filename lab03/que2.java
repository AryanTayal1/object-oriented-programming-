package lab03;

public class que2 {
    String name;
    int age;
    que2(String n,int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Player name: " + name);
        System.out.println("Age: " + age);
    }
}

class cricket_player extends que2 { String type;
    cricket_player(String n,String t,int a) {
        super(n, a);
        type = t;
    }

    public void show() {
        super.show();
        System.out.println("Player type : "+type);
    }
}

class football_player extends que2 {
    String type;
    football_player(String n,String t,int a) {
        super(n, a);
        type = t;
    }
    public void show() {
        super.show();
        System.out.println("Player type : "+type);
    }
}

class hockey_player extends que2 {
    String type;
    hockey_player(String n,String t,int a) { super(n,a);
        type=t;
    }
    public void show() {
        super.show();
        System.out.println("Player type : "+type);
    }
}

class Main {
    public static void main(String[] args) {
        cricket_player c=new cricket_player("Aryan Tayal","Football",21);
        football_player f=new football_player("Jaskaran Singh","Cricket",21);
        hockey_player h=new hockey_player("Sarthak Gupta","Hockey",21);

        c.show();
        f.show();
        h.show();
    }

    
}
