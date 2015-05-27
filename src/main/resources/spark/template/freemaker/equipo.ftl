<#include "base.ftl">

<#macro page_head>
<title>Bienvenido al equipo de futbol Athletic de Valencia </title>
<link rel="stylesheet" type="text/css" href="/public/css/styles.css" title="style">
</#macro>


<#macro page_body>
<link rel="stylesheet" type="text/css" href="/public/css/styles.css" title="style">
<div id="header">
<H2>
        Equipo Athletic de Valencia
</H2>
</div>
<div id="content">
 
 <#-- hola   -->
 
  <fieldset>
        <legend> Añade un jugador</legend>
  <form name="user" action="hello" method="post">
        Nombre: <input type="text" name="firstname" />       <br/>
        Apellido: <input type="text" name="lastname" /> <br/>
        Fecha de nacimiento: <input type="text" name="cumple" /> <br/>
        Salario: <input type="text" name="salario" /> <br/>
        Posicion: <input type="text" name="posicion" /> <br/>
        Duracion contrato: <input type="text" name="duracioncont" /> <br/>

        <input type="submit" value="   Save   " />
  </form>
  </fieldset>
  <br/>
  <table class="datatable">
        <tr>
                <th>Firstname</th>  <th>Lastname</th> <th>Fecha de nacimiento</th> <th>Salario</th>  <th>Posicion</th> <th>Duracion contrato</th> 
        </tr>
    <#list users as user>
        <tr>
                <td>${user.firstname}</td> <td>${user.lastname}</td> <td>${user.cumple}</td> <td>${user.salario}</td> <td>${user.posicion}</td> <td>${user.duracioncont}</td> 
        </tr>
    </#list>
  </table>
 
</div>  

<nav>
  <ul class="pagination">
    <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>


</#macro>

<@display_page/>
