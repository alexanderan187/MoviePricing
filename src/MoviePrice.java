public class MoviePrice {
    int m_age;
    String m_row;
    boolean m_earlyShow;

    public MoviePrice (int age, String row, boolean earlyShow) {
        m_age = age;
        m_row = row;
        m_earlyShow = earlyShow;
    }

    public int calculateMoviePrice() {
        int price = 0;

        if (m_age > 3) {

            if (m_row == "A" || m_row == "B") {
                price = 15;
            } else {
                price = 10;
            }
            
            if (m_earlyShow) {
                price += 6;
            }
            
            if (m_age <= 12) {
                price -= 4;
            }
        }
        return price;
    }
}
