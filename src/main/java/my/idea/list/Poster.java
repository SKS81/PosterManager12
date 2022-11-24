package my.idea.list;

public class Poster {

    private int id;
    private String posterName;
    private String posterGenre;

    public Poster(int id, String posterName, String posterGenre) {
        this.id = id;
        this.posterName = posterName;
        this.posterGenre = posterGenre;
    }

    public int getId() {
        return id;
    }

    public String getPosterName() {
        return posterName;
    }

    public String getPosterGenre() {
        return posterGenre;
    }
}