import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private int ID;
    private Patient patient;
    private Doctor doctor;
    private LocalDate date;
    private LocalTime time;
    private String status;

    public Appointment(int ID, Patient patient, Doctor doctor, LocalDate date, LocalTime time){
        this.ID = ID;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.status = "Scheduled";
    }

    public int getID(){
        return ID;
    }

    public Patient getPatient(){
        return patient;
    }

    public Doctor getDoctor(){
        return doctor;
    }

    public LocalDate getDate(){
        return date;
    }

    public LocalTime getTime(){
        return time;
    }

    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        if(status.equals("Scheduled")|| status.equals("Cancelled") || status.equals("Completed")){
            this.status = status;
        }
    }
}

