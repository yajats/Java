//============================================================================
// File Name   : ScheduleOfClasses.java
// Author      : Yajat Sharma
// Copyright   : None
// Description : This program is just an object oriented program for students looking for courses 

// Revision History:
// Date              Version         Author             Comment
// 06-06-22          1.0           Yajat Sharma       
//============================================================================

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScheduleOfCourses {
	
	private static BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
	
	public static void main(String[] args) {
			
		Course [] courseList = null;
    	
		final int COURSE_ARRAY_SIZE = 12;
		
		courseList = new Course[COURSE_ARRAY_SIZE];
		
		buildScheduleOfClasses(courseList);
		
		//viewScheduleOfClasses(courseList);
		
		viewCourseSections(courseList);
		
		//enrollACourse(courseList);
	}

	public static void buildScheduleOfClasses (Course [] courseList) {
		
		String [] courseTitleList = {"CS 1A", "CS 2B", "CS 1B", "CS 4A", "CS 5A", "CS 6A", "CS 5A", "CS 4A", "CS 1A", "CS 4A", "CS 9A", "CS 8A"};
		String [] sectionList     = {"2W",    "1Y",    "3Z",    "4Z",    "5Z",    "6Z",    "7Z",    "8Z",    "9Z",    "10Z",    "11Z",   "12Z"};
		int    [] CRNList = {32671, 31001, 33982, 36848, 36848, 84563, 84637, 36848, 32671, 36848, 57534, 32671};
		double [] unitsList = {4.5, 4.5, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0};
		int    [] capacityList = {0, 50, 30, 10, 50, 0, 90, 100, 0, 0, 130, 0};
		String [] instructorList = {"Pham", "Lankester", "Mazloom", "Jacob", "Daniels", "Mazerlev", "Zelt", "Martinez", "Lin", "Kaur", "Sheth", "Goulet"};
		
		for (int i = 0; i < courseList.length; i++) {
			
			if (i % 2 == 0) {
				
				courseList[i] = new Course();
				courseList[i].setTitle(courseTitleList[i]);
				courseList[i].setSection(sectionList[i]);
				courseList[i].setCRN(CRNList[i]);
				courseList[i].setUnits(unitsList[i]);
				courseList[i].setCapacity(capacityList[i]);
				courseList[i].setInstructor(instructorList[i]);
				
				}
			
			else {
				
				courseList[i] = new Course(courseTitleList[i],  CRNList[i], sectionList[i], unitsList[i], capacityList[i], instructorList[i]);
			}
		}
	}
	
	public static void viewScheduleOfClasses(Course [] courseList) {
		
		for (Course course : courseList) {
			
			System.out.println(course.toString());
		}
	}
	
	public static void viewCourseSections (Course [] courseList) {		
		
		
		boolean inMenu = true;
		
		do {
			
			boolean itExists = false;
			boolean inList = true;
			
			System.out.println("Enter a course title: ");
			String choice = null;
			
			try {
				choice = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			for (Course course : courseList) {
								
				if (choice.equals(course.getTitle())) {
					
					System.out.println("");
					System.out.println("Title: " + course.getTitle().toString());
					System.out.println("");
					System.out.println("Section: " + course.getSection().toString());
					System.out.println("");
					System.out.println("Registration Number: " + course.getCRN());
					System.out.println("");
					System.out.println("Units possible: " + course.getUnits());
					System.out.println("");
					System.out.print("Capacity: " + course.getCapacity());
					
					if (course.isFull() == true) {
						System.out.println("  (Sorry! this course is full)");
					}
					
					else {
						System.out.println("");
					}
					
					System.out.println("");
					System.out.println("Instructor: " + course.getInstructor().toString());
					System.out.println("");
					System.out.println("");
					
					inList = true;
					itExists = true;
					
					
				}
				else {
					inList = false;
				}
				
				
			}
			
			if (!inList && !itExists) {
				
				System.out.println("");
				System.out.println("Sorry, " + choice + " course is not offered in this quarter!");
				System.out.println("");

			}
			
		} while (inMenu);
	}
	
	public static void enrollACourse(Course [] courseList) {
		System.out.println("Enter a CRN: ");
		String CRNChoice = "";

		try {
			CRNChoice = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		        
        for (Course course: courseList) {
        	if(course.getCRN() == Integer.parseInt(CRNChoice) && course.getCapacity() != 0) {
        		
        		//viewScheduleOfClasses(courseList); (just for test cases)
        		
        		course.enroll();
     
        		/* (Just for test cases)
        		System.out.println("");
        		System.out.println("Successfully enrolled");
        		System.out.println("");
        		viewScheduleOfClasses(courseList);
        		*/
        	}
        }
        
	}
}

class Course {
	

	
	private String title;
	private int CRN;
	private String section;
	private double units;
	private int capacity;
	private String instructor;
	
	public Course() {
		
		 title = "TBD";
		 CRN = 0;
		 section = "0A";
		 units = 4.0;
		 capacity = 30;
		 instructor = "Staff";
	}
	
	public Course(String title, int CRN, String section, double units, int capacity, String instructor) {
		
		this.title = title;
		this.CRN = CRN;
		this.section = section;
		this.units = units;
		this.capacity = capacity;
		this.instructor = instructor;
	}
	
	public String getTitle() {return title;}
	public void setTitle(String newTitle) {title = newTitle;}
	
	public int getCRN() {return CRN;}
	public void setCRN(int newCRN) {CRN = newCRN;}
	
	public String getSection() {return section;}
	public void setSection(String newSection) {section = newSection;}
	
	public double getUnits() {return units;}
	public void setUnits(double newUnits) {units = newUnits;}
	
	public int getCapacity() {return capacity;}
	public void setCapacity(int newCapacity) {capacity = newCapacity;}
	
	public String getInstructor() {return instructor;}
	public void setInstructor(String newInstructor) {instructor = newInstructor;}
	
	public boolean enroll() {
		
		if (capacity > 0) {
			
			capacity -= 1;
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public boolean isFull() {
		return (capacity <= 0);
	}
	
	public String toString() {
		
		//This part with the if statement is so that it will display a message saying that the course is full, if it is full
		// (might not be necessary but it seemed like a useful touch)
		String fullMessage = "";
		
		if (capacity <= 0) {
			fullMessage = "  (Sorry! This course is full)";
		}
		
		return "Title : " + title + "\n" + "Reg #: " + CRN + "\n" + "Section: " + section + "\n" + "Units: " + units + "\n" + 
				"Capacity: " + capacity + fullMessage + "\n" + "Instructor: " + instructor + "\n" + "\n";
}
	
	public boolean equals(Object other) {
		
		if (this == other) {
            return true;
		}
		
        if (other == null) {
       return false;
        }
        
        if (! ( other instanceof Course)) {   
             return false;
        }
        
        Course comparedPoint  = (Course) other;  
       
        return ( title == comparedPoint.title && title == comparedPoint.title );
        
	}
	
}
