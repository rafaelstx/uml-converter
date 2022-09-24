/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.uml_converter.utils;

import br.com.unesp.uml_converter.models.BaseAttr;
import br.com.unesp.uml_converter.models.BaseClass;
import br.com.unesp.uml_converter.models.BaseProject;
import br.com.unesp.uml_converter.models.BaseRelationship;
import java.util.List;

public class UmlUtils {

    public static String projectToUML(BaseProject project) {

        StringBuilder strUML = new StringBuilder();

        strUML.append("@startuml");
        strUML.append(System.lineSeparator());
        strUML.append(String.format("Title: %s", project.getProjectName()));
        strUML.append(objectToUml(project.getObjects()));
        strUML.append(System.lineSeparator());
        strUML.append(relationshipToUML(project.getRelationships()));
        strUML.append(System.lineSeparator());
        strUML.append("@enduml");

        return strUML.toString();
    }

    private static String objectToUml(List<BaseClass> objects) {

        StringBuilder objectsUML = new StringBuilder();

        for (BaseClass o : objects) {
            objectsUML.append(System.lineSeparator());
            objectsUML.append(String.format("class %s {", o.getObjectName()));
            objectsUML.append(System.lineSeparator());
            objectsUML.append(attributeToUml(o.getAttributes()));
            objectsUML.append("}");
        }

        return objectsUML.toString();
    }

    private static String attributeToUml(List<BaseAttr> attributes) {

        StringBuilder attrsUML = new StringBuilder();

        for (BaseAttr attr : attributes) {
            attrsUML.append(
                    String.format("    %s %s %s", verifyModifier(attr.getModifier()), attr.getType(), attr.getName()));
            attrsUML.append(System.lineSeparator());
        }

        return attrsUML.toString();
    }

    private static String relationshipToUML(List<BaseRelationship> relationships) {

        StringBuilder relationUML = new StringBuilder();

        for (BaseRelationship attr : relationships) {
            relationUML.append(String.format("%s %s %s", attr.getObject1(), verifyRelantionshipMultiplicity(attr),
                    attr.getObject2()));
            relationUML.append(System.lineSeparator());
        }

        return relationUML.toString();
    }

    private static String verifyModifier(String v) {

        String modifier = " ";

        switch (v) {
            case "public":
                modifier = "+";
                break;

            case "private":
                modifier = "-";
                break;

            case "protected":
                modifier = "#";
                break;

            default:
                throw new AssertionError();
        }

        return modifier;
    }

    private static String verifyRelantionshipMultiplicity(BaseRelationship baseRM) {

        String strRM = "";

        if (!baseRM.getMultiplicity1().equals("none")) {
            strRM = String.format("\"%s\" ", baseRM.getMultiplicity1());
        }

        strRM = strRM + String.format("%s", verifyRelation(baseRM.getRelation()));

        if (!baseRM.getMultiplicity2().equals("none")) {
            strRM = strRM + String.format(" \"%s\"", baseRM.getMultiplicity2());
        }
        
        return strRM;
    }

    public static String verifyRelation(String m) {

        String rm = " ";

        switch (m) {
            case "inheritance":
                rm = "--|>";
                break;

            case "composition":
                rm = "--*";
                break;

            case "agregation":
                rm = "--o";
                break;

            default:
                throw new AssertionError();
        }

        return rm;

    }

}