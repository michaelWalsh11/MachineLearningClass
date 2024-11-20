import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Tester_00 tester = new Tester_00();

        String path = "Data\\data.txt";
        tester.readAndPrintData(path);

        tester.testDrawing();

    }
}