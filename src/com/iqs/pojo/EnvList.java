package com.iqs.pojo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EnvList {
	
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int env_id;
	private String env_name;
	//private Set<HostList> HostList = new HashSet<HostList>(0);
	
	@OneToMany(mappedBy="envlist",targetEntity=HostList.class)
    private Collection<HostList> hostlist;
    
    public EnvList(){
    	hostlist = new ArrayList<HostList>();
    }
	
	public int getEnv_id() {
		return env_id;
	}
	public void setEnv_id(int env_id) {
		this.env_id = env_id;
	}
	public String getEnv_name() {
		return env_name;
	}
	public void setEnv_name(String env_name) {
		this.env_name = env_name;
	}
	
	public Collection<HostList> getHostlist() {
		return hostlist;
	}
	public void setHostlist(Collection<HostList> hostlist) {
		this.hostlist = hostlist;
	}
	
	
	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "env_id")
	public Set<HostList> getHostList() {
		return HostList;
	}
	public void setHostList(Set<HostList> hostList) {
		HostList = hostList;
	}*/

}
