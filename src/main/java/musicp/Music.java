package musicp;

public class Music {
    int id;
    String musicName;
    String singerName;
    boolean favMusic;
    boolean premiumFree;
    String genre;
    int duration;

    public Music(int id, String musicName, String singerName, boolean favMusic, boolean premiumFree, String genre, int duration) {
        this.id = id;
        this.musicName = musicName;
        this.singerName = singerName;
        this.favMusic = favMusic;
        this.premiumFree = premiumFree;
        this.genre = genre;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getGenre() {
        return genre;
    }

    public boolean getFavMusic() {
        return favMusic;
    }

    public boolean getPremiumFree() {
        return premiumFree;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setGenre(String genre) {
        this.genre = genre;

    }

    public void setFavMusic(boolean favMusic) {
        this.favMusic = favMusic;
    }

    public void setPremiumFree(boolean premiumFree) {
        this.premiumFree = premiumFree;
    }

    @Override
    public String toString() {
        return "Music information: " +
                "id=" + id +
                ", musicName=" + musicName +
                ", singerName=" + singerName +
                ", favMusic=" + favMusic +
                ", premiumFree=" + premiumFree +
                ", genre=" + genre +
                ", duration=" + duration;
    }
}
