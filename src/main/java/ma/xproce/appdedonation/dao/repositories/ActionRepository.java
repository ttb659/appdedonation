package ma.xproce.appdedonation.dao.repositories;

import ma.xproce.appdedonation.dao.entities.Action;
import ma.xproce.appdedonation.dao.entities.Don;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActionRepository extends JpaRepository<Action, Long> {

}
