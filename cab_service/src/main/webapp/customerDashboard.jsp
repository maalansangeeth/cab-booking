<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home - Mega Cab Service</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('images/BG.jpg');
            background-size: cover;
            background-position: center;
            background-attachment: fixed;
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
        .vehicle-tiles .tile {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease-in-out;
            cursor: pointer;
            margin-bottom: 20px;
        }
        .vehicle-tiles .tile:hover {
            transform: scale(1.05);
        }
        .tile-img {
            width: 100%;
            height: 200px;
            object-fit: cover;
            border-radius: 10px 10px 0 0;
        }
        .tile-text {
            padding: 15px;
            text-align: center;
        }
        .tile-title {
            font-weight: bold;
            color: #007bff;
        }
        .tile-description {
            color: #555;
        }
        .tile-price {
            font-size: 18px;
            font-weight: bold;
            color: #ff5722;
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
                    <a class="nav-link active" aria-current="page" href="index.jsp">Log out</a>
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
    <p>Your gateway to hassle-free travel!</p>
</div>

<!-- Vehicle Tiles Section -->
<div class="container text-center vehicle-tiles">
    <h3>Our Fleet</h3>
    <div class="row mt-4">
        <div class="col-md-3">
            <div class="tile">
                <img src="images/van.jpg" alt="Van" class="tile-img">
                <div class="tile-text">
                    <h4 class="tile-title">Van</h4>
                    <p class="tile-description">Spacious and comfortable for group travel.</p>
                    <p class="tile-price">Rs 140 per Km</p>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="tile">
                <img src="images/car.jpg" alt="Car" class="tile-img">
                <div class="tile-text">
                    <h4 class="tile-title">Car</h4>
                    <p class="tile-description">Perfect for personal and short trips.</p>
                    <p class="tile-price">Rs 100 per Km</p>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="tile">
                <img src="images/mini van.png" alt="Mini Van" class="tile-img">
                <div class="tile-text">
                    <h4 class="tile-title">Mini Van</h4>
                    <p class="tile-description">Ideal for family or business group trips.</p>
                    <p class="tile-price">Rs 120 per Km</p>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="tile">
                <img src="images/bus.png" alt="Bus" class="tile-img">
                <div class="tile-text">
                    <h4 class="tile-title">Bus</h4>
                    <p class="tile-description">Great for large groups and events.</p>
                    <p class="tile-price">Rs 180 per Km</p>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- View Vehicles and Book Now Section -->
<div class="container mt-5 text-center">
    <div class="row justify-content-center">
        <!-- View Vehicles Section -->
        <div class="col-md-4 mb-4">
            <div class="card text-center admin-option">
                <div class="card-body">
                    <img src="images/viewv.png" class="img-fluid mb-3" alt="View Vehicles Icon" width="80">
                    <h5 class="card-title">View Vehicles</h5>
                    <form action="vehiclestb" method="post">
                        <button type="submit" class="btn btn-primary">Choose</button>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Book Now Section under View Vehicles -->
    <div class="row justify-content-center">
        <div class="col-md-4 mb-4">
            <a href="booking.jsp" class="btn btn-success btn-lg">Book Now</a>
        </div>
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
