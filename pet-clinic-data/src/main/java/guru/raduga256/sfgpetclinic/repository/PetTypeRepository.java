package guru.raduga256.sfgpetclinic.repository;

import guru.raduga256.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
