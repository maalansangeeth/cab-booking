<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<!-- Bootstrap CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background-color: #f8f9fa;
    }
    .login-container {
        margin-top: 80px;
    }
    .card {
        border-radius: 15px;
        border: none;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }
    .card img {
        width: 100px;
        border-radius: 50%;
        border: 3px solid #007bff; /* Blue border */
    }
    .btn-custom {
        background-color: #007bff; /* Blue button */
        color: white;
        width: 100%;
        font-weight: bold;
    }
    .btn-custom:hover {
        background-color: #0056b3; /* Darker blue on hover */
    }
</style>
</head>
<body>

<div class="container login-container">
    <div class="row justify-content-center">
        <div class="col-md-5">
            <div class="card shadow-sm p-4">
                <div class="text-center">
                    <img src="images/1.jpg" class="mb-3" alt="Profile Image">
                    <h4><b>User Login</b></h4>
                    <span class="text-muted">Account Status: <span class="text-success">Active</span></span>
                </div>
                <hr>
                <form method="post" action="log">
                    <div class="mb-3">
                        <label class="form-label">User Name</label>
                        <input type="text" class="form-control" name="username" placeholder="Enter User Name" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Password</label>
                        <input type="password" class="form-control" name="password" placeholder="Enter Password" required>
                    </div>
                    <div class="mb-3 d-grid">
                        <button type="submit" class="btn btn-custom">Login</button>
                    </div>
                </form>
                <p class="text-center text-muted mt-3">Don't have an account? <a href="reg.jsp" class="text-primary">Register</a></p>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>
