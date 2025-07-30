import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    private Map<String, Profile> Profiles = new HashMap<>();


    public App(){
        Window window = new Window();
    }

    public void addProfile(String first, String last) {
        Profiles.put(first, new Profile(first, last));
    }


}
