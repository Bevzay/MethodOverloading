public class Challenge {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimetres(5, 2.5);
    }

    /*
     * Create a method called calcFeetAndInchesToCentimetres
     * It needs to have two parameters, feet and inches
     *
     * You should validate that the first parameter feet is >= 0
     * You should validate that the 2nd parameter inches is >= 0 and <= 12
     * return -1 from the method if either of the above is not true
     *
     * If the parameters are valid, then calculate how many cm
     * comprise the ft and inches passed in this method and return
     * that value
     *
     * Create a 2nd method of the same name but
     * with only one parameter, inches
     * validate that its >=0
     * return -1 if it is not true
     *
     * But if its valid, calculate how many ft are in inches
     * then call the other overloaded method passing
     * the correct feet and inches calculated so that
     * it can calculate correctly
     *
     * Hints: Use double for your number datatypes
     * 1 inch = 2.54cm, 1 ft = 12 inches
     */

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if(feet <= 0 && inches <= 0) {
            return -1;
        } else {
            double ftToInches = feet * 12;
            double inchesToCm = (inches * 2.54) + (ftToInches * 2.54);
            System.out.println(feet + " ft and " + inches + " inches = " + inchesToCm + " cm");
            return inchesToCm;
        }
    }

}
