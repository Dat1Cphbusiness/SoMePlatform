public class Main {

    public static void main(String [] args){

        Post p = new Post("Signe", "I dag har jeg vasket min mors bil");
        Post p1 = new Post("Signe", "Yes! Solen skinner. Endelig!");
        Post p2 = new Post("Signe", "Hvad betyder det der 6-7 ???");
        Post p3 = new Post("Jesper", "Træt. Træt. Træt");

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
}
