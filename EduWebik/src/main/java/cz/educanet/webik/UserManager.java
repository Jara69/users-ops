package cz.educanet.webik;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private static List<User> names = new ArrayList<User>();

    @POST
    public Response createUser(@QueryParam("username") String username, @QueryParam("password") String password) {
        User tempUser = new User(username,password);
        if(doesUserExist(tempUser)){
            return Response.status(406).build();
        } else {
            names.add(tempUser);
            return Response.ok("User Created").build();
        }
    }

    public Boolean doesUserExist(User user) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).getUsername().equals(user.getUsername())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @DELETE
    public Response removeUser(User user) {
        if(doesUserExist(user)) {
            names.remove(user);
            return Response.ok().build();
        } else {
            return Response.status(406).build();
        }
    }

    @GET
        public Response GetCurrentUser(User user){

    }

    @POST
            public Response LoginUser(User user){

    }
}
