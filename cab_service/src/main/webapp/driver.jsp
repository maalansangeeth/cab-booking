<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add Driver - Mega City Cab Service</title>
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
        .card {
            border: none;
            border-radius: 15px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease-in-out;
        }
        .card:hover {
            transform: scale(1.05);
        }
        .hero {
            background: linear-gradient(to right, #6a11cb, #2575fc);
            color: white;
            text-align: center;
            padding: 80px 20px;
            border-radius: 0 0 30px 30px;
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
          <a class="nav-link active" aria-current="page" href="about.jsp">About</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<!-- Hero Section -->
<div class="hero">
    <h1>Add Driver</h1>
    <p>Fill out the form below to add a driver to Mega City Cab Service</p>
</div>

<!-- Main Content -->
<div class="container-fluid mt-5">
    <div class="row justify-content-center">
        <div class="col-md-5">
            <div class="card shadow-sm">
                <div class="card-body">
                    <center>
                        <h4 class="mt-3"><b>Driver Profile</b></h4>
                        <span>Account Status: Active</span>
                    </center>
                    <hr />
                    <!-- Add Driver Form -->
                    <form method="post" action="adddriver">
                        <div class="mb-3">
                            <label class="form-label">Driver ID</label>
                            <input type="text" class="form-control" name="driver_id" placeholder="Driver ID" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Name</label>
                            <input type="text" class="form-control" name="name" placeholder="Driver's Name" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">License Number</label>
                            <input type="text" class="form-control" name="license_number" placeholder="License Number" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Address</label>
                            <input type="text" class="form-control" name="address" placeholder="Driver's Address" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Contact Number</label>
                            <input type="number" class="form-control" name="contact_no" placeholder="Contact Number" required>
                        </div>
                        <div class="mb-3">
                            <button type="submit" class="btn btn-danger btn-lg w-100">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Footer -->
<footer>
    &copy; 2025 Mega City Cab Service | All Rights Reserved
</footer>

<!-- Bootstrap JS and dependencies -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
