import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader
{
    public DataReader()
    {

    }

    public ArrayList<Double> read1Ddata(File file)
    {
        ArrayList<Double> output = new ArrayList<Double>();
        try
        {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext())
            {
                double number = scanner.nextDouble();
                output.add(number);
            }

            scanner.close();

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return output;
    }


}
