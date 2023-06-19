package arrayProgram;

public class PrintLargestElement {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element is: " + largest);
    }
}
