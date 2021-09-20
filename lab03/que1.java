package lab03;

public class que1 {
    private int l,b;
    que1(int x,int y){
        l=x; b=y;
    }

    int area() { return(l*b);
    }
}
class class_room extends que1 { int h;
    class_room(int x,int y,int z) { super(x,y);
        h=z;
    }
    int volume() { 
        return(area()*h);
    }
}
public class main {
    public static void main(String[] args) {
        class_room cr=new class_room(5,6,7);
        int a1=cr.area();
        int v1=cr.volume(); System.out.println("Area of Room : "+a1);
        System.out.println("Volume of Room : "+v1);
    }
}
