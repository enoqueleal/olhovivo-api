<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="modal-body">
	<div class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">LINHA:</label>
			<div class="col-sm-10">
				<p class="form-control-static">${linha.letreiroParteUm}/${linha.letreiroParteDois}</p>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">CIRULAR:</label>
			<div class="col-sm-10">
				<p class="form-control-static">${linha.linhaCircular ? "SIM" : "NÃO"}</p>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">DESTINO:</label>
			<div class="col-sm-10">
				<p class="form-control-static">${linha.sentido == 1 ? linha.descritivoIda : linha.descritivoVolta}</p>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">ORIGEM:</label>
			<div class="col-sm-10">
				<p class="form-control-static">${linha.sentido == 2 ? linha.descritivoIda : linha.descritivoVolta}</p>
			</div>
		</div>
		<hr>
		<div class="text-center">
			<c:if test="${!noResultsFount}">
				<a href="https://www.google.com/maps/search/${bus.latitude}+${bus.longitude}" target="_blank">
					<span class="glyphicon glyphicon-globe" aria-hidden="true">&nbsp;</span><span>Ver ônibus no mapa</span>
				</a>
			</c:if>
			<c:if test="${noResultsFount}">
				<div class="text-center">
					<span>Nenhum ônibus encontrado!</span>
				</div>
			</c:if>
		</div>
	</div>
</div>
