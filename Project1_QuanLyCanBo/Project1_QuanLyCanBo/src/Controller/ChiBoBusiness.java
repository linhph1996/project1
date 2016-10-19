/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChiBo;
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
public class ChiBoBusiness {
    public ArrayList<ChiBo> getChiBo(String sql){
        ArrayList<ChiBo> lstChiBo = new ArrayList<ChiBo>();
        Connection con = Connect.getConnection();
        ChiBo chiBo;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                chiBo = new ChiBo(rs.getString("MaSoChiBo"),rs.getString("TenChiBo"),
                rs.getString("GhiChu"));
                lstChiBo.add(chiBo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CanBoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstChiBo;
    }
    
    public boolean addChiBo(ChiBo chiBo){
        if(chiBo == null){
            return false;
        }
        int isSuccess = 0;
        Connection con = Connect.getConnection();
        String sql = String.format("insert into chibo(MaSoChiBo,TenChiBo,GhiChu) "
                + "values('%s','%s','%s')", chiBo.getMaChiBo(), chiBo.getTenChiBo(),
                chiBo.getGhiChu());
        
        try {
            Statement st = con.createStatement();
            isSuccess = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ChiBoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(isSuccess == 0){
            return false;
        }
        return true;
    }
    
    public boolean suaChiBo(ChiBo chiBo){
        if(chiBo == null){
            return false;
        }
        int isSuccess = 0;
        Connection con = Connect.getConnection();
        String sql = String.format("update chibo set GhiChu = '%s', TenChiBo = '%s'"
                + " where MaSoChiBo = '%s';", chiBo.getGhiChu(), chiBo.getTenChiBo(),
                chiBo.getMaChiBo());
        
        try {
            Statement st = con.createStatement();
            isSuccess = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ChiBoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(isSuccess == 0){
            return false;
        }
        return true;
    }
    
    public boolean xoaChiBo(String maChiBo){
        if(maChiBo == ""){
            return false;
        }
        int isSuccess = 0;
        Connection con = Connect.getConnection();
        String sql = String.format("delete from chibo where MaSoChiBo = '%s'", maChiBo);
        String sql0 = String.format("update thongtincanbo set MaChiBo = '%s' where "
                + "MaChiBo = '%s'", "000000", maChiBo);
        try {
            
            Statement st = con.createStatement();
            if(st.executeUpdate(sql0) != 0){
                isSuccess = st.executeUpdate(sql);
            }
            else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiBoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(isSuccess == 0){
            return false;
        }
        return true;
    }
    
}
