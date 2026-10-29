import java.util.HashMap;
import java.util.Map;

public class MedicalOffice{
    Map<Integer, Person> Employees = new HashMap<>();
    Map<Integer, Person> Patients = new HashMap<>();

    public boolean registerPatient(Patient patient){
        int id = patient.getID();
        if(!Patients.containsKey(id)){
            Patients.put(id,patient);
            return true;
        }
        return false;
    }
}