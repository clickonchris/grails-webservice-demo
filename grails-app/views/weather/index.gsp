<html>
    <head>
        <title>Welcome to Grails</title>
        <meta name="layout" content="main" />
    </head>
    <body>
    
    <h1>Temperature Converter</h1>
    <div class="body">
    

        <form action="index">
                Convert degrees
		        <input type="text" name="value" />
		        From
        	<select name="from">
        		<option value="Farenheight">F to C</option>
        		<option value="Celcius">C to F</option>
        	</select>
        	
        	<input type="submit" />
        </form>
        
         <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
         </g:if>
        
    </div>
    
    </body>
    
</html>