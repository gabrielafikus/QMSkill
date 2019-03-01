package registration;

import java.awt.List;
import java.util.ArrayList;

public class Account {
	
	public String username;
	public String password; 
	public String Name;
	public int YearofStudy;
	public String phoneNumber;
	public int ID;
	public boolean AcceptTC;
	public String userRole; 
	public String Email; 
	public boolean registration; 
	private List registeredUsers;
	public String info; 
	public int userRating;
	
	public Account() {
		
		this.username = username;
		this.password = password; 
		this.Name = Name; 
		this.YearofStudy = YearofStudy; 
		this.phoneNumber = phoneNumber;
		this.ID = ID; 
		this.AcceptTC = AcceptTC;
		this.userRole = userRole; 
		this.Email = Email; 
		this.registration = registration; 
		this.registeredUsers = registeredUsers; 
		this.info =info; 
		this.userRating = userRating;
	}
	
	public void setUserName(String UserName) {
		// TODO - implement Account.setUserName
		throw new UnsupportedOperationException();
	}
	
	public String getPassword() {
		return password;
		
	}

	public String getUserName() {
		return username;
	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void checkUsernameAndPasswordLength(String username, String password) {
		// TODO - implement Account.checkUsernameAndPasswordLength
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param studentEmail
	 * @param ID
	 */
	public boolean verifyQmulStudent(String studentEmail, int ID) {
		// TODO - implement Account.verifyQmulStudent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sessionList
	 * @param ID
	 */


	/**
	 * 
	 * @param ID
	 * @param userName
	 * @param phoneNumber
	 */

	/**
	 * 
	 * @param Password
	 * @param ID
	 */
	public void setPassword(String Password) {
		// TODO - implement Account.setPassword
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public int getYearofStudy(String ID) {
		// TODO - implement Account.getYearofStudy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param YearofStudy
	 */
	public void setYearofStudy(int YearofStudy) {
		// TODO - implement Account.setYearofStudy
		throw new UnsupportedOperationException();
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement Account.setID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param UserName
	 */
	public int getID(String UserName) {
		// TODO - implement Account.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public String getEmail(int ID) {
		// TODO - implement Account.getEmail
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Email
	 */
	public void setEmail(String Email) {
		// TODO - implement Account.setEmail
		throw new UnsupportedOperationException();
	}

	public List getRegisteredUsers() {
		return this.registeredUsers;
	}

	public String getUserRole() {
		return this.userRole;
	}

	/**
	 * 
	 * @param userRole
	 */
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	/**
	 * 
	 * @param registration
	 */
	public void setRegistration(boolean registration) {
		this.registration = registration;
	}

	/**
	 * 
	 * @param ID
	 */
	public boolean getRegistration(int ID) {
		return this.registration;
	}

	/**
	 * 
	 * @param ID
	 */
	public String getInfo(int ID) {
		return this.info;
	}

	/**
	 * 
	 * @param info
	 * @param id
	 * @param password
	 */
	public void setInfo(String info, int id, String password) {
		// TODO - implement Account.setInfo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userName
	 * @param Password
	 */
	public void verifyLogin(String userName, String Password) {
		// TODO - implement Account.verifyLogin
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 * @param username
	 * @param password
	 */
	public void updateInfo(int ID, String username, String password) {
		// TODO - implement Account.updateInfo
		throw new UnsupportedOperationException();
	}

	public int getUserRating() {
		return this.userRating;
	}

	/**
	 * 
	 * @param userRating
	 */
	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}

	
	

}
