package com.itwill.shop.user;

public class UserService {
private UserDao userDao;
public UserService() {
	userDao=new UserDao();
}
//유저선택
public User select(String userId)throws Exception{
	return userDao.selectOneUser(userId);
}
public int insert(User user) throws Exception {
	return userDao.insertMainUser(user);
}

public int update(User user) throws Exception {
	return userDao.updateMainUser(user);
}

public int delete(String userId) throws Exception {
	return userDao.deleteMainUser(userId);
}
//회원가입
public int memberRegist(User user)throws Exception{
	int result=0;
	//아이디체크후
	if (userDao.duplicateIdCheck(user.getUserid())) {
		result=1;
	}else {
		userDao.insertMainUser(user);
		result=2;	
	}
		return result;
}
//로그인
public boolean login(String userId, String password)throws Exception {
	User findUser=userDao.selectOneUser(userId.trim());
	if (findUser!=null) {
		findUser.isMathpassword(password);
		return true;
	}else {
		return false;
	}
	
}
}
