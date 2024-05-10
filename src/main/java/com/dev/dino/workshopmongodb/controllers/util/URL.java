package com.dev.dino.workshopmongodb.controllers.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

    public static String decodParam(String text){
        try {
            return URLDecoder.decode(text,"UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            return "";
        }
    }
}
