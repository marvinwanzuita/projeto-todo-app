package TodoApp;

import controller.ProjectController;
import java.sql.SQLException;
import model.Project;

public class App {

    public static void main(String[] args) throws SQLException {
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("Descrição do projeto");
        projectController.save(project);
        
    }
}
