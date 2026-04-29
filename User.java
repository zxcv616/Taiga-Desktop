import java.util.*;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    LinkedList<Project> projects = new LinkedList<>();    

    public void addProject(Project project) {
        projects.add(project);
    }

    public LinkedList<Project> getProjects() {
        return projects;
    }
    public void removeProject(Project project) {
        projects.remove(project);
    }

}