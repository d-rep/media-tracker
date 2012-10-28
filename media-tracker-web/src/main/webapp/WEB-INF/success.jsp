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
		
		<h1>Media List</h1>
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="mediaList">
				<tr>
					<td><s:property value="id"/></td>
					<td><s:property value="title"/></td>
				</tr>
				</s:iterator>
			</tbody>
		</table>
	</body>
</html>