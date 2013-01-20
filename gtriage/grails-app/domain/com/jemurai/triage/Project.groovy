package com.jemurai.triage

class Project {
	String name
	String description
    static constraints = {
    	name(blank: false)
		description(blank: false)
	}
}
