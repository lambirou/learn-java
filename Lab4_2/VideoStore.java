package Lab4_2;

import java.util.*;

public class VideoStore {
    public static void main(String[] args) {
        Store store = new Store();

        List<Movie> movies = store.getMovies();
        List<Employee> employees = store.getEmployees();
        Employee cEmployee = employees.get(0);

        store.rent(movies.get(2).id, 908758, 7, cEmployee.id);
        store.rent(movies.get(1).id, 3546764, 3, cEmployee.id);

        store.rewardEmployee(cEmployee.id, new Goodies(1, GoodiesType.CANDY));
        store.rewardEmployee(cEmployee.id, new Goodies(2, GoodiesType.POPCORN));

        System.out.println(store.getRentals());
    }
}
