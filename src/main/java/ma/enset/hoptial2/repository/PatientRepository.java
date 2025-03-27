package ma.enset.hoptial2.repository;

import ma.enset.hoptial2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
