package com.zuperztar.algorithm.uniquecharacter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ahn on 2017. 2. 21..
 */
public class UniqueCharacter {

    /**
     * Question. 문자열에 포함된 문자들이 전부 유일한지 검사하는 솔루션을 작성하라.
     */

    public static void main(String[] args) {

        System.out.println(SolutionWithCollectionSet("12345")); // true
        System.out.println(SolutionWithCollectionSet("12355")); // false

        System.out.println(SolutionWithNoneDataStructure("ABCD")); // true
        System.out.println(SolutionWithNoneDataStructure("ABCA")); // false
    }

    /**
     * SolutionWithCollectionSet
     * 자바 콜렉션 Set 을 이용한 문제 해결
     *
     * @param str
     * @return
     */
    public static boolean SolutionWithCollectionSet(String str) {

        if (str.length() > 256)
            return false;

        Set<Character> characters = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));
        }

        if (str.length() != characters.size())
            return false;

        return true;

    }

    /**
     * SolutionWithNoneDataStructure
     * 자료구조를 사용하지 않은 문제 해결
     *
     * @param str
     * @return
     */
    public static boolean SolutionWithNoneDataStructure(String str) {

        if (str.length() > 256)
            return false;

        boolean[] bChar = new boolean[255];
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            if (bChar[value]) {
                return false;
            }
            bChar[value] = true;
        }
        return true;
    }


}
