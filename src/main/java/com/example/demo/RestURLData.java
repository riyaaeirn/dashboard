package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("resturl")
public class RestURLData {

	private String artUrl;
	private String volUrl;
	private String artSel;
	private String volSel;
	private String topConsumerUrl;
	private String appID;
	private String topConsumerSel;
	private String epmUrl;
	private String expmUrl;
	private String hecpmUrl;
	private String cpuUrl;
	private String memUrl;
	public String getArtUrl() {
		return artUrl;
	}
	public void setArtUrl(String artUrl) {
		this.artUrl = artUrl;
	}
	public String getVolUrl() {
		return volUrl;
	}
	public void setVolUrl(String volUrl) {
		this.volUrl = volUrl;
	}
	public String getArtSel() {
		return artSel;
	}
	public void setArtSel(String artSel) {
		this.artSel = artSel;
	}
	public String getVolSel() {
		return volSel;
	}
	public void setVolSel(String volSel) {
		this.volSel = volSel;
	}
	public String getTopConsumerUrl() {
		return topConsumerUrl;
	}
	public void setTopConsumerUrl(String topConsumerUrl) {
		this.topConsumerUrl = topConsumerUrl;
	}
	public String getAppID() {
		return appID;
	}
	public void setAppID(String appID) {
		this.appID = appID;
	}
	public String getTopConsumerSel() {
		return topConsumerSel;
	}
	public void setTopConsumerSel(String topConsumerSel) {
		this.topConsumerSel = topConsumerSel;
	}
	public String getEpmUrl() {
		return epmUrl;
	}
	public void setEpmUrl(String epmUrl) {
		this.epmUrl = epmUrl;
	}
	public String getExpmUrl() {
		return expmUrl;
	}
	public void setExpmUrl(String expmUrl) {
		this.expmUrl = expmUrl;
	}
	public String getHecpmUrl() {
		return hecpmUrl;
	}
	public void setHecpmUrl(String hecpmUrl) {
		this.hecpmUrl = hecpmUrl;
	}
	public String getCpuUrl() {
		return cpuUrl;
	}
	public void setCpuUrl(String cpuUrl) {
		this.cpuUrl = cpuUrl;
	}
	public String getMemUrl() {
		return memUrl;
	}
	public void setMemUrl(String memUrl) {
		this.memUrl = memUrl;
	}
	@Override
	public String toString() {
		return "RestURLData [artUrl=" + artUrl + ", volUrl=" + volUrl + ", artSel=" + artSel + ", volSel=" + volSel
				+ ", topConsumerUrl=" + topConsumerUrl + ", appID=" + appID + ", topConsumerSel=" + topConsumerSel
				+ ", epmUrl=" + epmUrl + ", expmUrl=" + expmUrl + ", hecpmUrl=" + hecpmUrl + ", cpuUrl=" + cpuUrl
				+ ", memUrl=" + memUrl + "]";
	}
	
}
