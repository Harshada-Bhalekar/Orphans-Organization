<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Helping Hand From</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
<link rel="stylesheet" href="DashStyle.css">
<!-- <link rel="stylesheet" href="StyleH.css"> -->
<style>
	th{
		padding-left: 110px;
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
				<button type="submit" name="button" value="Dashboard" style="background:none;border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
					<i class="ph-browsers"></i>
					<span >Dashboard</span>
				</button>
				<button type="submit" name="button" value="parentform" style="background:none;border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
				
					<i class="ph-check-square"></i>
					<span>Parent Details Form</span>
				</button>
				<button type="submit" name="button" value="adoptionform" style="background:none;border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
				
					<i class="ph-swap"></i>
					<span>Adoption Request Form</span>
				</button>
				<button type="submit" name="button" value="Helpingform" style="background-color:#ffff8f; border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
				
					<i class="ph-globe"></i>
					<span>Helping form</span>
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
					
				
			

<div id="container">
<div><h1>Helping Hand Form</h1></div>
        <table style="width:100%">
            <tr>
		
		<div class="form-wrap">
		  <h1>Registration</h1>
		  <p>It's Free and Only takes a minute</p>
        </tr>
		
		  <form action="HelpingInfo" enctype="multipart/form-data" method="post">

            <tr><td>
                <label for="Person Name">Person Name :<sup style="color:red;">*</sup></label></td>
			    <td><input type="text" placeholder="Enter Person Name" name="PersonName" pattern="[a-zA-Z]+" required></td>
			</tr>
            <tr>

			
			<td><label for="Person Phone Number">Person Phone Number:<sup style="color:red;">*</sup></label></td>
				<td><input type="text" placeholder="Enter Person Phone Number" name="PersonPhoneNumber" pattern="[1-9]{1}[0-9]{9}" required></td>
            </tr>

            <tr>

                <td><div class="form-group">
                    <label for="gender" required> Person Gender:<sup style="color:red;">*</sup></label></td>
                    <td><select name="gender">
                   <option name="gender" value="none" selected>Gender</option>
                   <option name="gender" value="male">Male</option>
                   <option name="gender" value="female">Female</option>
                   <option name="gender" value="Other">Other</option>
               </select>
                </div>
            </td>
        </tr>


                <tr>

                <div class="form-group">
                    <td><label for="Person Address">Person Address :<sup style="color:red;">*</sup></label></td>
                    <td><input type="text" placeholder="Enter Person Address" name="PersonAddress" pattern="[a-zA-Z]+" required></td>
                </div></tr>

                <tr>

                <div class="form-group">
                    <td><label for="Child Location">Child Location :<sup style="color:red;">*</sup></label></td>
                    <td><input type="text" placeholder="Enter Location Where Child Found" name="ChildLocation" pattern="[a-zA-Z]+" required></td>
                </div></tr>

                <tr>

                    <div class="form-group">
                        <td><label for="photo"> Person Aadhar Card:<sup style="color:red;">*</sup> </label></td>
                        <td><input type="file" name="PersonAadharphoto" size="100" placeholder="Upload Person Aadhar Card" required /></td>
                    </div> </tr>

			                <tr>
			
			                <div class="form-group">
			                    <td><label for="Police Complaint Letter"> Police Complaint Letter:</sup> </label></td> 
			                    <td><input type="file" name="Policecomplaint" size="100" placeholder="Upload Police Complaint Letter"></td>
			                </div></tr>

			                <tr>
			
			                <td><button type="submit" >Submit</button></td>
			            <td><button type="reset">Clear</button></td>
			            </tr>
            		</form>
            	</div>
        	</div>
    	</table>
    	</div>
<!-- partial -->
  <script src='https://unpkg.com/phosphor-icons'></script><script  src="./script.js"></script>

</body>
</html>