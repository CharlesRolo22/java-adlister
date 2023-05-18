
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>

<form action="/pizza-order" method="post">
    <label for="crust">Crust Type:</label>
    <select id="crust" name="crust">
        <option value="thin">Thin Crust</option>
        <option value="thick">Thick Crust</option>
        <option value="deep-dish">Deep Dish</option>
    </select><br><br>

    <label for="sauce">Sauce Type:</label>
    <select id="sauce" name="sauce">
        <option value="tomato">Tomato Sauce</option>
        <option value="barbecue">Barbecue Sauce</option>
        <option value="garlic">Garlic Sauce</option>
    </select><br><br>

    <label for="size">Size Type:</label>
    <select id="size" name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select><br><br>

    <label>Toppings:</label><br>
    <input type="checkbox" name="toppings" value="pepperoni"> Pepperoni<br>
    <input type="checkbox" name="toppings" value="mushrooms"> Mushrooms<br>
    <input type="checkbox" name="toppings" value="onions"> Onions<br>
    <input type="checkbox" name="toppings" value="sausage"> Sausage<br><br>

    <label for="address">Delivery Address:</label>
    <input type="text" id="address" name="address" required><br><br>

    <input type="submit" value="Place Order">
</form>
</body>
</html>
