
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>

    <meta charset="utf-8" />
  <script src="https://res.wx.qq.com/open/js/jweixin-1.4.0.js"></script>


</head>
<body>

a
<script>

  wx.config({
    debug: true, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
    appId: '', // 必填，公众号的唯一标识
    timestamp: new Date().getTime(),
    nonceStr: '', // 必填，生成签名的随机串
    signature: '',// 必填，签名
    jsApiList: ['openLocation'] // 必填，需要使用的JS接口列表
  });


  wx.ready(function() {


    wx.updateAppMessageShareData({
      title: '', // 分享标题
      desc: '', // 分享描述
      link: '', // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
      imgUrl: '', // 分享图标
      success: function () {
        // 设置成功
        alert('success');
      }
      ,fail:function(){
        alert('updateAppMessageShareData fail');
      }
    });



  });

  wx.error(function(res){
    alert(JSON.stringify(res));
  });


</script>
</body>
</html>
