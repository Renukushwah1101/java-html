import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class My extends HttpServlet
{
	/**
     * @param req
     * @param res
     * @throws java.lang.Exception
     */ 
         PrintWriter pw=null;
  public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException 
  {
	 res.setContentType("text/html");
             pw=res.getWriter();
	Date d=new Date();
	String s=d.toString();
pw.println(s);
	pw.println("Hello this is my first app");
    A a=new A();
int si=a.m1();
pw.println(si);
    pw.close();

   }
 

}