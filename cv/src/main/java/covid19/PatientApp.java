package covid19;

import java.util.ArrayList;
import java.util.Scanner;

public class PatientApp {
	public static void main(String[] args) {
		System.out.println("Contact Tracing Program");
		System.out.println("Enter a newly infected person's information");
		Scanner kbd = new Scanner(System.in);
		
		
		PatientContactedPerson patientContactedPerson = new PatientContactedPerson();
		Address addressContactedPerson = new Address();
		PatientVistedPlace patientVistedPlace = new PatientVistedPlace();
		Address addressVistedPlace = new Address();
		
		ArrayList<Symptoms> listOfsymptoms = new ArrayList<>();
		ArrayList<PatientContactedPerson> listOfPatientContactedPerson = new ArrayList<>();
		ArrayList< PatientVistedPlace> patientVistedPlaces= new ArrayList<>();
//====================================================
		Patient patient = new Patient();

		System.out.println("What is a patient's name ?");
		String name=kbd.nextLine();
		patient.setName(name);

		System.out.println("What is a patient's phone number?");
		patient.setPhoneNumber(kbd.nextLine());

		System.out.println("What is a patient's email?");
		patient.setEmailAddress(kbd.nextLine());

		Address address = new Address();
		System.out.println("What city does a patient live in?");
		address.setCity(kbd.nextLine());

		System.out.println("What state does a patient live in?");
		address.setState(kbd.nextLine());
        
		patient.setAddress(address);
//	=========================================================	
		Symptoms symptoms = new Symptoms();
		System.out.println("Does "+name+ "have any symptom for Fever? (y/n)");
		String answer1= kbd.nextLine();
		symptoms.setFever(kbd.nextLine());
		if(answer1.equalsIgnoreCase("y")) {
		System.out.println("How long has  "+name+"  had this symptom for?");
		
		}
		System.out.println("Does "+name+ "have any symptom for Cough? (y/n)");
		String answer2= kbd.nextLine();
		symptoms.setCough(kbd.nextLine());
		if(answer2.equalsIgnoreCase("y")) {
			System.out.println("How long has  "+name+"  had this symptom for?");
		
		}
		System.out.println("Does "+ name +" have any symptom for Shortness of breath or difficulty breathing? (y/n)");
		symptoms.setShortnessofbreathordifficultybreathing(kbd.nextLine());
		System.out.println("Does "+ name +" have any symptom for Tiredness? (y/n)");
		symptoms.setTiredness(kbd.nextLine());
		System.out.println("Does "+ name +" have any symptom for Aches? (y/n)");
		String answer3= kbd.nextLine();
		symptoms.setAches(kbd.nextLine());
		if(answer3.equalsIgnoreCase("y")) {
		
		System.out.println("How long has  "+name +"  had this symptom for?");
		
		}
		System.out.println("Does " +name+" have any symptom for Chills? (y/n)");
		String answer4= kbd.nextLine();
		symptoms.setChills(kbd.nextLine());
		if(answer4.equalsIgnoreCase("y")) {
		System.out.println("How long has  "+ name +"  had this symptom for?");
		
		}
		System.out.println("Does "+ name +" have any symptom for Sore throat? (y/n)");
		symptoms.setSorethroat(kbd.nextLine());
		System.out.println("Does "+ name +" have any symptom for Loss of smell? (y/n)");
		symptoms.setLossofsmell(kbd.nextLine());
		System.out.println("Does "+ name +" have any symptom for Loss of taste? (y/n)");
		symptoms.setLossoftaste(kbd.nextLine());
		System.out.println("Does "+ name +" have any symptom for Headache? (y/n)");
		symptoms.setHeadache(kbd.nextLine());
		System.out.println("Does "+ name +" have any symptom for Diarrhea? (y/n)");
		symptoms.setDiarrhea(kbd.nextLine());
		System.out.println("Does "+ name +" have any symptom for Severe vomiting? (y/n)");
		symptoms.getSeverevomiting();
		listOfsymptoms.add(symptoms);
		patient.setSymptoms(listOfsymptoms);
//===================================================================
	boolean flag=true;	
while(flag) {
	System.out.println("Has "+ name +" met or run into anyone? (y/n)");
	String p1 = kbd.nextLine();
			System.out.println("What is his/her name?");
			patientContactedPerson.setName(kbd.nextLine());
			System.out.println("What is his/her phone number?");
			patientContactedPerson.setPhoneNumber(kbd.nextLine());
			System.out.println("What is his/her email?");
			patientContactedPerson.setEmailAddress(kbd.nextLine());
            
			System.out.println("What city does he/her live in?");
			addressContactedPerson.setCity(kbd.nextLine());
			System.out.println("What state does he/her live in?");
			addressContactedPerson.setState(kbd.nextLine());
			
			patientContactedPerson.setAddress(addressContactedPerson);
		
			System.out.println("What city did "+ name + " see him/her?");
			address.setCity(kbd.nextLine());
			System.out.println("What state did "+ name +" see him/her?");
			address.setState(kbd.nextLine());
			patientContactedPerson.setLocationOfTheContact(address);
			
			System.out.println("When did "+ name +" see him/her? (mm/dd/yyyy)");
			patientContactedPerson.setDateOfContact(kbd.nextLine());
			listOfPatientContactedPerson.add(patientContactedPerson);
			
			patient.setPatientContactedPerson(listOfPatientContactedPerson);
			System.out.println("Have "+ name +" met or run into anyone else? (y/n)");
			String p2 = kbd.nextLine();

if (!(p2.equalsIgnoreCase("y"))) {
	System.out.println("==================="+flag);
flag=false;
		}

}
		
			System.out.println("Did "+ name +" visited anywhere in pass 14 days? (y/n)");
			String date = kbd.nextLine();

			if (date.equalsIgnoreCase("y")) {
				

				System.out.println("What is the name of a visited place?");
				String visitedplace=kbd.nextLine();
				patientVistedPlace.setVisitPlaceName(visitedplace);
				
				System.out.println("Which city is"+visitedplace +" located in?");
				String city=kbd.nextLine();
				addressVistedPlace.setCity(city);
				System.out.println("Which state is" +city + " located in?");
				String state=kbd.nextLine();
				addressVistedPlace.setState(state);
				System.out.println("Which city is "+state+" located in?");
				String city1=kbd.nextLine();
				addressVistedPlace.setCity(city1);
				patientVistedPlace.setVistedaddress(addressVistedPlace);
				System.out.println("When did "+ name +" went to "+ city + "? (mm/dd/yyyy)");
				patientVistedPlace.setVisitDate(kbd.nextLine());
				patientVistedPlaces.add(patientVistedPlace);
				patient.setPatientVistedPlace(patientVistedPlaces);
				
				
			}
		

		System.out.println("***** Contact Tracing Report *****");

		System.out.println("Name: " + patient.getName());
		System.out.println("Phone: " + patient.getPhoneNumber());
		System.out.println("Email: " + patient.getEmailAddress());
		System.out.println("City" + patient.getAddress().getCity());
		System.out.println("State) " + patient.getAddress().getState());
		System.out.println();

		System.out.println("**	Symptoms: ");

		for (Symptoms s : listOfsymptoms) {

			System.out.println("had Fever for" + s.getFever());
			System.out.println("had cough for" + s.getCough());
			System.out.println("had aches forr" + s.getAches());
			System.out.println("had chills for" + s.getChills());
			

		}

		System.out.println("**      Contacts:" +listOfPatientContactedPerson	);
		
		
		if(!listOfsymptoms.isEmpty()) {
		for (PatientContactedPerson pc : listOfPatientContactedPerson) {

			System.out.println("Name: " + pc.getName());
			System.out.println("Phone: " + pc.getPhoneNumber());
			System.out.println("Email: " + pc.getEmailAddress());
			System.out.println("City" + pc.getAddress().getCity());
			System.out.println("State " + pc.getAddress().getState());
			
			System.out.println("Contacted Location" + pc.getAddress().getState() + pc.getAddress().getCity());
			System.out.println("Contacted Date " + pc.getDateOfContact());
			
		}
		}
		System.out.print("**       Locations:");

		System.out.println("Name" + patientVistedPlace.getVisitPlaceName());
		System.out.println("City " + patientVistedPlace.getVistedaddress().getCity());
		System.out.println("State " + patientVistedPlace.getVistedaddress().getState());
		System.out.println("Visit Date" + patientVistedPlace.getVisitDate());

	}
	
}

