public class Main4 {
    public static void main(String[] args) {

        double doubleNumber = 3.0 - 2.2;
        double resultNumber = 0.8;
        double difference = Math.abs(doubleNumber - resultNumber);
        double epsilon = 0.00000000000001;

        System.out.println("Первое число: " + doubleNumber);
        System.out.println("Второе число: " + resultNumber);
        //System.out.println("Сравнение: " + (doubleNumber == resultNumber));
        System.out.println("Разница: " + difference);

        boolean comparinson = difference < epsilon ? true : false;
        System.out.println("Равны ли числа: " + comparinson);
    }
}
// не меньше 15 нулей