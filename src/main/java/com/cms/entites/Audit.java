package com.cms.entites;

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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Audit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private AuditSchedule auditSchedule;

	@ManyToOne
	@JoinColumn(name = "component_id")
	private StandardComponent component;

	@ManyToOne
	private SubComponent subComponent;

	private Integer status;

	private String remark;

	private FileDetails fileDetails;

	private Integer auditType;

}
