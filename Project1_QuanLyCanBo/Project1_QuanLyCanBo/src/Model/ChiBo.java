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
public class ChiBo {
    private String maChiBo;
    private String tenChiBo;
    private String ghiChu;

    public ChiBo(String maChiBo, String tenChiBo, String ghiChu) {
        this.maChiBo = maChiBo;
        this.tenChiBo = tenChiBo;
        this.ghiChu = ghiChu;
    }

    public String getMaChiBo() {
        return maChiBo;
    }

    public void setMaChiBo(String maChiBo) {
        this.maChiBo = maChiBo;
    }

    public String getTenChiBo() {
        return tenChiBo;
    }

    public void setTenChiBo(String tenChiBo) {
        this.tenChiBo = tenChiBo;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
