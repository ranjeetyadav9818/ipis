/**
 * Name: Apoorva Gupta
 * Copyright: Innobit Systems, 2021
 * Purpose: Train Status Entry Announcement Model
 */
package com.innobitsysytems.ipis.model.announcement;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="trainStatusAnnouncement")
@EntityListeners(AuditingEntityListener.class)

public class TrainStatusEntryAnnouncement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@Column(name="audioFile")
	private String audioFile;
	
	@Column(name="language")
	private String language;
	
	@Column(name="aord")
	private String aord;
	
	@NotBlank(message = "Status Code is mandatory")
	@Column(name = "statusCode")
    private  String statusCode;
	
	 @CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "createdAt", nullable = false)
	 private Date createdAt;

	 @Column(name = "createdBy", nullable = false)
	 @CreatedBy
	 private String createdBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(String audioFile) {
		this.audioFile = audioFile;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAord() {
		return aord;
	}

	public void setAord(String aord) {
		this.aord = aord;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "TrainStatusEntryAnnouncement [id=" + id + ", audioFile=" + audioFile + ", language=" + language
				+ ", aord=" + aord + ", statusCode=" + statusCode + ", createdAt=" + createdAt + ", createdBy="
				+ createdBy + "]";
	}
	 
	 

}
