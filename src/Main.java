public class essai {
    public static void main(String[] args) {
        segment segment = new segment(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        int point = Integer.parseInt(args[2]);

        System.out.println(segment);
        System.out.println("Longueur : " + segment.longueur());
        System.out.println("Le point " + point + (segment.appartient(point) ? " appartient " : " n'appartient pas ") + "au segment.");
    }
}