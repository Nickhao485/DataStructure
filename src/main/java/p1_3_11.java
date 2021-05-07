import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class p1_3_11  {
    public static void main(String[] args) throws IOException {
        Stack<String> opts = new Stack<>();
        Stack<String> val = new Stack<>();
        try (InputStream inputStream = new FileInputStream("src/main/resources/p1_3_10File.txt")) {
            int n;
            while ((n = inputStream.read()) != -1) {
                String str = String.valueOf((char) n);

                switch (str) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        opts.push(str);
                        break;
                    case ")":
//                        System.out.print(opts.pop());
                        String opt = opts.pop();
                        Integer last = Integer.parseInt(val.pop());
                        Integer first = Integer.parseInt(val.pop());
                        if (opt.equals("+")) {
                            Integer value = first + last;
                            System.out.println("value+: " + value);
                            val.push(value.toString());
                        } else if (opt.equals("-")) {
                            Integer value = first - last;
                            System.out.println("value-: " + value.toString());
                            val.push(value.toString());
                        } else if (opt.equals("*")) {
                            Integer value = first * last;
                            System.out.println("value*: " + value.toString());
                            val.push(value.toString());
                        } else if (opt.equals("/")) {
                            Integer value = first / last;
                            System.out.println("value/: " + value.toString());
                            val.push(value.toString());
                        }
                        break;
                    case "(":
                        break;
                    default:
                        val.push(str);
//                        System.out.print(str);
                        break;
                }
            }
        }
    }
}
