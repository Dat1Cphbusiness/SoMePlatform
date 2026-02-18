import java.util.ArrayList;

public class Profile {

    String username;
    ArrayList<Profile> followers = new ArrayList<>();


    public Profile(String username){
        this.username = username;
    }

    void addFollower(Profile p){
        this.followers.add(p);

    }

}
