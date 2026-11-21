import zero.ui.Element;
import zero.ui.Label;

public class ScoreDisplay {
    private final Label label = new Label("Score: 0");
    private String caption = "Score";
    private int points;

    //displays the supplied score
    public void setScore(int points) {
        this.points = points;
        refresh();
    }

    private void refresh() {
        label.setText(caption + ": " + points);
    }

    //changes the caption while retaining that displayed value
    public void setCaption(String caption) {
        if (caption == null) {
            throw new IllegalArgumentException("Score caption must not be null.");
        }
        this.caption = caption;
        refresh();
    }

    //gives calling class an Element
    public Element view() {
        return label;
    }
}
