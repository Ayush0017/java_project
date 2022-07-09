package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recruiter_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/index_header.jsp");
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
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"index.html\"><span>Home</span></a></li>\n");
      out.write("\t\t\t<li><span>Registration</span>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"first\"> <a href=\"recruiter_reg.jsp\">Recruiter Registration</a> </li>\n");
      out.write("\t\t\t\t\t<li class=\"first\"> <a href=\"candidate_reg.jsp\">Candidate Registration</a> </li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li><a href=\"#\"><span>Services</span></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"><span>About Us</span></a></li>\n");
      out.write("\t\t\t<li><span>Login</span>\n");
      out.write("                \t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"first\"> <a href=\"recruiter_login.jsp\">Recruiter</a> </li>\n");
      out.write("\t\t\t\t\t<li class=\"first\"> <a href=\"candidate_login.jsp\">Candidate</a> </li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t\t<li><a href=\"#\"><span>Contact Us</span></a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t$('#menu').dropotron();\n");
      out.write("\t\t</script>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #menu -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"splash\"><img src=\"images/pics01.jpg\" width=\"980\" height=\"300\" alt=\"\" /></div>\n");
      out.write("\t<div id=\"page\">\n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("\t\t\t<div class=\"contentbg\">\n");
      out.write("\t\t\t\t<div class=\"post\">\n");
      out.write("\t\t\t\t\t<h2 class=\"title\">Welcome to Recruitment System</h2>\n");
      out.write("\t\t\t\t\t<div class=\"entry\">\n");
      out.write("\t\t\t\t\t\t<p>This is <strong>Commercial</strong>, a free, fully standards-compliant CSS template designed by <a href=\"http://templated.co\" rel=\"nofollow\">TEMPLATED</a>.  The picture in this template is from <a href=\"http://fotogrph.com/\">Fotogrph</a>.The gallery slider and popup gallery used in this template is powered by <a href=\"http://n33.co/\">Poptrox</a> and <a href=\"http://n33.co/\">Slidertron</a>. Dropdown menu is powered by <a href=\"http://n33.co/\">Dropotron</a>. This free template is released under the <a href=\"http://templated.co/license\">Creative Commons Attribution</a> license, so you?re pretty much free to do whatever you want with it (even use it commercially) provided you give us credit for it. Have fun :)</p>\n");
      out.write("\t\t\t\t\t\t<p>Sed lacus. Donec lectus. Nullam pretium nibh ut turpis. Nam bibendum. In nulla tortor, elementum ipsum. Proin imperdiet est. Phasellus dapibus semper urna. Pellentesque ornare, orci in felis. Donec ut ante. In id eros. Suspendisse lacus turpis, cursus egestas at sem.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end #content -->\n");
      out.write("\t\t<div id=\"sidebar-bg\">\n");
      out.write("\t\t\t<div id=\"sidebar\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<h2>Categories</h2>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Services</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Mission</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Vision</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
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
