package com.example.De1KiemThu.bai1;

public class ArrayUtils {
    public static int sum(int[] arr){
        if(arr == null) throw new IllegalArgumentException("Mang khong duoc null");
            int sum = 0;
            for (int num : arr){
                sum += num;
            }
            return sum;
    }
}

