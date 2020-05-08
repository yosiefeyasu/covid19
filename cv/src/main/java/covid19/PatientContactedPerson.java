package covid19;



public class PatientContactedPerson extends BasicInfo{

	private Address locationOfTheContact;
	private String dateOfContact;
	
	public Address getLocationOfTheContact() {
		return locationOfTheContact;
	}
	public void setLocationOfTheContact(Address locationOfTheContact) {
		this.locationOfTheContact = locationOfTheContact;
	}
	public String getDateOfContact() {
		return dateOfContact;
	}
	@Override
	public String toString() {
		return "PatientContactedPerson [locationOfTheContact=" + locationOfTheContact + ", dateOfContact="
				+ dateOfContact + "]";
	}
	public void setDateOfContact(String dateOfContact) {
		this.dateOfContact = dateOfContact;
	}
	
}
