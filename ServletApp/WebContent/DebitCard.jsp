<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.util.*"%>
<%@page import = "com.cardinfo.web.entities.DebitCardInfo" %>

<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Debit Card Info</title>
</head>
<body>
<h1>Debit Card Info</h1>
<table>
<tr>
<td>
      <table border ="1" width="500" align="left"> 
         <tr bgcolor="00FF7F"> 
          <th><b>Debit Card Number</b></th> 
          <th><b>Expiry</b></th> 
          <th><b>Balance</b></th>
          <th><b>Status</b></th> 
         </tr> 
        <%-- Fetching the attributes of the request object 
             which was previously set by the servlet  
              "StudentServlet.java" 
        --%>  
        <%ArrayList<DebitCardInfo> dcInfo =  
            (ArrayList<DebitCardInfo>)request.getAttribute("dcdata"); 
        for(DebitCardInfo s:dcInfo){%> 
        <%-- Arranging data in tabular form 
        --%> 
            <tr> 
                <td><%=s.getNumber()%></td>
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
<table>
        <tr>
        <td style="width:250px;">
        <a href="#">Report Loss of Card</a>
        </td>
        <td>
        <a href="#">Reset PIN</a>
        </td>
        </tr>
        </table>
</td>
</tr>
</table>      
        
</body>
</html>