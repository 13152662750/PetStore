




<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>宠物日记</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <script type="text/javascript" src="calc/calendar.js"></script>
  <script type="text/javascript" src="calc/calendar-en.js"></script>
  <link type="text/css" rel="stylesheet" href="calc/calendar-system.css"/>
  <link rel="stylesheet" type="text/css" href="styles.css">
  <script >
      function doAdd()
      {
          document.forms[0].elements["operate"].value = "doAdd";
          document.forms[0].submit();
      }
  </script>
  <script language="JavaScript">
      // calendar /////////////////////////////////////////////////////////////////
      //
      var calendar = null;

      function calSelected(cal, date) {
          cal.sel.value = date;

          var updateFlexElements = document.getElementsByName('updateF' + cal.sel.name.substring(1));
          if ((typeof updateFlexElements != "undefined") && (updateFlexElements.length > 0)) {
              var elem = updateFlexElements[0];
              if (elem.type == "checkbox") {
                  elem.checked = true;
              }
          }
          cal.callCloseHandler();
      } // calSelected

      function calCloseHandler(cal) {
          cal.hide();
      } // calCloseHandler

      function calShow(id) {
          var el = document.getElementById(id);
          if (calendar != null) {
              calendar.hide();		// hide the existing calendar
              calendar.parseDate(el.value); // set it to a new date
          } else {
              var cal = new Calendar(false, null, calSelected, calCloseHandler);
              var now = new Date();
              calendar = cal;
              //calendar.setDateFormat('mm/dd/y');
              calendar.setDateFormat('y-mm-dd');
              calendar.setRange(now.getFullYear() - 10, now.getFullYear() + 10);
              calendar.weekNumbers = false;
              calendar.create();
          }
          calendar.sel = el;
          calendar.showAtElement(el);
          //calendar.addEvent(document, "mousedown", checkCalendar);
          return false;
      } // calShow
  </script>
</head>

<body>
<form name="diaryForm" method="post" action="${pageContext.request.contextPath}/diary/addDiary.do">
  <input type="hidden" name="operate" value="list">




  <div class="main_div">
    <h1>我的宝贝儿</h1>

    <table width="100%" cellspacing="0" cellpadding="0" border="0">
      <tr>
        <td width="450">&nbsp;
        </td>
        <td rowspan="2" style="background-color:pink;text-align:right;">&nbsp;

          欢迎您， ${pet.petName} ！
          <a href="${pageContext.request.contextPath}/index.jsp">注销</a>

          &nbsp;&nbsp;
        </td>
      </tr>
      <tr>
        <td style="background-color:pink;">&nbsp;
          <a href="${pageContext.request.contextPath}/index.jsp">首页</a>&nbsp;
          |&nbsp;

          我是 <a href="${pageContext.request.contextPath}/pet.jsp" >${pet.petName}</a> 宝贝！


          &nbsp;&nbsp;
        </td>
      </tr>
    </table>
  </div>
  <div class="main_div">
    <table>
      <tr>
        <td width="300px" valign="top">

          <table>
            <tr>
              <td valign="top">我叫 ${pet.petName}，
                是一只伟大的小千禧猪。<br />
                我的主人是<a href="mailto:liu@.net">${pet.petOwnerName}</a>。
                <li>力量：${pet.petStrength}</li>
                <li>能力：${pet.petCute}</li>
                <li>爱心：${pet.petLove}</li>
                <br />
                ------------------------------ <br />
              </td>
            </tr>
          </table>
          <div id="doingDiv"></div>

          <img id="doingImg" src="${pageContext.request.contextPath}/images/pet/pig.jpg" />

          <div id="trainingDiv">

            <button >喂食</button>&nbsp;
            <button >讲故事</button>&nbsp;
            <button >游戏</button>

          </div>
          <div id="diaryDiv1">
            <a href="${pageContext.request.contextPath}/write_diary.jsp">写宠物日记</a>
          </div>
          ------------------------------ <br />
          lanzhu。<br />
          <div id="funnyDiv"/>
        </td>
        <td width="500px" valign="top">

          <div id="diaryDiv2">
            <div class="input_title">发表新日记</div>

            <input type="hidden" name="diaryPetId" value="${pet.petId}" />
            <table class="input_table">
              <tr>
                <th>日期：</th>
                <td>
                  <input type="text" name="diaryDateString" size="10" value="2007-07-11" onclick="calShow('diaryDateString');" onfocus="calShow('diaryDateString');" readonly="readonly">
                </td>
                <th>天气：</th>
                <td style="text-align:right;"><input type="text" name="diaryWeather" size="10" value=""></td>
              </tr>
              <tr>
                <th>标题：</th>
                <td colspan="2"><input type="text" name="diaryTitle" size="40" value=""></td>
                <td style="text-align:right;"><br>是否公开：</br><input type="checkbox" name="diaryIsPublic" value="true" checked="checked"></td>
              </tr>

              <tr><th valign="top">内容：</th><td colspan="3"><textarea name="diaryContext" cols="50" rows="12"></textarea></td></tr>
              <tr><th>宠主：</th><td><input type="text" name="diaryAuthor" value="${pet.petOwnerName}"></td></tr>
              <tr><th>宠主Email：</th><td><input type="text" name="diaryAuthorEmail" value="${pet.petOwnerEmail}"></td></tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                  <button onclick="javascript:doAdd();">提交</button>&nbsp;&nbsp;
                  <button onclick="javascript:history.go(-1);">返回</button>
                </td></tr>
            </table>
          </div>
        </td>
      </tr>
    </table>
  </div>




  <hr size="1" width="800px" color="black"/>
  <div class="main_div" style="border-width:0;text-align:right;">
    copyright &copy;fjw
  </div>
</form>
</body>
</html>
