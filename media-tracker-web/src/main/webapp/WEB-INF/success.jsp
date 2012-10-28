<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>New Media Successfully Created</title>
	</head>
	<body>
		<h1>Success!</h1>
		<p>
			Your new media item has been created: 
			<s:property value="media.title"/>
		</p>
	</body>
</html>