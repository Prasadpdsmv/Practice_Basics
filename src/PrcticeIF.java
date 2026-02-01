import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrcticeIF {

    public void pritnStrPyramid(){

        int max=1;
        int length=10;
        int incr=2;
        //System.out.println("*");
        while (incr<length) {
            while(incr<length) {
                System.out.print(" ");
                length--;
            }
                while (max < incr) {
                    System.out.print("*");
                    System.out.print(" ");
                    max++;
                }
                System.out.println();
                //  System.out.println(max);
                incr++;
                max = 1;
                length=10;
        }
    }

    public  void forLoopPrct(){

        int i=1;
        int length=10;
        for (i=1; length>=1; length--) {
            for (i = 1; i < length; i++) {
                System.out.print(" ");
            }
           // i=1;
            int newlent=length-1;
           // System.out.println("new"+newlent);
            //System.out.println("old"+length);
            for (int j = 10; j > newlent; j--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public void aRRaysprc(){
        int age[]={12,13,18,20,50};
        System.out.println(age[3]);

        String names[]=new String[5];
        names[1]="durga";
        System.out.println("length of array"+names.length);
        names[2]="maruthi";
        names[0]="puthineedi";
        names[3]="vara";
        names[4]="prasad";
      //  names[5]="sai";
        System.out.println(names);
        System.out.println(names.toString());
        System.out.println(names[3]);
    }
    public void samprint(){
       // System.out.println("2");
        for (int i=0; i<10;i++)
            System.out.println(i);
    }
    public int recurssionPrc(int mltage){
        int sec=2*mltage;
        return sec;
    }
    public void stringsPrc(){

        String s="aasSFJNI345@";
        char c[]=s.toCharArray();
        char c1=c[1];
        s.charAt(1);
        Character.isUpperCase(c1);

        StringBuffer s1= new StringBuffer("value");

        System.out.println(s1);
        System.out.println("reverse :"+s1.reverse());

        StringBuilder s2=new StringBuilder("extension");

    }
    public void listPRC(){
        List<String> liNames= new ArrayList<>();
        liNames.add("many");
    }
    public void chaCountReapetedValuesString(){

        String s="Automation";

        Map<Integer, String> str=new HashMap<>();
        str.entrySet();


    }
    public void InterQuesOnArrays(){
        // {7,9,8,2} if check if array contains 8 remove 8 and print remaing
        // if array  doesn't contain 5 , print message no 5

        int a[]={7,9,8,2};
        int count=0;
        for (int i=0; i<=a.length-1;i++){

            if(a[i]==8){
                a[i]=a[a.length-1];
                System.out.println("equals condition"+ ":"+a[i]);
                count++;
            }
            System.out.println(a[i]);
        }
        int b[]=new int[a.length-count];

        for (int j=0; j<=b.length-1;j++){
            b[j]=a[j];
            System.out.println("new array after removing"+":"+b[j]);
        }

    }

    public void stringPrcIndex(){
        String s="feature";
        String s3="feaure";
        int i=s.indexOf("a");

        s=s+"new";
        String s1= new String();
        s1="feature";

        boolean b1=s1==s;
        boolean b2=s.equals(s1);
        boolean b3=s==s3;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }

    public void interViewQus2(){
        int[] a={2,7,8,12};
        int[] b=new int[15];
        boolean[] b1=new boolean[16];
        // find missigng numbers from 1 to 15
        for(int i=0; i<a.length;i++){
            for (int j=0; j<=16;j++){
                if (a[i]==j){
                  b1[j]=true;
                  break;
                }

            }
        }
       for(int i=0; i<=15;i++){
           if(!b1[i]){
               System.out.println(i);
           }
       }
    }

    public static void main(String[] args) {
        int x=20;
      //  System.out.println((x>30) ? "notright age":"yes right age");

//        String message=(x>10) ? "not rigth age"
//                : (x>15) ? "yes right"
//                : (x<10) ? "not ALLOWED"
//                : "will be okay";
//        System.out.println(message);

        PrcticeIF object= new PrcticeIF();
        object.pritnStrPyramid();
       // object.forLoopPrct();
        //object.samprint();
        //object.aRRaysprc();

        //object.stringsPrc();
       // object.InterQuesOnArrays();

        //PrcticeIF object2;
        //object.stringPrcIndex();
        object.interViewQus2();

    }


}
