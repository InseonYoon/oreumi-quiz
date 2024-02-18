import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> stack= new Stack<>();

        System.out.println("소괄호로 이루어진 문자열 입력: ");
        String input = scan.nextLine();

        for(char c : input.toCharArray()){
            stack.push(c);

            // 소괄호 이외의 문자는 즉시 pop
            if(stack.peek() != '(' && stack.peek() != ')'){
                stack.pop();
            }

            // ) push하면 짝 맞는 (까지 한번에 pop
            if(stack.peek() == ')'){
                stack.pop();
                stack.pop();
            }
        }
        System.out.println("결과: " + stack.empty());
    }
}
