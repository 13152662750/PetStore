<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>我的宝贝</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<div align="center" width=1000px" style="background-color:bisque; ">
<form name="petForm" method="post" action="${pageContext.request.contextPath}/pet/findPetByCondition.do">
  <input type="hidden" name="operate" value="list">
  <input type="hidden" name="listType" value="all" />
  <div class="main_div">
    <h1>我的宝贝儿</h1>

    <table width="800px" cellspacing="0" cellpadding="0" border="0" >
      <tr>
        <td style="background-color:pink;text-align:left;">&nbsp;
          <a href="index.jsp">首页</a>&nbsp;
          |&nbsp;


          <a href="adopt.jsp">领养宠物</a>

          &nbsp;&nbsp;
        </td>
        <td rowspan="1" style="background-color:pink;text-align:right;">&nbsp;


          <a href="index.jsp">登录</a>
          &nbsp;&nbsp;
        </td>


      </tr>
    </table>
  </div>
  <div class="main_div">
    <table>
      <tr>
        <td width="200px" valign="top">
          <br />
          <br />
          <br />
          <table style="border:solid 1px black;">
            <tr>
              <th style="background-color:gray;height:20px;">
                查找
              </th>
            </tr>
            <tr>
              <td>
                &nbsp;&nbsp;&nbsp;宠物名&nbsp;<input type="text" name="condition.petName" size="10" value="">
                <br />
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                主人&nbsp;<input type="text" name="condition.petOwnerName" size="10" value="">
                <br />
                宠物类别&nbsp;
                <select name="condition.petType"><option value="-1">全部...</option>
                  <option value="1">千禧猪</option>
                  <option value="2">喵咪</option>
                  <option value="3">哥斯拉</option></select><br />
                排序方式&nbsp;
                <select name="listType"><option value="all" selected="selected">全部...</option>
                  <option value="strength">活力</option>
                  <option value="cute">聪明</option>
                  <option value="love">可爱</option></select>
                &nbsp;<input type="submit" value="查找" />
              </td>
            </tr>
          </table>

        </td>
        <td>
          <div>
            <div class="input_title"> <h3>总积分排名</h3></div>


            <table class="data_table" align="center">
              <tr>
                <th width="40px">序号</th>
                <th width="200px">宠物名</th>
                <th width="50px">类别</th>
                <th width="50px">总积分</th>
                <th width="40px">力量</th>
                <th width="40px">聪明</th>
                <th width="40px">爱心</th>
                <th width="150px">主人</th>
              </tr>

              <c:forEach items="${pets.petinfos}" var="pet" varStatus="vs" begin="${pets.start}" end="${pets.pageSize*pets.currentPage-1}">
                <tr>
                  <td width="40px" style="text-align:center;">${vs.count+pets.start}</td>
                  <td width="200px" style="text-align:center;"><a href="pet.jsp#9" target="_blank">${pet.petName}</a></td>
                  <td width="50px" style="text-align:center;">${pet.petType==1?"千禧猪":pet.petType==2?"猫咪":"哥斯拉"}</td>
                  <td width="50px" style="text-align:center;">${pet.petStrength+pet.petCute+pet.petLove}</td>
                  <td width="40px" style="text-align:center;">${pet.petStrength}</td>
                  <td width="40px" style="text-align:center;">${pet.petCute}</td>
                  <td width="40px" style="text-align:center;">${pet.petLove}</td>
                  <td width="150px" style="text-align:center;"><a href="mailto:${pet.petOwnerEmail}">${pet.petOwnerName}</a></td>
                </tr>
              </c:forEach>

            </table>
            共${pets.count}条记录
            每页显示<input name="pageSize" value="${pets.pageSize}" size="3" />条
            第<input name="currentPage" value="${pets.currentPage}" size="3" />页
            / 共${pets.totalPage}页
            <a href="javascript:page_first();">第一页</a>
            <a href="javascript:page_pre('${pets.totalPage}');">上一页</a>
            <a href="javascript:page_next('${pets.totalPage}');">下一页</a>
            <a href="javascript:page_last('${pets.totalPage}');">最后一页</a>
            <button onclick="javascript:page_go('${pets.totalPage}');">GO</button>

            <script>
                function page_go(totalPage)
                {
                    page_validate(totalPage);
                    document.forms[0].submit();
                }
                function page_first()
                {
                    document.forms[0].elements["currentPage"].value = 1;
                    document.forms[0].submit();
                }
                function page_pre(totalPage)
                {
                    var currentPage = document.forms[0].elements["currentPage"].value;
                    document.forms[0].elements["currentPage"].value = parseInt(currentPage) - 1;
                    page_validate(totalPage);
                    document.forms[0].submit();
                }
                function page_next(totalPage)
                {

                    var currentPage = document.forms[0].elements["currentPage"].value;
                    document.forms[0].elements["currentPage"].value = parseInt(currentPage) + 1;
                    page_validate(totalPage);
                    document.forms[0].submit();
                }
                function page_last(totalPage)
                {
                    document.forms[0].elements["currentPage"].value = totalPage;
                    document.forms[0].submit();
                }
                function page_validate(totalPage)
                {
                    var pageTotal = totalPage;
                    var currentPage = document.forms[0].elements["currentPage"].value;
                    if (currentPage<1) {currentPage=1;};
                    if (currentPage>pageTotal){currentPage=pageTotal;};
                    document.forms[0].elements["currentPage"].value = currentPage;

                    var recTotal = 4;//用户选择每页显示条数<1时，强制将其改为每页显示4条
                    var pageSize = document.forms[0].elements["pageSize"].value;
                    if (pageSize<1){pageSize=4;}
                    document.forms[0].elements["pageSize"].value = pageSize;
                }

            </script></div>
        </td>
      </tr>
    </table>
  </div>




  <hr size="1" width="800px" color="black"/>
  <div class="main_div" style="border-width:0;text-align:center;">
    copyright &copy;fjw
  </div>
</form>
</div>
</body>
</html>
