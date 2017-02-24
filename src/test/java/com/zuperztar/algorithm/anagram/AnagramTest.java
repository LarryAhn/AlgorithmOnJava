package com.zuperztar.algorithm.anagram;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ahn on 2017. 2. 24..
 */
public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    public void isAnagramTest() {
        assertEquals(true, anagram.isAnagram("earth", "heart"));
        assertEquals(true, anagram.isAnagram("reset", "trees"));
        assertEquals(false, anagram.isAnagram("STEAM ", "teams"));
    }


}
