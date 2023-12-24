package Entity;

public class three { //третье задание
    public static void main(String[] args) {
        String[] strings = {"Moskow", "Khabarovsk", "Vladivostok"};
        String longstroka = Longstroka(strings);
        System.out.println("Самая длинная строка: " + longstroka);
    }
    public static String Longstroka(String[] strings) {
        String longstroka = "";
        for (String string : strings) {
            if (string.length() > longstroka.length()) {
                longstroka = string;
            }
        }
        return longstroka;
    }
}
