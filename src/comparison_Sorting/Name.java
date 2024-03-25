package comparison_Sorting;

public class Name implements Comparable<Name> {
	
	private String fname;
	private String lname;
	
	public Name(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}


	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return "Name" + " " +"[" + fname + " " + lname + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj.getClass() == getClass()) {
			Name n = (Name)obj;
			return fname.equals(n.fname) && lname.equals(n.lname);
		}
	
		return false;
	}
	

	public int compareTo(Name n) {
		if (lname.equals(n.lname)) return fname.compareTo(n.lname);
		return lname.compareTo(n.lname);
	}
	
	
	

}
