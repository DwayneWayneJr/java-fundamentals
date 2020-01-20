package inheritance;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Theater {
    String name;
    List<String> movies;
    int numberOfReviews;
    int rating;

    LinkedList<Review> theaterReviews;

    Theater(String name, int rating) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.rating = rating;
        this.numberOfReviews = 1;
        this.theaterReviews = new LinkedList<>();
    }

    public void addMovie (String movie) {
        this.movies.add(movie);
    }

    public void removeMovie (String movie) {
        this.movies.remove(new String(movie));
    }

    public String toString() {
        String theaterDetails = this.name + "theater is showing ";
        for (int i = 0; i < movies.size(); i++) {
            if (i == movies.size() - 1) {
                theaterDetails += "and " + movies.get(i) + ".";
            } else {
                theaterDetails += movies.get(i) + ", ";
            }
        }
        return theaterDetails;
    }

    public  void addReview (Review newReview) {
        this.numberOfReviews ++;
        this.rating = this.rating + (this.rating + newReview.rating / this.numberOfReviews);
        this.theaterReviews.addFirst(newReview);
    }
}
