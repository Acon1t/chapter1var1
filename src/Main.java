import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;
    public class Main {
        public static void main(String[] args) {
            createPasword();
            randomiser();
            imputNumbers();
            razrabot();
            imputName();
            imputArgument();
        }

        private static void imputName() {System.out.println("Enter name and press <Enter>:");
            Scanner scan = new Scanner(System.in);
            String name = scan.next();
            System.out.println("hello, " + name);
        }

        private static void razrabot() {
            String s = "Шульга";
            Date d = new Date();
            System.out.println("Получения задания для " + s + " " + d);

            Calendar c = Calendar.getInstance();
            c.set(Calendar.YEAR,2023);
            c.set(Calendar.MONTH,Calendar.FEBRUARY);
            c.set(Calendar.DAY_OF_MONTH,12);

            System.out.println("Сдача задания для " + s + " " + c.getTime());
        }

        private static void imputNumbers() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ввести целые числа: ");
            int number = scanner.nextInt();
            int sum = 0;
            int com = 1;
            while (number != 0) {
                com = com * (number % 100);
                sum = sum + (number % 100);
                number = number / 100;}
            System.out.println("Произведение введённых чисел: " + com);
            System.out.println("Cумма введённых чисел: " + sum);

        }



        private static void createPasword() {
            Scanner scann = new Scanner(System.in);
            System.out.print("Введите пароль: ");
            String pasword1 = scann.next();
            String pasword2 = "1234";
            if (pasword1.equals(pasword2))
                System.out.println("Пароль верный");
            else System.out.println("Пароль не верный");
        }

        private static void imputArgument() {
            System.out.println("Enter argument and press <Enter>:");
            Scanner scann = new Scanner(System.in);
            for (int i = 0; true; i++) {
                String reverse = new StringBuffer(scann.nextLine()).reverse().toString();
                System.out.println(reverse.toString());
            }
        }

        private static void randomiser() {
            int a = 0;
            int b = 246;
            for (int f = 0; f < 10; f++) {
                int random_number1 = a + (int) (Math.random() * (b - a)) + a;
                System.out.print(" " + random_number1);
            }

        }}




