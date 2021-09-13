package lab02;
import java.util.Scanner;

public class monthname {
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);

        int n;
        System.out.print("\nMonth No: ");
        n = reader.nextInt();
        switch(n)
        {
            case 1:
                System.out.print("\nJanuary");
                break;
            case 2:
                System.out.print("\nFebruary");
                break;
            case 3:
                System.out.print("\nMarch");
                break;
            case 4:
                System.out.print("\nApril");
                break;
            case 5:
                System.out.print("\nMay");
                break;
            case 6:
                System.out.print("\nJune");
                break;
            case 7:
                System.out.print("\nJuly");
                break;
            case 8:
                System.out.print("\nAugust");
                break;
            case 9:
                System.out.print("\nSeptember");
                break;
            case 10:
                System.out.print("\nOctober");
                break;
            case 11:
                System.out.print("\nNovember");
                break;
            case 12:
                System.out.print("\nDecember");
                break;
            default:
                System.out.print("\nInvalid Month number\nPlease try again ....\n");
                break;
        }
    }
}
