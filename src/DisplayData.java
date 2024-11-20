import java.util.ArrayList;

public class DisplayData {

    public DisplayData()
    {

    }

    public void displayOneD(ArrayList<Double> data)
    {
        int width = 1000;
        int height = 500;

        StdDraw.enableDoubleBuffering();

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

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
