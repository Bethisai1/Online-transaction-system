<center>
<body bgcolor="pink">
    <h1 style="color:red">TRANSFER AMOUNT</h1>

    <form action="/trans" method="GET">
        <a href="/newacount" >New account </a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/balance" >BALANCE </a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/deposite" >DEPOSIT </a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/withdraw" >WITHDRAW </a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/transfer" >TRANSFER </a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/close" >CLOSE A/C </a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/about" >ABOUT US</a>
        <br><br>
        Accountno<input type="text" name="accountno"><br><br>
        Name<input type="text" name="name"><br><br>
        Password<input type="text" name="password"><br><br>
        TARGET ACCOUNTNO<input type="text" name="targetAccountNo"><br><br> <!-- Corrected the parameter name -->
        Amount<input type="text" name="amount"><br><br>
        <label for="mobileNumber">Mobile Number:</label>
        <input type="text" id="mobileNumber" name="mobileNumber" required>

        <input type="submit" value="formsubmit"/>
    </form>
    </body>
</center>
