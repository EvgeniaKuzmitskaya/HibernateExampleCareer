package Career.PostDao;

import Career.PostDao.DaoPost;
import Career.PostEntity;
import Career.utilits.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Evgenia on 29.03.2017.
 */
public class DaoPostImpl implements DaoPost {



    public void delete(PostEntity post) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(post);
            session.getTransaction().commit();
        } catch (Exception e){
            System.out.println("ошибка");
        }
        finally {
            if((session!=null)&&(session.isOpen())){
                session.close();
            }
        }
     }

    public void add(PostEntity post) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(post);
        } finally {
            session.getTransaction().commit();
            session.close();
        }


    }

    public PostEntity getPost(int id) throws SQLException {
        return null;
    }

    public List<PostEntity> getAll() throws SQLException {
        return null;
    }
}
