package demo;

import java.util.List;

import com.jfinal.plugin.activerecord.Page;

public class service {
 public static List<User> query(){
	return User.dao.query();
 }
 public static Page<User> page(int page,int count){
		return User.dao.fenye(page,count);
	 }
}
