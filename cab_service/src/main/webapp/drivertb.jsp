<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Driver List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    
    <style>
        body {
            background-color: #f9f9f9;
            font-family: 'Arial', sans-serif;
        }
        .navbar {
            background-color: #ffffff;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
        }
        .navbar-brand {
            font-weight: bold;
            color: #007bff !important;
        }
        .nav-link {
            color: #555 !important;
            font-weight: 500;
        }
        .nav-link:hover {
            color: #007bff !important;
        }
        .hero {
            background: linear-gradient(to right, #6a11cb, #2575fc);
            color: white;
            text-align: center;
            padding: 100px 20px;
            border-radius: 0 0 30px 30px;
        }
        .btn-custom {
            background-color: #ff7f50;
            color: white;
            font-weight: bold;
            padding: 12px 25px;
            border-radius: 25px;
            text-decoration: none;
        }
        .btn-custom:hover {
            background-color: #ff5722;
            color: white;
        }
        .container {
            margin-top: 40px;
        }
        footer {
            background: #007bff;
            color: white;
            padding: 15px;
            text-align: center;
            margin-top: 30px;
            border-radius: 15px 15px 0 0;
        }
        .table {
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            overflow: hidden;
        }
        th, td {
            text-align: center;
        }
        .btn-danger {
            background-color: #ff5722;
            color: white;
            border-radius: 15px;
        }
        .btn-danger:hover {
            background-color: #ff7f50;
        }
    </style>
    
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Mega City Cab Service</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarScroll">
      <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="about.jsp">About</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<!-- Hero Section -->
<div class="hero">
    <h1>Welcome to Mega City Cab Service</h1>
    <h1>Driver List</h1>
</div>

<div class="container mt-4">
    <c:if test="${empty cust}">
        <p class="alert alert-warning text-center">No drivers found in the database.</p>
    </c:if>
    
    <div class="table-responsive">
        <table class="table table-striped table-bordered text-center">
            <thead class="table-dark">
                <tr>
                    <th scope="col">Driver ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">License Number</th>
                    <th scope="col">Address</th>
                    <th scope="col">Contact Number</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="cus" items="${cust}">
                    <tr>
                        <td>${cus.driver_id}</td>
                        <td>${cus.name}</td>
                        <td>${cus.license_no}</td>
                        <td>${cus.address}</td>
                        <td>${cus.contact_no}</td>
                        <td>
                            <form action="deldri" method="post" class="d-inline">
                                <input type="hidden" name="driver_id" value="${cus.driver_id}">
                                <button type="submit" class="btn btn-danger btn-sm">
                                    <i class="fas fa-trash-alt"></i> Delete
                                </button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<!-- Footer -->
<footer>
    &copy; 2025 Mega City Cab Service | All Rights Reserved
</footer>

<!-- Bootstrap JS for better UI interactions -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://kit.fontawesome.com/your-fontawesome-key.js" crossorigin="anonymous"></script>

</body>
</html>
