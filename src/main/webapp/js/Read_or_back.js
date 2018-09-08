

/**================================借阅函数=====================================**/
function read_book(book_id,people,tel){
	$.ajax({
		url:"read" ,
		type: "GET",
		data:{book_id:book_id,people:people,tel:tel},
		success:function(){
			to_page(currentPage);
		}
	});
}
/**================================还书函数=====================================**/
function back_book(book_id,people){
	$.ajax({
		url:"back",
		type: "GET",
		data:{book_id:book_id,people:people},
		success:function(){
			to_page(currentPage);
		}
	});
}
/**================================借阅历史函数=====================================**/
function history_book(book_id){
	$.ajax({
		url:"history",
		type: "GET",
		data:{book_id:book_id},
		success:function(data){
			$( "#dialog_3" ).dialog("open");
			showtable_1(data);
			//创建数据库实体
			//想办法data传回来的数据加入弹出框
		}
	});
}
/**================================添加书籍函数=====================================**/
function add_book(book_name,book_code){
	$.ajax({
		url:"addbook",
		//此处使用GET传输有点不严谨，建议使用post，然后后台将其转换为put请求
		type: "GET",
		data:{book_name:book_name,book_code:book_code},
		success:function(){
			alert("添加成功");
		}
	});
}

