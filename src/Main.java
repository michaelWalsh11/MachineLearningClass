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

        String path = "Data\\ThreeDData_randomInt.txt ";
        File file = new File(path);
        //tester.readAndPrintData(path);

        double [][] threeDdata = readData.generate3dData(100000);
        displayData.displayColor(threeDdata);


        for(double [] out : threeDdata)
        {
            System.out.println(Arrays.toString(out));
        }


        //tester.testDrawing();

    }
}