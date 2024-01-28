<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>ONLINE BANKING</title>
  <style>
    body {
      background-color: pink;
      color: #fff;
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100vh;
    }

    form {
      max-width: 400px;
      padding: 20px;
      background-color: rgba(52, 73, 94, 0.8); /* Background color with some transparency */
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
      text-align: center;
    }

    h1 {
      color: #3498db;
    }

    a {
      text-decoration: none;
      padding: 10px 20px;
      margin: 10px;
      border-radius: 5px;
      display: inline-block;
      transition: background-color 0.3s;
    }

    a[href="/newacount"] {
      color: #3498db;
    }

    a[href="/balance"] {
      color: #2ecc71;
    }

    a[href="/deposite"] {
      color: #f39c12;
    }

    a[href="/withdraw"] {
      color: #e74c3c;
    }

    a[href="/transfer"] {
      color: #9b59b6;
    }

    a[href="/close"] {
      color: #ecf0f1;
    }

    a[href="/about"] {
      color: #16a085;
    }

    a:hover {
      background-color: #2c3e50;
    }
  </style>
</head>

<body>
  <form>
    <h1>ONLINE BANKING SYSTEM</h1>
    <a href="/newacount">New account</a>
    <a href="/balance">BALANCE</a>
    <a href="/deposite">DEPOSIT</a>
    <a href="/withdraw">WITHDRAW</a>
    <a href="/transfer">TRANSFER</a>
    <a href="/close">CLOSE A/C</a>
    <a href="/about">ABOUT US</a>
  </form>
</body>

</html>
