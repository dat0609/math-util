/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import dto.Artical;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author liemn
 */
public class ArticalDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ;
    ResultSet rs = null;

    public List<Artical> getAll() {
        try {
            String query = "Select * from article";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            List<Artical> list = new ArrayList<>();
            while (rs.next()) {
                Artical A = new Artical(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(A);
            }
            return list;
        } catch (Exception ex) {
            Logger.getLogger(ArticalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int create(Artical a) {
        try {
            String query = "INSERT INTO [dbo].[article]\n"
                    + "           ([title]\n"
                    + "           ,[description])\n"
                    + "     VALUES\n"
                    + "           (?,?)";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, a.getTitle());
            ps.setString(2, a.getDescription());
            return ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ArticalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
