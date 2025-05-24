package hust.soict.hedspi.aims.media;

public class Disc extends Media {
	protected String director;
	protected int length;
	
	public Disc(String title) {
		super(title);
	}
	
	public Disc(String title, String category, float cost) {
		super(title,category,cost);
	}
	
	public Disc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
		this.director = director;
		this.length = length;
	}

	public String getDirector() {
		return director;
	}
	
    public void setDirector(String director) {
        if (director == null || director.trim().isEmpty()) {
            throw new IllegalArgumentException("Director cannot be null or empty.");
        }
        this.director = director;
    }
	
	public int getLength() {
		return length;
	}
	
    public void setLength(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive.");
        }
        this.length = length;
    }

}
