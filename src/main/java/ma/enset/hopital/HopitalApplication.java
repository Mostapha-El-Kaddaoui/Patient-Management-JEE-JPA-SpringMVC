package ma.enset.hopital;

import ma.enset.hopital.entities.Patient;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //Using a Constructor without parameters
        Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("khalid");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);

        // Using a Constructor with parameters
        Patient patient2 = new Patient(null, "Yassine", new Date(), false, 20);

        // Using Builder
        Patient patient3 = Patient.builder()
                .nom("omar")
                .dateNaissance(new Date())
                .score(56)
                .malade(true)
                .build();
        patientRepository.save(patient);
        patientRepository.save(patient2);
        patientRepository.save(patient3);
    }
}


















