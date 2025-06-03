package com.mycompany.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {"/"})
public class HelloFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

        System.out.println("filtering");

        /*
        var request = (HttpServletRequest) req;
        var response = (HttpServletResponse) res;

        var session = request.getSession(true);

        var auth = session.getAttribute("auth_user");

        if (auth != null) {
            chain.doFilter(req, res);
        }

        response.sendRedirect("/login.jsp");
         */
        chain.doFilter(req, res);
    }

}
