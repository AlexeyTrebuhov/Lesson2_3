///Написать метод, который проверяет валидность логина и пароля (где нибудь в переменных сохраните)
// и при помощи конструкции try-catch рекурсивно принимайте данные (нужно ограничить колиичество
// попыток до 6 и после 3 попытки должно быть сообщение, мол вы привысили количество попыток,
// немного пододождите //тут можете поток заслипить на некоторое время. А когда попытки кончатся тогда - выйти)

import java.util.Scanner;

public class Main1 extends Thread {
    public static void main(String[] args) {

        int login = 777777;//  логин для сверки
        int pass = 123457; // пароль для сверки

        try {
            System.out.println("Input login (attempt 1) = ( 7????? ) : "); // запрашиваем пароль логин первый раз
            Scanner scanner = new Scanner(System.in);
            int x0 = scanner.nextInt();
            System.out.println("Input password (attempt 1) = ( 1????? ) : ");
            int y0 = scanner.nextInt();

            if (login == x0 && pass == y0) { // если пароль-логин верные, печатаем "Доступ открыт"
                System.out.println("Assed open ");
            } else { // если логин-пароль неверен, даем второй шанс

                System.out.println("Input login (attempt 2) = ( 77????) : ");// запрашиваем пароль логин второй раз
                int x1 = scanner.nextInt();
                System.out.println("Input password (attempt 2) = ( 12????)  : ");
                int y1 = scanner.nextInt();
                if (login == x1 && pass == y1) { // если пароль-логин верные, печатаем "Доступ открыт"
                    System.out.println("Assed open ");
                } else { // если логин-пароль неверен, даем третий шанс
                    System.out.println("Input login (attempt 3) = ( 777??? ) : ");
                    int x2 = scanner.nextInt();
                    System.out.println("Input password (attempt 3) = ( 123??? ) : ");
                    int y2 = scanner.nextInt();
                    if (login == x2 && pass == y2) { // если пароль-логин верные, печатаем "Доступ открыт"
                        System.out.println("Assed open ");
                    } else { // если логин-пароль неверен, слипим на 1 секунду и даем четвертый шанс
                        System.out.println("Sleep 5 sec");
                        Thread.sleep(5000);

                        System.out.println("Input login (attempt 4) = ( 7777?? ) : ");
                        int x3 = scanner.nextInt();
                        System.out.println("Input password (attempt 4) = ( 1234?? ) : ");
                        int y3 = scanner.nextInt();
                        if (login == x3 && pass == y3) { // если пароль-логин верные, печатаем "Доступ открыт"
                            System.out.println("Assed open ");
                        } else { // если логин-пароль неверен, даем пятый шанс
                            System.out.println("Input login (attempt 5) = ( 77777? ) : ");
                            int x4 = scanner.nextInt();
                            System.out.println("Input password (attempt 5) = ( 12345? ) : ");
                            int y4 = scanner.nextInt();
                            if (login == x4 && pass == y4) { // если пароль-логин верные, печатаем "Доступ открыт"
                                System.out.println("Assed open ");
                            } else { // если логин-пароль неверен, даем последний шестой  шанс
                                System.out.println("Input login (attempt 6) = ( 777777 ) : ");
                                int x5 = scanner.nextInt();
                                System.out.println("Input password (attempt 6) = ( 123457 ) : ");
                                int y5 = scanner.nextInt();
                                scanner.close();  // вводим пароль логин
                                if (login == x5 && pass == y5) { // если пароль-логин верные, печатаем "Доступ открыт"
                                    System.out.println("Assed open ");

                                }else{
                                int z = 1 / 0;}
                            }
                        }
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Access denied ");
        } finally {
            System.out.println("finally");

        }
    }

}