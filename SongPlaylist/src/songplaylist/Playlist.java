package songplaylist;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs;
    private int capacity;
    
    public Playlist(int capacity) {
        songs = new ArrayList<String>(capacity);
        this.capacity = capacity;
    }
    
    public void addSong(String song) {
        if (songs.size() == capacity) {
            songs.remove(0);
        }
        songs.add(song);
    }
    
    public void playSong(String song) {
        if (songs.contains(song)) {
            songs.remove(song);
        }
        addSong(song);
    }
    
    public void printPlaylist() {
        System.out.println(String.join(",", songs));
    }
    
    public static void main(String[] args) {
        Playlist playlist = new Playlist(3);
        playlist.addSong("S1");
        playlist.addSong("S2");
        playlist.addSong("S3");
        playlist.printPlaylist(); // S1,S2,S3
        
        playlist.playSong("S4");
        playlist.printPlaylist(); // S2,S3,S4
        
        playlist.playSong("S2");
        playlist.printPlaylist(); // S3,S4,S2
        
        playlist.playSong("S1");
        playlist.printPlaylist(); // S4,S2,S1
    }
}


