package my.idea.list;

public class PosterManager {

    private int countPoster = 500;
    private Poster[] posters = new Poster[0];
    public PosterManager(int countPoster) {
        this.countPoster = countPoster;
    }
    public PosterManager() {};

    public void addNewPoster(Poster poster) {
        Poster[] temp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            temp[i] = posters[i];
        }
        temp[temp.length - 1] = poster;
        posters = temp;
    }

    public void removePosterById(int id) {
        Poster[] temp = new Poster[posters.length - 1];
        int copyToInd = 0;
        for (Poster poster : posters) {
            if (poster.getId() !=id) {
                temp[copyToInd] = poster;
                copyToInd++;
            }
        }
        posters = temp;
    }

    public Poster[] getLastAll() {
        int resLenght = posters.length;
        if (resLenght < countPoster) {
            resLenght = posters.length;
        } else {
            resLenght = countPoster;
        }
        Poster[] res = new Poster[resLenght];
        for (int i = 0; i < resLenght; i++) {
            int index = posters.length - i - 1;
            res[i] = posters[index];
        }
        return res;
    }

    public Poster[] getAll() {
        return posters;
    }
}