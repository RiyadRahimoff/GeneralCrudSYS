package musicp;

public interface MusicService {
    void add(String musicName, String singerName, boolean favMusic, boolean premiumFree, String genre, int duration);

    void delete(int id);

    void update(int id,String musicName, String singerName, boolean favMusic, boolean premiumFree, String genre, int duration);

    Music getMusic(int id);

    Music[] getAll();
}
