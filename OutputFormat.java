/*Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
Input Format
Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
Output Format
In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
Sample Input
java 100
cpp 65
python 50
Sample Output
================================
java           100 
cpp            065 
python         050 
================================
Explanation
Each String is left-justified with trailing whitespace through the first  15 characters. The leading digit of the integer is the  16 th character, and each integer that was less than  digits now has leading zeroes. explain this step by step clearly 
*/
/*Explanation also here to refer
1. Understanding the Format Specifier
The "secret sauce" for this challenge is the string format: %-15s%03d%n.

Let’s break down exactly what each part of that code does:

%-15s:

%: Starts the format specifier.

-: Tells Java to left-justify the text (align it to the left).

15: Reserves exactly 15 characters for the string. If the string is shorter (like "java"), Java adds spaces at the end to fill the gap.

s: Stands for String.

%03d:

0: Tells Java to pad the number with leading zeroes instead of spaces.

3: Reserves exactly 3 digits for the number.

d: Stands for Decimal integer.

%n:

This is a platform-independent way to add a new line (similar to \n).

2. The Step-by-Step Logic

Step A: Print the Header
The problem requires a border at the top.

Java

System.out.println("================================");

Step B: Use a Loop to Read Input
You will usually be given a loop to read the String and the Integer for each line.

Java

for(int i=0; i<3; i++) {
    String s1 = sc.next();
    int x = sc.nextInt();
    // This is where the formatting happens
    System.out.printf("%-15s%03d%n", s1, x);
}
Step C: Print the Footer
Finally, close the border.

Java

System.out.println("================================");
3. Visual Example of Formatting
If the input is cpp 65:

%-15s takes "cpp" and turns it into "cpp " (cpp + 12 spaces).

%03d takes 65 and turns it into "065".

Combined, they look like: cpp 065*/
import java.util.Scanner;

public class OutputFormat{

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
                //Complete this line
            }
            System.out.println("================================");

    }
}


