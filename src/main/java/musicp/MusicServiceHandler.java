package musicp;

public class MusicServiceHandler implements MusicService {
    Music[] music = new Music[100];
    private int count = 0;
    private int idAuto = 1;

    @Override
    public void add(String musicName, String singerName, boolean favMusic, boolean premiumFree, String genre, int duration) {
        if (count < music.length) {
            music[count++] = new Music(idAuto, musicName, singerName, favMusic, premiumFree, genre, duration);
            System.out.println("Music added sucessfully !!!");
            System.out.println("It is your ID: " + idAuto + " Don't forget it!!!");
            idAuto++;

        }
    }

    @Override
    public void delete(int id) {
        boolean founded = false;
        for (int i = 0; i < count; i++) {
            if (music[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    music[j] = music[j + 1];
                }
                music[count - 1] = null;
                count--;
                founded = true;
                return;
            }
        }
        if (!founded) {
            System.out.println("Matching ID not found !!!");
        }
    }

    @Override
    public void update(int id, String musicName, String singerName, boolean favMusic, boolean premiumFree, String genre, int duration) {
        boolean updated = false;
        for (int i = 0; i < music.length; i++) {
            if (music[i].getId() == id) {
                music[i].setMusicName(musicName);
                music[i].setSingerName(singerName);
                music[i].setFavMusic(favMusic);
                music[i].setPremiumFree(premiumFree);
                music[i].setGenre(genre);
                music[i].setDuration(duration);
                updated = true;
                break;
            }

        }
        if (!updated) {
            System.out.println("Music not founded matching with ID");
        }
    }

    @Override
    public Music getMusic(int id) {
        for (int i = 0; i < music.length; i++) {
            if (music[i].getId() == id) {
                return music[i];

            }
        }
        return null;
    }

    @Override
    public Music[] getAll() {
        for (int i = 0; i < music.length; i++) {
            return new Music[i];
        }
         return null;
    }
}
