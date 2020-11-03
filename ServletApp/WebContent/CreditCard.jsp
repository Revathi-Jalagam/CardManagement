<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.cardinfo.web.entities.CreditCardInfo"%>

<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credit Card Info</title>
</head>
<body>
	<h1>Credit Card Details</h1>
	<table>
		<tr>
			<td>
				<table border="1" width="500" align="left">
					<tr bgcolor="cyan">
						<th><b>Credit Card Number</b></th>
						<th><b>Credit Card Type</b></th>
						<th><b>Expiry Date</b></th>
						<th><b>Credit Limit</b></th>
						<th><b>Status</b></th>
					</tr>
					<%-- Fetching the attributes of the request object 
             which was previously set by the servlet  
              "StudentServlet.java" 
        --%>
					<%ArrayList<CreditCardInfo> ccInfo =  
            (ArrayList<CreditCardInfo>)request.getAttribute("ccdata"); 
        for(CreditCardInfo s:ccInfo){%>
					<%-- Arranging data in tabular form 
        --%>
					<tr>
						<td><%=s.getNumber()%></td>
						<td><%=s.gettype()%></td>
						<td><%=s.getExpiry()%></td>
						<td><%=s.getBalance()%></td>
						<td><%=s.getStatus()%></td>
					</tr>
					<%}%>
				</table>

			</td>
		</tr>
		<tr>
			<td>
				<table style="padding-top:25px;">
					<tr>
						<td style="width: 200px;"><a href="#">Report Loss of Card</a>
						</td>
						<td style="width: 170px;"><a href="#">Reset PIN</a></td>
						<td><a href="#">Card Upgradation</a></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>




</body>
</html>