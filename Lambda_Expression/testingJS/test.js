<html>
	<head>
		<title>Scope of Variable</title>
		<script type="text/javascript">
		var car="ABC"
		
		document.write("<h2>"+car+"</h2>");
		
		var car1 = ["a","b","c"];
		car1.push("cd");
		for(var i=0;i<car1.length;i++)
		{
			document.write("<h1>"+car1[i]+"</h1>");
		}
		
		
		function test1()
		{
		document.write("<h1>this is function</h1>");
		}
		
		test1();

//objects

var run = {
brand : "abc",
price : 1234,

test : function()
{
document.write("<h1> inside object function</h1>");
}
};

document.write("<h6>"+run.brand+"</h6>");
		
		
	</script>
	</head>
</html>