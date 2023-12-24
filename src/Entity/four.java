package Entity;
public class four { //четвертое задание
    public static void main(String[] args) {
        String origStroka = "Hello world";
        String Stroka = stroka(origStroka);
        System.out.println(Stroka);
    }
    public static String stroka(String str) {
        String stroka = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            stroka += str.charAt(i);
        }
        return stroka;
    }
}