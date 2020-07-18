package com.dxc.SpringBootJPAMovie.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movieinfo")
public class Movie {
	

	@Column(name = "mveid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "mvename", nullable = true, length = 255)
	private String name;

	@Column(name = "mverating", nullable = true, length = 255)
	private String rating;

	@Column(name = "mvecategory", nullable = true, length = 255)
	private String category;

	@Column(name = "mvetype", nullable = true, length = 255)
	private String type;

	@Column(name = "mveduration", nullable = true, length = 255)
	private double duration;

	public Movie() {
		super();
	}

	public Movie(Integer id, String name, String rating, String category, String type, double duration) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.category = category;
		this.type = type;
		this.duration = duration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + ", category=" + category + ", type=" + type
				+ ", duration=" + duration + "]";
	}


	
}
