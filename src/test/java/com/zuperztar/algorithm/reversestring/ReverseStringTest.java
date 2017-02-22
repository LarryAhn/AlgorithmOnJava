package com.zuperztar.algorithm.reversestring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ahn on 2017. 2. 22..
 */
public class ReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @Test
    public void 문자열_뒤집기() {
        assertEquals("ep@rG", reverseString.reverseStringNoneDataStructure("Gr@pe"));
    }

    @Test
    public void 문자열_뒤집기_스택사용() {
        assertEquals("ep@rG", reverseString.reverseStringWithStack("Gr@pe"));
    }

}
