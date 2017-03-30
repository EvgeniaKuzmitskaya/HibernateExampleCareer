package Career.PostDao;

import Career.PostDao.DaoPost;
import Career.PostDao.DaoPostImpl;
import Career.PostEntity;
import Career.utilits.Factory;

import java.sql.SQLException;

/**
 * Created by Evgenia on 29.03.2017.
 */
public class AppDapPost {
    public static void main(String[] args) throws SQLException {


        Factory factory = Factory.getInstance();
        PostEntity postEntity = new PostEntity();
        postEntity.setIdPost(1);
        postEntity.setNamePost("экономист");
        DaoPost daoPost = factory.getDaoPost();
//        try {
//            daoPost.delete(postEntity);
//        } catch (SQLException ex){
//            ex.printStackTrace();
//        }

        daoPost.add(postEntity);




    }
}
