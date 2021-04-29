package p17.android.nivigationactivity.ui.list.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<PhareItem> ITEMS = new ArrayList<PhareItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, PhareItem> ITEM_MAP = new HashMap<String, PhareItem>();

    private static final int COUNT = 25;

    public static void loadData() {
        // Add some sample items.
        addItem(new PhareItem("1","Phare de l'Espiguette","PACA"));
        addItem(new PhareItem("2","Phare du planier","PACA"));
        /* for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }*/
    }

    private static void addItem(PhareItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static PhareItem createDummyItem(int position) {
        return new PhareItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
       for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }

        return builder.toString();
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class PhareItem {
        public final String id;
        public final String content;
        public final String region;

        public PhareItem(String id, String content, String region) {
            this.id = id;
            this.content = content;
            this.region = region;
        }




        @Override
        public String toString() {
            return content;
        }
    }
}