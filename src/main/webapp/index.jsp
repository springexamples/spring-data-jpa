<html>
<body>
	<h2>Add User</h2>

	<form action="AddUserServlet" method="post">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add User" /></td>
			</tr>
		</table>
	</form>

	<a href="ListUserServlet"> List All Users</a>
</body>
</html>


