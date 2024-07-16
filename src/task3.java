import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String [] arr = {"red", "green", "blue"};
        System.out.println(arr.length);

        String [] newArr = arr.clone();
        System.out.println(Arrays.toString(newArr));
    }


}
