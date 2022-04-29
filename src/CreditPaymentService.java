public class CreditPaymentService {
    public double calculate(double interestRate, int numberOfYearOfLoanRepayment, int loanAmount) {
        double interestRateOnTheLoanPerMonth = interestRate / 1200;                     //Процентная ставка в месяц
        double interestRateForTheFormula = 1 + interestRateOnTheLoanPerMonth;           //Процентная ставка для расчета степени
        double numberOfMonths = numberOfYearOfLoanRepayment * 12;                       //Преобразование количества лет в количество месяцев
        double exponentiation = Math.pow(interestRateForTheFormula, numberOfMonths);    //Возведение в степень
        double annuityRatioNumerator = interestRateOnTheLoanPerMonth * exponentiation;  //Числитель формулы расчета коэффициента аннуитента
        double annuityRatioDenominator = exponentiation - 1;                            //Знаменатель формулы расчета коэффициента аннуитента
        double annuityRatio = annuityRatioNumerator / annuityRatioDenominator;          //Формула расчета коэффициента аннуитента
        double paymentRatio = annuityRatio * loanAmount;                                //Формула расчета ежемесячного платежа

        return paymentRatio;                                                            //Передача полученного результата в main
    }
}

