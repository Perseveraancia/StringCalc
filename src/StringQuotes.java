public class StringQuotes {
    private static boolean isQuoted(String quote){
        return quote.startsWith("\"") && quote.endsWith("\"");
    }
    public static boolean isValid(String[] values){
        String opr = values[1];
        switch (opr){
            case "*":
            case "/":
                return StringQuotes.isQuoted(values[0]) && IntChecker.isIntValue(values[2]);
        }
        return StringQuotes.isQuoted(values[0]) && StringQuotes.isQuoted(values[2]);
    }
}