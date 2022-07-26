package servlets.Les7_Task1;

import modal.Lesson7_Task1.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.lang.System.out;

@WebServlet(value = "/les7Task1Step3")
public class Les7Task1Step3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Student student;
        student = (Student) session.getAttribute("student_data");
        if (student == null){
            student = new Student();
        }
        request.setAttribute("one_student", student);
        request.getRequestDispatcher("Les7Task1/task1Step3.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name_value");
        String surname = request.getParameter("surname_value");
        int age = Integer.parseInt(request.getParameter("age_value"));
        String city = request.getParameter("city_value");
        String address = request.getParameter("address_value");
        String phone = request.getParameter("phone_value");
        String university = request.getParameter("university_value");
        String faculty = request.getParameter("faculty_value");
        String group = request.getParameter("group_value");

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
        student.setCity(city);
        student.setAddress(address);
        student.setPhone(phone);
        student.setUniversity(university);
        student.setFaculty(faculty);
        student.setGroup(group);

        HttpSession session = request.getSession();
        session.setAttribute("student_data", student);

        out.println("Name: " + student.getName());
        out.println("Surname: " + student.getSurname());
        out.println("Age: " + student.getAge());
        out.println("City: " + student.getCity());
        out.println("Address: " + student.getAddress());
        out.println("Phone: " + student.getPhone());
        out.println("University: " + student.getUniversity());
        out.println("Faculty: " + student.getFaculty());
        out.println("Group: " + student.getGroup());

        response.sendRedirect("/les7Task1Step3");
    }
}
