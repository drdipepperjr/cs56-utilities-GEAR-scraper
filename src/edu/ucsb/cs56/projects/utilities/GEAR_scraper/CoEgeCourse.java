package edu.ucsb.cs56.projects.utilities.GEAR_scraper;

/**
 * CoEGECourse Interface
 * @version CS56, Winter 2014
 * 
 */

public interface CoEgeCourse {
public String getDeptInGear(); // department offering the course, exactly as formatted in GEAR
                            // e.g. Anthropology
public String getDeptCode();  // department code (e.g. ANTH) as in GOLD (you'll have to translate to get that)
public String getCourseNum(); // e.g. 118B 
public boolean isD(); // its on the area D list
public boolean isE(); // its on the area E list
public boolean isF(); // its on the area F list
public boolean isG(); // its on the area G list
public boolean isWriting(); // This course applies toward the writing requirement. 
public boolean isAmHistInst(); // This course applies toward the American History & Institutions requirement.
public boolean isEthnicity(); //  This course applies toward the ethnicity requirement.
public boolean isEuroTrad(); // This course applies toward the European Traditions requirement.
}