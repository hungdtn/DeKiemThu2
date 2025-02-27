package com.example.De1KiemThu.bai1;

public class TongSoChanTrongDay {
    public static int tongChan(int[] arr){
        if(arr == null ) throw new IllegalArgumentException("Khong duoc de trong mang");
        int tong = 0;
        for(int so : arr){
                if(so % 2 == 0){
                    tong += so;
                }
        }
        return tong;
    }
}
