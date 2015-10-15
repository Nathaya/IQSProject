package com.iqs.pojo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class ProjectList {
	
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int project_id;
	private String project_name;
	//private Set<UrlList> UrlList = new HashSet<UrlList>(0);
	@OneToMany(mappedBy="projectlist",targetEntity=UrlList.class)
    private Collection<UrlList> urllist;
	
    
    public ProjectList(){
    	urllist = new ArrayList<UrlList>();
    }
	
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public Collection<UrlList> getUrllist() {
		return urllist;
	}

	public void setUrllist(Collection<UrlList> urllist) {
		this.urllist = urllist;
	}
	

	
	
	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "project_id")
	public Set<UrlList> getUrlList() {
		return this.UrlList;
	}
	public void setUrlList(Set<UrlList> urlList) {
		UrlList = urlList;
	}*/
}
