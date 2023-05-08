package sevotaProject.ENOCK.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sevotaProject.ENOCK.Entity.Instructor;
import sevotaProject.ENOCK.Repository.InstructorRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InstructorServiceImpl implements InstructorService{

    private InstructorRepository instructorRepository;
    @Override
    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor getInstructorById(Long instructorId) {
        Optional<Instructor> optionalInstructor = instructorRepository.findById(instructorId);
        return optionalInstructor.get();
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor updateInstructors(Instructor instructor) {
        Instructor existingInstructor = instructorRepository.findById(instructor.getId()).get();
        existingInstructor.setFirstName(instructor.getFirstName());
        existingInstructor.setLastName(instructor.getLastName());
        existingInstructor.setEmail(instructor.getEmail());
        existingInstructor.setDepartment(instructor.getDepartment());
        Instructor updatedInstructor = instructorRepository.save(instructor);
        return updatedInstructor;
    }

    @Override
    public void deleteInstructor(Long instructorId) {
        instructorRepository.deleteById(instructorId);
    }
}
