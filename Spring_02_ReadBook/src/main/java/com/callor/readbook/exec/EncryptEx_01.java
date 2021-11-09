package com.callor.readbook.exec;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import java.util.Arrays;

public class EncryptEx_01 {
    public static void main(String[] args) {

        StandardPBEStringEncryptor pbe = new StandardPBEStringEncryptor();

        String name = "Korea";
        String salt = "dudzpsdb1!";
        String encPolicy = "PBEWithMD5AndDES";

        pbe.setAlgorithm(encPolicy);
        pbe.setPassword(salt);

        String encText = pbe.encrypt(name);
        System.out.println(encText);

        String planText = pbe.decrypt(encText);
        System.out.println(planText);

    }
}
