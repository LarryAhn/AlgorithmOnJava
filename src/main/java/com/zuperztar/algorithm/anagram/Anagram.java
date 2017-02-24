package com.zuperztar.algorithm.anagram;

import java.util.Arrays;

/**
 * Created by Ahn on 2017. 2. 24..
 */
public class Anagram {

    /**
     * 두개의 문자열을 받아서 두개의 문자열이 서로 Anagram 이면 true 를 반환하는 솔루션을 작성
     * whitespace 도 하나의 문자로 취급하며, 대소문자 구분은 없는것 으로한다.
     */
    public static boolean isAnagram(String ls, String rs) {

        if (ls.length() != rs.length()) {
            return false;
        }

        return sort(ls).equals(sort(rs));

    }

    private static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars).replace(" ", "").toUpperCase();
    }

}
