



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>我的宝贝儿</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <script type="text/javascript" src="calc/calendar.js"></script>
  <script type="text/javascript" src="calc/calendar-en.js"></script>
  <link type="text/css" rel="stylesheet" href="calc/calendar-system.css"/>
  <link rel="stylesheet" type="text/css" href="styles.css">
  <script >
    /*window.onload=function () {
        window.location.href="${pageContext.request.contextPath}/pet/index.do";
    }*/

      function doLogin()
      {
          //document.forms[0].action = "pet.jsp";
          document.forms[0].elements["operate"].value = "doLogin";

          document.forms[0].action = "${pageContext.request.contextPath}/pet/login.do";

          document.forms[0].submit();

      }
      function searchPet()
      {
          document.forms[0].action = "${pageContext.request.contextPath}/pet/findPetByCondition.do";
          document.forms[0].target = "_blank";
          document.forms[0].elements["operate"].value = "list";
          document.forms[0].submit();
      }
      function searchDiary()
      {
          document.forms[0].action = "diary_list.jsp";
          document.forms[0].target = "_blank";
          document.forms[0].elements["operate"].value = "list";
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
<div align="center" width=1000px" style="background-color:bisque; ">
<form name="petForm" method="post" action="">
  <input type="hidden" name="operate" value="index">
  <div class="main_div">
    <h1>我的宝贝儿</h1>

    <table class="main_div" cellspacing="0" cellpadding="0" border="0" align="center">
      <tr>
        <td style="background-color:pink;width: 450px;">&nbsp;</td>
        <td rowspan="2" style="background-color:pink;text-align:right;width: 350px;">


          宠物<input type="text" name="petId" size="6" value="">
          密码<input type="password" name="petPassword" size="6" value="">
          <button onclick="javascript:doLogin();">登录</button>
          &nbsp;&nbsp;
        </td>
      </tr>
      <tr>
        <td style="background-color:pink;">&nbsp;


          <a href="adopt.jsp">领养宠物</a>

          &nbsp;&nbsp;
        </td>
      </tr>
    </table>
  </div>
  <div class="main_div">
    <table><tr>
      <td>
        <table style="border:solid 1px black;" height="200px" width="500px">
          <tr>
            <th colspan="2" style="background-color:gray;height:20px;">
              金宝宝排行
            </th>
          </tr>
          <tr>
            <td width="200px">
              <img src="images/pet/pig.jpg" width="200px" height="140px" /><br />
              yicongying
              (千禧猪-318-hlliu)<br />
              [力量:170;
              能力:145;
              爱心:139]
            </td>
            <td>

              <li>
                <a href="pet.jsp" target="_blank">
                  yicongying
                </a>(千禧猪 - 318 - hlliu)
              </li>

              <li>
                <a href="pet.jsp" target="_blank">
                  yicongying
                </a>(千禧猪 - 246 - hlliu)
              </li>

              <li>
                <a href="pet.jsp" target="_blank">
                  yicongying
                </a>(千禧猪 - 246 - hlliu)
              </li>



              <li>
                <a href="pet.jsp" target="_blank">
                  new
                </a>(哥斯拉 - 203 - hlliu)
              </li>

              <li>
                <a href="pet.jsp" target="_blank">
                  newcat
                </a>(喵咪 - 184 - ss)
              </li>

              <li>
                <a href="pet.jsp" target="_blank">
                  bb
                </a>(哥斯拉 - 128 - bb)
              </li>

              <li>
                <a href="pet.jsp" target="_blank">
                  qq
                </a>(哥斯拉 - 116 - )
              </li>

              <li>
                <a href="pet.jsp" target="_blank">
                  11
                </a>(哥斯拉 - 116 - 11)
              </li>

              <li>
                <a href="pet.jsp" target="_blank">
                  ww
                </a>(哥斯拉 - 116 - 2)
              </li>

              <br />
              <a href="pet_list.jsp" target="_blank">更多&gt;&gt;</a>
            </td>
          </tr>
        </table>
      </td>
      <td valign="top">

        <table style="border:solid 1px black;" height="200px" width="300px">
          <tr>
            <th colspan="1" style="background-color:gray;">
              查找
            </th>
          </tr>
          <tr>
            <td valign="top" style="height:182px;">
              &nbsp;&nbsp;&nbsp;宠物名&nbsp;<input type="text" name="petinfo.petName" size="10" value=""><br />
              宠物类别&nbsp;
              <select name="petinfo.petType">
                <%--<option value="-1">全部...</option>--%>
                <option value="1">千禧猪</option>
                <option value="2">喵咪</option>
                <option value="3">哥斯拉</option></select>
              <br />
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                  主人&nbsp;<input type="text" name="petinfo.petOwnerName" size="10" value="">
                   &nbsp;<button onclick="javascript:searchPet();">查找宠物</button>



              <br /><br />
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              标题&nbsp;<input name="petinfo.diaryTitle" size="10" /><br />
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              作者&nbsp;<input name="petinfo.diaryAuthor" size="10" /><br />
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              日期&nbsp;<input type="text" onclick="calShow('diaryDateString');" onfocus="calShow('diaryDateString');" name="petinfo.diaryDateString" size="10" readonly="true" />
              <br />
              &nbsp;&nbsp;
              关键字&nbsp;<input name="petinfo.diaryContext" size="10" />
              &nbsp;<button onclick="javascript:searchDiary();">查找日记</button>

              <br />
            </td>
          </tr>
        </table>
      </td>
    </tr></table>
  </div>
  <div class="main_div">
    <table><tr>
      <td>
        <table style="border:solid 1px black;height:20px;" height="200px" width="200px">
          <tr>
            <th colspan="1" style="background-color:gray;">
              最新宠物日记
            </th>
          </tr>
          <tr>
            <td valign="top">

              <li>
                <a href="diary.jsp#1" target="_blank">
                  t1
                </a>(kk,2007-07-15)
              </li>

              <li>
                <a href="diary.jsp#2" target="_blank">
                  t2
                </a>(,2007-07-31)
              </li>

              <li>
                <a href="diary.jsp#3" target="_blank">
                  t3
                </a>(,2007-08-01)
              </li>

              <li>
                <a href="diary.jsp#4" target="_blank">
                  t4
                </a>(,2007-06-30)
              </li>

              <li>
                <a href="diary.jsp#5" target="_blank">
                  t5
                </a>(hlliu,2007-07-01)
              </li>

              <li>
                <a href="diary.jsp#6" target="_blank">
                  t6
                </a>(hlliu,2007-07-01)
              </li>

              <li>
                <a href="diary.jsp#7" target="_blank">
                  t7
                </a>(hlliu,2007-07-01)
              </li>

              <li>
                <a href="diary.jsp#8" target="_blank">
                  t8
                </a>(hlliu,2007-07-01)
              </li>

              <li>
                <a href="diary.jsp#9" target="_blank">
                  t9
                </a>(hlliu,2007-07-01)
              </li>

              <li>
                <a href="diary.jsp#10" target="_blank">
                  t10
                </a>(hlliu,2007-07-01)
              </li>

              <br />
              <a href="diary_list.jsp" target="_blank">更多&gt;&gt;</a>
            </td>
          </tr>
        </table>
      </td>
      <td>
        <table style="border:solid 1px black;height:20px;" height="200px" width="200px">
          <tr>
            <th colspan="1" style="background-color:gray;">
              最活力宝贝
            </th>
          </tr>
          <tr>
            <td valign="top">

              <li>
                <a href="pet.jsp#19" target="_blank">
                  new
                </a>(195)
              </li>

              <li>
                <a href="pet.jsp#14" target="_blank">
                  yicongying
                </a>(190)
              </li>

              <li>
                <a href="pet.jsp#15" target="_blank">
                  yicongying
                </a>(190)
              </li>

              <li>
                <a href="pet.jsp#9" target="_blank">
                  yicongying
                </a>(170)
              </li>

              <li>
                <a href="pet.jsp#1" target="_blank">
                  dog1
                </a>(100)
              </li>

              <li>
                <a href="pet.jsp#16" target="_blank">
                  newcat
                </a>(100)
              </li>

              <li>
                <a href="pet.jsp#21" target="_blank">
                  bb
                </a>(100)
              </li>

              <li>
                <a href="pet.jsp#12" target="_blank">
                  qq
                </a>(80)
              </li>

              <li>
                <a href="pet.jsp#13" target="_blank">
                  11
                </a>(80)
              </li>

              <li>
                <a href="pet.jsp#20" target="_blank">
                  ww
                </a>(80)
              </li>

              <br />
              <a href="pet_list.jsp" target="_blank">更多&gt;&gt;</a>
            </td>
          </tr>
        </table>
      </td>
      <td>
        <table style="border:solid 1px black;height:20px;" height="200px" width="200px">
          <tr>
            <th colspan="1" style="background-color:gray;">
              最聪明宝贝
            </th>
          </tr>
          <tr>
            <td valign="top">

              <li>
                <a href="pet.jsp#9" target="_blank">
                  yicongying
                </a>(145)
              </li>

              <li>
                <a href="pet.jsp#14" target="_blank">
                  yicongying
                </a>(106)
              </li>

              <li>
                <a href="pet.jsp#15" target="_blank">
                  yicongying
                </a>(106)
              </li>

              <li>
                <a href="pet.jsp#1" target="_blank">
                  dog1
                </a>(100)
              </li>

              <li>
                <a href="pet.jsp#19" target="_blank">
                  new
                </a>(90)
              </li>

              <li>
                <a href="pet.jsp#16" target="_blank">
                  newcat
                </a>(72)
              </li>

              <li>
                <a href="pet.jsp#21" target="_blank">
                  bb
                </a>(64)
              </li>

              <li>
                <a href="pet.jsp#12" target="_blank">
                  qq
                </a>(60)
              </li>

              <li>
                <a href="pet.jsp#13" target="_blank">
                  11
                </a>(60)
              </li>

              <li>
                <a href="pet.jsp#20" target="_blank">
                  ww
                </a>(60)
              </li>

              <br />
              <a href="pet_list.jsp" target="_blank">更多&gt;&gt;</a>
            </td>
          </tr>
        </table>
      </td>
      <td>
        <table style="border:solid 1px black;height:20px;" height="200px" width="200px">
          <tr>
            <th colspan="1" style="background-color:gray;">
              最可爱宝贝
            </th>
          </tr>
          <tr>
            <td valign="top">

              <li>
                <a href="pet.jsp#9" target="_blank">
                  yicongying
                </a>(139)
              </li>

              <li>
                <a href="pet.jsp#14" target="_blank">
                  yicongying
                </a>(102)
              </li>

              <li>
                <a href="pet.jsp#15" target="_blank">
                  yicongying
                </a>(102)
              </li>

              <li>
                <a href="pet.jsp#1" target="_blank">
                  dog1
                </a>(100)
              </li>

              <li>
                <a href="pet.jsp#16" target="_blank">
                  newcat
                </a>(92)
              </li>

              <li>
                <a href="pet.jsp#19" target="_blank">
                  new
                </a>(74)
              </li>

              <li>
                <a href="pet.jsp#21" target="_blank">
                  bb
                </a>(44)
              </li>

              <li>
                <a href="pet.jsp#12" target="_blank">
                  qq
                </a>(40)
              </li>

              <li>
                <a href="pet.jsp#13" target="_blank">
                  11
                </a>(40)
              </li>

              <li>
                <a href="pet.jsp#20" target="_blank">
                  ww
                </a>(40)
              </li>

              <br />
              <a href="pet_list.jsp" target="_blank">更多&gt;&gt;</a>
            </td>
          </tr>
        </table>
      </td>
    </tr></table>
  </div>
  <hr size="1" width="810px" color="black" align="center"/>
  <div class="main_div" style="border-width:0;text-align:center;">
    copyright &copy;fjw
  </div>
</form>
</div>
</body>
</html>
