package practice.CollectionPrc;

import java.util.*;
import java.util.stream.Stream;

public class ListPractice {


    public void frqnSetfindings(){

        int[] nums={1,2,3,4,4,2,3,4};
        Set<Integer> noDuplicates=new HashSet<>();
        for (int i : nums){

            int count=0;

        }

        System.out.println(noDuplicates);

        System.out.println("^^^^^^^^^^&&&&&&&&&&&&&&&&&&&&&&&&**********");
        System.out.println("frequency");
        List<Integer> listArry= Arrays.asList(1,2,3,4,2,3,4,2, 2 ,2);
        int fres =0;
        String s1="s";
        for (int i : nums){
             fres=Collections.frequency(listArry, 2);
        }
        System.out.println("frequency :"+fres);
        s1="error"+"2";

        System.out.println(s1);

    }
    public void listPrtc(){
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // 2. Access elements
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Last fruit: " + fruits.get(fruits.size() - 1));

        // 3. Update element
        fruits.set(1, "Blueberry");
        fruits.get(1);



        // 5. Iterate using for-each loop
        System.out.println("Iterating with for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 6. Iterate using Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        it.remove();
        // 7. Sorting
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        // 8. Using LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        System.out.println("Numbers List: " + numbers);

        System.out.println("===========================");

        numbers.forEach(number -> System.out.println("for each bbbb"+numbers));

        // 9. Sorting numbers
        Collections.sort(numbers);
        System.out.println("Sorted Numbers: " + numbers);

        // 10. Searching
        if (fruits.contains("Apple")) {
            System.out.println("Apple is in the list!");
        }

        // 11. Convert List to Array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Array from List: " + Arrays.toString(fruitArray));

        // 12. Clear list
        fruits.clear();
        System.out.println("After clear: " + fruits);

        Collections.sort(numbers);

        Comparator<Integer> compa=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {  // here we giving our own logic
                if(o1>o2){
                    return 1;
                }
                else return -1;
            }
        };

        Collections.sort(numbers, compa);

        //(Stream<List>)numbers;

        Stream<Integer> str=numbers.stream();

        //str.forEach(v -> System.out.println("sdgs"));

        Map<String, Integer> map=new HashMap<>();


        String s="a4k2";
    }
    public static void main(String[] args) {
        // 1. Create a List using ArrayList

        ListPractice obj = new ListPractice();
        //obj.frqnSetfindings();
        String s1;

        s1="error"+"2";

        //but
        char c;

        c='d'+'s';

        System.out.println(c);

        System.out.println(s1);

        int x=' ';

        System.out.println("value of x: "+x);

        char c1=69;

        System.out.println("value number in char: "+c1);

        String str="the value";

        char[] cArry=str.toCharArray();

        for (char e : cArry){
            int vlaueIN=e;

            System.out.println("value of char to ingr array t: "+vlaueIN);
        }



    }
}