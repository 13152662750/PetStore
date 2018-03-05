



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>宝贝日记</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <script type="text/javascript" src="calc/calendar.js"></script>
  <script type="text/javascript" src="calc/calendar-en.js"></script>
  <link type="text/css" rel="stylesheet" href="calc/calendar-system.css"/>
  <link rel="stylesheet" type="text/css" href="styles.css">
  <script>
      function searchDiary()
      {
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
<form name="diaryForm" method="post" action="diary_list.jsp">
  <input type="hidden" name="operate" value="list">




  <div class="main_div">
    <h1>我的宝贝儿</h1>

    <table width="100%" cellspacing="0" cellpadding="0" border="0">
      <tr>
        <td width="450">&nbsp;
        </td>
        <td rowspan="2" style="background-color:pink;text-align:right;">&nbsp;

          欢迎您， hlliu ！
          <a href="index.jsp">注销</a>

          &nbsp;&nbsp;
        </td>
      </tr>
      <tr>
        <td style="background-color:pink;">&nbsp;
          <a href="index.jsp">首页</a>&nbsp;
          |&nbsp;

          我是 <a href="pet.jsp" >yicongying</a> 宝贝！


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
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                标题&nbsp;<input type="text" name="condtion.diaryTitle" size="10" value=""><br />
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                作者&nbsp;<input type="text" name="condtion.diaryAuthor" size="10" value=""><br />
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                日期&nbsp;<input type="text" name="condtion.diaryDateString" size="10" value="" onclick="calShow('condtion.diaryDateString');" onfocus="calShow('condtion.diaryDateString');"><br />
                &nbsp;&nbsp;
                关键字&nbsp;<input type="text" name="condtion.diaryContext" size="10" value="">
                &nbsp;<button onclick="javascript:searchDiary();">查找</button>
              </td>
            </tr>
          </table>

        </td>
        <td>
          <div>
            <div class="input_title">宝贝日记</div>


            <table class="data_table">
              <tr>
                <th width="40px">序号</th>
                <th width="200px">标题</th>
                <th width="50px">作者</th>
                <th width="120px">日期</th>
                <th width="150px">最近更新</th>
              </tr>

              <tr>
                <td style="text-align:right;">
                  1
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    ddddddddddddd
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:bb">bb</a></td>
                <td style="text-align:center;">2007年07月18日</td>
                <td style="text-align:center;">2007-07-04 15:02:51</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  2
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    diary
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:sscccccccccccc">ssccccc</a></td>
                <td style="text-align:center;">2007年07月04日</td>
                <td style="text-align:center;">2007-07-03 17:26:58</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  3
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    ssss
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:sssdfd">ssf</a></td>
                <td style="text-align:center;">2007年07月03日</td>
                <td style="text-align:center;">2007-07-03 17:18:57</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  4
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    dd
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:ss">ss</a></td>
                <td style="text-align:center;">2007年07月03日</td>
                <td style="text-align:center;">2007-07-03 17:02:21</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  5
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    new diary
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:liu@.net">hlliu</a></td>
                <td style="text-align:center;">2007年07月03日</td>
                <td style="text-align:center;">2007-07-03 13:35:16</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  6
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    11111111
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:liu@.net">hlliu</a></td>
                <td style="text-align:center;">2007年07月02日</td>
                <td style="text-align:center;">2007-07-02 11:16:44</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  7
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    t12
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:liu@.net">hlliu</a></td>
                <td style="text-align:center;">2007年07月01日</td>
                <td style="text-align:center;">2007-07-01 17:51:57</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  8
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    t11
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:liu@.net">hlliu</a></td>
                <td style="text-align:center;">2007年07月01日</td>
                <td style="text-align:center;">2007-07-01 17:51:55</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  9
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    t10
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:liu@.net">hlliu</a></td>
                <td style="text-align:center;">2007年07月01日</td>
                <td style="text-align:center;">2007-07-01 17:51:54</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  10
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    t9
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:liu@.net">hlliu</a></td>
                <td style="text-align:center;">2007年07月01日</td>
                <td style="text-align:center;">2007-07-01 17:51:53</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  11
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    t8
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:liu@.net">hlliu</a></td>
                <td style="text-align:center;">2007年07月01日</td>
                <td style="text-align:center;">2007-07-01 17:51:52</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  12
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    t7
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:liu@.net">hlliu</a></td>
                <td style="text-align:center;">2007年07月01日</td>
                <td style="text-align:center;">2007-07-01 17:51:51</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  13
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    t6
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:liu@.net">hlliu</a></td>
                <td style="text-align:center;">2007年07月01日</td>
                <td style="text-align:center;">2007-07-01 17:51:50</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  14
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    t5
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:liu@.net">hlliu</a></td>
                <td style="text-align:center;">2007年07月01日</td>
                <td style="text-align:center;">2007-07-01 17:51:46</td>
              </tr>

              <tr>
                <td style="text-align:right;">
                  15
                </td>
                <td>
                  <a href="diary.jsp" target="_blank">
                    t4
                  </a>
                </td>
                <td style="text-align:left;"><a href="mailto:"></a></td>
                <td style="text-align:center;">2007年06月30日</td>
                <td style="text-align:center;">2007-07-01 13:39:58</td>
              </tr>

            </table>
            共18条记录
            每页显示<input name="pageResult.pageSize" value="15" size="3" />条
            第<input name="pageResult.pageNo" value="1" size="3" />页
            / 共2页
            <a href="javascript:page_first();">第一页</a>
            <a href="javascript:page_pre();">上一页</a>
            <a href="javascript:page_next();">下一页</a>
            <a href="javascript:page_last();">最后一页</a>
            <button onclick="javascript:page_go();">GO</button>

            <script>
                function page_go()
                {
                    page_validate();
                    document.forms[0].submit();
                }
                function page_first()
                {
                    document.forms[0].elements["pageResult.pageNo"].value = 1;
                    document.forms[0].submit();
                }
                function page_pre()
                {
                    var pageNo = document.forms[0].elements["pageResult.pageNo"].value;
                    document.forms[0].elements["pageResult.pageNo"].value = parseInt(pageNo) - 1;
                    page_validate();
                    document.forms[0].submit();
                }
                function page_next()
                {
                    var pageNo = document.forms[0].elements["pageResult.pageNo"].value;
                    document.forms[0].elements["pageResult.pageNo"].value = parseInt(pageNo) + 1;
                    page_validate();
                    document.forms[0].submit();
                }
                function page_last()
                {
                    document.forms[0].elements["pageResult.pageNo"].value = 2;
                    document.forms[0].submit();
                }
                function page_validate()
                {
                    var pageTotal = 2;
                    var pageNo = document.forms[0].elements["pageResult.pageNo"].value;
                    if (pageNo<1)pageNo=1;
                    if (pageNo>pageTotal)pageNo=pageTotal;
                    document.forms[0].elements["pageResult.pageNo"].value = pageNo;

                    var recTotal = 18;
                    var pageSize = document.forms[0].elements["pageResult.pageSize"].value;
                    if (pageSize<1)pageSize=1;
                    document.forms[0].elements["pageResult.pageSize"].value = pageSize;
                }

            </script></div>
        </td>
      </tr>
    </table>
  </div>




  <hr size="1" width="800px" color="black"/>
  <div class="main_div" style="border-width:0;text-align:right;">
    copyright &copy;
  </div>
</form>
</body>
</html>
