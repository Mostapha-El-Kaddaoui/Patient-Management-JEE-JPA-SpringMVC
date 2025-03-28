package ma.enset.hoptial2.web;

import lombok.AllArgsConstructor;
import ma.enset.hoptial2.entities.Patient;
import ma.enset.hoptial2.repository.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;
    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name = "p", defaultValue = "0") int page,
                        @RequestParam(name = "s", defaultValue = "4") int size,
                        @RequestParam(name = "k", defaultValue = "") String keyword){
        //Pagination
        //http://localhost:8084/index?p=0&s=5
        // --> first 5 patients
        Page<Patient> pagePatients= patientRepository.findByNomContains(keyword, PageRequest.of(page, size));

        model.addAttribute("listPatients", pagePatients.getContent());
        model.addAttribute("pages",new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",keyword);
        return "patient";
    }
    @GetMapping("/delete")
    public String delete(Long id, String keyword, int page){
        patientRepository.deleteById(id);
        return "redirect:/index?p="+page+"&k="+keyword;
    }
}







