<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Home Page</title>

<!-- Import Bootstrap CSS from CDNs -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.9.1/bootstrap-table.min.css">
<link href="css/demo_css.css" rel="stylesheet" type="text/css" />

<script type="text/javascript"
	src="<%= request.getContextPath() %>/js/demo_js.js"></script>

</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a name="link1" href="javascript:doDBDataAjaxCall();">DB
							DATA</a></li>
					<li><a name="link2" href="javascript:doWeatherAjaxCall();">WEATHER
							DATA</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<!-- Import Bootstrap, Bootstrap Table and JQuery JS from CDNs -->
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.9.1/bootstrap-table.min.js"></script>

	<div id="left">
		<table id="WeatheTabId" style="background: #FFFFF; width: 300px"
			border="1">
			<tr>

			</tr>
		</table>
		<table>
			<tr>
				<td>&nbsp;</td>
			</tr>
		</table>
	</div>

	<div id="center">
		<table id="DBDataTabId" style="background: #FFFFF; width: 300px"
			border="1">
			<tr>

			</tr>
		</table>
		<table>
			<tr>
				<td>&nbsp;</td>
			</tr>
		</table>
	</div>

</body>
</html>