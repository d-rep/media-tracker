<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Create New Media</title>
	</head>
	<body>
		<s:form action="addMedia">
			<s:textfield name="media.title" 
				label="Please enter a title"
				required="true"
				maxlength="50"
				size="50"
			/>
			<s:submit value="Create New Media"/>
		</s:form>
	</body>
</html>