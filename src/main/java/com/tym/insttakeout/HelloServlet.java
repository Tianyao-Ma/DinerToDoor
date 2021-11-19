package com.tym.insttakeout;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tym.insttakeout.entity.Customer;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Vincent!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");

        ObjectMapper mapper = new ObjectMapper();
//        Customer customer = new Customer.CustomerBuilder().
//                email("lee@gamil.com")
//                .firstName("Fiona")
//                .lastName("Lee")
//                .password("123456")
//                .enabled(false)
//                .build();
//
//        response.getWriter().print(mapper.writeValueAsString(customer));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // read customer information from request body
        // request.getReader() retrieve the body info from http request;
        JSONObject jsonRequest = new JSONObject(IOUtils.toString(request.getReader()));
        String email = jsonRequest.getString("email");
        String firstName = jsonRequest.getString("first_name");
        String lastName = jsonRequest.getString("last_name");
        int age = jsonRequest.getInt("age");
        //print customer information to IDE console:
        System.out.println("Email is " + email);
        System.out.println("First name is " + firstName);
        System.out.println("Last name is " + lastName);
        System.out.println("Age is " + age);

        // Return status = ok as response body to the client
        response.setContentType("application/json");
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("status", "ok");
        response.getWriter().print(jsonResponse);
    }

    public void destroy() {
    }
}