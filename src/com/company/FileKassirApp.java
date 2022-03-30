package com.company;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FileKassirApp {


   public static void main(String[] args)  {

        new File("Kassir.txt");
        System.out.println("Ввести данные или отобразить?");
        System.out.println("1. Ввести");
        System.out.println("2. Отобразить");

        Scanner sc = new Scanner(System.in);
       int option = sc.nextInt();

         try {                                                // обработка(try-catch)
             if (option == 1) {
                 System.out.println("Заполнить данные и сохранить");
                 dbWrite(sc);
             } else if (option == 2) {
                 System.out.println("Список кассиров:");
                 dbRead();
             }
            else if (optionNumber(option)) {
              System.out.println("Попробуйте еще раз");
             }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         } finally {
             System.out.println("Завершено");
         }
    }

    private static void dbWrite(Scanner sc) {    // запись объекта в файл Kassir.txt
        try (FileWriter fw = new FileWriter("Kassir.txt", true)) {
            fw.write("name:" + sc.next() + " ");
            fw.write("age:" + sc.next() + " ");
            fw.write("number:" + sc.next() + " ");
            fw.write("sale:" + sc.next() + " ");
            fw.write("\n");
            fw.flush();
            System.out.println("Информация записана в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void dbRead() {  //чтение из файла Kassir.txt

        try (BufferedReader br = new BufferedReader(new FileReader("Kassir.txt"))) {
            String text;
            while ((text = br.readLine()) != null) {

                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean optionNumber(int option) throws Exception {   // throws Exception
               if (option != 1 & option != 2) {
                throw new Exception("Получено неверное значение. Попробуйте еще раз");
           }
        return false;
               }
    }



