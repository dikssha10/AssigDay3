package arrayProgram;

public class PrintSmallestElement {
    public static void main(String[] args) {

        int[] arr = {11,22,33,44,55};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element is: " + smallest);
    }
}
