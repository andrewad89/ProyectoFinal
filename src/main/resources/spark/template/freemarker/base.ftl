
<#macro page_head>
<title>Bienvenido al equipo de futbol Athletic de Valencia </title>
<link rel="stylesheet" type="text/css" href="/css/styles.css" title="style">
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