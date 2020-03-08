package com.company;

public class Main
    {

            public void  main(String[] args)
            {
                // creat Student object
                Student kong = new Student();
                Student mig = new Student();
                Student say =new Student();

                // input data to object
                kong.name= "Kinfff";
                kong.id= "623416268-8";
                kong.major= "CIS";
                mig.name= "youdigfm";
                mig.id= "0997";
                mig.major= "CIS";
                say.name= "sama";
                say.id= "0998";
                say.major= "CS";


                //get data from object
                System.out.println("1."+ kong.name +" "+ kong.major);
                System.out.println("2."+ mig.name +" "+ mig.major);
                System.out.println("3."+ say.name +" "+ say.major);

                // add student to array
                // array intex       0
                Student[] oopStudents = {kong,mig,say};

                System.out.println("1."+oopStudents[0].name);
                System.out.println("2."+oopStudents[1].name);
                System.out.println("3."+oopStudents[2].name);

                find_CIS_Student(oopStudents);
            }
            // To find CIS Student
            public void  find_CIS_Student(Student[] students)
            {
                for(int i = 0; i < students.length; i++)
                {
                    // check student.major is "CIS"
                    if (students[i].major == "CIS")
                    {
                        System.out.println(i+1 + ". "+ students[i].name);
                    }
                }

            }
    }



