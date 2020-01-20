package inheritance;

import java.util.LinkedList;

public class Restaurant {
    String name;
    int rating;
    String price;
    int numberofReviews;

    LinkedList<Review>restaurantReviews;

    Restaurant (String name, int rating, String price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.numberofReviews = 1;
        this.restaurantReviews = new LinkedList<Review>();
    }

    public String toString() {
        return "Restaurant: " + this.name + "\n" +
                "Rating: " + this.rating + "Stars\n" +
                "Reviews: " + this.numberofReviews + "\n" +
                "Price: " + this.price;
    }

    public void addReview (Review newReview) {
        this.numberofReviews ++;
        this.rating = this.rating + newReview.rating/this.numberofReviews;
        this.restaurantReviews.addFirst(newReview);
    }
}
