import com.jemurai.triage.Project

class BootStrap {

    def init = { servletContext ->
		if (!Project.count()) { 
			new Project(name: "Triage", description: "Testing").save(failOnError: true)
			
		 } 
	}
	
	def destroy = {
    }
}
