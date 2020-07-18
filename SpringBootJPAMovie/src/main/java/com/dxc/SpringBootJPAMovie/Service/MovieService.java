package com.dxc.SpringBootJPAMovie.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.SpringBootJPAMovie.Entity.Movie;
import com.dxc.SpringBootJPAMovie.Dao.MovieDAo;

@Service
public class MovieService {
	
	@Autowired
	MovieDAo movieDao;
	

	public List<Movie> getAllMovies() {
		
		return this.movieDao.findAll();
	}
	
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return this.movieDao.save(movie);
	}

	public Movie updateMovie(Movie movie) {
		
		return this.movieDao.save(movie);
	}
	
	

	public void deleteAllMovies() {
		this.movieDao.deleteAll();
	
		
	}

	public void deleteMovieById(int id) {
		this.movieDao.deleteById(id);
		
	}
	

	public Optional<Movie> getSearchMovieById(int id) {
		return this.movieDao.findById(id);
	}

	
}
