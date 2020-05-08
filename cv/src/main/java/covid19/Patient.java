package covid19;

import java.awt.List;
import java.util.ArrayList;


public class Patient extends BasicInfo
{
	ArrayList <Symptoms> symptoms;
	ArrayList<PatientContactedPerson> patientContactedPerson;
	ArrayList< PatientVistedPlace> patientVistedPlace;
	ArrayList<Symptoms> getSymptoms() {
		return symptoms;
	}

	@Override
	public String toString() {
		return "Patient [symptoms=" + symptoms + ", patientContactedPerson=" + patientContactedPerson
				+ ", patientVistedPlace=" + patientVistedPlace + "]";
	}

	public void setSymptoms(ArrayList<Symptoms> symptoms) {
		this.symptoms = symptoms;
	}

	public ArrayList<PatientContactedPerson> getPatientContactedPerson() {
		return patientContactedPerson;
	}

	public void setPatientContactedPerson(ArrayList<PatientContactedPerson> patientContactedPerson) {
		this.patientContactedPerson = patientContactedPerson;
	}

	public ArrayList<PatientVistedPlace> getPatientVistedPlace() {
		return patientVistedPlace;
	}

	public void setPatientVistedPlace(ArrayList<PatientVistedPlace> patientVistedPlace) {
		this.patientVistedPlace = patientVistedPlace;
	}


  

  
	


		     

}