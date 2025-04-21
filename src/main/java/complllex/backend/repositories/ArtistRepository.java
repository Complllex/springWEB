package complllex.backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import complllex.backend.models.Artist;

@Repository
public interface ArtistRepository  extends JpaRepository<Artist, Integer> {

}
