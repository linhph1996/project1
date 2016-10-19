/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Luong;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linh
 */
public class LuongBusiness {
    public ArrayList<Luong> getLuong(String sql){
        ArrayList<Luong> lstLuong = new ArrayList<Luong>();
        Luong luong;
        if(sql == "")
            return null;
        Connection con = Connect.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                luong = new Luong(rs.getString("MaSoCanBo"), rs.getDouble("HeSoBac"),
                        rs.getDouble("PhuCapChucVu"), rs.getDouble("PhuCapNganh"),
                        rs.getInt("NamThamNien"), rs.getDouble("HeSoThamNien"), 
                        rs.getDouble("HeSoCong"), rs.getDouble("BaoHiemXaHoi"), 
                        rs.getDouble("BaoHiemYTe"), rs.getDouble("BaoHiemThatNghiep"), rs.getDouble("LuongDuocNhan"));
                lstLuong.add(luong);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LuongBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstLuong;
    }
    
    public boolean addLuong(Luong luong){
       int isSuccess = 0;
        if (luong == null) {
            return false;
        }
        Connection con = Connect.getConnection();
        String sql = String.format("insert into luong(MaSoCanBo, HeSoBac, "
                + "PhuCapChucVu, PhuCapNganh, NamThamNien, HeSoThamNien, "
                + "HeSoCong, BaoHiemXaHoi, BaoHiemYTe, BaoHiemThatNghiep, "
                + "LuongToiThieu, LuongDuocNhan) values ('%s', %f, %f, %f, %d,"
                + "%f,%f,%f,%f,%f,%f,%f);", luong.getMaSoCanBo(), luong.getHeSoBac(),
                luong.getPhuCapChucVu(), luong.getPhuCapNganh(), luong.getNamThamNien(),
                luong.getHeSoThamNien(), luong.getHeSoCong(), luong.getBaoHiemXaHoi(),
                luong.getBaoHiemYTe(), luong.getBaoHiemThatNghiep(), Luong.getLuongToiThieu(),
                luong.getLuongDuocNhan());
        try {
            Statement st = con.createStatement();
            isSuccess = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CanBoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (isSuccess == 0) {
            return false;
        }
        return true;
    }
    
    public boolean suaLuong(Luong luong){
        int isSuccess = 0;
        if (luong == null) {
            return false;
        }
        Connection con = Connect.getConnection();
        String sql = String.format("update luong set HeSoBac = %f, PhuCapChucVu = %f, PhuCapNganh = %f,"
                + "NamThamNien = %d, HeSoThamNien = %f, HeSoCong = %f, BaoHiemXaHoi = %f,"
                + "BaoHiemYTe = %f, BaoHiemThatNghiep = %f, LuongDuocNhan = %f "
                + " where MaSoCanBo = '%s'; ", luong.getHeSoBac(),
                luong.getPhuCapChucVu(), luong.getPhuCapNganh(), luong.getNamThamNien(),
                luong.getHeSoThamNien(), luong.getHeSoCong(), luong.getBaoHiemXaHoi(),
                luong.getBaoHiemYTe(), luong.getBaoHiemThatNghiep(),
                luong.getLuongDuocNhan(),luong.getMaSoCanBo());
        try {
            Statement st = con.createStatement();
            isSuccess = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CanBoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (isSuccess == 0) {
            return false;
        }
        return true;
    }
    
    public boolean xoaLuong(String maSoCanBo){
        if(maSoCanBo == "")
            return false;
        int isSuccess = 0;
        String sql = String.format("delete from luong where MaSoCanBo = '%s';", maSoCanBo);
        Connection con = Connect.getConnection();
        try {
            Statement st = con.createStatement();
            isSuccess = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LuongBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(isSuccess == 0){
            return false;
        }
        return true;
    }
}
