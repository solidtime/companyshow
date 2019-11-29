<%--
  Created by IntelliJ IDEA.
  User: Soulelement99
  Date: 2019/11/27
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="resources/layui/css/layui.css"  media="all">
    <%pageContext.setAttribute("ctp",request.getContextPath());%>
</head>
<body>

<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">后台管理系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <%--<ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">控制台</a></li>
            <li class="layui-nav-item"><a href="">商品管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>--%>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item">
                    <a href="javascript:;">用户管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="pages/user_manager_page.html" onclick="return false" class="side-child-item" data-type="tabAdd">用户信息管理</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">企业管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="pages/company_manager_page.html" onclick="return false" class="side-child-item" data-type="tabAdd">企业信息管理</a></dd>
                        <dd><a href="pages/company_type_manager_page.html" onclick="return false" class="side-child-item" data-type="tabAdd">企业性质管理</a></dd>
                        <dd><a href="pages/company_industry_manager_page.html" onclick="return false" class="side-child-item" data-type="tabAdd">企业行业管理</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">职位管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="pages/position_manager_page.html" onclick="return false" class="side-child-item" data-type="tabAdd">职位信息管理</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div id="tab-div" class="layui-body">
        <div class="layui-tab" lay-allowClose="true" lay-filter="tab-page">
            <ul id="tab-ul" class="layui-tab-title">
                <li>主页</li>
            </ul>
            <div class="layui-tab-content">
                <div class="layui-tab-item layui-show">
                    1. 高度默认自适应，也可以随意固宽。
                    <br>2. Tab进行了响应式处理，所以无需担心数量多少。
                </div>
            </div>
        </div>
    </div>


</div>

<script src="resources/layui/layui.all.js" charset="utf-8"></script>

<script>
    layui.use('element',function () {
        var $=layui.jquery,element=layui.element;

        var active={
            //新增并切换到该新增Tab项
            tabAdd:function () {
                //新增一个Tab项
                var ramid=new Date().getTime();
                //【<iframe>高度自适应】--创建<iframe>时，计算其高度
                var h1=document.getElementById('tab-div').clientHeight;
                var h2=document.getElementById('tab-ul').clientHeight;
                var h=h1-h2-50;
                element.tabAdd('tab-page',{
                    title:this.innerText
                    ,content: "<iframe id='contain-iframe' src="+this.href+" height="+h+" frameborder='no' width='100%'></iframe>"
                    ,id:ramid
                })
                    //切换到刚新增的Tab项
                ,element.tabChange('tab-page',ramid)
            }
        };
        
        $('.side-child-item').on('click',function () {
            var othis = $(this), type = othis.data('type');
            active[type] ? active[type].call(this, othis) : '';
        })
    });

    //【<iframe>高度自适应】--当浏览器大小变化时，重新计算<iframe>的高度
    window.onresize=function () {
        var ifm=document.getElementById('contain-iframe');
        var tabDiv=document.getElementById('tab-div');
        var tabUl=document.getElementById('tab-ul');
        ifm.height=tabDiv.clientHeight-tabUl.clientHeight-50;
    }
</script>
</body>
</html>
