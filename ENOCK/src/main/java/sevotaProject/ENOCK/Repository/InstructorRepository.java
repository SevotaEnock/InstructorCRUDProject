package sevotaProject.ENOCK.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sevotaProject.ENOCK.Entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
