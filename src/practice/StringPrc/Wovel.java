package practice.StringPrc;

public class Wovel {
    public static void main(String[] args) {
        //check given string have any wovel like A E I O U

        String s="the many people are learning be yur own";
        String s2="the";
        //char e='a';
        //int i=10;
        char[] cArray=s.toCharArray();
        Character e='e';
        //e.charValue();
        int iC=e;

        System.out.println("the compareto method");
        System.out.println(s.compareTo("z"));
        System.out.println(s2.compareTo("tha"));
        System.out.println(e.charValue());
        System.out.println(iC);

        char[] cArrraya={'A','E','I','O','U'};

        for (int i=0; i<cArrraya.length; i++){

        }


    }
}
