package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	protected static int nbMedia = 0;
	
	public Media(String title) {
		this.title = title;
		nbMedia++;
		this.id = nbMedia;
	}
	
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbMedia++;
		this.id = nbMedia;
	}
	
	public int getId() {
		return id;
	}

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive.");
        }
        this.id = id;
    }

	public String getTitle() {
		return title;
	}

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = title;
    }

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("Category cannot be null or empty.");
        }
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

    public void setCost(float cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative.");
        }
        this.cost = cost;
    }
	
    @Override
    public String toString() {
        return "Media - " + this.id + " - " + this.title + " - " + this.category + ": " + this.cost + " $";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Media)) {
            System.err.println("Comparison object is not of type Media.");
            return false;
        }

        Media check = (Media) obj;

        if (this.title == null || check.title == null) {
            return false;
        }

        return this.title.equals(check.title);
    }
    
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();

    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
}
