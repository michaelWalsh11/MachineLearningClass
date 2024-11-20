import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Tester_00 tester = new Tester_00();
        DataReader readData = new DataReader();
        DisplayData displayData = new DisplayData();

        String path = "Data\\OneDData_02_short.txt";
        File file = new File(path);
        tester.readAndPrintData(path);

        ArrayList<Double> oneDdata = readData.read1Ddata(file);
        displayData.displayOneD(oneDdata);

        for (double num : oneDdata)
        {
            System.out.println(num);
        }

        tester.testDrawing();

    }
}