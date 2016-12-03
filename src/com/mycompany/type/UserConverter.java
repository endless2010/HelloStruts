package com.mycompany.type;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;
public class UserConverter extends StrutsTypeConverter{
	@Override
	public Object convertFromString(Map map, String[] value, Class toClass) {
    	String[] params=(String[])value;
    	User user=new User();
    	String[] userinfo=params[0].split(",");
    	user.setUserid(Integer.parseInt(userinfo[0]));
    	user.setUsername(userinfo[1]);
    	System.out.println("converter called");
    	return user;
	}

	@Override
	public String convertToString(Map map, Object value) {
    	User user=(User)value;
    	return  user.getUserid()+","+user.getUsername();
	}
}
/*public class UserConverter extends DefaultTypeConverter{
    public Object convertValue(Map context, Object value, Class toType){     
        if(toType==User.class){
        	String[] params=(String[])value;
        	User user=new User();
        	String[] userinfo=params[0].split(",");
        	user.setUserid(Integer.parseInt(userinfo[0]));
        	user.setUsername(userinfo[1]);
        	return user;
        }else if(toType==String.class){
        	User user=(User)value;
        	return  user.getUserid()+","+user.getUsername();
        }
        return null;
    }
}*/
