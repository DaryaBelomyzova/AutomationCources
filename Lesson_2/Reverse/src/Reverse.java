import java.util.*;

public class Reverse
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString().replaceAll("\\s+","\n"));
        System.out.println(str.replace(' ', '*'));
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(5, 10));
    }
