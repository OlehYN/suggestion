package com.cw.recommendation.system.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "subject_id", unique = true, nullable = false)
	private Long subjectId;
	
	@Column(name = "name", unique = true, nullable = false, length = 100)
	private String name;

	@Column(name = "credits", nullable = false)
	private int credits;
	
	@Column(name = "year_of_study", nullable = false)
	private int yearOfStudy;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "subject_module", joinColumns = {
			@JoinColumn(name = "subject_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "module_id", nullable = false, updatable = false) })
	private Set<Module> subjectModules;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "studentSubjects")
	private Set<Student> subjectStudents;

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public Set<Student> getSubjectStudents() {
		return subjectStudents;
	}

	public void setSubjectStudents(Set<Student> subjectStudents) {
		this.subjectStudents = subjectStudents;
	}
	
	public Set<Module> getSubjectModules() {
		return subjectModules;
	}

	public void setSubjectModules(Set<Module> subjectModules) {
		this.subjectModules = subjectModules;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subjectId == null) ? 0 : subjectId.hashCode());
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
		Subject other = (Subject) obj;
		if (subjectId == null) {
			if (other.subjectId != null)
				return false;
		} else if (!subjectId.equals(other.subjectId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", name=" + name + ", credits=" + credits + ", yearOfStudy="
				+ yearOfStudy + ", subjectModules=" + subjectModules + "]";
	}

}
