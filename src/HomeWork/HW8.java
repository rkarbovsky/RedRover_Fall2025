package HomeWork;

public class HW8 {
    public static void main(String[] args) {

        System.out.printf(intToString(1055464309));

    }

    public static String intToString(int a) {
        String str = String.valueOf(a);
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0') {
                string += " ноль";
            }
            if (c == '1') {
                string += " один";
            }
            if (c == '2') {
                string += " два";
            }
            if (c == '3') {
                string += " три";
            }
            if (c == '4') {
                string += " четыре";
            }
            if (c == '5') {
                string += " пять";
            }
            if (c == '6') {
                string += " шесть";
            }
            if (c == '7') {
                string += " семь";
            }
            if (c == '8') {
                string += " восемь";
            }
            if (c == '9') {
                string += " девять";
            }

        }
        return string;
    }
}
