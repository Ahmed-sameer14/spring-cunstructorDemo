package com.vco.spring.cunstructor.bean;

import java.io.Serializable;
import java.util.List;

public class Pen implements Serializable
{
	private int SerialNumber;
	private String brand;
	private String name;
	private double price;
	
	public Pen()
	{
		System.out.println(this.getClass().getSimpleName()+" Object created for empty constructor");
	}

	public Pen(int serialNumber, String brand, String name, double price) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created for with argument constructor");
		SerialNumber = serialNumber;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public int getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(int serialNumber) 
	{	
		System.out.println("inside setSearialNumber("+serialNumber+") "+this.getClass().getSimpleName());
		SerialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) 
	{
		System.out.println("inside setBarnd("+brand+") "+this.getClass().getSimpleName());
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		System.out.println("inside setName("+name+") "+this.getClass().getSimpleName());
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) 
	{
		System.out.println("inside setPrice("+price+") "+this.getClass().getSimpleName());
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Pen [SerialNumber=" + SerialNumber + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
	
}