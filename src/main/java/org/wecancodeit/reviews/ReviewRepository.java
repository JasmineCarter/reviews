package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	public ReviewRepository() {
		Review colorado = new Review(1L, "Colorado",
				"Noted for its vivid landscape of mountains, forests, high plains, mesas, canyons, plateaus, rivers, and desert lands.", "/images/colorado.jpg");
		Review hawaii = new Review(2L, "Hawaii",
				"The state of Hawaii consists of eight main islands: Niihau, Kauai, Oahu, Maui, Molokai, Lanai, Kahoolawe and the Big Island of Hawaii. Hawaii is the most isolated population center on the face of the earth... Hawaii is the only state that grows coffee.", "/images/hawaii.jpg"); 
		Review ohio = new Review(3L, "Ohio", "Winters are cold and summers mild in the eastern highlands. Also, home of the 2016 NBA champions, Cleveland Cavaliers.", "/images/ohio.jpg");

		reviewList.put(colorado.getId(), colorado);
		reviewList.put(hawaii.getId(), hawaii);
		reviewList.put(ohio.getId(), ohio);

	}

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository(Review... reviews) {
		for (Review review : reviews)
			reviewList.put(review.getId(), review);
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
