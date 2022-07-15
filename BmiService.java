public class BmiService {
    public double calculate(double heft, double height) {
        double bmi = heft / (height * height);
        return bmi;
    }
}
