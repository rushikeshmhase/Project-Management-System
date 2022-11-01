package com.yash.pms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
@AllArgsConstructor
public class AddProject {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int projectId;
	private String projectName;
	private String projectDescription;
	private String technology;
	private String erDiagram;
	private Date startDate;
	private Date endDate;
	private Date createdOn;
	private int team;
}
