package guru.raduga256.sfgpetclinic.repository;

import guru.raduga256.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
