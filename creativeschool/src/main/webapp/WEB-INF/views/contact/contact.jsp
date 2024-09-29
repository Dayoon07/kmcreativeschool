<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${ pageContext.request.contextPath }" />
<jsp:include page="/WEB-INF/views/common/header.jsp" />

	<h2 class="text-center mt-4">문의하기</h2>

	<div class="container mt-4 mb-4">
		<div class="text-right">
			<a href="${ path }/contact/contactwrite.do">
				<button type="button" class="btn btn-light border">문의 글 작성하기</button>
			</a>
		</div>
		<ul class="list-group list-group-flush">
			<li class="list-group-item"><a href="${ path }/contact/contactview.do">An item</a></li>
			<li class="list-group-item"><a href="${ path }/contact/contactview.do">An item</a></li>
			<li class="list-group-item"><a href="${ path }/contact/contactview.do">An item</a></li>
			<li class="list-group-item"><a href="${ path }/contact/contactview.do">An item</a></li>
			<li class="list-group-item"><a href="${ path }/contact/contactview.do">An item</a></li>
			<li class="list-group-item"><a href="${ path }/contact/contactview.do">An item</a></li>
			<li class="list-group-item"><a href="${ path }/contact/contactview.do">An item</a></li>
			<li class="list-group-item"><a href="${ path }/contact/contactview.do">An item</a></li>
		</ul>
	</div>

<jsp:include page="/WEB-INF/views/common/footer.jsp" />