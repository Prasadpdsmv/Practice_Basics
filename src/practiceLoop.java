

public class practiceLoop {
    public  void starsPrint() {



        System.out.println("Hello world!");

        char c='a';
       // System.out.println(number);

        String s="a4k2";
        int number=c;
        char[] c1=s.toCharArray();
        for(char c2 : c1);
        {
            System.out.println("c2");
        }

        //         *
        int Length =10;
        for (int k=0; k<10; k++) {
            int i=1;
            int j=11;
            while (i < Length) {
                System.out.print(" ");
                i++;
            }
          //  System.out.print("value of i is: "+i);
            while (Length < j) {
                System.out.print("*");
                System.out.print(" ");
                j--;
            }
            System.out.println("dhfh");
            Length--;
//            System.out.println("value of j:"+j);
//            System.out.println("valiue of length:"+Length);
        }




    }
    public void frequency(){
        int results=0;
        char ctoFind='q';

        System.out.println("frequeny os  a element in this list");

        String s="the valur it this the value z ";
        char[] clist=s.toCharArray();
        for (char c :clist){
            if (c==ctoFind){
                results++;
            }
        }
        System.out.println("the frequency of is "+ctoFind+" :"+results);
    }

    public static void main(String[] args) {

        practiceLoop obj=new practiceLoop();
        obj.frequency();
        obj.starsPrint();
    }
}