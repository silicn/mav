<%--
  Created by IntelliJ IDEA.
  User: JiaHao
  Date: 2017/2/14
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>






<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>

    <title>${name}</title>
</head>
<body>


<h1 style="text-align: center; font-size: 25px; display: block" >

    ${nihao}

    <%--<c:forEach items="${shi}" var="node">--%>
                 <%--姓名：<c:out value="${node.key}"></c:out>--%>
                 <%--住址：<c:out value="${node.value}"></c:out>--%>
                 <%--<br/>--%>
    <%--</c:forEach>--%>


    标题不知写什么
</h1>
<p>
    这是一个页面，你知道吗？好多时候我都不知道怎么实现，哈哈哈
</p>
</body>
</html>
