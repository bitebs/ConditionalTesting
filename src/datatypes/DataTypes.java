package datatypes;

public class DataTypes {
    //Write a Java program that reads a number in inches, converts it to meters. Go to the editor
    public static double inchesToMeters(double inches){
        return inches * 0.0254;
    }

    //Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
    public int sumOfDigits3(int num){
        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        return sum;
    }

    //Write a Java program that reads a number and display the square, cube, and fourth power.
    public double[] power2_3_4(double val){
        double pow2 = val * val;
        double pow3 = pow2 * val;
        double pow4 = Math.pow(val, 4);
        double[] result = new double[3];
        result[0] = pow2;
        result[1] = pow3;
        result[2] = pow4;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(inchesToMeters(1));
    }
}
