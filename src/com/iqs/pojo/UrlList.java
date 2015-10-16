package com.iqs.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UrlList {

	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int uri_id;
	private String uri_name;
	
	@Column(nullable=false)
	private int project_id;
	//private String create_date;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date create_date;
	@Column(nullable=false)
	private int host_id;
	
	@ManyToOne
	  private ProjectList projectlist;
	@ManyToOne
	  private HostList hostlist;
	

	public int getUri_id() {
		return uri_id;
	}
	public void setUri_id(int uri_id) {
		this.uri_id = uri_id;
	}
	public String getUri_name() {
		return uri_name;
	}
	public void setUri_name(String uri_name) {
		this.uri_name = uri_name;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public int getHost_id() {
		return host_id;
	}
	public void setHost_id(int host_id) {
		this.host_id = host_id;
	}
	
	
	public ProjectList getProjectlist() {
		return projectlist;
	}
	public void setProjectlist(ProjectList projectlist) {
		this.projectlist = projectlist;
	}

	public HostList getHostlist() {
		return hostlist;
	}
	public void setHostlist(HostList hostlist) {
		this.hostlist = hostlist;
	}
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROJECT_ID", nullable = false)
	public ProjectList getProject_id() {
		return project_id;
	}
	public void setProject_id(ProjectList project_id) {
		this.project_id = project_id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HOST_ID", nullable = false)
	public HostList getHost_id() {
		return host_id;
	}
	public void setHost_id(HostList host_id) {
		this.host_id = host_id;
	}*/
	
	
}
