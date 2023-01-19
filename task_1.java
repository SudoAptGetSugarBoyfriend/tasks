import java.util.Scanner;
public class task_1 {
    public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        String s[] = new String[]{
                con.nextLine().toString()
        };
        boolean flag = false;
        int open  = 0;
        for(int i = 0; i < s.length; i++)
        {
            if (s[i] == "(" || s[i] == "[" || s[i] == "{")
                open++;
            else
                open--;
            if (open < 0)
                flag = true;
        }
        if (flag || (open > 0))
            System.out.println("INCORRECT");
        else
            System.out.println("CORRECT");
        con.close();
    }
}