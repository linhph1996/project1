/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CanBo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linh
 */
public class CanBoBusiness {

    public ArrayList<CanBo> getCanBo(String sql) {
        Connection con = Connect.getConnection();
        ArrayList<CanBo> lstCanBo = new ArrayList<CanBo>();
        CanBo canBo;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                canBo = new CanBo(rs.getString("MaSoCanBo"), rs.getString("Ngach"),
                        rs.getString("HoTen"), rs.getDate("NgaySinh"), rs.getString("GioiTinh"),
                        rs.getString("ChucDanh"), rs.getString("ChucVu"), rs.getString("MaSoThue"),
                        rs.getString("SoTaiKhoan"), rs.getString("DiaChi"), rs.getString("SoDienThoai"),
                        rs.getString("Email"), rs.getString("DangVien"), rs.getString("DoanVien"),
                        rs.getString("CongDoanVien"), rs.getString("ThanhTich"), rs.getString("MaChiBo"),
                        rs.getString("MaToCongDoan"));

                lstCanBo.add(canBo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CanBoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstCanBo;
    }

    public boolean addCanBo(CanBo canBo) {
        int isSuccess = 0;
        if (canBo == null) {
            return false;
        }
        Connection con = Connect.getConnection();
        String sql = String.format("insert into thongtincanbo(MaSoCanBo, Ngach, HoTen, "
                + "NgaySinh, GioiTinh, ChucDanh, ChucVu, MaSoThue, SoTaiKhoan, "
                + "DiaChi, SoDienThoai, Email, DangVien, DoanVien, CongDoanVien,"
                + " ThanhTich, MaChiBo, MaToCongDoan) values ('%s','%s','%s','%s',"
                + "'%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s',"
                + "'%s','%s')", canBo.getMaSoCanBo(),
                canBo.getNgach(), canBo.getHoTenCanBo(), dateSQLToString(canBo.getNgaySinh()),
                canBo.getGioiTinh(), canBo.getChucDanh(), canBo.getChucVu(),
                canBo.getMaSoThue(), canBo.getSoTaiKhoan(), canBo.getDiaChi(),
                canBo.getSoDienThoai(), canBo.getEmail(), canBo.getDangVien(),
                canBo.getDoanVien(), canBo.getCongDoanVien(), canBo.getThanhTich(),
                canBo.getMaChiBo(), canBo.getMaToCongDoan());

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

    String dateSQLToString(Date date) {
       String str = "";
        str = date.getYear() + "-" + date.getMonth() + "-" + date.getDate();
        return str;
    }

}
