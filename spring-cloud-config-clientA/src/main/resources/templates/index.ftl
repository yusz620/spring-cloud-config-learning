<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FreeMarker Template</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<script  type="text/javascript" src="../js/jquery-3.2.1.js"></script>
	<script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>
	<script src="http://www.jq22.com/jquery/angular-1.4.6.js"></script>	
	<script  type="text/javascript" src="../js/DatePicker/WdatePicker.js"></script>
</head>
<body>
	hello ${user.name}
	<form method="post" style="margin: 0px;" action="" name="fmName" id="fmName">
        	
            <table class="EpmsTable">
                <tr>
                    <td class="EpmsTdWithColor" width="10%" align="right">模板名称<font color="red">*</font></td>
                    <td class="EpmsTdNoColor" width="50">
                        <input class="inputInput" maxlength="100" type="text" name="template.name"
                            id="template.name"  value=${user.name?if_exists} />
                    </td>
                	<td class="EpmsTdWithColor" width="10%" align="right">选择查询出的模板</td>
                	<td class="EpmsTdNoColor" >
 						<select class="selectInput" name="template.name1" id="template.name1" style="width:158px;" onchange="getVal()">
                 				<option value="" onclick="toView()">请选择</option>
             			</select>
					</td>
				</tr>
                <tr>
                    <td class="EpmsTdWithColor" width="10%" align="right">模板说明</td>
                    <td class="EpmsTdNoColor" width="200">
                        <input class="inputInput" maxlength="150" type="text" name="template.description"
                            id="template.description"   />
                    </td>
                    <td class="EpmsTdWithColor" width="10%" align="right">日期</td>
                    <td class="EpmsTdNoColor" width="200">
                        <input type="date" class="inputInput"  
                        onclick="WdatePicker()"/>
                    </td>
				</tr>
				<tr>
					<td class="EpmsTdNoColor" width="50">
                        <input class="inputInput"  type="hidden" name="template.indicatorsJson"
                            id="template.indicatorsJson"    />
                    </td>
                    <td class="EpmsTdNoColor" width="50">
                        <input class="inputInput"  type="hidden" name="template.indicators1Json"
                            id="template.indicators1Json"    />
                    </td>
				</tr>
            </table>
        </form> 
<script>
function toView(){
		var url = "/region/fee/warehouseaccount/toView.html";
		fmName.action = url;
		var formData = $("#fmName").serialize();
		$.ajax({
				type:"POST",
				url:url,
				cache:false,
				processData:true,
				data:formData,
				success: function(responseData){
					window.location.href=url;
		}});
}
</script>         
</body>
</html>