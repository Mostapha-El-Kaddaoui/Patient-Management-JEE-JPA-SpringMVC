package ma.enset.hoptial2;


import ma.enset.hoptial2.entities.Patient;
import ma.enset.hoptial2.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Hoptial2Application {

    public static void main(String[] args) {
        SpringApplication.run(Hoptial2Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            //Using a Constructor without parameters
            /*
            Patient patient = new Patient();
            patient.setId(null);
            patient.setNom("khalid");
            patient.setDateNaissance(new Date());
            patient.setMalade(false);
            patient.setScore(23);
            */

            // Using a Constructor with parameters
            /*
            Patient patient2 = new Patient(null, "Yassine", new Date(), false, 20);
            */

            // Using Builder
            /*
            Patient patient3 = Patient.builder()
                    .nom("omar")
                    .dateNaissance(new Date())
                    .score(56)
                    .malade(true)
                    .build();
             */
            patientRepository.save(new Patient(null,"Yahya",new Date(), false,20));
            patientRepository.save(new Patient(null,"Khalid",new Date(), false,20));
            patientRepository.save(new Patient(null,"Bachir",new Date(), false,20));
        };
    }
}









