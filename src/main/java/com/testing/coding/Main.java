package com.testing.coding;

import java.util.*;

public class Main {
//    a. Write a new class called "Student" with roll, name, age and grade as fields.
//    b. Initialise below 3 students, keep those student objects in a Map (roll as key, student as value)
//    Roll: 1, Name: John,  Age: 18, Grade: 7.5
//    Roll: 5, Name: Steve, Age: 19, Grade: 6.5
//    Roll: 7, Name: Brian, Age: 19, Grade: 8.5
//    c. Iterate through the Map and calculate average age of the students
        public static void main(String[] args) {
            Student s1 = new Student(1, "John", 18, 7.5);
            Student s2 = new Student(5, "Steve", 19, 6.5);
            Student s3 = new Student(7, "Brian", 19, 8.5);

            Map<Integer, Student> map1 = new HashMap<>();
            map1.put(s1.getRoll(), s1);
            map1.put(s2.getRoll(), s2);
            map1.put(s3.getRoll(), s3);

            Collection<Student> students =  map1.values();
            int len = students.size();
            int sum = 0;

            for(Student s: students){
                sum+= s.getAge();
            }
            double avg  = (double) sum/len;
            System.out.println(avg);

        }

}
