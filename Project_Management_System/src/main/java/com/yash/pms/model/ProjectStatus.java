package com.yash.pms.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class ProjectStatus {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int projectStatusId;
    @ManyToOne(fetch = FetchType.LAZY)
	private AddProject  projectId;
    
	private String projectStatus;
	
	
	
}
