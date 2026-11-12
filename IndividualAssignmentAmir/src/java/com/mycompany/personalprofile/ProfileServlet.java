package com.mycompany.personalprofile;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String studentId = request.getParameter("studentId");
        String program = request.getParameter("program");
        String email = request.getParameter("email");
        String introduction = request.getParameter("introduction");

        String[] hobbies = request.getParameterValues("hobbies");
        String hobbiesText;

        if (hobbies == null || hobbies.length == 0) {
            hobbiesText = "No hobbies selected";
        } else {
            StringBuilder hobbiesBuilder = new StringBuilder();

            for (int i = 0; i < hobbies.length; i++) {
                if (i > 0) {
                    hobbiesBuilder.append(", ");
                }
                hobbiesBuilder.append(hobbies[i]);
            }

            hobbiesText = hobbiesBuilder.toString();
        }

        request.setAttribute("name", escapeHtml(name));
        request.setAttribute("studentId", escapeHtml(studentId));
        request.setAttribute("program", escapeHtml(program));
        request.setAttribute("email", escapeHtml(email));
        request.setAttribute("hobbies", escapeHtml(hobbiesText));
        request.setAttribute("introduction", escapeHtml(introduction));

        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

    private String escapeHtml(String value) {
        if (value == null) {
            return "";
        }

        return value
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}
