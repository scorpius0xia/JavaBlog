package com.coolwind.javablog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.coolwind.javablog.bean.BlogSubmit;
import com.coolwind.javablog.bean.LoginBean;
import com.coolwind.javablog.bean.RegistrationBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author coolwind
 */
public class IndexServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IndexServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IndexServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        request. setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action.equals("hot_top")) {
            String hot_top = request.getParameter("hot_top");

            try (PrintWriter out = response.getWriter()) {
                out.println("The value is " + hot_top);
            }
        } else if (action.equals("to_registration")) {
            this.toRegistration(request, response);
        } else if (action.equals("change")) {
            String change = request.getParameter("change");
            if (change.equals("to_mainpage")) {
                this.toMainpage(request, response);
            } else if (change.equals("to_publicblog")) {
                int code = 1;
                request.setAttribute("ActionCode", code);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else if (change.equals("to_myblog")) {
                int code = 2;
                request.setAttribute("ActionCode", code);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } else if (action.equals("to_blog_create")) {
            this.toBlogCreate(request, response);
        } else if (action.equals("to_modify_password")) {
            this.toModifyPassword(request, response);
        } else if (action.equals("to_modify_user")) {
            this.toModifyUser(request, response);
        } else if (action.equals("to_manage_blog")) {
            this.toBlogManage(request, response);
        } else if (action.equals("logout")) {
            logout(request, response);
        } else if (action.equals("login")) {
            login(request, response);
        } else if (action.equals("registration_detail")) {
            this.register(request, response);
        } else if (action.equals("blog_submit")){
            this.BlogSubmit(request, response);
        } else if (action.equals("view_blog")){
            System.out.println("blog_view");
            this.BlogView(request, response);
            
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        LoginBean loginData = new LoginBean(request.getParameter("username"), request.getParameter("password"));

        if (loginData.checkValid()) {
            Cookie usrCookie = new Cookie("username", loginData.getUsername());
            Cookie pwdCookie = new Cookie("password", loginData.getPassword());
            Cookie uidCookie = new Cookie("uid",loginData.getUid());
            usrCookie.setMaxAge(30 * 24 * 3600);
            pwdCookie.setMaxAge(30 * 24 * 3600);
            uidCookie.setMaxAge(30 * 24 * 3600);
            response.addCookie(usrCookie);
            response.addCookie(pwdCookie);
            response.addCookie(uidCookie);
        }

        response.sendRedirect("index.jsp");
    }

    public void logout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie usrCookie = new Cookie("username", null);
        Cookie pwdCookie = new Cookie("password", null);
        usrCookie.setMaxAge(0);
        pwdCookie.setMaxAge(0);
        response.addCookie(usrCookie);
        response.addCookie(pwdCookie);

        response.sendRedirect("index.jsp");
    }

    public void toMainpage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int code = 0;
        request.setAttribute("ActionCode", code);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void toRegistration(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int code = 3;
        request.setAttribute("ActionCode", code);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void toBlogCreate(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int code = 4;
        request.setAttribute("ActionCode", code);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void toModifyPassword(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int code = 5;
        request.setAttribute("ActionCode", code);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void toModifyUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int code = 6;
        request.setAttribute("ActionCode", code);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void toBlogManage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int code = 8;
        request.setAttribute("ActionCode", code);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void register(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RegistrationBean rb = new RegistrationBean(
                request.getParameter("username"),
                request.getParameter("password"),
                request.getParameter("email")
        );

        rb.insertInto();
        this.toMainpage(request, response);
    }
    
    public void BlogView(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int code = 7;
        String bid = request.getParameter("view_blog");
        request.setAttribute("ActionCode", code);
        request.setAttribute("Blogid", bid);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void BlogSubmit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("blog_title");
        String label = request.getParameter("label");
        String previlige = request.getParameter("previlige");
        String content = request.getParameter("editorValue");
        //System.out.println(content);
        System.out.println(title);
        String username = null;
        Cookie[] cookies = request.getCookies();
        for(Cookie tmp: cookies){
            if(tmp.getName().equals("username")){
                username = tmp.getValue();
                break;
            }
        }
        
        BlogSubmit bs = new BlogSubmit(title,label,previlige,content,username);
        bs.insertInto();
        
        //跳转到查看日志
        this.toMainpage(request, response);
    }
}
