import java.util.Scanner;

public class Solution
{
    public static char mostFrequentChar(String string)
    {
        char mostFrequentChar = string.charAt(0);
        int maxCount = 0;
        int[] charCount = new int[256];

        for (char c : string.toCharArray())
        {
            charCount[c]++;

            if (charCount[c] > maxCount || (charCount[c] == maxCount && string.indexOf(c) < string.indexOf(mostFrequentChar)))
            {
                maxCount = charCount[c];
                mostFrequentChar = c;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String string = "";
        System.out.print("Please enter a string: ");
        string = keyboard.nextLine();
        Solution test = new Solution();
        char result = test.mostFrequentChar(string);
        System.out.println(result);
    }
}
