import java.util.*;
public class task_3 {
    public static void main(String[] args)
    {
        String[] arr1 = {"kll", "nll", "mll"};
        int size = arr1.length;
        if (size == 0){
            System.out.println("Longest common prefix: ");
        }
        else if (size == 1){
            System.out.println("Longest common prefix: " + arr1[0]);
        }
        else{
            Arrays.sort(arr1);
            int length = arr1[0].length();
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < length; i++){
                if(arr1[0].charAt(i) == arr1[size - 1].charAt(i)){
                    res.append(arr1[0].charAt(i));
                }
                else{
                    break;
                }
            }
            String result = res.toString();
            System.out.println("Longest common prefix: " + result);
        }
    }
}
