package com.driver;

import java.util.*;

import org.springframework.stereotype.Service;

import com.driver.*;

@Service
public class SpotifyService {

    //Auto-wire will not work in this case, no need to change this and add autowire

    SpotifyRepository spotifyRepository = new SpotifyRepository();

    public User createUser(String name, String mobile){
    	
//    	if(name == null || mobile==null) {
//    		re
//    	}
    	return spotifyRepository.createUser(name, mobile);

    }

    public Artist createArtist(String name) {
    	
    	return spotifyRepository.createArtist(name);

    }

    public Album createAlbum(String title, String artistName) {
    	
    	return spotifyRepository.createAlbum(title, artistName);

    }

    public Song createSong(String title, String albumName, int length) throws Exception {
    		
    	 Song s = spotifyRepository.createSong(title,albumName,length);
         return s;
    }

    public Playlist createPlaylistOnLength(String mobile, String title, int length) throws Exception {
    		
    	Playlist p = spotifyRepository.createPlaylistOnLength(mobile,title,length);
        return p;
    }

    public Playlist createPlaylistOnName(String mobile, String title, List<String> songTitles) throws Exception {

    	 Playlist p = spotifyRepository.createPlaylistOnName(mobile,title,songTitles);
         return p;
    }

    public Playlist findPlaylist(String mobile, String playlistTitle) throws Exception {

    	Playlist p = spotifyRepository.findPlaylist(mobile,playlistTitle);
        return p;
    }

    public Song likeSong(String mobile, String songTitle) throws Exception {
    		
    	 Song s = spotifyRepository.likeSong(mobile,songTitle);
         return s;
    }

    public String mostPopularArtist() {

    	String name = spotifyRepository.mostPopularArtist();
        return name;
    }
    
    

    public String mostPopularSong() {

    	 String name = spotifyRepository.mostPopularSong();
         return name;
    }
}
