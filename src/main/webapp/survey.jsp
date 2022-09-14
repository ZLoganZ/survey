<!DOCTYPE html>
<html>
    <meta charset="UTF-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="style/main.css" type="text/css"/>
    </head>

    <body>
        <img src="images/murachlogo.jpg" alt="logo" />
        <h1>
            Thanks for joining our survey!
        </h1>
        <p>
            Here is the information you entered:
        </p>

        <label>Email:</label>
        <span>
            ${user.email}
        </span><br>
        <label>First Name:</label>
        <span>
            ${user.firstName}
        </span><br>
        <label>Last Name:</label>
        <span>
            ${user.lastName}
        </span><br>
        <label>Date of Birth:</label>
        <span>
            ${user.doB}
        </span><br>
        <label>How did you hear about us:</label>
        <span>
            ${user.heardFrom}
        </span><br>

        <p>
            To enter another survey, click the Back button in your browser or the Return button shown below.
        </p>

        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    </body>
</html>