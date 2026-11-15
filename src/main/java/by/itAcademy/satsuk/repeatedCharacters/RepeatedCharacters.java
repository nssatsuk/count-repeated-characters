package by.itAcademy.satsuk.repeatedCharacters;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";

        char symbol1 = 'o';
        int count1 = 0;

        char symbol2 = ',';
        int count2 = 0;

        char symbol3 = 'Q';
        int count3 = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol1) {
                count1++;
            } else if (text.charAt(i) == symbol2) {
                count2++;
            }
        }
        System.out.println("Кол-во символа o = " + count1);
        System.out.println("Кол-во запятых = " + count2);

    }
}
