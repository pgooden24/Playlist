/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String artist;
    private String title;
    private boolean status;
    private int minutes;
    private int seconds;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String myTitle, String myArtist, int myMinutes, int mySeconds) {
        artist = myArtist;
        title = myTitle;
        minutes = myMinutes;
        seconds = mySeconds;
        status = false;
    }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

      public String getName() {
        return title;

      }

      public String getArtist() {
        return artist;
      }

      private boolean favorite() {
        status = !status

      }

      




}
