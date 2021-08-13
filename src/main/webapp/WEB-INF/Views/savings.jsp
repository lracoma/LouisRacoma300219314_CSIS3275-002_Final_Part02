<%--
  Created by IntelliJ IDEA.
  User: jb
  Date: 8/12/2021
  Time: 5:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Savings Investment Record</title>
    <style>
        h1{
            text-align: center;
        }
        .btn {

            width: 100%;
        }

    </style>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body>
    <h1>Savings Investment Record</h1>

<div class="container2">
    <h2>The following are the savings records</h2>
    <h2>Categories</h2>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Customer number</th>
            <th>Customer Name</th>
            <th>Customer Deposit</th>
            <th>number of years</th>
            <th>savings type</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.custno}</td>
                <td>${todo.custname}</td>
                <td>${todo.cdep}</td>
                <td>${todo.nyears}</td>
                <td>${todo.savtype}</td>

                <td>    <a type="button" class="btn btn-primary"
                           href="edit?id=${todo.custno}" >Edit</a> </td>
                <td>    <a type="button" class="btn btn-primary"
                           href="delete?id=${todo.custno}" >Delete</a> </td>
                <td>    <a type="button" class="btn btn-primary"
                           href="id=${todo.custno}" >Projected Investment</a> </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>
