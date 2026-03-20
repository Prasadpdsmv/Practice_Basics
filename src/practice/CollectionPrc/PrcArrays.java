package practice.CollectionPrc;


public class PrcArrays {
    //static int rllnumbers[] = {54,32,65,78,12};

    public static int method1(int rllnumbers[]) {
        int size = rllnumbers.length;
        int largest = -1;
        int secondLargest = -1;
        int thirdLargest = -1;

        for (int i = 0; i < size; i++) {

            if (rllnumbers[i] > largest) {

                largest = rllnumbers[i];
            }
        }

        for (int i = 0; i < size; i++) {
            if (rllnumbers[i] > secondLargest && rllnumbers[i] != largest) {
                secondLargest = rllnumbers[i];
            }
            return secondLargest;
        }

        for (int i = 0; i < size; i++) {
            if (rllnumbers[i] > thirdLargest && rllnumbers[i] < secondLargest) {
                thirdLargest = rllnumbers[i];
            }


        }
        return thirdLargest;
    }

    public static void main(String[] args) {
        int[] arr={54,32,65,78,12,92,64};
        System.out.println("third largest :"+method1(arr));

    }
}
