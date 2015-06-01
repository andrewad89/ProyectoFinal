
<#macro page_head>
    <title>Bienvenido al equipo de f&uacute;tbol Athletic de Valencia </title>

    <link href="/css/bootstrap.css" rel="stylesheet"></link>
    <link href="/css/jumbotron-narrow.css" rel="stylesheet"></link>

</#macro>


<#macro display_page>	
 
<html>

	<head>
		<@page_head/>
	</head>
	<body>

        <div class="container">
        
          <div class="jumbotron">
            <h1>Athletic de Valencia</h1>
            <p class="lead">Bienvenido a la p&aacute;gina oficial del equipo</p>
            <p class="lead">Athletic de Valencia.</p>
          </div>

          <div class="botones">
            <a href="/" class="btn btn-primary">Ver plantilla</a>
            <a href="/form" class="btn btn-success">A&ntilde;adir jugador</a>  
          </div> 

          <div id="content">
            <@content/> 
          </div>

          <footer class="footer">
            <p>Realizado por Andr&eacute;s Amat y Pedro Mogort</p>
          </footer>
        </div>
	</body>
 
</html>
</#macro>