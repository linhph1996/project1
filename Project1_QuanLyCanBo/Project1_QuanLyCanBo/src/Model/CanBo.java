/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Linh
 */
public class CanBo {
    private String maSoCanBo;
    private String ngach;
    private String hoTenCanBo;
    private Date ngaySinh;
    private String gioiTinh;
    private String chucDanh;
    private String chucVu;
    private String maSoThue;
    private String soTaiKhoan;
    private String diaChi;
    private String soDienThoai;
    private String email;
    private String dangVien;
    private String doanVien;
    private String congDoanVien;
    private String thanhTich;
    private String maChiBo;
    private String maToCongDoan;

    public CanBo(String maSoCanBo, String ngach, String hoTenCanBo, Date ngaySinh, String gioiTinh, String chucDanh, String chucVu, String maSoThue, String soTaiKhoan, String diaChi, String soDienThoai, String email, String dangVien, String doanVien, String congDoanVien, String thanhTich, String maChiBo, String maToCongDoan) {
        this.maSoCanBo = maSoCanBo;
        this.ngach = ngach;
        this.hoTenCanBo = hoTenCanBo;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chucDanh = chucDanh;
        this.chucVu = chucVu;
        this.maSoThue = maSoThue;
        this.soTaiKhoan = soTaiKhoan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.dangVien = dangVien;
        this.doanVien = doanVien;
        this.congDoanVien = congDoanVien;
        this.maChiBo = maChiBo;
        this.thanhTich = thanhTich;
        this.maToCongDoan = maToCongDoan;
    }

    public String getMaSoCanBo() {
        return maSoCanBo;
    }

    public void setMaSoCanBo(String maSoCanBo) {
        this.maSoCanBo = maSoCanBo;
    }

    public String getNgach() {
        return ngach;
    }

    public void setNgach(String ngach) {
        this.ngach = ngach;
    }

    public String getHoTenCanBo() {
        return hoTenCanBo;
    }

    public void setHoTenCanBo(String hoTenCanBo) {
        this.hoTenCanBo = hoTenCanBo;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDangVien() {
        return dangVien;
    }

    public void setDangVien(String dangVien) {
        this.dangVien = dangVien;
    }

    public String getDoanVien() {
        return doanVien;
    }

    public void setDoanVien(String doanVien) {
        this.doanVien = doanVien;
    }

    public String getCongDoanVien() {
        return congDoanVien;
    }

    public void setCongDoanVien(String congDoanVien) {
        this.congDoanVien = congDoanVien;
    }

    public String getMaChiBo() {
        return maChiBo;
    }

    public void setMaChiBo(String maChiBo) {
        this.maChiBo = maChiBo;
    }

    public String getMaToCongDoan() {
        return maToCongDoan;
    }

    public void setMaToCongDoan(String maToCongDoan) {
        this.maToCongDoan = maToCongDoan;
    }

    public String getThanhTich() {
        return thanhTich;
    }

    public void setThanhTich(String thanhTich) {
        this.thanhTich = thanhTich;
    }

    public CanBo() {
    }

   
    
}
