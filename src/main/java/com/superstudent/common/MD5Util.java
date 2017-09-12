package com.superstudent.common;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/9/12.
 * md5加密工具类
 */
public class MD5Util {

    public static String EncoderPwdByMd5(String str) throws NoSuchAlgorithmException,UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        return base64en.encode(md5.digest(str.getBytes("utf-8")));
    }

    public static void main(String[] str) throws Exception{
        System.out.println(EncoderPwdByMd5("123"));
    }
}
