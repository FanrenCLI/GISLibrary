//创建总记录数，当前页码
var totalRecord, currentPage;
/**==========================打开图书馆===============================**/
	
	$("#getdata").click(function(){
		to_page(1);
	});
/**==========================创建表格函数===============================**/
	function showtable(book){
		//先清空table表格
	    $("#book_table tbody").empty();
	    var bookinfo=book.extend.pageInfo.list;
	    $.each(bookinfo, function (index, item) {
	        var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
	        var bookTd = $("<td></td>").append(item.idBook);
	        var nameTd = $("<td></td>").append(item.name);
	        var codeTd =$("<td></td>").append(item.code);
	        var statusTd = $("<td></td>").addClass(item.idBook).append(item.status);
	        statusTd.attr("status",item.status);
	        var peopleTd = $("<td></td>").append(item.people);
	        var telTd = $("<td></td>").append(item.tel);
	        var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
	            .append($("<span></span>").addClass("glyphicon glyphicon-book")).append(" 借阅");
	        // 为编辑按钮添加自定义的属性，来表示当前员工的id
	        editBtn.attr("edit-id", item.idBook);
	        editBtn.attr("status",item.status);
	        var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
	            .append($("<span></span>").addClass("glyphicon glyphicon-comment")).append(" 还书");
	        delBtn.attr("del-id", item.idBook);
	        delBtn.attr("status", item.status);
	        var HistoryBtn = $("<button></button>").addClass("btn btn-info btn-sm History_btn")
	        .append($("<span></span>").addClass("glyphicon glyphicon-bookmark")).append(" 借阅历史");
	        HistoryBtn.attr("history-id", item.idBook);
	
	        var btnTd = $("<td> </td>").append(editBtn).append(delBtn).append(HistoryBtn);
	        $("<tr></tr>").append(checkBoxTd).append(bookTd).append(nameTd).append(codeTd)
	            .append(statusTd).append(peopleTd).append(telTd)
	            .append(btnTd).appendTo("#book_table tbody");
	    });
	}
/**================================创建分页条函数=====================================**/
	function show_page_nav(result) {
	    totalRecord = result.extend.pageInfo.total;
	    currentPage = result.extend.pageInfo.pageNum;
	    $("#page_nav_area").empty();
	    // 构建元素
	    var ul = $("<ul></ul>").addClass("pagination");
	    var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href", "#"));
	    var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
	    if(result.extend.pageInfo.hasPreviousPage == false){
	        prePageLi.addClass("disabled");
	    }else {
	        prePageLi.click(function () {
	            to_page(result.extend.pageInfo.pageNum - 1);
	        });
	    }

	    //为元素添加单击监听事件
	    firstPageLi.click(function(){
	        to_page(1);
	    });

	    var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
	    var lastPageLi = $("<li></li>").append($("<a></a>").append("尾页").attr("href", "#"));
	    if(result.extend.pageInfo.hasNextPage == false){
	        nextPageLi.addClass("disabled");
	    }else {
	        nextPageLi.click(function(){
	            to_page(result.extend.pageInfo.pageNum + 1);
	        });
	    }
	    //为元素添加单击监听事件
	    lastPageLi.click(function () {
	        to_page(result.extend.pageInfo.pages);
	    });

	    // 添加 首页 和 前一页
	    ul.append(firstPageLi).append(prePageLi);

	    $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {
	        var numLi = $("<li></li>").append($("<a></a>").append(item));
	        if (result.extend.pageInfo.pageNum == item) {
	            numLi.addClass("active");
	        }
	        numLi.click(function () {
	            to_page(item);
	        });
	        ul.append(numLi);
	    });
	    //添加 下一页 和 尾页
	    ul.append(nextPageLi).append(lastPageLi);
	    var navEle = $("<nav></nav>").append(ul);
	    navEle.appendTo("#page_nav_area");
	}

/**================================跳转函数=====================================**/
	function to_page(pageNum) {
	    $.ajax({
	        url: "bookInfo",
	        data: "pn=" + pageNum,
	        type: "GET",
	        success: function (result) {
	            //1.解析并显示员工数据
	            showtable(result);
	            //2.解析并显示分页条数据
	            show_page_nav(result);
	        }
	    });
	}
	/**==========================借阅历史信息函数===============================**/
	function showtable_1(result){
		$("#history_table tbody").empty();
		$.each(result, function (index, item) {
			
			var read_time=new Date(item.readTime).toLocaleString();
			var back_time=new Date(item.backTime).toLocaleString();
			if(back_time=="1999/1/1 上午8:00:00"){
				back_time="无";
			}else{
				
			}
	        var readTd = $("<td></td>").append(read_time);
	        var backTd = $("<td></td>").append(back_time);
	        var peopleTd = $("<td></td>").append(item.people);
	        $("<tr></tr>").append(readTd).append(backTd).append(peopleTd).appendTo("#history_table tbody");
	    });
		
		
		
		
	}

