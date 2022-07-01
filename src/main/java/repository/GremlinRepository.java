package repository;

import model.Gremlin;
import util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GremlinRepository implements DAO<Gremlin> {

    @Override
    public Gremlin create(Gremlin gremlin) {

        Gremlin newGremlin = new Gremlin();
        String sql = "INSERT INTO gremlins (name, age, color, is_evil) VALUES (?, ?, ?, ?)";

        try(Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, gremlin.getName());
            stmt.setInt(2, gremlin.getAge());
            stmt.setString(3, gremlin.getColor());
            stmt.setBoolean(4, gremlin.getIsEvil());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newGremlin;
    }



    public List<Gremlin> getAllGremlins() {

        List<Gremlin> gremlins = new ArrayList<>();
        String sql = "SELECT * FROM gremlins";

        try(Connection conn = ConnectionUtility.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();) {

            while(rs.next()) {
                Gremlin gremlin = new Gremlin();
                gremlin.setId(rs.getInt("id"));
                gremlin.setName(rs.getString("name"));
                gremlin.setAge(rs.getInt("age"));
                gremlin.setColor(rs.getString("color"));
                gremlin.setEvil(rs.getBoolean("is_Evil"));
                gremlins.add(gremlin);
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }
        return gremlins;
    }

    @Override
    public Gremlin getById(int id) {
        return null;
    }

    @Override
    public Gremlin update(Gremlin gremlin) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public List<Gremlin> getAll() {
        return null;
    }


}

