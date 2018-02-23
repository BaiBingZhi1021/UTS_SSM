package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!DOCTYPE html>\n<html lang=\"en\" >\n\n<head>\n  <meta charset=\"UTF-8\">\n  <title>EC-Invest System</title>\n  <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n  <link rel=\"stylesheet\" href=\"./css/style.css\" type=\"text/css\">\n</head>\n\n<body>\n  <div style=\"text-align:center;clear:both\">\n</div>\n\n<nav>\n  <ul class=\"main\">\n    <li>\n      <a href=\"#\">Home</a>\n      <ul class=\"drop menu1\">\n        <li><a href=\"#\">Home</a></li>\n        <li><a href=\"#\">news</a></li>\n        <li><a href=\"#\">contact</a></li>\n        <li><a href=\"#\">about</a></li>\n      </ul>\n    </li>\n    <li><a href=\"#\">news</a>\n      <ul class=\"drop menu2\">\n        <li><a href=\"#\">Home</a></li>\n        <li><a href=\"#\">news</a></li>\n        <li><a href=\"#\">contact</a></li>\n        <li><a href=\"#\">about</a></li>\n      </ul>\n    </li>\n    <li><a href=\"#\">contact</a>\n      <ul class=\"drop menu3\">\n        <li><a href=\"#\">Home</a></li>\n        <li><a href=\"#\">news</a></li>\n        <li><a href=\"#\">contact</a></li>\n        <li><a href=\"#\">about</a></li>\n");
      out.write("      </ul>\n    </li>\n    <li><a href=\"#\">works</a>\n      <ul class=\"drop menu4\">\n        <li><a href=\"#\">Home</a></li>\n        <li><a href=\"#\">news</a></li>\n        <li><a href=\"#\">contact</a></li>\n        <li><a href=\"#\">about</a></li>\n      </ul>\n    </li>\n    <li><a href=\"#\">team</a>\n      <ul class=\"drop menu5\">\n        <li><a href=\"#\">Home</a></li>\n        <li><a href=\"#\">news</a></li>\n        <li><a href=\"#\">contact</a></li>\n        <li><a href=\"#\">about</a></li>\n      </ul>\n    </li>\n    <li><a href=\"#\">about</a>\n      <ul class=\"drop menu6\">\n        <li><a href=\"#\">Home</a></li>\n        <li><a href=\"#\">news</a></li>\n        <li><a href=\"#\">contact</a></li>\n        <li><a href=\"#\">about</a></li>\n      </ul>\n    </li>\n  </ul>\n</nav>\n<script  src=\"./js/index.js\"></script>\n</body>\n</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
