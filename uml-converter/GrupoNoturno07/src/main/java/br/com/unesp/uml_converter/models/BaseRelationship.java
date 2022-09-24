/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.uml_converter.models;


public class BaseRelationship {
    
    private String object1;
    private String multiplicity1;
    private String object2;
    private String multiplicity2;
    private String relation = "none";

    public BaseRelationship(String object1, String multiplicity1, String object2, String multiplicity2) {
        this.object1 = object1;
        this.multiplicity1 = multiplicity1;
        this.object2 = object2;
        this.multiplicity2 = multiplicity2;
    }

    public BaseRelationship() {
    }

    public String getObject1() {
        return object1;
    }

    public void setObject1(String object1) {
        this.object1 = object1;
    }

    public String getMultiplicity1() {
        return multiplicity1;
    }

    public void setMultiplicity1(String multiplicity1) {
        this.multiplicity1 = multiplicity1;
    }

    public String getObject2() {
        return object2;
    }

    public void setObject2(String object2) {
        this.object2 = object2;
    }

    public String getMultiplicity2() {
        return multiplicity2;
    }

    public void setMultiplicity2(String multiplicity2) {
        this.multiplicity2 = multiplicity2;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "BaseRelationship{" + "object1=" + object1 + ", multiplicity1=" + multiplicity1 + ", object2=" + object2 + ", multiplicity2=" + multiplicity2 + ", relation=" + relation + '}';
    }
    
}
