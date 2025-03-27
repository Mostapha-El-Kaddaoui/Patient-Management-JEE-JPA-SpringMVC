package ma.enset.hoptial2.web;

import lombok.AllArgsConstructor;
import ma.enset.hoptial2.entities.Patient;
import ma.enset.hoptial2.repository.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;
    @GetMapping("/index")
    public String index(Model model){
        List<Patient> patientList = patientRepository.findAll();
        model.addAttribute("listPatients",patientList);

        return "patient";
    }
}







