<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>

<form class="book_insert">
    <div class="input_1">
        <input placeholder="ISBN">
        <input placeholder="책 제목">
    </div>
    <div class="input_2">
        <input placeholder="날짜" type="date">
        <input placeholder="" type="time">
        <input placeholder="" type="time">
    </div>
    <div class="input_3">
        <input placeholder="생각 중독은...">
        <textarea placeholder="내용을 입력해주세요"></textarea>
    </div>
    <div class="insert_btn">
        <button class="btn_save">저장</button>
        <button type="reset">새로작성</button>
        <button class="btn_home">리스트보기</button>
    </div>
</form>


