package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        if (m1 == null || m2 == null) {
            throw new NullPointerException("One or both Media objects to compare are null.");
        }

        if (!(m1 instanceof Media) || !(m2 instanceof Media)) {
            throw new ClassCastException("Objects being compared must be instances of Media.");
        }

        if (m1.getTitle() == null || m2.getTitle() == null) {
            throw new NullPointerException("One or both Media titles are null.");
        }

        int costCompare = Float.compare(m2.getCost(), m1.getCost());
        if (costCompare != 0) {
            return costCompare;
        }

        return m1.getTitle().compareTo(m2.getTitle());
    }
}
