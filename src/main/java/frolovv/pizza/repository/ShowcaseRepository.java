package frolovv.pizza.repository;

import frolovv.pizza.entity.Showcase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowcaseRepository extends JpaRepository<Showcase, String>
{
    List<Showcase> findByName(@Param("name") String name);
}
