package cz.educanet.webik;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


public class UserManager{

    private ArrayList<Users> users = new ArrayList<Users>();

    public ArrayList<Users> getAll(){
        return users;
    }

    public boolean doesUserExist(String username){
        for (Users user : users){
            if (user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }

    public Users getUserLogin(String username, String password) {
        for (int i = 0; i < users.size(); i++) {
            Users user = users.get(i);
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void saveUser(Users user){
        users.add(user);
    }


    public boolean addUser(String user){
        return true;
    }

}
