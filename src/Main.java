import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Tester_00 tester = new Tester_00();
        DataReader readData = new DataReader();
        DisplayData displayData = new DisplayData();

        String path = "Data\\TwoDData_02_long.txt";
        File file = new File(path);
        //tester.readAndPrintData(path);

        double [][] twoDdata = readData.read2Ddata(file);
        displayData.displayTwoD(twoDdata);


        for(double [] out : twoDdata)
        {
            System.out.println(Arrays.toString(out));
        }


        //tester.testDrawing();

    }
}