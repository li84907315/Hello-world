package com.dailyuse.service;



import com.dailyuse.mapper.UserRegister;
import com.dailyuse.model.UsersVo;
import com.dailyuse.util.DBUtil;
import org.apache.ibatis.session.SqlSession;


public class UserServiceImpl {

    private UserRegister userRegister;
    private static UserServiceImpl service;
    private UserServiceImpl() {

    }
    public static UserServiceImpl genTnstance() {
        if(service==null) {
            service=new UserServiceImpl();
        }
        return service;
    }
    /**
     * 注册用户
     * @return
     */
    public boolean regist(UsersVo user) {

        //确定用户存在

//        User u =.FindByUsername(user.getUsername());

//        if(u!=null)
//        {
//
//            return false;
//        }

        SqlSession session =null;
        try {
            session = DBUtil.getSession();
            userRegister = session.getMapper(UserRegister.class);
            userRegister.regist(user);
            session.commit();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            session.close();
        }




        return true;
    }

//    @Override
//    public User login(User user) {
//
//        return userDao.login_by(user.getUsername(),user.getPassword());
//    }



}

