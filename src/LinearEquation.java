public class LinearEquation {
    private int xOne; // variables for points to be entered
    private int xTwo;
    private int yOne;
    private int yTwo;
    private String firstPairLocation; // variables to store calculations from constructor and use in toString
    private String secondPairLocation;
    private String slopeIs;
    private String yInterceptIs;
    private String slopeIntercept;
    private String distance;
    public LinearEquation(int x1, int y1, int x2, int y2){ // constructor does all logic
        xOne = x1;
        xTwo = x2;
        yOne = y1;
        yTwo = y2;
        firstPairLocation = "(" + x1 + "," + y1 + ")";
        secondPairLocation = "(" + x2 + "," + y2 + ")";
        double slope = (y2-y1)/(x2-x1);
        slopeIs = "" + slope;
        int yIntercept = (y1-((int)slope*x1));
        yInterceptIs = "" + yIntercept;
        slopeIntercept = (y2-y1) + "/" + (x2-x1) + "x" + " + " + yIntercept;
        distance = "" + Math.round((Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1))))*100.0)/100.0;
    }
    public String coordinateSolver(double thirdX) // solves the coordinate for the third x value
    {
        double solvedCoordinate = (((yTwo-yOne)/(xTwo-xOne))*thirdX) + (yOne-((((yTwo-yOne)/(xTwo-xOne)))*xOne));
        return "" + solvedCoordinate + ")";
    }
    public String toString(){ // toString prints all information
        String toString = "First pair: " + firstPairLocation + " \n";
        toString = toString + "Second pair: " + secondPairLocation + " \n";
        toString = toString + "Slope of line: " + slopeIs + " \n";
        toString = toString + "Y-intercept: " + yInterceptIs + " \n";
        toString = toString + "Slope intercept form: y = " + slopeIntercept + " \n";
        toString = toString + "Distance between points: " + distance + " \n";
        return toString;
    }
}
