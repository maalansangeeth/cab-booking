<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>
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
        .company-info-tile {
            background: rgba(255, 255, 255, 0.7); /* Slight white background for readability */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
       
        }
        .vehicle-tiles .tile {
        background-color: rgba(255, 255, 255, 0.8); /* Slight white background for tiles */
        padding: 15px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        margin-bottom: 20px;
    }

        /* Updated styles for Why Choose Us section */
        .container.text-center {
            background: rgba(255, 255, 255, 0.7); /* Slight white background for readability */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            margin-top: 40px;
        }

        .card {
            background-color: rgba(255, 255, 255, 0.8); /* Slight white background for cards */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease-in-out;
        }
        .card:hover {
            transform: scale(1.05);
        }
        .card h4 {
            font-weight: bold;
            font-size: 18px;
        }
        .card p {
            font-size: 14px;
            color: #555;
        }
        
        footer {
            background: #007bff;
            color: white;
            padding: 15px;
            text-align: center;
            margin-top: 30px;
            border-radius: 15px 15px 0 0;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Mega City Cab Service</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" 
            aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="login.jsp">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="reg.jsp">Register</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="about.jsp">About</a>
                </li>
            </ul>
            <form class="d-flex">
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

<!-- Main Content -->
<div class="container d-flex">
    <div class="company-info-tile">
        <h4>About Mega City Cab Service</h4>
        <p>At Mega City Cab Service, we provide reliable and affordable transportation across Kurunegala and beyond.</p>
    </div>
</div>

<!-- Vehicle Tiles Section -->
<div class="container text-center vehicle-tiles">
    <h3>Our Fleet</h3>
    <div class="row mt-4">
        <!-- Mini Van Tile -->
        <div class="col-md-3 col-sm-6 mb-4">
            <div class="tile">
                <img src="images/mini van.png" alt="Mini Van" class="tile-img img-fluid">
                <div class="tile-text">
                    <h4 class="tile-title">Mini Van</h4>
                    <p class="tile-description">Ideal for family or business group trips.</p>
                    <p class="tile-price">Rs 120 per Km</p>
                </div>
            </div>
        </div>

        <!-- Car Tile -->
        <div class="col-md-3 col-sm-6 mb-4">
            <div class="tile">
                <img src="images/car.jpg" alt="Car" class="tile-img img-fluid">
                <div class="tile-text">
                    <h4 class="tile-title">Car</h4>
                    <p class="tile-description">Perfect for personal and short trips.</p>
                    <p class="tile-price">Rs 100 per Km</p>
                </div>
            </div>
        </div>

        <!-- Van Tile -->
        <div class="col-md-3 col-sm-6 mb-4">
            <div class="tile">
                <img src="images/van.jpg" alt="Van" class="tile-img img-fluid">
                <div class="tile-text">
                    <h4 class="tile-title">Van</h4>
                    <p class="tile-description">Spacious and comfortable for group travel.</p>
                    <p class="tile-price">Rs 140 per Km</p>
                </div>
            </div>
        </div>

        <!-- Bus Tile -->
        <div class="col-md-3 col-sm-6 mb-4">
            <div class="tile">
                <img src="images/bus.png" alt="Bus" class="tile-img img-fluid">
                <div class="tile-text">
                    <h4 class="tile-title">Bus</h4>
                    <p class="tile-description">Great for large groups and events.</p>
                    <p class="tile-price">Rs 180 per Km</p>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Why Choose Us Section -->
<div class="container text-center">
    <h2 class="mt-4" style="color: #333;">Why Choose Us?</h2>
    <p>We offer top-notch services to help you achieve your goals.</p>
    <div class="row mt-4">
        <div class="col-md-4">
            <div class="card p-3">
                <h4>🌟 Quality Service</h4>
                <p>We ensure high-quality services tailored to your needs.</p>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card p-3">
                <h4>📞 Customer Support</h4>
                <p>Our support team is available 24/7 to assist you.</p>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card p-3">
                <h4>💰 Affordable Pricing</h4>
                <p>We offer competitive pricing without compromising quality.</p>
            </div>
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
