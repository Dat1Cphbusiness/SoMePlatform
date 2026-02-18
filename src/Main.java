import java.util.ArrayList;

public class Main {
    ArrayList<Profile> allProfiles = new ArrayList<>();

    void main(String [] args){

        createProfiles();
        //createPosts();

        Profile p1 = getProfileByIndex(3);
        Profile p2 = getProfileByIndex(1);

        if(p1.followers.size()> p2.followers.size()){


        }


    }

    private void createPosts() {
        Post p = new Post("Signe", "I dag har jeg vasket min mors bil");
        Post p1 = new Post("Signe", "Yes! Solen skinner. Endelig!");
        Post p2 = new Post("Signe", "Hvad betyder det der 6-7 ???");
        Post p3 = new Post("Jesper", "Træt. Træt. Træt");


        // TESTKODE

        p.addLike();
        p3.addLike();
        p3.addLike();
        p3.addLike();
        p3.addLike();
        p3.unLike();

        if(p.likes > p3.likes){
            System.out.println(p3.owner + " 's post har flest likes");
        }

        System.out.println(p.owner+"'s post har "+p.likes+ " likes");
        System.out.println(p3.owner+"'s post har "+p3.likes+ " likes");


        p.addComment("Du er sådan en god datter, Signe !");
        p.addComment("Godt gået, Signe !");
        p.addComment("Kan du også vaske min bil ?");


        System.out.println("\n Signe's post: "+p.textContent+"\n");

        p.showComments();

        System.out.println(p);


    }

    void createProfiles() {

        Profile p1 = new Profile("Signe");
        Profile profile2 = new Profile("Tine");
        Profile profile3 = new Profile("Jon");
        Profile profile4 = new Profile("Jesper");

        allProfiles.add(p1);
        allProfiles.add(profile2);
        allProfiles.add(profile3);
        allProfiles.add(profile4);


       // displayAllProfiles(allProfiles);


        //TESTKODE

        //Alle følger Signe
        p1.addFollower(profile4);
        p1.addFollower(profile2);
        p1.addFollower(profile3);
        //Jon (profile3) følger Tine(profile2)
        profile2.addFollower(profile3);

        displayAllProfiles(allProfiles);
    }

    void displayAllProfiles(ArrayList<Profile> list) {
        //for each loop gennemløber list og printer elementets brugernavn
        for (Profile p:list){
            System.out.println(p.username +", antal følgere: "+p.followers.size());
        }
    }

    Profile getProfileByIndex(int i){
        Profile p;
        if( i > 0 && i >= allProfiles.size() ) {
            p = allProfiles.get(i);
            return p;
        }
       return null;
    }
}
