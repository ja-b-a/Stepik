public class Main {
    public static void main(String[] args) {
        // 2.1 Вывод на экран

        System.out.print("Hello, World!");

        //1. Выведите на экран сообщение:  «My name is Java!».
        System.out.println("My name is Java!");

        /*2. Выведите на экран сообщения(соблюдая перевод строк):
        I like programming!
        This is my homework
        5 + 1
        100*/
        System.out.println("I like programming!");
        System.out.println("This is my homework");
        System.out.println("5 + 1");
        System.out.println("100");

        /*3. Выведите на экран сообщения(соблюдая перевод строк):
        Math operations
        900 - 10000
        5 + 100
        100 + 100*/
        System.out.println("Math operations");
        System.out.println("900 - 10000");
        System.out.println("5 + 100");
        System.out.println("100 + 100");

        /*4. Напиши программу, которая выведет в консоль следующее сообщение (каждую строку отдельно):
        Изучать Java — это интересно!
                Не бойся делать ошибки.
                Каждый день ты становишься лучше!*/
        System.out.println("Изучать Java — это интересно!");
        System.out.println("Не бойся делать ошибки.");
        System.out.println("Каждый день ты становишься лучше!");

        /*5. Напиши программу, которая выведет в консоль список покупок, по одному пункту на строку.
        Список покупок:
        1. Хлеб
        2. Молоко
        3. Яблоки
        4. Шоколад*/
        System.out.print("""
                Список покупок:
                1. Хлеб
                2. Молоко
                3. Яблоки
                4. Шоколад
                """);

        /*6. Перед тобой программа, в которой не хватает пояснений.
        Добавь однострочные комментарии к каждой строке, объясняющие, что делает код.*/
        /*public class Main { // Это класс
            public static void main(String[] args) { // Это метод
                int a = 5; // присваиваем переменной "а" значение 5
                int b = 7; // присваиваем переменной "b" значение 7
                int sum = a + b; // переменной sum присваиваем значение суммы a и b
                System.out.println(sum); // выводим значение переменной sum
            }
        }
        */

        /*7. В коде ниже используй многострочный комментарий, чтобы временно отключить часть кода (без удаления).
        Программа должна выполнить только одну строку вывода — это «Удачи!».
                System.out.println("Привет!");
                System.out.println("Это тестовая программа.");
                System.out.println("Удачи!");*/

                /*System.out.println("Привет!");
                System.out.println("Это тестовая программа.");*/
        System.out.println("Удачи!");



        /*Перед тобой программа, которая выводит информацию о пользователе. Используй многострочный комментарий,
        чтобы временно отключить вывод возраста и города. Программа должна вывести только имя.
        public class Main {
            public static void main(String[] args) {
                System.out.println("Имя: Алексей");
                System.out.println("Возраст: 25");
                System.out.println("Город: Москва");
            }
        }*/

        System.out.println("Имя: Алексей");
        /*System.out.println("Возраст: 25");
        System.out.println("Город: Москва");*/

        //перенос строки
        System.out.println("My name is \nJava!");
    }
}
