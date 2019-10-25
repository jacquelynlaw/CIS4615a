

/**
 * OBJ01-J. Limit accessibility of fields
 * Manipulation of fields to violate class invariants:
 *  Arises when we do not limit accessibility
 * Prevention:
 *  Declare fields as private or package-private
 */
public class rule05 {
    // Compliant solution for an index getter and length of an array
    private static final String[] items = 
    {
        "Alaska",
        "Delaware",
        "Florida",
        "New Jersey",
        "Texas"
    };

    public static final String getItem(int i) {
        return items[i];
    }

    public static final int getLength() {
        return items.length;
    }
    public static void main(String args[]) {
        System.out.println("Items Array: " + items.toString());
        System.out.println("Item at index = 2: " + getItem(2));
        System.out.println("Length of Items Array: " + getLength());
    }
}