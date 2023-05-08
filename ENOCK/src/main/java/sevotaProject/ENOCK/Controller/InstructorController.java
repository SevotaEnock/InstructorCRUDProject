package sevotaProject.ENOCK.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sevotaProject.ENOCK.Entity.Instructor;
import sevotaProject.ENOCK.Service.InstructorService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/instructor")
public class InstructorController {

    private InstructorService instructorService;

    @PostMapping
    public ResponseEntity<Instructor> createInstructor(@RequestBody Instructor instructor){
        Instructor savedInstructor = instructorService.createInstructor(instructor);
        return new ResponseEntity<>(savedInstructor, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Instructor> getInstructorById(@PathVariable("Id") Long instructorId){
        Instructor instructor = instructorService.getInstructorById(instructorId);
        return new ResponseEntity<>(instructor, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Instructor>> getAllInstructors(){
        List<Instructor> instructors = instructorService.getAllInstructors();
        return new ResponseEntity<>(instructors, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Instructor> updateInstructor(@PathVariable("id") Long instructorId, @PathVariable Instructor instructor){
        instructor.setId(instructorId);
        Instructor updatedInstructor = instructorService.updateInstructors(instructor);
        return new ResponseEntity<>(updatedInstructor, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteInstructor(@PathVariable("id") Long instructorId){
        instructorService.deleteInstructor(instructorId);
        return new ResponseEntity<>("Instructor successfuly deleted", HttpStatus.OK);
    }
}
