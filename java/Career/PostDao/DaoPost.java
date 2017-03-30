package Career.PostDao;

import Career.PostEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Evgenia on 29.03.2017.
 */
public interface DaoPost {

    public void delete(PostEntity post) throws SQLException;
    public void add(PostEntity post) throws SQLException;
    public PostEntity getPost(int id) throws SQLException;
    public List<PostEntity> getAll() throws SQLException;


}
