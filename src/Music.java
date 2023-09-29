import java.util.Objects;

public class Music {

    private String title;
    private int duration;
    private String genre;
    private String albumName;
    private Date releaseDate;
    private Artist artistN;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Artist getArtistN() {
        return artistN;
    }

    public void setArtistN(Artist artistN) {
        this.artistN = artistN;
    }

    public Music(String title,int duration,String genre,String albumName,Date releaseDate,Artist artistN) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.artistN = artistN;
    }

    @Override
    public String toString() {
        return String.format("%-10s%5d%10s%-20s%20s%20s ",title , duration, genre , albumName , releaseDate,artistN);

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return duration == music.duration && Objects.equals(title, music.title) && Objects.equals(genre, music.genre) && Objects.equals(albumName, music.albumName) && Objects.equals(releaseDate, music.releaseDate) && Objects.equals(artistN, music.artistN);
    }

}
