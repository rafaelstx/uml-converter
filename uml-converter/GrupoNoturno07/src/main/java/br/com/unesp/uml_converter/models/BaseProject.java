/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.uml_converter.models;

import java.util.ArrayList;
import java.util.List;

public class BaseProject {

    private String projectName;
    private List<BaseClass> objects = new ArrayList<>();
    private List<BaseRelationship> relationships = new ArrayList<>();

    public BaseProject(String projectName, List<BaseClass> objects) {
        this.projectName = projectName;
        this.objects = objects;
    }

    public BaseProject() {
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<BaseClass> getObjects() {
        return objects;
    }

    public void setObjects(List<BaseClass> objects) {
        this.objects = objects;
    }
    
    public void addObject(BaseClass baseObject) {
        objects.add(baseObject);
    }

    public List<BaseRelationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<BaseRelationship> relationships) {
        this.relationships = relationships;
    }
    
    @Override
    public String toString() {
        return "Project{" + "projectName=" + projectName + ", objects=" + objects.toString() + '}';
    }

}
