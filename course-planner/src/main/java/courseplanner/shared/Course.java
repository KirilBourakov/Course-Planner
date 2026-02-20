package courseplanner.shared;

import java.util.ArrayList;

public class Course {
	private String courseCode;
	private String courseName;
	private String description;
	private int ch;
	
	
	private ArrayList<String> tags;
	private ArrayList<Course> prerequisites;
	private ArrayList<Course> corequisites;
	
	public Course(String courseCode, String courseName, String description, int ch){
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.description = description;
		this.ch = ch;
		
		this.tags = new ArrayList<>();
		this.prerequisites = new ArrayList<>();
		this.corequisites = new ArrayList<>();
	}
}
