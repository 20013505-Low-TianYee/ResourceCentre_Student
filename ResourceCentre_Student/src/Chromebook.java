
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
<<<<<<< HEAD
	public String toString(){//tianyee
		String output = "";
=======
	public String toString(){
		String info = "";
		 
>>>>>>> branch 'master' of https://github.com/20013505-Low-TianYee/ResourceCentre_Student.git
		// Write your codes here
<<<<<<< HEAD
		String info = super.toString();
		
		return String.format("%-63s %-20d", info, getOs());
=======
		 return info;
>>>>>>> branch 'master' of https://github.com/20013505-Low-TianYee/ResourceCentre_Student.git
	}
}


