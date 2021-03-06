<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍页面</title>
    <!--导入bootstrap cdn-->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表--新增书籍</small>

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



    <form action="${pageContext.request.contextPath}/book/addBook" method="">
        <div class="form-group">
            <label for="bkname">书籍名称</label>
            <input type="text" name="bookName" class="form-control" id="bkname" required>
            <label for="bkcount">书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" id="bkcount" required>
            <label for="bkdetail">书籍描述</label>
            <input type="text" name="detail" class="form-control" id="bkdetail" required>
        </div>
        <div class="form-group">
            <button type="submit" class="form-control">添加</button>
        </div>
    </form>

</div>

</body>
</html>
