package Persons;

import java.time.LocalDate;

/**
 * Created by oleksii on 9/29/15.
 */
public class Person {
	private String name;
	private String lastName;
	private LocalDate birthDate;

	public Person(String name, String lastName, LocalDate birthDate) {
		checkBirthDate(birthDate);
		checkNames(name, lastName);
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	private void checkBirthDate (LocalDate birthDate){
		LocalDate dateNow = LocalDate.now();
		LocalDate minBorder = dateNow.minusYears(120);

		if (birthDate.isBefore(minBorder) || birthDate.isAfter(dateNow)){
			throw new IllegalArgumentException("Wrong date!");
		}
	}

	private void checkNames(String name, String lastName) {
		checkName(name, "name");
		checkName(lastName, "last name");
	}

	private void checkName(String name, String typeOfName) {
		for (int i = 0; i < name.length(); i++){
			if (i == 0){
				if (!Character.isUpperCase(name.charAt(i))){
					throw new IllegalArgumentException("First symbol in " + typeOfName + " have to be uppercase!");
				} else if (!Character.isAlphabetic(name.charAt(i))){
					throw new IllegalArgumentException("First symbol in " + typeOfName + " have to be only a letter!");
				}
			} else if (i == name.length()-1){
				if (Character.isUpperCase(name.charAt(i))){
					throw new IllegalArgumentException("Last symbol in " + typeOfName + " have not to be uppercase!");
				} else if (!Character.isAlphabetic(name.charAt(i))){
					throw new IllegalArgumentException("Last symbol in " + typeOfName + " have to be only a letter!");
				}
			} else {
				if (Character.isUpperCase(name.charAt(i))){
					throw new IllegalArgumentException("In " + typeOfName + " only first symbol can be uppercase!");
				} else if (!Character.isAlphabetic(name.charAt(i)) && name.charAt(i) != '-'){
					throw new IllegalArgumentException("Only letters and symbol '-' can be in " + typeOfName + " !");
				}

			}
		}

	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", birthDate=" + birthDate +
				'}';
	}
}
