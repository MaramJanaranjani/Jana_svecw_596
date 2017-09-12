import java.util.Date;

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
public class StudentGroup implements StudentArrayOperation {

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
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		try{
			if(students == null)
			   throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException AE) {}
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try {
		   if(index <0 || index >= students.length)
			   throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException Ae) {}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try {
			if(student == null || index < 0 || index >= students.length) 
				throw new IllegalArgumentException();
			else
				students[index] = student;
		}
		catch(IllegalArgumentException AE) {}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try {
		  if(student == null) {
			  throw new IllegalArgumentException();
		  }
		  else {
			  for(int i = 0; i <= students.length; i++) {
		         students[i+1] = students[i];
			  }
			  students[0] = student;
		  }
		}
		catch(IllegalArgumentException AE){}
	}
	@Override
	public void addLast(Student student) {
		int j = students.length;
		students[j - 1] = student;
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try {
		 if(student == null || index < 0 || index >= students.length)
		 	throw new IllegalArgumentException();
		 else{
			 int idx = index;
			 while(idx <=  students.length) {
				 students[idx+1] = students[idx];
                 idx++;					 
			 }
			 students[index] = student;
		 }
		}
		catch(IllegalArgumentException AE) {}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try {
		  if(index == 0 || index >= students.length)
			  throw new IllegalArgumentException();
		  else {
			  int i;
			  for(i = index; i < students.length; i++) {
				  students[index] = students[index + 1];
			  }
			  students[students.length-1] = null;
		  } 
	    }
		catch(IllegalArgumentException Ae) {}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try {
		 if(student == null)
			 throw new IllegalArgumentException();
		 else {
			 int i;
			 for(i = 0; i < students.length;i++) {
				 if(students[i] == student) {
					 for(int j = i; j <= students.length; j++) {
						 students[j+1] = students[j];
					 }
				 }
				 students[students.length - 1] = null;
			 }
		 }
	    }
		catch(IllegalArgumentException AE){}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try{
			if(student == null)
				throw new IllegalArgumentException();
			else {
				for(int i = 0; i < students.length; i++) {
					if(students[i] == student) {
						for(int j = i + 1; j < students.length;j++) {
							students[j] = null;
						}
					}
				}
			}
		}
		catch(IllegalArgumentException ae) {};
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		try {
		if(index == 0 || index >= students.length)
			throw new IllegalArgumentException();
		else {
			int i;
			for(i = 0; i < index; i++) {
				students[i] = students[i+1];
			}
			for(int j = index+1; j <= students.length;j++)
				students[j] = null;
		}
		}
		catch(IllegalArgumentException ae) {};
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
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
