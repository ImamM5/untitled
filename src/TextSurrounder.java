import java.nio.charset.StandardCharsets;

public class TextSurrounder{
    public static void main(String args[]) {
        String example1 = "This is the first line!\nThis is the second Line!\n";
        String example2 = "A world of dew,\nAnd within every dewdrop\nA world of struggle.\n";
        String example3 = "A dozen, a gross, and a score\nPlus three times the square root of four\nDivided by seven\nPlus five times eleven\nIs nine squared and not a bit more.\n";

        textSurrounder(example1,"*");
        textSurrounder(example2,"+");
        textSurrounder(example3,"=");

    }
    public static void textSurrounder(String str,String s)
    {
        int n = str.indexOf("\n");
        String last = new StringBuilder(str).reverse().toString();
        String reverse = last.substring()

        String str1 = str.substring(0, n);
        int len1 = str1.length();
        int n1 = last.indexOf("\n");
        String str2 = last.substring(1, n1);
        int len3 = str2.length();

        for (int i = 0; i < (len1+2); i++)
        {
            System.out.print(s);
        }
        System.out.println();
        System.out.println(s + str1 + s);
        System.out.println(s + str2 + s);

        for (int j = 0; j < (len3+2); j++)
        {
            System.out.print(s);
        }
        System.out.println();

    }
}
