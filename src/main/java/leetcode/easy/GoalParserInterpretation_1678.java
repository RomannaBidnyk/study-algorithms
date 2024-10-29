package leetcode.easy;

public class GoalParserInterpretation_1678 {

    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        char[] letters = command.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'G') result.append("G");
            else if (letters[i] == '(') {
                if (letters[i + 1] == ')') result.append("o");
                else result.append("al");
            }
        }
        return result.toString();
    }

    public static String interpret2(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

}