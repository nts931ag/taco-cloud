package sia.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.Order;

public interface OrderRepository  {
    Order save(Order order);
}
