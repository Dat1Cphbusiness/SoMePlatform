import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    int likes;
    String owner;
    LocalDateTime date;
    String textContent;

    //String[] comments = new String[10];
    ArrayList<String> comments = new ArrayList();

    Post(String name, String content){
        owner = name;
        textContent = content;
        date = LocalDateTime.now();
    }
//--------------------------------------------
    void addLike(){
        likes++;
    }
    void unLike(){
        likes--;
    }

    void addComment(String comment){
        comments.add(comment);
    }

    void showComments() {
        for(String comment: comments){
            System.out.println();
            System.out.println("*************************");
            System.out.println(comment);
            System.out.println("*************************");
            System.out.println();
        }
    }

    String getPostDate(){
        return  this.date.getDayOfWeek()+", "+
                this.date.getDayOfMonth()+"-"+this.date.getMonth()+", "+
                this.date.getHour()+":"+this.date.getMinute();

    }

    @Override
    public String toString(){
        String s = "Profilnavn: "+this.owner+ "\n"
                +"POST d."+this.getPostDate()+"\n"
                + this.textContent+ "\n"
                +"Antal likes: "+this.likes;
        // Tilføj kommentarer til s


         //
        return s;

    }

}
