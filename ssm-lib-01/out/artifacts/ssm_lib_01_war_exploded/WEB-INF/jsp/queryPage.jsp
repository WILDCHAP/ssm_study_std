<%--
  Created by IntelliJ IDEA.
  User: 99370
  Date: 2020/10/30
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询详情页</title>
    <!--导入bootstrap cdn-->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表--显示所有书籍</small>

                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
                <form action="${pageContext.request.contextPath}/book/queryBook" method="post">
                    <div class="form-group">
                        <input type="text" name="bookID" class="form-control" required/>
                        <button type="submit" class="form-control">查询书籍</button>
                    </div>
                </form>
            </div>
        </div>


    </div>



    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书记数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>
                <%--书籍从数据库中查询出来--%>
                <tbody>
                    <tr>
                        <td>${books.bookID}</td>
                        <td>${books.bookName}</td>
                        <td>${books.bookCounts}</td>
                        <td>${books.detail}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/toUpdataBook/${books.bookID}">修改</a>
                            &nbsp; | &nbsp;
                            <a href="${pageContext.request.contextPath}/book/deleteBook/${books.bookID}">删除</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>


</body>
</html>
