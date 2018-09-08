var book_id=null;
var status_book=null;
/**================================单个借阅功能实现=====================================**/
$(document).on("click", ".edit_btn", function () {

		book_id=$(this).attr("edit-id");
		status_book=$(this).attr("status");
		if(status_book=="已借"){
			alert("该书已经借出");
		}else{
			$( "#dialog" ).dialog("open");
		}
});
$("#read_send").click(function(){
	read_book(book_id,$("#name").val(),$("#tel").val());
});

/**================================单个还书功能实现=====================================**/
$(document).on("click", ".delete_btn", function () {
		book_id=$(this).attr("del-id");
		status_book=$(this).attr("status");
		if(status_book=="可借"){
			alert("错误");
		}else{
			$( "#dialog_1" ).dialog("open");
		}
});
$("#back_send").click(function(){
	back_book(book_id,$("#name_1").val());
});
/**================================借阅历史功能实现=====================================**/
$(document).on("click", ".History_btn", function (data) {
	history_book($(this).attr("history-id"));
});




/**================================批量还书功能实现=====================================**/



/**================================批量借阅功能实现=====================================**/


/**================================添加书籍功能实现=====================================**/
$("#add_book").click(function(){
	$( "#dialog_2" ).dialog("open");
});
$("#add_send").click(function(){
	add_book($("#book_name_1").val(),$("#book_code_1").val());
});

