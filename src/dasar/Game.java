package dasar;

public class Game {
    public static void main(String[] args) {
        Player petani = new Player();
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 100;
        petani.run();

        if (petani.isDead()) {
            System.out.println("Game Over!");
        }
    }

    }
