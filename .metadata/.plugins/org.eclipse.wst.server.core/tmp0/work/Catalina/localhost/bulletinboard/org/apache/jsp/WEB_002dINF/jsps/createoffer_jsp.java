/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2017-11-13 22:04:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createoffer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.0.1.RELEASE.jar", Long.valueOf(1509933184113L));
    _jspx_dependants.put("jar:file:/E:/copSpringAlt/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/bulletinboard/WEB-INF/lib/spring-webmvc-5.0.1.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1508871170000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fpath_005fname_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fpath_005fname_005fcols_005fclass_005fnobody;

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
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fpath_005fname_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fpath_005fname_005fcols_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fpath_005fname_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fpath_005fname_005fcols_005fclass_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\t\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/main.css\" />\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      //  sf:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      boolean _jspx_th_sf_005fform_005f0_reused = false;
      try {
        _jspx_th_sf_005fform_005f0.setPageContext(_jspx_page_context);
        _jspx_th_sf_005fform_005f0.setParent(null);
        // /WEB-INF/jsps/createoffer.jsp(15,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_sf_005fform_005f0.setMethod("post");
        // /WEB-INF/jsps/createoffer.jsp(15,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_sf_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/docreate", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        // /WEB-INF/jsps/createoffer.jsp(15,0) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_sf_005fform_005f0.setModelAttribute("offer");
        int[] _jspx_push_body_count_sf_005fform_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_sf_005fform_005f0 = _jspx_th_sf_005fform_005f0.doStartTag();
          if (_jspx_eval_sf_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("<table class=\"formtable\">\r\n");
              out.write("<tr><td class=\"label\">Name: </td><td>");
              if (_jspx_meth_sf_005finput_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
                return;
              out.write("<br/>");
              //  sf:errors
              org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
              boolean _jspx_th_sf_005ferrors_005f0_reused = false;
              try {
                _jspx_th_sf_005ferrors_005f0.setPageContext(_jspx_page_context);
                _jspx_th_sf_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
                // /WEB-INF/jsps/createoffer.jsp(18,106) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sf_005ferrors_005f0.setPath("name");
                // /WEB-INF/jsps/createoffer.jsp(18,106) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sf_005ferrors_005f0.setCssClass("error");
                int[] _jspx_push_body_count_sf_005ferrors_005f0 = new int[] { 0 };
                try {
                  int _jspx_eval_sf_005ferrors_005f0 = _jspx_th_sf_005ferrors_005f0.doStartTag();
                  if (_jspx_th_sf_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (java.lang.Throwable _jspx_exception) {
                  while (_jspx_push_body_count_sf_005ferrors_005f0[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_sf_005ferrors_005f0.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_sf_005ferrors_005f0.doFinally();
                }
                _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f0);
                _jspx_th_sf_005ferrors_005f0_reused = true;
              } finally {
                if (!_jspx_th_sf_005ferrors_005f0_reused) {
                  _jspx_th_sf_005ferrors_005f0.release();
                  _jsp_getInstanceManager().destroyInstance(_jspx_th_sf_005ferrors_005f0);
                }
              }
              out.write("</td></tr>\r\n");
              out.write("<tr><td class=\"label\">Email: </td><td>");
              if (_jspx_meth_sf_005finput_005f1(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
                return;
              out.write("<br/>");
              //  sf:errors
              org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
              boolean _jspx_th_sf_005ferrors_005f1_reused = false;
              try {
                _jspx_th_sf_005ferrors_005f1.setPageContext(_jspx_page_context);
                _jspx_th_sf_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
                // /WEB-INF/jsps/createoffer.jsp(19,109) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sf_005ferrors_005f1.setPath("email");
                // /WEB-INF/jsps/createoffer.jsp(19,109) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sf_005ferrors_005f1.setCssClass("error");
                int[] _jspx_push_body_count_sf_005ferrors_005f1 = new int[] { 0 };
                try {
                  int _jspx_eval_sf_005ferrors_005f1 = _jspx_th_sf_005ferrors_005f1.doStartTag();
                  if (_jspx_th_sf_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (java.lang.Throwable _jspx_exception) {
                  while (_jspx_push_body_count_sf_005ferrors_005f1[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_sf_005ferrors_005f1.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_sf_005ferrors_005f1.doFinally();
                }
                _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f1);
                _jspx_th_sf_005ferrors_005f1_reused = true;
              } finally {
                if (!_jspx_th_sf_005ferrors_005f1_reused) {
                  _jspx_th_sf_005ferrors_005f1.release();
                  _jsp_getInstanceManager().destroyInstance(_jspx_th_sf_005ferrors_005f1);
                }
              }
              out.write("</td></tr>\r\n");
              out.write("<tr><td class=\"label\">Your offer: </td><td>");
              if (_jspx_meth_sf_005ftextarea_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
                return;
              out.write("<br/>");
              //  sf:errors
              org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
              boolean _jspx_th_sf_005ferrors_005f2_reused = false;
              try {
                _jspx_th_sf_005ferrors_005f2.setPageContext(_jspx_page_context);
                _jspx_th_sf_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
                // /WEB-INF/jsps/createoffer.jsp(20,135) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sf_005ferrors_005f2.setPath("text");
                // /WEB-INF/jsps/createoffer.jsp(20,135) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sf_005ferrors_005f2.setCssClass("error");
                int[] _jspx_push_body_count_sf_005ferrors_005f2 = new int[] { 0 };
                try {
                  int _jspx_eval_sf_005ferrors_005f2 = _jspx_th_sf_005ferrors_005f2.doStartTag();
                  if (_jspx_th_sf_005ferrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (java.lang.Throwable _jspx_exception) {
                  while (_jspx_push_body_count_sf_005ferrors_005f2[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_sf_005ferrors_005f2.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_sf_005ferrors_005f2.doFinally();
                }
                _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f2);
                _jspx_th_sf_005ferrors_005f2_reused = true;
              } finally {
                if (!_jspx_th_sf_005ferrors_005f2_reused) {
                  _jspx_th_sf_005ferrors_005f2.release();
                  _jsp_getInstanceManager().destroyInstance(_jspx_th_sf_005ferrors_005f2);
                }
              }
              out.write("</td></tr>\r\n");
              out.write("<tr><td class=\"label\"> </td><td><input class=\"control\" value=\"Create advert\" type=\"Submit\" /></td></tr>\r\n");
              out.write("</table>\r\n");
              out.write("\r\n");
              int evalDoAfterBody = _jspx_th_sf_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_sf_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_sf_005fform_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_sf_005fform_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_sf_005fform_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_sf_005fform_005f0);
        _jspx_th_sf_005fform_005f0_reused = true;
      } finally {
        if (!_jspx_th_sf_005fform_005f0_reused) {
          _jspx_th_sf_005fform_005f0.release();
          _jsp_getInstanceManager().destroyInstance(_jspx_th_sf_005fform_005f0);
        }
      }
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_sf_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fpath_005fname_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_sf_005finput_005f0_reused = false;
    try {
      _jspx_th_sf_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/jsps/createoffer.jsp(18,37) null
      _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "class", "control");
      // /WEB-INF/jsps/createoffer.jsp(18,37) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f0.setPath("name");
      // /WEB-INF/jsps/createoffer.jsp(18,37) null
      _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "name", "name");
      // /WEB-INF/jsps/createoffer.jsp(18,37) null
      _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "type", "text");
      int[] _jspx_push_body_count_sf_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f0 = _jspx_th_sf_005finput_005f0.doStartTag();
        if (_jspx_th_sf_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fpath_005fname_005fclass_005fnobody.reuse(_jspx_th_sf_005finput_005f0);
      _jspx_th_sf_005finput_005f0_reused = true;
    } finally {
      if (!_jspx_th_sf_005finput_005f0_reused) {
        _jspx_th_sf_005finput_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_sf_005finput_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fpath_005fname_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_sf_005finput_005f1_reused = false;
    try {
      _jspx_th_sf_005finput_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/jsps/createoffer.jsp(19,38) null
      _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "class", "control");
      // /WEB-INF/jsps/createoffer.jsp(19,38) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f1.setPath("email");
      // /WEB-INF/jsps/createoffer.jsp(19,38) null
      _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "name", "email");
      // /WEB-INF/jsps/createoffer.jsp(19,38) null
      _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "type", "text");
      int[] _jspx_push_body_count_sf_005finput_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f1 = _jspx_th_sf_005finput_005f1.doStartTag();
        if (_jspx_th_sf_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fpath_005fname_005fclass_005fnobody.reuse(_jspx_th_sf_005finput_005f1);
      _jspx_th_sf_005finput_005f1_reused = true;
    } finally {
      if (!_jspx_th_sf_005finput_005f1_reused) {
        _jspx_th_sf_005finput_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_sf_005finput_005f1);
      }
    }
    return false;
  }

  private boolean _jspx_meth_sf_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_sf_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fpath_005fname_005fcols_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    boolean _jspx_th_sf_005ftextarea_005f0_reused = false;
    try {
      _jspx_th_sf_005ftextarea_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sf_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/jsps/createoffer.jsp(20,43) null
      _jspx_th_sf_005ftextarea_005f0.setDynamicAttribute(null, "class", "control");
      // /WEB-INF/jsps/createoffer.jsp(20,43) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005ftextarea_005f0.setPath("text");
      // /WEB-INF/jsps/createoffer.jsp(20,43) null
      _jspx_th_sf_005ftextarea_005f0.setDynamicAttribute(null, "name", "text");
      // /WEB-INF/jsps/createoffer.jsp(20,43) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005ftextarea_005f0.setRows("10");
      // /WEB-INF/jsps/createoffer.jsp(20,43) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005ftextarea_005f0.setCols("10");
      int[] _jspx_push_body_count_sf_005ftextarea_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005ftextarea_005f0 = _jspx_th_sf_005ftextarea_005f0.doStartTag();
        if (_jspx_th_sf_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005ftextarea_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005ftextarea_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005ftextarea_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fsf_005ftextarea_0026_005frows_005fpath_005fname_005fcols_005fclass_005fnobody.reuse(_jspx_th_sf_005ftextarea_005f0);
      _jspx_th_sf_005ftextarea_005f0_reused = true;
    } finally {
      if (!_jspx_th_sf_005ftextarea_005f0_reused) {
        _jspx_th_sf_005ftextarea_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_sf_005ftextarea_005f0);
      }
    }
    return false;
  }
}
