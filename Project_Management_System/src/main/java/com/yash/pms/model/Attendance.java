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
public class Attendance {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int attendanceId;
	private Date attenDate;
	private String statusOfDay;
	private int workDuration;
	private Date createdOn;
	private String attenSatus;
	private int employeeOfficialId;
}
