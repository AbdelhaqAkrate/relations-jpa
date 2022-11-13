package com.example.jpa;

import java.io.*;

import com.example.jpa.entities.DepartementEntity;
import com.example.jpa.entities.EmployeEntity;
import jakarta.persistence.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        DepartementEntity departement = new DepartementEntity();
        departement.setIdDep(1);
        departement.setName("Departement1");
        transaction.begin();
        entityManager.persist(departement);
        transaction.commit();

        EmployeEntity employe = new EmployeEntity();
        employe.setId(1);
        employe.setName("abdelhaq");
        employe.setAdresse("adresse");
        employe.setPhone(017171717171);
        transaction.begin();
        DepartementEntity dep = entityManager.find(DepartementEntity.class,1);
        transaction.commit();
        employe.setIdDep(dep);
        transaction.begin();
        entityManager.persist(employe);
        transaction.commit();
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}