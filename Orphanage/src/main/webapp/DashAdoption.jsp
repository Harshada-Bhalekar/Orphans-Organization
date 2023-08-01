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
					<img src="logo-removebg-preview.png" />
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
					<img src="data:image/jpg;base64,${dP1}"/>
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
				<button type="submit" name="button" value="parentform" style="background-color:#ffff8f; border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
				
					<i class="ph-check-square"></i>
					<span>Parent Details Form</span>
				</button>
				<button type="submit" name="button" value="adoptionform" style="background:none;border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
				
					<i class="ph-swap"></i>
					<span>Adoption Request Form</span>
				</button>
				<button type="submit" name="button" value="Helpingform" style=" background:none;border:none;  padding:5px; border-radius: 5px; width: 220px; height: 50px;">
				
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
        <table>
           
	            <tr><div><h1>Adoption Request Form</h1></div>
	            
		
		                <div class="form-wrap">
                        <h1>Registration</h1>
                        <p>It's Free and Only takes a minute</p>
                    </tr>
                        <form action="AdoptionReq" enctype="multipart/form-data" method="post">
                            <tr><td>
                                <label for="Parent Mother Name">Parent Mother Name :<sup style="color:red;">*</sup></label></td>
                                <td><input type="text" placeholder="Enter Mother Name" name="MotherName" pattern="[a-zA-Z]+" required></td>
                           
                  
                                <td><label for="Parent Father Name">Parent Father Name:<sup style="color:red;">*</sup></label></td>
                                <td><input type="text" placeholder="Enter Father Name" name="FatherName" pattern="[a-zA-Z]+" required></td>
                            
                            </tr>

                            <tr>
                            
                            <td><label for="Mother Mobile Number">Parent Mother Mobile Number:<sup style="color:red;">*</sup></label></td>
                            <td><input type="text" placeholder="Enter Mobile Number" name="MotherMobileNumber" pattern="[1-9]{1}[0-9]{9}" required></td>
                                
                            <td><label for="Father Mobile Number">Parent Father Mobile Number:<sup style="color:red;">*</sup></label></td>
                            <td><input type="text" placeholder="Enter Mobile Number" name="FatherMobileNumber" pattern="[1-9]{1}[0-9]{9}" required></td>
                        
                        </tr>

                        <tr>
                    
                        <td><label for="Parent Address">Parent Address:<sup style="color:red;">*</sup></label></td>
                        <td><input type="text" placeholder="Enter Parent Address" name="ParentAddress" pattern="[a-zA-Z]+" required></textarea></td>
                
                                             
                            <div class="form-group">
                                <td><label for="Email Id">Parent Mother Email Id:<sup style="color:red;">*</sup></label></td>		
                                <td><input type="text" placeholder="Enter Parent Mother Email Id" name="ParentMotherEmailId" pattern="^[a-zA-Z0-9+]+@[a-zA-Z.-]+$" required></td>
                            </div>
                            </tr>
                            <tr>
                            <div class="form-group">
                                <td><label for="Email Id">Parent Father Email Id:<sup style="color:red;">*</sup></label></td>
                                <td><input type="text" placeholder="Enter Parent Father Email Id" name="ParentFatherEmailId" pattern="^[a-zA-Z0-9+]+@[a-zA-Z.-]+$" required></td>
                            </div>
                            
                            <div class="form-group">
                                <td><label for="Birth Date">Parent Mother Birth Date:<sup style="color:red;">*</sup></label></td>
                                <td><input type="date" id="ParentMotherBirthDate" name="ParentMotherBirthDate "required></td>
                                </div>
                              </tr>

                            <tr>  
                                <div class="form-group">
                                    <td><label for="Birth Date">Parent Father Birth Date:<sup style="color:red;">*</sup></label></td>
                                    <td><input type="date" id="ParentFatherBirthDate" name="ParentFatherBirthDate"required></td>
                                    </div>
                                    
                                    <div class="form-group">
                                        <td><label for="Parent Mother Age">Parent Mother Age:<sup style="color:red;">*</sup></label></td>
                                        <td><input type="text" placeholder="Enter Parent Mother Age" name="ParentMotherAge" pattern="^(0?[1-9]|[1-9][0-9]|[1][1-9][1-9]|200)$" required></td>
                                    </div>
                                </tr>

                                    <tr>
                                        <div class="form-group">
                                        <td><label for="Parent Father  Age">Parent Father Age:<sup style="color:red;">*</sup></label></td>
                                        <td><input type="text" placeholder="Enter Parent Father Age" name="ParentFatherAge" pattern="^(0?[1-9]|[1-9][0-9]|[1][1-9][1-9]|200)$"required></td>
                                    </div>
                                    
                                        <td><div class="form-group">
                                            <label for="gender" required> Select Child Gender:<sup style="color:red;">*</sup></label></td>
                                            <td><select name="babygender">
                                                <option value="none" selected>Gender</option>
                                                <option value="male" name="babygender">Boy Child</option>
                                                <option value="female" name="babygender">Girl Child</option>
                                            </select>
                                        </div></td>
                                    </tr>

                                    <tr>

                            <td>
                            <div class="form-group">
                                <label for="Age Group" required> Select Child Age Group:<sup style="color:red;">*</sup></label></td>
                                <td><select name="AgeGroup">
                            <option value="none " name="AgeGroup" selected>Child Age Group:</option>
                            <option value="6-8" name="AgeGroup">6-8</option>
                            <option value="9-11" name="AgeGroup">9-11</option>
                            <option value="12-14" name="AgeGroup">12-14</option>
                            <option value="15-17" name="AgeGroup">15-17</option>
                            
                        </select>
                        </td>
                            </div>
                            
                            <div class="form-group">
                                <td><label for="Orphanage Name">Orphanage Name :<sup style="color:red;">*</sup></label></td>
                                <td><input type="text" placeholder="Enter Orphanage Name" name="OrphanageName" pattern="[a-zA-Z]+" required></td>
                            </div>
                           </tr>

                                    <tr>
                            <div class="form-group">
                                <td><label for="Orphanage Address">Orphanage Address:<sup style="color:red;">*</sup></label></td>
                                <td><input type="text" placeholder="Enter Orphanage Address" name="OrphanageAddress" pattern="[a-zA-Z]+" required></td>
                            </div>
                            
                            <div class="form-group">
                                <td><label for="Vlounteer"> Vlounteer Name :<sup style="color:red;">*</sup></label></td>
                                <td><input type="text" placeholder="Enter Vlounteer Name" name="VlounteerName" pattern="[a-zA-Z]+" required></td>
                            </div>
                            
                              </tr>

                                    <tr>          
                                <td><label for="Parent Mother Photo"> Parent Mother Passport Size Photo:<sup style="color:red;">*</sup> </label> </td>
                                <td><input type="file" name="ParentMotherPassportSizePhoto" size="150" placeholder="Upload Parent Mother Passport size photo"/></td>
                            </div>
                           
                            <div class="form-group">
                                <td><label for="Parent Father Photo"> Parent Father Passport Size Photo:<sup style="color:red;">*</sup> </label></td> 
                                <td><input type="file" name="ParentFatherPassportSizePhoto" size="150" placeholder="Upload Parent Father Passport size photo"/></td>
                            </div>
                            </tr>

                                    <tr>
                            <div class="form-group">
                                <td><label for="photo"> Parent Mother Aadhar Card:<sup style="color:red;">*</sup> </label></td> 
                                <td><input type="file" name="ParentMotherAadharphoto" size="100" placeholder="Upload Parent Mother Aadhar Card" required /></td>
                            </div>
                           
                            <div class="form-group">
                                <td><label for="photo">Parent Father Aadhar Card:<sup style="color:red;">*</sup> </label></td> 
                                <td><input type="file" name="ParentFatherAadharphoto" size="100" placeholder="Upload Parent Father Aadhar Card" required /></td>
                            </div>
                            </tr>

                                    <tr>
                    <div class="form-group">
                        <td><label for="Parent Mother  Medical Certificate"> Parent Mother Medical Certificate:<sup style="color:red;">*</sup> </label></td> 
                        <td><input type="file" name="ParentMotherMedicalCertificate" size="150" placeholder="Upload Parent Mother Medical Certificate"required></td>
                    </div>
                    
                    <div class="form-group">
                        <td><label for="Parent Father Medical Certificate"> Parent Father Medical Certificate:<sup style="color:red;">*</sup> </label> </td>
                        <td><input type="file" name="ParentFatherMedicalCertificate" size="150" placeholder="Upload Parent Father Medical Certificate"required></td>
                    </div>
                    </tr>

                    <tr>
                            <td><button type="submit" >Submit</button></td>
                            <td></td>
                            
                            <td><button type="reset">Clear</button></td>
                            
                        </tr>
                        </form>
                        </div>
                
                        </div>
                    
                    
                        </div>
                    </div>
           
        </table>
        </div>
<!-- partial -->
  <script src='https://unpkg.com/phosphor-icons'></script><script  src="./script.js"></script>

</body>
</html>