/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2023-01-18 07:54:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.wagu.dao.MemberDAO;
import java.util.ArrayList;
import com.wagu.dto.CityDTO;
import com.wagu.dao.CommonDAO;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.wagu.dto.CityDTO");
    _jspx_imports_classes.add("com.wagu.dao.MemberDAO");
    _jspx_imports_classes.add("com.wagu.dao.CommonDAO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	CommonDAO comDAO = new CommonDAO();
	MemberDAO mDAO = new MemberDAO();
	
	String s2;
	String s;
	if(session.getAttribute("loginEmail")==null){
		s="display:none";
		s2="display:flex";

	}else {
		s="display:flex";
		s2="display:none";
	}

      out.write("  \n");
      out.write("     \n");
      out.write("<div class=\"header_left\">\n");
      out.write("  <a href=\"../index.jsp\" class=\"header_logo\"></a>\n");
      out.write("  <p class=\"header_area_tit\">다른 도시 보기 <i class=\"fa-solid fa-chevron-down\"></i></p>\n");
      out.write("  <div class=\"header_area\">\n");
      out.write("    <a href=\"#n\" class=\"btn_close\">\n");
      out.write("      <img src=\"../images/common/close_icon.svg\" alt=\"close\">\n");
      out.write("    </a>\n");
      out.write("    <nav class=\"header_area_menu\">\n");
      out.write("      <p class=\"header_area_menu_tit\">국내 도시의 신나는 <span class=\"underline\">액티비티</span>를 발견해 보세요.</p>\n");
      out.write("      <ul class=\"header_area_menu_list\">\n");
      out.write("       ");

       ArrayList<CityDTO> cityList = comDAO.getCityMenu();
       for(CityDTO list : cityList) {
       
      out.write("\n");
      out.write("       <li>\n");
      out.write("         <a href=\"ticket.jsp?city=");
      out.print(list.getCity());
      out.write("\" class=\"link\">\n");
      out.write("           <span class=\"list_img\">\n");
      out.write("             <img src=\"../images/main/");
      out.print(list.getImagesArr()[1]);
      out.write("\" alt=\"\" class=\"img\">\n");
      out.write("           </span>\n");
      out.write("           <span class=\"list_city\">");
      out.print(list.getCity());
      out.write("</span>\n");
      out.write("         </a>\n");
      out.write("       </li>\n");
      out.write("       ");

       }
       
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"header_right\">\n");
      out.write("  <div class=\"header_user_info\">\n");
      out.write("  	<a href=\"Login.jsp\" class=\"login\" style=\"");
      out.print(s2);
      out.write("\">\n");
      out.write("  		<span style=\"font-size:14px; font-weight:400; margin-right:20px;\">로그인</span>\n");
      out.write("  	</a>\n");
      out.write("    <i class=\"fa-solid fa-magnifying-glass\"></i>\n");
      out.write("    <p class=\"header_user_profile\" style=\"");
      out.print(s);
      out.write("\">\n");
      out.write("	    <span class=\"img\">\n");
      out.write("	    	<img src =\"../images/common/");
      out.print(mDAO.getImageFromEmail((String)session.getAttribute("loginEmail")) );
      out.write("\">\n");
      out.write("	    </span>\n");
      out.write("	    <span class=\"name\">\n");
      out.write("	    	");
      out.print(mDAO.getNameFromEmail((String)session.getAttribute("loginEmail")) );
      out.write("\n");
      out.write("	    </span>\n");
      out.write("    </p>\n");
      out.write("    <ul class=\"header_user_list\">\n");
      out.write("      <li>\n");
      out.write("        <a href=\"mypageProfile.jsp\" class=\"link\">\n");
      out.write("          <span><i class=\"fa-solid fa-user\"></i></span>\n");
      out.write("          내정보\n");
      out.write("      </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"mypageActivity.jsp\" class=\"link\">\n");
      out.write("          <span><i class=\"fa-solid fa-clipboard-list\"></i></span>\n");
      out.write("          예약 및 구매 내역\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"mypageCoupon.jsp\" class=\"link\">\n");
      out.write("          <span><i class=\"fa-solid fa-ticket\"></i></span>\n");
      out.write("          쿠폰\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"mypageReview.jsp\" class=\"link\">\n");
      out.write("          <span><i class=\"fa-solid fa-comment-dots\"></i></span>\n");
      out.write("          이용후기\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"mypageBasket.jsp\" class=\"link\">\n");
      out.write("          <span><i class=\"fa-solid fa-basket-shopping\"></i></span>\n");
      out.write("          장바구니\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"mypageWishlist.jsp\" class=\"link\">\n");
      out.write("          <span><i class=\"fa-solid fa-heart\"></i></span>\n");
      out.write("          위시리스트\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"Logout.jsp\" class=\"link logout\">로그아웃</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<aside class=\"scroll_top\">\n");
      out.write("  <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"currentColor\" class=\"bi bi-arrow-up-circle\" viewBox=\"0 0 16 16\">\n");
      out.write("    <path fill-rule=\"evenodd\" d=\"M1 8a7 7 0 1 0 14 0A7 7 0 0 0 1 8zm15 0A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-7.5 3.5a.5.5 0 0 1-1 0V5.707L5.354 7.854a.5.5 0 1 1-.708-.708l3-3a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1-.708.708L8.5 5.707V11.5z\"/>\n");
      out.write("  </svg>\n");
      out.write("  <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"currentColor\" class=\"bi bi-arrow-down-circle\" viewBox=\"0 0 16 16\">\n");
      out.write("    <path fill-rule=\"evenodd\" d=\"M1 8a7 7 0 1 0 14 0A7 7 0 0 0 1 8zm15 0A8 8 0 1 1 0 8a8 8 0 0 1 16 0zM8.5 4.5a.5.5 0 0 0-1 0v5.793L5.354 8.146a.5.5 0 1 0-.708.708l3 3a.5.5 0 0 0 .708 0l3-3a.5.5 0 0 0-.708-.708L8.5 10.293V4.5z\"/>\n");
      out.write("  </svg>\n");
      out.write("</aside>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
