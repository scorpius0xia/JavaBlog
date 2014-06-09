/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolwind.javablog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author coolwind
 */
public class MD5Util {

    public final static char[] strDigits = {'0', '1', '2', '3', '4', '5',
        '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String getMD5(String str) {
        String s = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] tmp = md.digest();
            char[] strChar = new char[32];
            int k = 0;                                
            for (int i = 0; i < 16; i++) {
                byte byte0 = tmp[i];  
                strChar[k++] = strDigits[byte0 >>> 4 & 0xf];   
                // >>> 为逻辑右移，将符号位一起右移
                strChar[k++] = strDigits[byte0 & 0xf];            // 取字节中低 4 位的数字转换
            }
            s = new String(strChar);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MD5Util.class.getName()).log(Level.SEVERE, null, ex);
        }

        return s;
    }
}
