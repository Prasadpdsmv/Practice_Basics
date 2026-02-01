import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrcString {

    public void checkMutable(){
        String s="feature";  // creates object in string pool and if any identical same var comes it points to this obj
        System.out.println(s);

        s="new";
        String s2="new";
        System.out.println(s);

        String ss1= new String();  // this object losts after re assignment
        ss1="new";
        String ss2=new String();
        ss2="new";

        String sss1 = new String("hello"); // it creates a brand new obj
        String sss2 = new String("hello");

        // inside memory s="feature" is object created and we can't ,modify it
        // s=new here again a new object is created

        if(s=="feature"){
            System.out.println(" conditon");
            // new object is created s=new but you
        }
        if (s=="new"){
            System.out.println("new values passed");
        }
        if (s2==s){
            System.out.println("it should pass");
        }
        if (ss1==ss2){
            System.out.println("with euqals conditin" );
        }
        if (sss1==sss2){
            System.out.println( "it shold pass but,  wont beacaus == not works for objects as they references");
        }

        String sss3 = new String("hello").intern();
    }

    public boolean checkPolindromeAnd(String s){
        //polindrome spleeling is same in forward and backward
       // String s="ababababababababa";
        int lth=s.length();

        System.out.println("system length "+lth);
        for(int i=0; i<=lth-1; i++){
            int endLth=s.length()-(i+1);
            if(s.charAt(i)!=s.charAt(endLth)){
                System.out.println("not a polidrome");
                return false;
            }

        }
        System.out.println("given string is polindrome");
        return true;

    }
    public void splitinPrc(){
        String s="ASaaaaDDDDas123GF";
        String[] low=s.split("[^a-z]");
        String[] upp=s.split("[^A-Z]");
        System.out.println(Arrays.toString(upp));
        for (String ss : upp){
            System.out.println(ss);
        }
        String s1 = "Ab@12#xY$9m!";

        String special = s1.replaceAll("[a-zA-Z0-9]", "");

        System.out.println(special);

    }

    public void interviewQuestion(){
        // a2b3c4d5 print char with number of times with value behind

        String s="a2b3c4d5";

        for(int i=0; i<s.length(); i++){

            Pattern p=Pattern.compile("[a-z]");
            Matcher m=p.matcher(s);



            char[] ch=s.toCharArray();

           // System.out.println(ch);
            if(Character.isAlphabetic(ch[i])){
               int j=Character.getNumericValue(ch[i+1]);
               //int j=ch[i+1]; this is invalid type cast ;
               char jC=ch[i+1];

                System.out.print("j value:"+j);
                System.out.println("j as char value:"+jC);
                System.out.println();
              //  System.out.println(ch[i]);
               // System.out.println(ch[1]);
                for (int k=0; k<j; k++){
                    System.out.print(ch[i]);
                }
            }

        }

    }

    public void InterviewQue2(){
        // count the repeated char in a string and print the value

        String s="automationa";
        char[] ch=s.toCharArray();

        char c = ch[0];
       // int j=0;
        int acuualCount=1;
        boolean[] b=new boolean[s.length()];
        char[] newc=new char[s.length()];
        for (int j=0;j<s.length();j++) {
            if (b[j]) continue;
            int count =1;
            for (int i = j+1; i < s.length(); i++) {
                c = ch[j];
                //int count =0;
               // System.out.println("value of c  :"+c);
               // System.out.println("va;ue of ch  :"+ ch[i]);
                //int count=1;

                    if (c == ch[i]) {

                        // System.out.println("entered to if condition"+count);
                        count = count + 1;
                        //   acuualCount=count;
                        //  System.out.println("actual count value::" +count);
                        b[i]=true;
                    }

            }
            System.out.println("character and its value:" + ch[j] + count);
          //  System.out.println("j vale  is  :"+j);
        }

        //***********************method 2****************************

        Map<Character, Integer> countChar=new HashMap<>();
       // countChar.put("hell", 1);
        //countChar.put("world", 2);



    //   int r= rever.getOrDefault("hell", 1);

       //automation
        for (char c1 :s.toCharArray())
        if(Character.isLetter(c1)){
            countChar.put(c1, countChar.getOrDefault(c1, 0)+1);

        }

        System.out.println("map set "+countChar);







    }
    public void reverseString(){

        String s="automation";
        String snew="";
        char[] ch=s.toCharArray();
        System.out.println("vale of 1 char :"+ch[0]);
        for (int i=0; i<s.length(); i++){
            snew=ch[i]+snew;
        }

        System.out.println(snew);
    }
    public static void main(String[] args) {
        PrcString object=new PrcString();
       // object.checkMutable();
        //object.checkPolindromeAnd("aaaac");
        //object.splitinPrc();
        //object.interviewQuestion();
        object.InterviewQue2();
       // object.reverseString();
    }
}
