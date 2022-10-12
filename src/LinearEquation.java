public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private String firstPairLocation;
    private String secondPairLocation;
    private String slopeIs;
    private String yInterceptIs;
    private String slopeIntercept;
    private String distance;
    public LinearEquation(int x1, int y1, int x2, int y2){
        firstPairLocation = "First pair: (" + x1 + "," + y1 + ")";
        secondPairLocation = "Second pair: (" + x2 + "," + y2 + ")";
        double slope = (y2-y1)/(x2-x1);
        slopeIs = "Slope of line: " + slope;
        int yIntercept = (y1-((int)slope*x1));
        yInterceptIs = "Y-intercept: " + yIntercept;
        slopeIntercept = "y = " + (y2-y1) + "/" + (x2-x1) + "x" + "+ " + yIntercept;
        distance = "Distance between points: " + Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
    }
    public String toString(){
        String toString = firstPairLocation + "/n";
        toString = toString + secondPairLocation + "/n";
        toString = toString + slopeIs + "/n";
        toString = toString + yInterceptIs + "/n";
        toString = toString + slopeIntercept + "/n";
        toString = toString + distance + "/n";
        return toString;
    }
}
