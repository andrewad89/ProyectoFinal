
<#macro page_head>
<title>Bienvenido al equipo de fútbol Athletic de Valencia </title>
<link rel="stylesheet" type="text/css" href="/css/styles.css" title="style">
<link rel="stylesheet" type="text/css" href="/css/bootstrap.css" title="style">

</#macro>

<#macro menu>
<a href="/listar"><button type="button" class="btn btn-primary">Lista</button></a>
<a href="/form"><button type="button" class="btn btn-success">Añadir</button></a>
	<title>Base Template</title>
</#macro>


<#macro display_page>
	
	<html>
	<head>
		<@page_head/>
	</head>
	<body>
          <div id="header">
            <H2>
            Equipo Athletic de Valencia
            </H2>
            <div class="menu">
            <@menu/>
            </div>
            </div>
            <div id="content">
            <@content/> 
            </div>
            <div id="footer">
                Esto es el footer
            </div>
	</body>
	</html>
</#macro>