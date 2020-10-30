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
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/addBook">新增书籍</a>
            </div>
        </div>

    </div>



    <form action="" method="">
        <div class="form-group">
            <label for="bkname">书籍名称</label>
            <input type="text" class="form-control" id="bkname">
            <label for="bkcount">书籍数量</label>
            <input type="text" class="form-control" id="bkcount">
            <label for="bkdetail">书籍描述</label>
            <input type="text" class="form-control" id="bkdetail">
        </div>
        <div class="form-group">
            <button type="submit" class="form-control">添加</button>
        </div>
    </form>

</div>

</body>
</html>
