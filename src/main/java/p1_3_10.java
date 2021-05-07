import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class p1_3_10 {
    public static void main(String[] args) throws IOException {
        // (( 1 + 2) * ((3 - 4) * (5 - 6)))
        Stack<Character> stack = new Stack<>();
        try (InputStream inputStream = new FileInputStream("src/main/resources/p1_3_10File.txt")) {
            int n;
            while ((n = inputStream.read()) != -1) {
                char str = (char) n;
                switch (str) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        stack.push(str);
                        break;
                    case '(':
                        break;
                    case ')':
                        System.out.print(stack.pop() + " ");
                        break;
                    default:
                        System.out.print(str + " ");
                        break;
                }
            }
        }
    }
}

class InfixToPostFix {

}
