package HomeWork;

public class HomeWork0207 {

// В методе main инициализировать все примитивные типы и не примитивные типы.
//    Вывести их результат в консоль:

    public static void main(String[] args) {

        char Character = 'G';
        int Integer = 89;
        byte Byte = 4;
        short Short = 56;
        float Float = 4.7333436F;
        double Double = 4.355453532;
        long Long = 12121;

        System.out.println("Character " + Character);
        System.out.println("Integer " + Integer);
        System.out.println("Byte " + Byte);
        System.out.println("Short " + Short);
        System.out.println("Float " + Float);
        System.out.println("Double " + Double);
        System.out.println("Long " + Long);


//    Дано трехзначное число. Вывести на экран все цифры этого числа
//    Пример: 345
//    Вывод в консоль: Число 345 -> 3, 4, 5

        int n = 247;
        System.out.println((n % 1000 / 100) + ", " + (n % 100 / 10) + ", " + (n % 10));
    }
}
