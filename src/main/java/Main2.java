public class Main2 {
    public static void main(String[] args) {
        double firstNumber = 9.9;
        int secondNumber = 10;
        int thirdNumber = -20;

        System.out.println("Модуль: " + Math.abs(thirdNumber));
        System.out.println("Минимальное число: " + Math.min(secondNumber, thirdNumber));
        System.out.println("Максимальное число: " + Math.max(secondNumber, thirdNumber));
        System.out.println("Sin: " + Math.sin(firstNumber));
        System.out.println("Cos: " + Math.cos(firstNumber));
        System.out.println("Tan: " + Math.tan(firstNumber));
        System.out.println("Степень: " + Math.pow(secondNumber, thirdNumber));
        System.out.println("корень: " + Math.sqrt(firstNumber));
        System.out.println("ПИ: " + Math.PI);
        System.out.println("E: " + Math.E);
        System.out.println("Round: " + Math.round(firstNumber));
        System.out.println("Rand: " + Math.random());
    }
}
