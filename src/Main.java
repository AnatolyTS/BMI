public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(180, 90);
        System.out.println(bmi);
        int bmi1 = service.calculate(170, 70);
        System.out.println(bmi1);
        int bmi2 = service.calculate(200, 50);
        System.out.println(bmi2);
        int bmi3 = service.calculate(156, 80);
        System.out.println(bmi3);
    }
}
