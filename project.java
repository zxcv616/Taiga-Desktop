import java.util.ArrayList;
import java.util.List;

public class project {
    private int id;
    private String name;
    private String description;
    private String projType;
    private String authType;
    private List<story> userStories;
    private List<task> userTasks;
    private List<sprint> userSprints;

    public project(int id, String name, String description, String type, String projType, String authType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.projType = projType;
        this.authType = authType;
        this.userStories = new ArrayList<story>();
        this.userTasks = new ArrayList<task>();
        this.userSprints = new ArrayList<sprint>();
    }

    public void addUserStory(story s) {
        this.userStories.add(s);
    }

    public void addUserTask(task t) {
        this.userTasks.add(t);
    }

    public void addUserSprint(sprint sp) {
        this.userSprints.add(sp);
    }

    public List<story> getStory() {
        return this.userStories;
    }

    public List<task> getTask() {
        return this.userTasks;
    }

    public List<sprint> getSprint() {
        return this.userSprints;
    }

}