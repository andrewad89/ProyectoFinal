
<#macro page_head>
    <title>Bienvenido al equipo de fútbol Athletic de Valencia </title>

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
            <p class="lead">Bienvenido a la página oficial del equipo</p>
            <p class="lead">Athletic de Valencia.</p>
          </div>

          <div class="botones">
            <a href="listar" class="btn btn-primary">Ver plantilla</a>
            <a href="form" class="btn btn-success">Añadir jugador</a>  
          </div> 

          <div id="content">
                <br>
                <@content/> 
          </div>

          <footer class="footer">
            <p>Realizado por Andrés Amat y Pedro Mogort</p>
          </footer>
        </div>
	</body>
 </html>
</#macro>