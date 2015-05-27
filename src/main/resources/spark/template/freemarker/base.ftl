
<#macro page_head>
	<title>Base Template</title>
</#macro>

<#macro page_head>
	<h1>Basic page</h1>
	<p> This is the body of the page!</p>
</#macro>

<#macro display_page>
	
	<html>
	<head>
		<@page_head/>
	</head>
	<body>
            <div id="header">
            <img src="http://blog.jelastic.com/wp-content/uploads/2013/04/netbeans-logo.jpg">
            </div>
            <div id="content">
                <@page_body/>
            </div>
            <div id="footer">
                Esto es el footer
            </div>
	</body>
	</html>
</#macro>