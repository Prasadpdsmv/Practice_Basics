package practice.InterviewQuestions;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class question1 {
    static String s="abcde";
    static String s2="ace";
  public static int method() {
      int n=s.length();
      int m=s2.length();

      int[][] dp= new int[n+1][m+1];

      for (int i=0; i<=n; i++){
          for (int j=0; j<m; j++){
              if (s.charAt(i-1) == s2.charAt(j-1)){
                  dp[i][j]=1+dp[i-1][j-1];
              }
              else {
                  dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                  }
          }
      }
      return dp[m][n];
  }

  public static boolean  primeNumbers(int value){
      boolean isprime = false;
      if(value <=1){
          return false;
      }
      for (int i=2; i<=Math.sqrt(value); i++ ) {
          if (value%i ==0){
              return false;
          }
      }
      return true;
  }
  public static void regularExpressions(){
      String s="the welcome party is to happen 125456 ";

      String regularExpression="^[a-z]+";

      Pattern p=Pattern.compile(regularExpression);
      Matcher m=p.matcher(s);

      if (m.find()) {
          System.out.println(m.group());
      }
  }
  public  static void repetedCharecterInString(String str){

      List<String>  listStrings= List.of(str.split(" "));

      System.out.println(listStrings);
      Map<String, Integer> mappedValues=new HashMap<>();
//      mappedValues.put(1,)
      int length=listStrings.size();
     for (String s : listStrings) {
             System.out.println("the value for key 1 is:" + mappedValues.get(1));
             mappedValues.put(s, mappedValues.getOrDefault(s, 0) + 1);
     }
      System.out.println("the repeated values are :" + mappedValues);
  }

    public static void main(String[] args) {
        //method();
       /* int start=10;
        int end=20;
        for (int i=start; i<=end; i++){
            if (primeNumbers(i)){
                System.out.println("prime numbers :"+i);
            }
        }
*/
        //repetedCharecterInString("the main value of the main is");
        regularExpressions();
    }



}
