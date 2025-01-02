package ma.xproce.appdedonation.dao.repositories;

import ma.xproce.appdedonation.dao.entities.Don;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonRepository extends JpaRepository<Don, Long> {
}
