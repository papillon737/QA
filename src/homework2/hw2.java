package homework2;

/*1)
        Создать переменную string1 = "This line that i want to cut, cause it is too long".
        Создать строку string2 в которой должно быть помещено значение строки string1,
        Обрезанное до "This line that i want to cut, cause".
        Создать строку string3 на основе string2 которое будет содержать значение
        "This line that don't want to cut, cause it is perfect".
        Вывести на консоль каждое сообщение и его длину.*/

public class hw2 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 29); // Обрезаем string1 до нужной длины
        String string3 = string2 + " don't want to cut, cause it is perfect";

        System.out.println("string1: " + string1 + ", Длина: " + string1.length());
        System.out.println("string2: " + string2 + ", Длина: " + string2.length());
        System.out.println("string3: " + string3 + ", Длина: " + string3.length());
    }
}
