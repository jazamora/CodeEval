/*
CHALLENGE DESCRIPTION:
You are given two strings 'A' and 'B'. Print out a 1 if string 'B' occurs at the end of string 'A'. Else a zero.

INPUT SAMPLE:
The first argument will be the path to the input filename containing two strings, comma delimited, one per line. Ignore all empty lines in the input file. E.g.

Hello World,World
Hello CodeEval,CodeEval
San Francisco,San Jose

OUTPUT SAMPLE:
Print out 1 if the second string occurs at the end of the first string. Else zero. Do NOT print out empty lines between your output. E.g.

1
1
0
*/
import java.io.*;
public class TrailingString {
    public static void main (String[] args) {
        try{
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] lineArray = line.split(",");
                String s1 = lineArray[0];
                String s2 = lineArray[1];
                int end1 = s1.length()-1;
                int end2 = s2.length()-1;

                if(end2 > end1){
                    System.out.println("0");
                }else{
                    int isSub = 1;
                    while(end2 >= 0){
                        if(s1.charAt(end1--) != s2.charAt(end2--)){
                            isSub = 0;
                            break;
                        }
                    }
                    System.out.println(isSub);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}