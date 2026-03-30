package practice.StringPrc;

public class Duplicates {
    public static void frequencyDuplicates(){
        int[] frequency=new int[256];
                                                       //         Integer.valueOf(frequency[2]);
        String s="the repeated values and frequency";
        char[] cArr=s.toCharArray();
        System.out.println((int)cArr[5]);

        for (int i=0; i<cArr.length; i++){
            frequency[s.charAt(i)]++;                 // arrray of 256 elements and the value of variabe at nth position is 0 initilally
        }
        System.out.println("duplictes charecter frequency");
        for (int j=0; j<frequency.length;j++){


            if (frequency[j]>0)System.out.println(
                    (char)j +"--->" + frequency[j] + "times"
            );
        }
    }
    public static void duplicates(){
        String s="sdfs happy new yessar";
        String ss="sdfs happy new yessar";
        char[] cArr=s.toCharArray();

        Character c='s';
        c.compareTo('d');

        StringBuilder result=new StringBuilder();

        for (int i=0; i<cArr.length; i++){
            if (result.indexOf(String.valueOf(cArr[i]))<0){
                result.append(cArr[i]);}

        }
        System.out.println(result);
        int[] points=ss.codePoints().toArray();
        int[] newResul=new int[256];
        for (int i=0; i<points.length; i++){
            newResul[points[i]]++;
        }
        System.out.println("duplicates");
        for (int j=0; j<newResul.length; j++){
           if (newResul[j]>0){System.out.println("duplicates "+(char)j + newResul[j]);}
        }
    }
    public static void main(String[] args) {

        //frequencyDuplicates();
        duplicates();

    }
}
