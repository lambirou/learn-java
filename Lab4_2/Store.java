package Lab4_2;

import java.util.*;

public class Store {
    private ArrayList<Movie> movies;
    private ArrayList<Employee> employees;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Rental> rentals = new ArrayList<>();

    public Store() {
        this.movies = new ArrayList<>();
        this.employees = new ArrayList<>();

        // Initialize movies
        this.movies.add(new Movie(1, "The Godfather", MovieType.VHS));
        this.movies.add(new Movie(2, "The Shawshank Redemption", MovieType.DVD));
        this.movies.add(new Movie(3, "The Godfather: Part II", MovieType.VHS));
        this.movies.add(new Movie(4, "The Dark Knight", MovieType.DVD));
        this.movies.add(new Movie(5, "The Dark Knight Rises", MovieType.DVD));
        this.movies.add(new Movie(6, "Pulp Fiction", MovieType.DVD));

        // Initialize employees
        this.employees.add(new Employee(1, "John"));
        this.employees.add(new Employee(2, "Mary"));
    }

    public Rental rent(int movieId, int customerPhoneNumber, int daysRented, int employeeId) {
        Movie movie = getMovie(movieId);

        if (movie == null) {
            return null;
        }

        Customer customer = getCustomer(customerPhoneNumber);

        if (customer == null) {
            customer = new Customer(customerPhoneNumber);
            customers.add(customer);
        }

        Rental rental = new Rental(rentals.size() + 1, movieId, customer, new Date(), daysRented, employeeId);
        rentals.add(rental);

        return rental;
    }

    public void rewardEmployee(int id, Goodies goodies) {
        Employee employee = getEmployee(id);

        if (employee == null) {
            return;
        }

        employee.addGoodies(goodies);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.id == id) {
                return employee;
            }
        }

        return null;
    }

    public Movie getMovie(int id) {
        Movie item = null;

        for (Movie movie : movies) {
            if (movie.id == id) {
                item = movie;
                break;
            }
        }

        return item;
    }

    public Movie getMovieByTitle(String title) {
        Movie item = null;

        for (Movie movie : movies) {
            if (movie.title.equals(title)) {
                item = movie;
                break;
            }
        }

        return item;
    }

    public Customer getCustomer(int phoneNumber) {
        Customer item = null;

        for (Customer customer : customers) {
            if (customer.phoneNumber == phoneNumber) {
                item = customer;
                break;
            }
        }

        return item;
    }
}
