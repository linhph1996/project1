/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CanBo;
import java.util.ArrayList;

/**
 *
 * @author Linh
 */
public class QuanLyCanBo {
    private CanBoBusiness qlcb = new CanBoBusiness();
    public ArrayList<CanBo> getCanBo(String sql){
        return qlcb.getCanBo(sql);
    }
}
