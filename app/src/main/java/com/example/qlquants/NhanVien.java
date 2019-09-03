package com.example.qlquants;

public class NhanVien {
    public int MaNV;
    public String TenNV;
    public String DiaChi;
    public String SoDienThoai;
    public String Email;
    public String UserName;
    public String Password;
    public int Quyen;

    public void setMaNV(int maNV) {
        MaNV = maNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setQuyen(int quyen) {
        Quyen = quyen;
    }

    public int getMaNV() {
        return MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public int getQuyen() {
        return Quyen;
    }

    public NhanVien(int maNV, String tenNV, String diaChi, String soDienThoai, String email, String userName, String password, int quyen) {
        MaNV = maNV;
        TenNV = tenNV;
        DiaChi = diaChi;
        SoDienThoai = soDienThoai;
        Email = email;
        UserName = userName;
        Password = password;
        Quyen = quyen;
    }

    public NhanVien() {
    }
}
