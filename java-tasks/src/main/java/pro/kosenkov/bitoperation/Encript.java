package pro.kosenkov.bitoperation;

import java.util.Arrays;

public class Encript {
    public static void main(String[] args) {
        int[] data =  {6, 55, 14, 24435, 23, 11};
        int password = 199;

        // зашифровываем массив данных
        int[] encrypted = cript(data, password) ;
        System.out.println(Arrays.toString(encrypted)); // [193, 240, 201, 24500, 208, 204]

        // расшифровываем массив данных
        int[] decrypted = cript(encrypted, password) ;
        System.out.println(Arrays.toString(decrypted)); // [6, 55, 14, 24435, 23, 11]
    }

    public static int[] cript(int[] data, int password)
    {
        int[] result = new int[data.length];
        for (int i = 0; i <  data.length; i++)
            result[i] = data[i] ^ password;
        return result;
    }
}
