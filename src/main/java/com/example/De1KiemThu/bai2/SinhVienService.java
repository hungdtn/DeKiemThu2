package com.example.De1KiemThu.bai2;

public class SinhVienService {
    public void update(SinhVien sv, String ten, int tuoi, float diemTrungBinh, int kyHoc, String chuyenNganh) {
        if (sv == null) {
            throw new IllegalArgumentException("Sinh vien khong duoc null");
        }
        if (ten == null || ten.isEmpty() || chuyenNganh == null || chuyenNganh.isEmpty()) {
            throw new IllegalArgumentException("Thong tin khong hop le hoac de trong thong tin");
        }
        if (tuoi < 18) {
            throw new IllegalArgumentException("Tuoi khong hop le");
        }
        if (diemTrungBinh < 0 || diemTrungBinh > 10) {
            throw new IllegalArgumentException("Diem trung binh khong hop le");
        }
        sv.setTen(ten);
        sv.setTuoi(tuoi);
        sv.setDiemTrungBinh(diemTrungBinh);
        sv.setKyHoc(kyHoc);
        sv.setChuyenNganh(chuyenNganh);
    }
}
