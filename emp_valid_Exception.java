class nullvalueException extends Exception{
	
}
class invalidPhoneNoException extends Exception{
	
}

class emp{
	private String fname,lname,address,phoneNo;
	
	public emp(String fname,String lname,String address,String phoneNo) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "emp [fname=" + fname + ", lname=" + lname + ", address=" + address + ", eno=" + phoneNo + "]";
	}
	
	public void isValid() {
		try {
			if(fname == null || lname == null) {
				throw new nullvalueException();
			}
			if(phoneNo.length() != 10 || !phoneNo.matches("^[0-9]+$")) {
				throw new invalidPhoneNoException();
			}
		}
		catch(nullvalueException e) {
			System.out.println("Null value in fname or lname");
		}
		catch(invalidPhoneNoException e) {
			System.out.println("Invalid Phone number");
		}
		
	}
	
	
}

public class emp_valid_Exception {
	public static void main(String[] args) {
		emp e1 = new emp("vatsal","Bhalani","fsdfsdf","900054119466");
		e1.isValid();
	}
}
