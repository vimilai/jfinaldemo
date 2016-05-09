package demo;

import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class HelloController extends Controller {
	public void index() {
		// renderText("sadsads");
		renderJsp("/index.jsp");
	}
	public void dopost(){
		Page<User> users=service.page(2,10);
		List<User>userss= users.getList();
		setAttr("users", userss);
		System.out.println(users);
		String v=getPara("v1");
		System.out.println(v);
		setAttr("v", 1);
		renderJsp("/111.jsp");
	}
}
