package org.wecancodeit.reviews;

public class Review {

	private long reviewId;
	private String name;
	private String description;
	private String image;

	public Review(long reviewId, String name, String description, String image) {
		this.reviewId = reviewId;
		this.name = name;
		this.description = description;
		this.image = image;
	}

	public Long getId() {
		return reviewId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImage() {
		return image;
	}
}
