package Lab4_2;

import java.util.Date;

public class Rental {
    int id;
    int movieId;
    Customer customer;
    Date dateRented;
    int daysRented;
    int employeeId;

    public Rental(int id, int movieId, Customer customer, Date dateRented, int daysRented, int employeeId) {
        this.id = id;
        this.movieId = movieId;
        this.customer = customer;
        this.dateRented = dateRented;
        this.daysRented = daysRented;
        this.employeeId = employeeId;
    }

    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", movieId=" + movieId +
                ", customer=" + customer +
                ", dateRented=" + dateRented +
                ", daysRented=" + daysRented +
                ", employeeId=" + employeeId +
                '}';
    }
}
