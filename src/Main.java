public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment1 = service.calculate(9.99, 1, 1000000);  //Исходные данные для расчета
        double monthlyPayment2 = service.calculate(9.99, 2, 1000000);  //Исходные данные для расчета
        double monthlyPayment3 = service.calculate(9.99, 3, 1000000);  //Исходные данные для расчета

        System.out.println("Ваш ежемесячный платеж составит " + (int) Math.round(monthlyPayment1) + "р");                 //Вывод результата с округлением до целого числа
        System.out.println("Ваш ежемесячный платеж составит " + (int) Math.round(monthlyPayment2) + "р");
        System.out.println("Ваш ежемесячный платеж составит " + (int) Math.round(monthlyPayment3) + "р");
    }
}
