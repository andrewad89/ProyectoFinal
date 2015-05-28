
<#include "base.ftl">

<#macro content>
<br/>
<table class="datatable">
<tr>
<th>Firstname</th> <th>Lastname</th> <th>Fecha de nacimiento</th> <th>Salario</th> <th>Posicion</th> <th>Duracion contrato</th>
</tr>
<#list jugadores as jugador>
<tr>
<td>${jugador.firstname}</td> <td>${jugador.lastname}</td> <td>${jugador.fecha_nac}</td> <td>${jugador.salario}</td> <td>${jugador.posicion}</td> <td>${jugador.duracion}</td>
<td>
<a href="delete/${jugador.lastname}" class="btn btn-default btn-xs">Borrar</a>
<a href="updateSearch/${jugador.lastname}" class="btn btn-default btn-xs">Actualizar</a>
</td>
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