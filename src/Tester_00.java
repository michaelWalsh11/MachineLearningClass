import java.io.File;
import java.util.Scanner;

public class Tester_00
{
    public static void main(String[] args)
    {

    }

    public void readAndPrintData(String path)
    {
        try
        {
            File file = new File(path);
            Scanner input = new Scanner(file);

            while (input.hasNext())
            {
                String line = input.nextLine();
                System.out.println(line);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testDrawing()
    {
        int width = 400;
        int height = 400;

        StdDraw.setCanvasSize(width, height);

        StdDraw.setXscale(0, width);
        StdDraw.setYscale(height, 0);

        double points [][] = {{100, 100},
                              {200, 100},
                              {150, 50}};

        for (int i = 1; i < points.length; i++)
        {
            double x0 = points[i-1][0];
            double y0 = points[i-1][1];
            double x1 = points[i][0];
            double y1 = points[i][1];

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(x0, y0, 3);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.line(x0, y0, x1, y1);
        }

        double x0 = points[0][0];
        double y0 = points[0][1];
        double x1 = points[points.length-1][0];
        double y1 = points[points.length-1][1];
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(x1, y1, 3);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.line(x0, y0, x1, y1);
    }
}
