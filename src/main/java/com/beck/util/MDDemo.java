package com.beck.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.NoSuchAlgorithmException;

public class MDDemo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
//        MessageDigest md = MessageDigest.getInstance("SHA");
//        String s = new String(md.digest("i123love".getBytes()));
//        String s1 = new String(md.digest("123love".getBytes()));
//        System.out.println(s.equals(s1));

        String str = DigestUtils.md5Hex("123客戶");
        String str1 = DigestUtils.md5Hex("123客户");
        System.out.println("str="+str+","+(str.equals(str1)));
        String str2 = DigestUtils.sha256Hex("123客户");
        String str4 = DigestUtils.sha256Hex("123客户");
        System.out.println("str2="+str2+","+(str2.equals(str4)));
        System.out.println(str2.length()+","+(str.equals(str2)));

    }




}
