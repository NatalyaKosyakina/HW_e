import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        task1();
        System.out.println("\n \n Task 2");
        task2(new int[0], 0);
        System.out.println("\n \n Task 3");
        task3();
        System.out.println("\n \n Task 4");
        task4();

    }

    public static void task1(){
        InputStream inputStream;
        String[] strings = {"asdf", "asdf"};
        String strings1 = strings[1];
        try {
            int a = 1/1;
            inputStream = new FileInputStream(test());
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я всё равно выполнился!");
        }
        System.out.println("Я жив!");
    }
    public static File test(){
        try {
            File file = new File("1");
            file.createNewFile();
            FileReader reader = new FileReader(file);
            reader.read();
            reader.close();
            return file;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void task2(int[] intArray, int d){
        if (intArray.length < 9){
            System.out.println("Массив недостаточной длины");
        }
        if (d == 0) {
            System.out.println("Деление на ноль");
        } else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }

    public static void task3(){
        int a = 90;
        int b = 3;
        if (b!= 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Деление на ноль");
        }
        printSum(23, 234);
        int[] abc = { 1, 2 };
        if (abc.length > 3){
            abc[3] = 9;
        } else {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }

    public static void task4() {
        System.out.println("Write something: ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        if (string.isEmpty() || string == "") {
            string = null;
            try {
                string.hashCode();
            } catch (NullPointerException e) {
                System.out.println("You can't input nothing.");
            }
        } else System.out.println(string);
    }

}