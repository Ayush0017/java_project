package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import dao.AdminDao;
import dto.Recruiter;

public final class recruiterlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin_header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Online Faculty Recruitment</title>\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery.dropotron-1.0.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\t<div id=\"header-wrapper\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t<h1><a href=\"#\">Online Faculty System</a></h1>\n");
      out.write("\t\t\t\t<p>Hire With Us</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #header -->\n");
      out.write("\t<div id=\"menu-wrapper\">\n");
      out.write("\t\t<ul id=\"menu\">\n");
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"adminhome.jsp\"><span>Home</span></a></li>\n");
      out.write("\t\t\t<li><a href=\"recruiterlist.jsp\"><span>Recruiter List</span></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"><span>Candidate List</span></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"><span>Vacancy List</span></a></li>\n");
      out.write("                        <li><a href=\"#\"><span>Applied Candidate List</span></a></li>\n");
      out.write("                        <li><a href=\"#\"><span>Logout</span></a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t$('#menu').dropotron();\n");
      out.write("\t\t</script>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #menu -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("        <div id=\"page\">\n");
      out.write("\t\t<div id=\"\">\n");
      out.write("\t\t\t<div class=\"contentbg\">\n");
      out.write("\t\t\t\t<div class=\"post\">\n");
      out.write("\t");

            String email = (String)session.getAttribute("email");
        
      out.write("\n");
      out.write("                                    <h2 class=\"title\">Recruiter List</h2>\n");
      out.write("\t\t\t\t\t<div class=\"entry\">\n");
      out.write("<table border=\"1\" cellpadding=\"10\" cellspacing=\"5\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>Recruiter Name</th>\n");
      out.write("            <th>Type</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Contact</th>\n");
      out.write("            <th>Address</th>\n");
      out.write("            <th>Status</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");

            AdminDao ad = new AdminDao();
            List<Recruiter> list = ad.getRecruiterList();
            for(Recruiter rt : list)
            {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(rt.getName() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rt.getRecruiter());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rt.getEmail());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rt.getContact());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rt.getAddress());
      out.write("</td>\n");
      out.write("            <td><a href=\"\">");
      out.print(rt.getStatus());
      out.write("</a></td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("    <tfoot>\n");
      out.write("            <th>Recruiter Name</th>\n");
      out.write("            <th>Type</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Contact</th>\n");
      out.write("            <th>Address</th>\n");
      out.write("            <th>Status</th>\n");
      out.write("    </tfoot>\n");
      out.write("</table>\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end #content -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- end #sidebar -->\n");
      out.write("\t\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #page -->\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("    <p>All Rights Reserved | Designed By Advance Java Batch &trade; | 2021</p>\n");
      out.write("</div>\n");
      out.write("<!-- end #footer -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
