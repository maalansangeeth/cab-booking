<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>About Us - Mega City Cab Service</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
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
        .card {
            border: none;
            border-radius: 15px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease-in-out;
        }
        .card:hover {
            transform: scale(1.05);
        }
        footer {
            background: #007bff;
            color: white;
            padding: 15px;
            text-align: center;
            margin-top: 30px;
            border-radius: 15px 15px 0 0;
        }
        .company-info-tile {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }
        .company-info-tile h4 {
            font-weight: bold;
            color: #007bff;
        }
        .company-info-tile p {
            color: #555;
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
          <a class="nav-link active" aria-current="page" href="login.jsp">Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="reg.jsp">Register</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<!-- Hero Section -->
<div class="hero">
    <h1>About Mega City Cab Service</h1>
    <p>Your reliable travel partner in Colombo</p>
</div>

<!-- Main Content -->
<div class="container d-flex justify-content-center mt-5">
    <div class="company-info-tile">
        <h4>Our Story</h4>
        <p>At Mega City Cab Service, we strive to make transportation easier for all. Our mission is to offer affordable, comfortable, and on-time transportation services across Colombo and its surrounding areas. Whether you're headed to a meeting, the airport, or exploring the city, we’re here to make your ride smooth and hassle-free.</p>

        <h4>Why Choose Us?</h4>
        <ul>
            <li>Professional, friendly, and experienced drivers</li>
            <li>Affordable rates without compromising quality</li>
            <li>24/7 availability for your convenience</li>
            <li>Real-time tracking of your ride</li>
            <li>Wide range of vehicles to suit your needs</li>
        </ul>

        <h4>Our Fleet</h4>
        <p>We offer a variety of vehicles, including cars, vans, mini vans, and buses, to suit different group sizes and requirements. No matter your transportation needs, we've got the right vehicle for you.</p>
    </div>
</div>

<!-- Footer -->
<footer>
    &copy; 2025 Mega City Cab Service | All Rights Reserved
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
