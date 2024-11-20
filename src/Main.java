import java.io.File;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        DataReader readData = new DataReader();
        DisplayData displayData = new DisplayData();

        String path = "Data\\ThreeDData_02.txt ";
        File file = new File(path);
        //file.notify();

        double [][] threeDdata = readData.read3Ddata(file);
        displayData.displayColor(threeDdata);


        for(double [] out : threeDdata)
        {
            System.out.println(Arrays.toString(out));
        }

    }
}