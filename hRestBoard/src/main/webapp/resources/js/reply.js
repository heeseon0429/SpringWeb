
$(function(){
      // '댓글추가' 버튼이 눌렸을 때 
      $('#replyConfirm').click(function(){
      
         // 사용자 입력 값 받아오기
         /*let param = { bno       : $('#bno').val(), 
                            replyer     : $('#replyer').val(),
                            reply       : $('#reply').val() 
                           }; */                       // 폼태그 안의 정보 따로 받기 
      
         let param = $('#replyFrm').serialize(); // 폼태그 안의 정보 한꺼번에 다 받기 
         // alert(param);
         // console.log(param);
         
         // 비동기 통신?
         $.ajax({
         type           : 'post',
         url           : '../replies/new',
         data           : param,
         success    : function(result){
                        //alert(result);
                        $('#reply').val('');
         },
         error       : function(err){
                           alert('error');
                           console.log(err);
        }// end of error
        
         });// end of click
         
      });
    
      
      
      replyList();
      function replyList()
	{

	 $.ajax({
	 	type   : 'get',
	 	url    : '../replies',
	  //data   : 보내는 데이터 없음
	  dataType : 'json',   // 라이브러리 필요
	  success  : function(result){
	  			//alert(result);
	  			//console.log(result);
	  			
	  			let replyTbl = $('#replyList')
	  			replyTbl.empty();
	  			
	  			for( row of result )
	  			{
					//console.log(row);
					let tr = $('<tr/>');
					//<tr><td>1</td></tr>
					tr.append( $('<td/>').html(row['rno']) );
					tr.append( $('<td/>').html(row['replyer']) );
					tr.append( $('<td/>').html(row['reply']) );
					
					tr.append('<td><button class="delete">삭제</button></td>')
					tr.append('<td><button class="modify">수정</button></td>')
					
					replyTbl.append(tr);	  			
	  			}
	  			},
	  error    : function(err){
	 			 alert('error');
	  			 console.log(err);
	  } 
	 }); //end of ajax

	}// end of replylist


  //삭제 버튼을 클릭했을 때
  //******************동적으로 생성된 버튼은 일반적인 이벤트 발생 안됨! -->on()함수 써야함
/*
  $('.delete').on(click,function(){
     alert("delete");
  });
*/  
  $('#replyList').on('click','.delete',function(){
     let btn = $(this);
     
     let rno = $(this).parents('tr').children().eq(0).text();
     
     // alert(rno);
     
     $.ajax({
           type: 'delete',
           url : '../replies/' + rno,
           success: function(result){
                 replyList();
           },
           error: function(err){
                 alert('에러 발생');
           }
        });
     }) // end of ajax
});