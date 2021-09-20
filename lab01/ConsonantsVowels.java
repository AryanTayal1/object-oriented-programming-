package lab01;

public class ConsonantsVowels {

    public static void main(String[] args) {
        String str="Hello Everyone ";
        int vcount=0,ccount=0;

        str=str.toLowerCase();
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vcount++;
            }
            else if((ch>='a'&&ch<='z')){
                ccount++;
            }
        }
        System.out.println("number of Vowels:" +vcount);
        System.out.println("number of Consonants:" +ccount);


    }
}
