package com.zuperztar.algorithm.reversestring;

import java.util.Stack;

/**
 * Created by Ahn on 2017. 2. 22..
 */
public class ReverseString {

    /**
     * Question. 문자열 뒤집기
     */

    public String reverseStringNoneDataStructure(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String reverseStringWithStack(String s) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i <= s.length() - 1; i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

}
