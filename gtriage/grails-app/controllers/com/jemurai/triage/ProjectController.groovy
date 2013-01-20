package com.jemurai.triage

class ProjectController {

	def scaffold = Project
	
	def list() {
	// http://localhost:8081/gtriage/project/list?field=name&query=AZ
	//  http://localhost:8081/gtriage/project/list?field=description%20is%20not%20null%20or%20name&query=AZ
			if (params.field && params.query){
	        	[projectInstanceList: Project.executeQuery("select p from Project p where " + 
						params.field + " = ?", [params.query] ),
			 			projectInstanceTotal: Project.count()]
			} else {
				[projectInstanceList: Project.list(),
  	 			projectInstanceTotal: Project.count()]
			
			}
 	}
}
