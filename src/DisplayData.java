import java.awt.*;
import java.util.ArrayList;

public class DisplayData {

    public DisplayData()
    {

    }
    public void displayColor(double [][] out)
    {
        int width = 800;
        int height = 600;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(height, 0);

        for (int i = 0; i < out[0].length; i++)
        {
            Color color = new Color((int) out[2][i], (int) out[2][i], (int) out[2][i]);
            double y = out[1][i];
            double x = out[0][i];
            StdDraw.setPenColor(color);
            StdDraw.filledCircle(x, y, 5);
        }
    }

    public void displayThreeD(double [][] out)
    {
        int width = 1000;
        int height = 500;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(height, 0);

        for (int i = 0; i < out[0].length; i++)
        {
            Color color = new Color((int) out[2][i], (int) out[2][i], (int) out[2][i]);
            double y = out[1][i];
            double x = out[0][i];
            StdDraw.setPenColor(color);
            StdDraw.filledCircle(x, y, 3);
        }
    }

    public void displayTwoD(double [][] out)
    {
        int width = 1000;
        int height = 500;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(height, 0);

        for (int i = 0; i < out[0].length; i++)
        {
            double y = out[1][i];
            double x = out[0][i];
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledCircle(x, y, 3);
        }
    }

    public void displayOneD(ArrayList<Double> data)
    {
        int width = 1000;
        int height = 500;

        //StdDraw.enableDoubleBuffering();

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(height, 0);

        for (int i = 0; i < data.size(); i++)
        {
            double y = data.get(i);
            double x = (double) i;
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledCircle(x, y, 3);
        }

        StdDraw.show();
    }
}
