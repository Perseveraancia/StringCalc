public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение типа: \"а\" + \"b\", \"a\" - \"b\", \"a\" * x, \"a\" / x");
        String[] values = Input.read();
        String opr = values[1];
        String result = Calc.calculate(values[0], values[2], opr);
        int resultLength = result.length();
        if (resultLength > 100){
            throw new Exception("Ввод символов и чисел больше 10 не допускается");
        }
        System.out.println("\"" + result + "\"");
    }
}