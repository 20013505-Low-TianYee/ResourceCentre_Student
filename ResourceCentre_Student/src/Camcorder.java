
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String info = super.toString();
		// Write your codes here
<<<<<<< HEAD
		String info = super.toString();
		
=======
>>>>>>> branch 'master' of https://github.com/20013505-Low-TianYee/ResourceCentre_Student.git
		return String.format("%-63s %-20d", info, getOpticalZoom());
	}
}

