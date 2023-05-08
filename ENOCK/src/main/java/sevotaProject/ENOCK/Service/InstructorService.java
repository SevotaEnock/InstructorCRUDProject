package sevotaProject.ENOCK.Service;

import sevotaProject.ENOCK.Entity.Instructor;

import java.util.List;

public interface InstructorService {
    Instructor createInstructor(Instructor instructor);

    Instructor getInstructorById(Long instructorId);

    List<Instructor> getAllInstructors();

    Instructor updateInstructors(Instructor instructor);

    void deleteInstructor(Long instructorId);
}
