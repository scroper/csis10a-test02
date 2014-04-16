
/**
 * 3 ways of reversing strings.
 * 
 * @Sean Roper
 * @15 Apr 2014
 */

public class ReverseString
{

    public static void main(String [] args){
        System.out.print("\f");
        //System.out.println(whileLoop("hello"));
        //System.out.println(forLoop("test"));
        System.out.println(rec("words"));
    }

    public static String whileLoop(String a){
        int i = 0;
        String b = a;
        while(i <= a.length()-1){
            b = a.charAt(i) + b.substring(0, a.length()-1);
            i++;
        }
        return b;
    }

    public static String forLoop(String a){
        String b = a;
        for(int i=0; i<= a.length()-1; i++){
            b = a.charAt(i) + b.substring(0, a.length()-1);
        }
        return b;
    }
    //I didn't get this part
    public static String rec(String a){
        if (a.length() == 1) {
            return a;
        } else {
            char b = a.charAt(a.length()-1);
            String c = a.substring(0, a.length()-1);
            return b + rec(c);
        }
    }
}

