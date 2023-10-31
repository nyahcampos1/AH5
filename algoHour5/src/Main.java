// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {

    }

    public char[] mostFrequentChar(String str)
    {
        int temp = 0;
        int count = 0;
        int current = 0;

        char[] maxchar = new char[str.length()];

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++)
            {
                char ch1 = str.charAt(j);

                if (ch != ch1)
                {
                    count++;
                }
            }

            if (count > temp)
            {
                temp = count;
                maxchar[current] = ch;
                current++;
            }
        }
        return maxchar;
    }
}

 */