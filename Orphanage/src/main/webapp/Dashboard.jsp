<%@page import="com.insertdata.AdoptionReqDTO"%>
<%@page import="java.util.List"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="data" uri="http://java.sun.com/jstl/core_rt"%>
<% List<AdoptionReqDTO> dataList = (List<AdoptionReqDTO>) session.getAttribute("data"); %>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>DashBoard</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
<link rel="stylesheet" href="DashStyle.css">

<style>

table {
	color: black;
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<!-- partial:index.partial.html -->
<div class="app" >
	
	
	<div class="verticalLine"></div>
	<header class="app-header">
		
		<div class="app-header-logo">
			
			<div class="logo">
				
				<span class="logo-icon">
					<img src="logo.png" />
				</span>
				<h1 class="logo-title">
					<strong><span>Orphanage</span></strong>
				</h1>
			</div>
		</div>
		<div class="app-header-actions">
			<button class="user-profile">
				<span>${Username}</span>
				<span>
				<i class="fa-solid fa-user-large"></i>
					<%-- <img src="data:image/jpg;base64,${dP1}"/> --%>
				</span>
			</button>
			<div class="app-header-actions-buttons">
			<form action="LogOut">
				<button class="icon-button large">
					<!--<i class="ph-magnifying-glass"></i>-->
					<img src="check-out.png">logout</img>
					

				</button>
			</form>
				
			</div>
		</div>
		<div class="app-header-mobile">
			<button class="icon-button large">
				<i class="ph-list"></i>
			</button>
		</div>

	</header>
	<div class="app-body">
		<div class="app-body-navigation">
			<form action="Dashurl" method="get">
			<nav class="navigation">
				<button type="submit" name="button" value="Dashboard" style="background-color:#ffff8f; border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
					<i class="ph-browsers"></i>
					<span >Dashboard</span>
				</button>
				<button type="submit" name="button" value="parentform" style=" background:none;border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
				
					<i class="ph-check-square"></i>
					<span>Parent Details Form</span>
				</button>
				<button type="submit" name="button" value="adoptionform" style="background:none;border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
				
					<i class="ph-check-square"></i>
					<span>Adoption Request Form</span>
				</button>
				<button type="submit" name="button" value="Helpingform" style=" background:none;border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
				
					<i class="ph-check-square"></i>
					<span>Helping Form</span>
				</button>
			</nav>
			</form>
			<footer class="footer">
				<h1>Orphanage<small>©</small></h1>
				<div>
					Orphanage ©<br />
					All Rights Reserved 2023
				</div>
			</footer>
                        
        </div>
        <div>
        	<table>
				  <tr>
				    <th>S. No</th>
				    <th>Mother Name</th>
				    <th>Father Name</th>
				    <th>Mother Contact</th>
				    <th>Father Contact</th>
				    <th>Baby Gender</th>
				    <th>Age Group</th>
				    <th>Status</th>
				  </tr>
				  <% for (AdoptionReqDTO x : dataList) { %>
            
        
				 <%--  <c:forEach var ="x" items="${ datalist }" > --%>
				  <tr>
				        <td><%= x.getFormno()%></td>
				   		<td><%= x.getMotherName()%></td>
				        <td><%= x.getFatherName()%></td>
				        <td><%= x.getMotherMobileNumber()%></td>
				    	<td><%= x.getFatherMobileNumber()%></td>
				        <td><%= x.getBabygender()%></td>
				        <td><%= x.getAgeGroup()%></td>
				    <td>under</td>
				        
				        <%-- <form action="edit">
				        <input type="hidden" name ="id" value=" ${x.id }"/>
				         <input type="hidden" name ="task" value= " ${x.task }"/>
				                 <input type="hidden" name ="taskDesc" value= " ${x.taskDesc }"/>
				        <td><input type="submit" value="Update"/></td>
				        </form> --%>
				
				  </tr>
				  <% } %>
				<%-- </c:forEach> --%>
  
</table>
        
        </div>
					
				
			
</div>

<!-- partial -->
  <script src='https://unpkg.com/phosphor-icons'></script><script  src="./script.js"></script>

</body>
</html>