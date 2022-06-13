package com.chainsys.springproject.lifecycle;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitDesposeBean implements DisposableBean,InitializingBean{
	private String city;
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	private long pinCode;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesset method called");
	}
	//similar
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method called");
	}
	public InitDesposeBean()
	{
		System.out.println("InitDesposeBean object created : " +hashCode());
	}
	public void setUp()
	{
		System.out.println("Starting...");
	}
	public void close()
	{
		System.out.println("Closing...");
	}
	public void print()
	{
		System.out.println("cc");
	}
}
