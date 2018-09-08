<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%--引入jQuery--%>
<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
<%--引入样式--%>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript"src="js/dialog.js"></script>
<%--引入jquery-ui--%>
<link rel="stylesheet" href="css/jquery-ui.css">
<script src="js/jquery-ui.js"></script>


</head>
<body>
   <%--借书弹出框--%>
	<div id="dialog" title="信息填写" >
		<p><h3>Study never behind</h3></p>
		<div class="input-group">
		  <span class="input-group-addon" id="peo_name">姓名</span>
		  <input type="text" id="name" class="form-control" placeholder="Username" aria-describedby="basic-addon1" >
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="student">学号</span>
		  <input type="text" id="student_id" class="form-control" placeholder="Username" aria-describedby="basic-addon1" >
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="peo_tel">电话</span>
		  <input type="text" id="tel" class="form-control" placeholder="Username" aria-describedby="basic-addon1" >
		</div>
		<br>
		<button id="read_send" class="btn btn-default col-md-2 col-md-offset-10" type="button" >确认</button>
	</div>
   <%--还书弹出框--%>
	<div id="dialog_1" title="信息填写" >
		<p><h3>Study never behind</h3></p>
		<div class="input-group">
		  <span class="input-group-addon" id="peo_name_1">姓名</span>
		  <input type="text" id="name_1" class="form-control" placeholder="Username" aria-describedby="basic-addon1" >
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="student_1">学号</span>
		  <input type="text" id="student_id_1" class="form-control" placeholder="Username" aria-describedby="basic-addon1" >
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="peo_tel_1">电话</span>
		  <input type="text" id="tel_1" class="form-control" placeholder="Username" aria-describedby="basic-addon1" >
		</div>
		<br>
		<button id="back_send" class="btn btn-default col-md-2 col-md-offset-10" type="button" >确认</button>
	</div>
   <%--借阅历史弹出框--%>
	<div id="dialog_3" title="借阅历史" >
		<div class="col-md-12">
            <table class="table table-hover table-bordered table-striped" id="history_table">
                <thead>
                <tr>
                    <th>借阅时间</th>
                    <th>归还时间</th>
                    <th>借阅人</th>
                </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
	</div>
   <%--添加书籍弹出框--%>
	<div id="dialog_2" title="书籍信息" >
		<p><h3>Study never behind</h3></p>
		<div class="input-group">
		  <span class="input-group-addon" id="book_name">书名</span>
		  <input type="text" id="book_name_1" class="form-control" placeholder="Username" aria-describedby="basic-addon1" >
		</div>
		<br>
		<div class="input-group">
		  <span class="input-group-addon" id="book_code">编号</span>
		  <input type="text" id="book_code_1" class="form-control" placeholder="Username" aria-describedby="basic-addon1" >
		</div>
		<br>
		<button id="add_send" class="btn btn-default col-md-2 col-md-offset-10" type="button" >确认</button>
	
	</div>


	<div class="container">
    <%--标题--%>
    <div class="row">
        <div class="col-md-6">
            <h1>GIS Library</h1>
        </div>
         <div class="col-md-12">
            <button type="button" class="btn btn-success" id="getdata">
            	打开图书馆
            </button>
            <button type="button" class="btn btn-primary">批量借阅</button>
            <button type="button" class="btn btn-info">批量还书</button>
            <button type="button" id="add_book" class="btn btn-warning">添加书籍</button>
        </div>
    </div>
    <%--显示表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover table-bordered table-striped" id="book_table">
                <thead>
                <tr>
                    <th>勾选</th>
                    <th>ID</th>
                    <th>书名</th>
                    <th>编号</th>
                    <th>状态</th>
                    <th>借阅人</th>
                    <th>电话号码</th>
                    <th class="col-xs-3">操作形式</th>
                </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    </div>
    <div class="row">
    	<div class="col-md-6" id="page_nav_area_1"></div>
		    <%--分页条信息--%>
		    <div class="col-md-6" id="page_nav_area">
		    	<nav aria-label="Page navigation">
				  <ul class="pagination">
				  <li><a href="#" id="first">首页</a></li>
				    <li>
				      <a href="#" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				      </a>
				    </li>
				    <li><a href="#">1</a></li>
				    <li><a href="#">2</a></li>
				    <li><a href="#">3</a></li>
				    <li><a href="#">4</a></li>
				    <li><a href="#">5</a></li>
				    <li>
				      <a href="#" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				    </li>
				    <li><a href="#" id="last">尾页</a></li>
				  </ul>
				</nav>
		    </div>
	</div>
</div>
<!-- 引入功能js -->
<script type="text/javascript" src="js/DataGet.js"></script>
<script type="text/javascript" src="js/Read_or_back.js"></script>
<script type="text/javascript" src="js/realize_function.js"></script>
</body>
</html>
