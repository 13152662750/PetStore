
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>我是 ${pet.petName} 宝贝！</title>

  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <link rel="stylesheet" type="text/css" href="styles.css">
  <script type="text/javascript"></script>
  <script>
      function doTraining(tType)
      {
          document.forms[0].elements["operate"].value = "doTraining";
          document.forms[0].elements["trainingType"].value = tType;
          document.forms[0].submit();
      }
      function feed()
      {
          setImg("feed");
          var oDoingDiv = document.getElementById("doingDiv");
          oDoingDiv.innerHTML ="${pet.petName}吃饭ing";
          window.setTimeout(doTraining("TRANING_TYPE_FEED"),2000);
      }
      function story()
      {
          setImg("story");
          var oDoingDiv = document.getElementById("doingDiv");
          oDoingDiv.innerHTML ="${pet.petName}在听故事ing";
          window.setTimeout(doTraining("TRANING_TYPE_STORY"),2000);
      }
      function game()
      {
          setImg("game");
          var oDoingDiv = document.getElementById("doingDiv");
          oDoingDiv.innerHTML ="${pet.petName}在玩耍ing";
          window.setTimeout(doTraining("TRANING_TYPE_GAME"),2000);
      }
      function setImg(p)
      {
          var oDoingImg = document.getElementById("doingImg");
          var src = oDoingImg.src;
          src = src.replace(".jpg","_"+p+".jpg");
          oDoingImg.src = src;
      }
      function showDiary(dId)
      {
          window.open("diary.do?operate=toView&id="+dId);
      }
  </script>

</head>

<body>
<form name="petForm" method="post" action="${pageContext.request.contextPath}/pet/train.do">
  <input type="hidden" name="operate" value="doAdopt">
  <input type="hidden" name="trainingType" >
  <input type="hidden" name="petId" value="${pet.petId}">




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
              <td valign="top">
                宠物ID：${pet.petId}<br>
                ----------------------------------------- <br>
                我叫 ${pet.petName}，是一只伟大的小千禧猪。<br>
                我的主人是<a href="mailto:${pet.petOwnerEmail}">${pet.petOwnerName}</a>。<br>
                -----------------------------------------  <br>
                力量：${pet.petStrength}<br>
                能力：${pet.petCute}<br>
                爱心：${pet.petLove}<br>
                -----------------------------------------  <br>
              </td>
            </tr>
          </table>
          <div id="doingDiv"></div>

          <img id="doingImg" src="${pageContext.request.contextPath}/images/pet/pig.jpg" />

          <div id="trainingDiv">

            <button onclick="javascript:feed('${pet.petId}');">喂食</button>&nbsp;
            <button onclick="javascript:story('${pet.petId}');">讲故事</button>&nbsp;
            <button onclick="javascript:game('${pet.petId}');">游戏</button>

          </div>
          <div id="diaryDiv">

            <a href="${pageContext.request.contextPath}/rest/pet/write/${pet.petId}">写宠物日记</a>

          </div>
          ------------------------------ <br>
          lanzhu。<br>
          <div id="funnyDiv" ></div>
        </td>
        <td width="500px" valign="top">
          <div id="diaryDiv2">
            <table class='cal' border="1" cellpadding="0" cellspacing="0" >
              <tr>
                <th>星期日</th><th>星期一</th><th>星期二</th><th>星期三</th><th>星期四</th><th>星期五</th><th>星期六</th>
              </tr>
                <tr>
                  <td valign='top'>1<li><a href="${pageContext.request.contextPath}/diary.jsp">t5</a></li><li><a href="diary.jsp">t6</a></li><li><a href="diary.jsp">t7</a></li><li><a href="diary.jsp">t8</a></li><li><a href="diary.jsp">t9</a></li><li><a href="diary.jsp">t10</a></li><li><a href="diary.jsp">t11</a></li><li><a href="diary.jsp">t12</a></li></td>
                  <td valign='top'>2<li><a href="${pageContext.request.contextPath}/diary.jsp">11111111</a></li></td>
                  <td valign='top'>3</td>
                  <td valign='top'>4</td>
                  <td valign='top'>5</td>
                  <td valign='top'>6</td>
                  <td valign='top'>7</td>
                </tr>
                <tr>
                  <td valign='top'>8</td>
                  <td valign='top'>9</td>
                  <td valign='top'>10</td>
                  <td valign='top'>11*</td>
                  <td valign='top'>12</td>
                  <td valign='top'>13</td>
                  <td valign='top'>14</td>
                </tr>
                <tr>
                  <td valign='top'>15<li><a href="diary.jsp">t1</a></li></td>
                  <td valign='top'>16</td>
                  <td valign='top'>17</td>
                  <td valign='top'>18</td>
                  <td valign='top'>19</td>
                  <td valign='top'>20</td>
                  <td valign='top'>21</td>
                </tr>
                <tr>
                  <td valign='top'>22</td>
                  <td valign='top'>23</td>
                  <td valign='top'>24</td>
                  <td valign='top'>25</td>
                  <td valign='top'>26</td>
                  <td valign='top'>27</td>
                  <td valign='top'>28</td>
                </tr>
                <tr>
                  <td valign='top'>29</td>
                  <td valign='top'>30</td>
                  <td valign='top'>31<li><a href="diary.jsp">t2</a></li></td>
                </tr>

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
