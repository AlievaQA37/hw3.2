public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heft = 52; // килограмм
        double height = 1.67 ; //  метр 
        double bmi = service.calculate(heft, height);
        System.out.println(bmi);
    }
}