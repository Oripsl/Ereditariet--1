public class Carlo {
    public static void main(String[] args) {

        Animale animaleGenerico = new Animale();

        System.out.println("Verso dell'animale:");
        animaleGenerico.faiIlVerso();
        System.out.println();

        Gatto gatto = new Gatto();

        System.out.println("Verso del gatto:");
        gatto.faiIlVerso();
    }
}

class Animale {

    public void faiIlVerso() {
        System.out.println("Suono generico");
    }
}

class Gatto extends Animale {
    @Override
    public void faiIlVerso() {
        System.out.println("Miao");
    }
}


