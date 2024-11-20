import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader
{
    public DataReader()
    {

    }

    public double [][] generate3dData(int amount)
    {
        double [][] numbers = new double[5][amount];

        for (int i = 0; i < numbers[0].length; i++)
        {
            numbers[0][i] = (int)((Math.random() * 1920) + 1);
            numbers[1][i] = (int)((Math.random() * 1080) + 1);
            numbers[2][i] = (int)((Math.random() * 255) + 1);
            numbers[3][i] = (int)((Math.random() * 255) + 1);
            numbers[4][i] = (int)((Math.random() * 255) + 1);
        }
        return numbers;
    }

    public double [][] read3Ddata(File file)
    {
        ArrayList<String> str = new ArrayList<>();
        try
        {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext())
            {
                str.add(scanner.nextLine());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        double [][] out = new double[3][str.size()];
        String [] temp = new String[3];
        int count = 0;

        for (String string : str)
        {
            temp = string.split(", ");
            out[0][count] = Double.parseDouble(temp[0]);
            out[1][count] = Double.parseDouble(temp[1]);
            out[2][count] = Double.parseDouble(temp[2]);

            count++;

        }
        return out;
    }

    public double [][] read2Ddata(File file){
        ArrayList<String> str = new ArrayList<>();
        try
        {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext())
            {
                str.add(scanner.nextLine());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        double [][] out = new double[2][str.size()];
        String [] temp = new String[2];
        int count = 0;

        for (String string : str)
        {
            temp = string.split(",");
            out[0][count] = Double.parseDouble(temp[0]);
            out[1][count] = Double.parseDouble(temp[1]);

            count++;

        }
        return out;
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
