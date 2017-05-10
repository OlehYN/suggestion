package com.cw.recommendation.system.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "module")
public class Module {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "module_id", unique = true, nullable = false)
	private Long moduleId;
	
	@Column(name = "name", unique = true, nullable = false, length = 100)
	private String name;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "courseModules")
	private Set<Course> moduleCourses;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "subjectModules")
	private Set<Subject> moduleSubjects;

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getModuleCourses() {
		return moduleCourses;
	}

	public void setModuleCourses(Set<Course> moduleCourses) {
		this.moduleCourses = moduleCourses;
	}

	public Set<Subject> getModuleSubjects() {
		return moduleSubjects;
	}

	public void setModuleSubjects(Set<Subject> moduleSubjects) {
		this.moduleSubjects = moduleSubjects;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((moduleId == null) ? 0 : moduleId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Module other = (Module) obj;
		if (moduleId == null) {
			if (other.moduleId != null)
				return false;
		} else if (!moduleId.equals(other.moduleId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Module [moduleId=" + moduleId + ", name=" + name + "]";
	}

}
