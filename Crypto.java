package com.alojea;

public class Crypto {

    static final int MODULO = 26;

    /*public String encrypt(String clearText, String keyStream) {
        int[] clearTextConvertedInNumber = stringToNumber(clearText);
        int[] keyStreamConvertedInNumber = stringToNumber(keyStream);
    }

    public String decrypt(String cipherText, String keyStream) {

    }*/

    public int[] stringToNumber(String textToConvert){
        int[] intArray = new int[textToConvert.length()];

        for(int i=0;i<textToConvert.length();i++){
            intArray[i] = Integer.parseInt(String.valueOf(textToConvert.charAt(i)));

            if(intArray[i] > MODULO){
                intArray[i] = intArray[i] - MODULO;
            }
        }

        System.out.println(intArray);

        return intArray;

    }
}
