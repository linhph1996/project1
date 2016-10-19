/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Linh
 */
public class Luong {
    private static final double luongToiThieu = 1210000;
    private String maSoCanBo;
    private double heSoBac;
    private double phuCapChucVu;
    private double phuCapNganh;
    private int namThamNien;
    private double heSoThamNien;
    private double heSoCong;
    private double baoHiemXaHoi;
    private double baoHiemYTe;
    private double baoHiemThatNghiep;
    private double luongDuocNhan;

    public Luong(String maSoCanBo, double heSoBac, double phuCapChucVu, double phuCapNganh, int namThamNien, double heSoThamNien, double heSoCong, double baoHiemXaHoi, double baoHiemYTe, double baoHiemThatNghiep, double luongDuocNhan) {
        this.maSoCanBo = maSoCanBo;
        this.heSoBac = heSoBac;
        this.phuCapChucVu = phuCapChucVu;
        this.phuCapNganh = phuCapNganh;
        this.namThamNien = namThamNien;
        this.heSoThamNien = heSoThamNien;
        this.heSoCong = heSoCong;
        this.baoHiemXaHoi = baoHiemXaHoi;
        this.baoHiemYTe = baoHiemYTe;
        this.baoHiemThatNghiep = baoHiemThatNghiep;
        this.luongDuocNhan = luongDuocNhan;
    }

    public String getMaSoCanBo() {
        return maSoCanBo;
    }

    public void setMaSoCanBo(String maSoCanBo) {
        this.maSoCanBo = maSoCanBo;
    }

    public double getHeSoBac() {
        return heSoBac;
    }

    public void setHeSoBac(double heSoBac) {
        this.heSoBac = heSoBac;
    }

    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }

    public double getPhuCapNganh() {
        return phuCapNganh;
    }

    public void setPhuCapNganh(double phuCapNganh) {
        this.phuCapNganh = phuCapNganh;
    }

    public int getNamThamNien() {
        return namThamNien;
    }

    public void setNamThamNien(int namThamNien) {
        this.namThamNien = namThamNien;
    }

    public double getHeSoThamNien() {
        return heSoThamNien;
    }

    public void setHeSoThamNien(double heSoThamNien) {
        this.heSoThamNien = heSoThamNien;
    }

    public double getHeSoCong() {
        return heSoCong;
    }

    public void setHeSoCong(double heSoCong) {
        this.heSoCong = heSoCong;
    }

    public double getBaoHiemXaHoi() {
        return baoHiemXaHoi;
    }

    public void setBaoHiemXaHoi(double baoHiemXaHoi) {
        this.baoHiemXaHoi = baoHiemXaHoi;
    }

    public double getBaoHiemYTe() {
        return baoHiemYTe;
    }

    public void setBaoHiemYTe(double baoHiemYTe) {
        this.baoHiemYTe = baoHiemYTe;
    }

    public double getBaoHiemThatNghiep() {
        return baoHiemThatNghiep;
    }

    public void setBaoHiemThatNghiep(double baoHiemThatNghiep) {
        this.baoHiemThatNghiep = baoHiemThatNghiep;
    }

    public double getLuongDuocNhan() {
        return luongDuocNhan;
    }

    public void setLuongDuocNhan(double luongDuocNhan) {
        this.luongDuocNhan = luongDuocNhan;
    }

    public static double getLuongToiThieu() {
        return luongToiThieu;
    }

    public Luong() {
        
    }
    
    
    
}
