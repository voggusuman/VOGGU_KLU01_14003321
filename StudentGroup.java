import java.util.Date;
import java.util.*;
import java.io.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StudentGroup implements StudentArrayOperation {
Scanner obj=new Scanner(System.in);
private Exception IllegalArgumentException;
	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
	@Override
	public Student[] getStudents() {
		// Add your implementation here
               
                return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
                if(index<=0||index>students.length){
                    try {
                        throw IllegalArgumentException;
                    } catch (Exception ex) {
                        Logger.getLogger(StudentGroup.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
                int i;
                if(index<=0||index>students.length){
                    try {
                        throw IllegalArgumentException;
                    } catch (Exception ex) {
                        Logger.getLogger(StudentGroup.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    for(i=index;i<students.length;i++){
                        students[i+1]=students[i];
                    }
                    students[0]=student;
                }
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
                for(int i=0;i<students.length;i++){
                    
                }
                
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
                int length=students.length;
                for(int i=0;i<length;i++){
                    students[i+1]=students[i];
                }
                students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
                 int length=students.length;
                for(int i=1;i<length;i++){
                    students[i-1]=students[i];
                }
                //students[index]=student;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
                 int length=students.length;
                for(int i=1;i<length;i++){
                    students[i-1]=students[i];
                }
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here0
                 int length=students.length;
                for(int i=1;i<length;i++){
                    students[i-1]=students[i];
                }
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
                 int length=students.length;
                for(int i=1;i<length;i++){
                    students[i-1]=students[i];
                }
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
                 int length=students.length;
                for(int i=1;i<length;i++){
                    students[i-1]=students[i];
                }
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
                 int length=students.length;
                for(int i=1;i<length;i++){
                    students[i-1]=students[i];
                }
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
                java.ArraySort(students);
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
