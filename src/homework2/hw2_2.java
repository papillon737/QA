package homework2;

/*При применении к массиву строк поля length, можно узнать сколько
        элементов находится в массиве.
        Тоесть если у Вас есть массив строк типа: String[] arrayOfString;
        то при вызове поля lenth:
        int size = arrayOfString.length;
        можно получить какое количество символов находится в данном массиве.

        Попробовать, используя метод split и информацию по поводу поля length, вывести на экран какое количество раз
        символ 'a' встречается в  строке:
        "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method."

        Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.*/

public class hw2_2 {
    public static void main(String[] args) {
        String text = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        String[] words = text.split(" ");
        int count = 0;

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (c == 'a' || c == 'A') {
                    count++;
                }
            }
        }

        System.out.println("Количество символов 'a': " + count);
    }
}
