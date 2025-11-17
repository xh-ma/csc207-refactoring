package theater;

/**
 * Class representing a play with a name and a type.
 * <p>
 * The type of the play can be used to determine its genre,
 * such as "tragedy", "comedy", or others.
 * </p>
 */
public class Play {

    private final String name;
    private final String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }
}
