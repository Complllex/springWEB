package complllex.backend.repositories;

import complllex.backend.models.Museum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuseumRepository extends JpaRepository<Museum, Integer> {
}
