package br.com.unesp.uml_converter.models;

public class BaseAttr {
    
    private String modifier;
    private String type;
    private String name;

    public BaseAttr(String modifier, String type, String name) {
        this.modifier = modifier;
        this.type = type;
        this.name = name;
    }

    public BaseAttr() {
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return modifier + " " + type + " " + name;
    }
    
}
