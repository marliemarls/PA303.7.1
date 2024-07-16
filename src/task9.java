import java.util.Arrays;

public class task9 {
    public static void main(String[] args) {
        int [] arr =  {4, 2, 9, 13, 1, 0};
        Arrays.sort(arr);
        System.out.println("Array in ascending order: "+ Arrays.toString(arr));
        System.out.println("The smallest number is "+ arr[0]);
        System.out.println("The biggest number is "+ arr[5]);
    }
}
