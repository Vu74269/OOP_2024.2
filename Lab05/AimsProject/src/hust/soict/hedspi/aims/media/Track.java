package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Track implements Playable {
	private String title;
	private int length;

    public Track(String title, int length) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Track length must be positive.");
        }
        this.title = title;
        this.length = length;
    }

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	@Override
	public void play() throws PlayerException {
	    if (this.getLength() > 0) {
		    System.out.println("Playing Track: " + this.getTitle());
		    System.out.println("Track length: " + this.getLength());
	    } else {
	        throw new PlayerException("ERROR: DVD length is non-positive!");
	    }
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    
	    Track check = (Track) obj;
	    return this.title != null && this.title.equals(check.title) && this.length == check.length;
	}
	
}
