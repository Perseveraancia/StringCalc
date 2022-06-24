import java.util.Scanner;

public class Input {
    private static String extractValue(String quotedValue){
        return quotedValue.replaceAll("\"", "");
    }
    public static String[] read() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] args = input.split(" ");
        if (args.length > 3) {
            throw new Exception("Больше двух аргументов");
        }
        boolean isInt = IntChecker.isIntValue(args[0]);
        if (isInt == true){
            throw new Exception("Операции, начинаемые с чисел недопустимы");
        }
        boolean inQuotes = StringQuotes.isValid(args);
        if (inQuotes == false){
            throw new Exception("Допускаются только строки в кавычках и целые числа");
        }
        args[0] = Input.extractValue(args[0]);
        args[2] = Input.extractValue(args[2]);
        return args;
    }

}
