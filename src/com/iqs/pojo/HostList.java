package com.iqs.pojo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class HostList {

	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int host_id;
	private String host_name;
	private String port;
	
	@Column(nullable=false)
	private int env_id;
	
	@ManyToOne
	  private EnvList envlist;
	 
	
	@OneToMany(mappedBy="hostlist",targetEntity=UrlList.class)
    private Collection<UrlList> urllist;
	
    
    public HostList(){
    	urllist = new ArrayList<UrlList>();
    }
	//private Set<UrlList> UrlList = new HashSet<UrlList>(0);
	
	
	
	public int getHost_id() {
		return host_id;
	}
	public void setHost_id(int host_id) {
		this.host_id = host_id;
	}
	public String getHost_name() {
		return host_name;
	}
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public int getEnv_id() {
		return env_id;
	}
	public void setEnv_id(int env_id) {
		this.env_id = env_id;
	}
	
	
	public EnvList getEnvlist() {
		return envlist;
	}
	public void setEnvlist(EnvList envlist) {
		this.envlist = envlist;
	}

	public Collection<UrlList> getUrllist() {
		return urllist;
	}
	public void setUrllist(Collection<UrlList> urllist) {
		this.urllist = urllist;
	}
	
	
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ENV_ID", nullable = false)
	public EnvList getEnv_id() {
		return env_id;
	}
	public void setEnv_id(EnvList env_id) {
		this.env_id = env_id;
	}*/
	
	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "host_id")
	public Set<UrlList> getUrlList() {
		return UrlList;
	}
	public void setUrlList(Set<UrlList> urlList) {
		UrlList = urlList;
	}*/
	
	
}
