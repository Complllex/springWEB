package complllex.backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import complllex.backend.models.Country;

@Repository
public interface CountryRepository  extends JpaRepository<Country, Integer>
{

}