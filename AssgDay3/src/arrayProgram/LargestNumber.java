package arrayProgram;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {4,8,5,2,1};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(a[i] > a[j]){
                arr = a[i];
                a[i] = a[j];
                a[j] = arr;
            }
       /*if(arr[i]>largest) {
           second_largest = largest;
           largest = arr[i];
       }
       else if(arr[i] > second_largest && arr[i] != largest){
           second_largest=arr[i];
       }*/
    }
       /* if(second_largest==Integer.MIN_VALUE){
            System.out.println("There is no second largest number");
        }
        else {
            System.out.println("second largest value is:" + second_largest);
        }*/
    }
}
