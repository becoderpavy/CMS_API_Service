package com.cms.entites;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class AuditSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Company company;

	@ManyToOne
	private Department department;

	@ManyToOne
	@JoinColumn(name = "operation_id")
	private OperationType operationType;

	@ManyToOne
	private Project project;

	private String version;

	@ManyToOne
	private User user;

	private Date scheduleDate;

	private Date startDate;

	private Date endDate;

	private Boolean isAudit;

	private Boolean isCompliance;

}
