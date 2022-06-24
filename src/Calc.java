public class Calc {
    public static String calculate(String wrd, String wrd1, String opr) throws Exception {
        int num1 = 0;
        String result = new String();
        if (wrd.length() > 10){
            throw new Exception("Размер вводимых строк не должен превышать 10 символов");
        }
        if (wrd1.length() > 10){
            throw new Exception("Размер вводимых строк не должен превышать 10 символов");
        }

        switch (opr) {
            case "-":
                result = wrd.replaceFirst(wrd1, "");
                break;
            case "+":
                result = wrd + wrd1;
                break;
            case "*":
                num1 = Integer.parseInt(wrd1);
                if (num1 < 1 || num1 >10){
                    throw new Exception("Используйте множитель от 1 до 10");
                }
                for (int i = 0; i < num1; i++) {
                    result += wrd;
                }
                if (result.length() > 40) {
                    result = result.substring(0, 39) + "...";
                }
                break;
            case "/":
                num1 = Integer.parseInt(wrd1);
                if (num1 < 1 || num1 >10){
                    throw new Exception("Используйте делитель от 1 до 10");
                }
                int stringLength = Math.round(wrd.length() / num1);
                result = wrd.substring(0, stringLength);
                break;
            default:
                throw new Exception("Ошибка");
        }
        return result;
    }
}
