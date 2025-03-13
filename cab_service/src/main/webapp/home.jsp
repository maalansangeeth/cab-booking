<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <style>
        body {
            background-color: #ffffff; /* White background */
            color: #1E90FF; /* Light blue text */
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 50px;
        }
        
        h1 {
            font-size: 2.5em;
            margin-bottom: 30px;
        }

        .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 15px;
        }

        button {
            background-color: #1E90FF; /* Light blue */
            color: white;
            font-size: 18px;
            padding: 12px 25px;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            transition: 0.3s;
            width: 200px;
        }

        button:hover {
            background-color: #007BFF; /* Darker blue on hover */
        }
    </style>
</head>
<body>
    <h1>Welcome to the Home Page</h1>
    <div class="container">
        <form action="regstb" method="post">
            <button type="submit">All Customers</button>
        </form>

        <form action="vehiclestb" method="post">
            <button type="submit">All Vehicles</button>
        </form>

        <form action="driverstb" method="post">
            <button type="submit">All Drivers</button>
        </form>
    </div>
</body>
</html>
