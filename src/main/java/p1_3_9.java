import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class p1_3_9 {
    public static void main(String[] args) throws IOException {
        // 1 + 2 ) * 3 - 4 ) * 5 - 6) ) )
        // (( 1 + 2) * ((3 - 4) * (5 - 6)))
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();

        try (InputStream inputStream = new FileInputStream("src/main/resources/p1_3_9File.txt")) {
            int n;
            while ((n = inputStream.read()) != -1) {
                char str = (char) n;
                stack.push(str);

                if (str == ')') {
                }
            }
        }
    }
}
