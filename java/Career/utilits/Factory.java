package Career.utilits;

import Career.PostDao.DaoPost;
import Career.PostDao.DaoPostImpl;

/**
 * Created by Evgenia on 29.03.2017.
 */
public class Factory {

    public static Factory instance = new Factory();
    DaoPost daoPost;


    public DaoPost getDaoPost() {
        if(daoPost==null) daoPost = new DaoPostImpl();
        return daoPost;
    }

    public static Factory getInstance() {

        return  Factory.instance;
    }
}





