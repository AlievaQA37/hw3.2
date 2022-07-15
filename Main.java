public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heft = 50; // килограмм
        double height = 1.67; // метр
        double bmi = service.calculate(heft, height);
        System.out.println("индекс массы тела = " + bmi);
    }
}