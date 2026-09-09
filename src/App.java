public class App {
    public static void main(String[] args) throws Exception {
        MoviePrice[] array = new MoviePrice[24];

        array[0] = new MoviePrice(3, "A", true);
        array[1] = new MoviePrice(3, "B", true);
        array[2] = new MoviePrice(3, "C", true);
        array[3] = new MoviePrice(3, "D", true);
        array[4] = new MoviePrice(3, "A", false);
        array[5] = new MoviePrice(3, "B", false);
        array[6] = new MoviePrice(3, "C", false);
        array[7] = new MoviePrice(3, "D", false);
        array[8] = new MoviePrice(12, "A", true);
        array[9] = new MoviePrice(12, "B", true);
        array[10] = new MoviePrice(12, "C",true);
        array[11] = new MoviePrice(12, "D",true);
        array[12] = new MoviePrice(12, "A", false);
        array[13] = new MoviePrice(12, "B", false);
        array[14] = new MoviePrice(12, "C", false);
        array[15] = new MoviePrice(12, "D", false);
        array[16] = new MoviePrice(20, "A", true);
        array[17] = new MoviePrice(20, "B", true);
        array[18] = new MoviePrice(20, "C", true);
        array[19] = new MoviePrice(20, "D", true);
        array[20] = new MoviePrice(20, "A", false);
        array[21] = new MoviePrice(20, "B", false);
        array[22] = new MoviePrice(20, "C", false);
        array[23] = new MoviePrice(20, "D", false);

        for (MoviePrice ticket : array) {
            System.out.println("The price is $" + ticket.calculateMoviePrice());
        }

    }  
}
