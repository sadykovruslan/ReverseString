public class Brackets {
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
//        '(', ')', '{', '}', '[' и ']'

    }

    public static boolean isValid(String s) {
        if (s==null || s.length() % 2 != 0) {
            return false;
        } else {
            char[] brackets = s.toCharArray();
            for( char d : brackets ){
                if(!(d=='(' || d==')' || d=='[' || d==']' || d=='{' || d=='}')) {
                    return false;
                }
            }
        }
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        } if (s.length()==0){
            return true;
        } return false;

        }
    }

