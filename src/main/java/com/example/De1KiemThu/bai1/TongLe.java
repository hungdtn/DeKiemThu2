package com.example.De1KiemThu.bai1;


public class TongLe{
    public static int tongLe(int[] arr){
        if(arr == null ) throw new IllegalArgumentException("Khong duoc de trong mang");
        int tong = 0;
        for(int so : arr){
            if(so % 2 != 0){
                tong += so;
            }
        }
        return tong;
    }

    public static int tongLeBatKy(int[] arr){
        if(arr == null) throw new IllegalArgumentException("Khong duoc de trong");
        int tong1 = 0;
        for(int n : arr){
            if(n % 2 != 0){
                tong1 += n;
            }
        }
        return tong1;
    }
}



