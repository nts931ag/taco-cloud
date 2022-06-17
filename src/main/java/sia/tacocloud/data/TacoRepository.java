package sia.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
