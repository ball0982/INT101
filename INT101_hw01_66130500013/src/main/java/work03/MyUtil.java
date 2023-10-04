package work03;

public class MyUtil {

    public static double calculateBMI(double weight,double height){
        int m = 100;
        double hEight = height/m;
        double hEight2 = hEight*hEight;
        double BMI = weight/hEight2;

        return BMI;
    }

    public static double average(int v1,int v2,int v3){
        int nS = 3;
        double averageTotal = (double)(v1+v2+v3)/nS ;
        return averageTotal;

    }
}
