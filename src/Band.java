public class Band {
	int id;
	String name, webpage;
	
	public Band(int id, String name, String webpage) {
		this.id = id;
		this.name = name;
		this.webpage = webpage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWebpage() {
		return webpage;
	}

	public void setWebpage(String webpage) {
		this.webpage = webpage;
	}

	public Band(int id, String webpage) {
		this.id = id;
		this.webpage = webpage;
	}
	
	
}