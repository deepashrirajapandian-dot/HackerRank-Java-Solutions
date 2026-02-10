import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Initialize a line counter starting at 1
        int lineNumber = 1;
        
        // The loop runs as long as there is another line to read
        while (scan.hasNext()) {
            // Read the entire current line
            String lineContent = scan.nextLine();
            
            // Print: [Line Number] [Space] [Content]
            System.out.println(lineNumber + " " + lineContent);
            
            // Increment the counter for the next line
            lineNumber++;
        }
        
        scan.close();
    }
}
/*Java End-of-File (EOF) SolutionOverviewThis program demonstrates how to read an unknown number of input lines until the End-of-File (EOF) condition is met. In Java, this is a common requirement when processing data streams or files where the total number of lines is not predefined.Key Technical ConceptsScanner.hasNext(): This method is the core of the solution. It returns true if the scanner has another token in its input, allowing the program to "peek" ahead without consuming data. This is used to detect when the input stream has ended.While Loop: Since the number of iterations ($n$) is unknown, a while loop is used to continuously check for more data before attempting to read the next line.Line Numbering: An integer counter is initialized to track and display the sequence of each line processed, starting from 1.Standard Input (System.in): The program reads from stdin, which is the standard data source for most competitive programming challenges.Implementation LogicInitialize a Scanner object linked to System.in.Declare an integer variable to store the current line number.Execute a loop that persists as long as scan.hasNext() is true.Read the line content using scan.nextLine().Output the current line number followed by the string content.Increment the line counter after each successful print.*/
