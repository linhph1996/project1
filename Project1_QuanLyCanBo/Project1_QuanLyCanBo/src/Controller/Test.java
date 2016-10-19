/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Luong;
import java.util.ArrayList;

/**
 *
 * @author Linh
 */
public class Test {

    public static void main(String[] args) {
      LuongBusiness lbb = new LuongBusiness();
      ArrayList<Luong> lstLuong = lbb.getLuong("select * from luong");
      Luong l = new Luong();
      l.setMaSoCanBo("NV0002");
      l.setBaoHiemYTe(15);
      lbb.addLuong(l);
    }
}
