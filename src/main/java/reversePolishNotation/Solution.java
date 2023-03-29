package reversePolishNotation;

import java.util.Stack;


//    Question: Evaluate the value of an arithmetic expression in Reverse Polish Notation.
//    Valid operators are +, -, *, /. Each operand may be an integer or another
//    expression.

public class Solution {

    public static void main(String[] args) {
//        String [] tokens = {"6", "7", "+", "2", "*"};
        String[] tokens = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN2(tokens));
    }

    public static int evalRPN(String[] tokens) {
        String operators = "+-*/";
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {
            if (!operators.contains(t)) {
                stack.push(Integer.valueOf(t));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                int index = operators.indexOf(t);
                switch (index) {
                    case 0:
                        stack.push(a + b);
                        break;
                    case 1:
                        stack.push(b - a);
                        break;
                    case 2:
                        stack.push(a * b);
                        break;
                    case 3:
                        stack.push(b / a);
                        break;
                }
            }
        }
        return stack.pop();
    }

    //Another method

    public static int evalRPN2(String[] tokens) {
        Stack<Integer> littleStack = new Stack<>();
        String operators = "+-*/";
        for (String token : tokens) {
            if (!operators.contains(token)) {
                littleStack.push(Integer.valueOf(token));
            } else {
                int x = littleStack.pop();
                int y = littleStack.pop();
//                int index = operators.indexOf(token);
                if (token.equals("+"))
                    littleStack.push(x + y);
                else if (token.equals("-"))
                    littleStack.push(x - y);
                else if (token.equals("*"))
                    littleStack.push(x * y);
                else if (token.equals("/"))
                    littleStack.push(x / y);
//                else //Token is a number
//                    littleStack.push(Integer.parseInt(token));
            }
        }
        return littleStack.pop();
    }
}
