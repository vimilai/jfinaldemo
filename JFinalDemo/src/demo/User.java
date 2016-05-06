package demo;

						

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;

public class User extends Model<User> {
   /**
	 * 
	 */
	
public static User dao=new User();
private static final long serialVersionUID = 1L;
   public List<User> query(){
	   String sql="select * from dlk_order";
	   return (List<User>) dao.find(sql);
	   
   }
 
public Page<User> fenye(int page,int count){
	   return  dao.paginate(page, count, "select *", "from dlk_order");
	   
   }
   public void asdsa(){
	  Record user=new Record().set("user", "sdas");
	  Db.save("user", user);
   }
   
}
