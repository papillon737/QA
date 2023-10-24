package homework2;

/*Создать строку string = "Testing, is my favourite job".
        Вывести на экран отдельно каждое слово и длину этого слова в след виде:
        Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
        Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
        и т.д.
        Вывести на консоль true, если первое слово длиннее остальных, в
        противном случае вывести false.*/

public class hw2_1 {
    public static void main(String[] args) {
        String string = "Testing , is my favourite job";
        String[] words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = word.length();
            System.out.println("Cлово" + (i + 1) + " = " + word + ", Длина этого слова = " + length);
        }

        boolean isFirstWordLongest = true;
        int firstWordLength = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > firstWordLength) {
                isFirstWordLongest = false;
                break;
            }
        }

        System.out.println("Первое слово длиннее остальных: " + isFirstWordLongest);
    }
}
