package com.callor.sec.exec;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import java.util.Map;
import java.util.Set;

public class Encrypt {

    public static void main(String[] args) {

        StandardPBEStringEncryptor pbe = new StandardPBEStringEncryptor();

        Map<String , String> sysEnvList = System.getenv();
        Set<String> keys = sysEnvList.keySet();
        for(String key : keys){
            sysEnvList.get(key);
        }

        String salt = sysEnvList.get("pw");
        String encPolicy = "PBEWithMD5AndDES";

        pbe.setAlgorithm(encPolicy);
        pbe.setPassword(salt);

        String dbusername = "root";
        String dbpassword = "dudzpsdb1!";

        String enc_username = pbe.encrypt(dbusername);
        String enc_password = pbe.encrypt(dbpassword);

        System.out.println(enc_username + "\n" + enc_password + "\n" + salt);

    }
}
