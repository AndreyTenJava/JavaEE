package servlets.Les7_Task1;

import modal.Lesson7_Task1.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/les7Task1Step1")
public class Les7Task1Step1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Student student;
        student = (Student) session.getAttribute("student_data");
        if (student == null){
            student = new Student();
        }

        request.setAttribute("one_student", student);
        request.getRequestDispatcher("Les7Task1/task1Step1.jsp").forward(request, response);
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
        response.sendRedirect("/les7Task1Step2");
    }
}
