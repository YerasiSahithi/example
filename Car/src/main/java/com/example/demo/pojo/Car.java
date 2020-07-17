package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")

public class Car {
    @Id
    private String carid;

	  private int carname ;
	  private int cost;
	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + ", cost=" + cost + "]";
	}
	public Car(String carid, int carname, int cost) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.cost = cost;
	}
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public int getCarname() {
		return carname;
	}
	public void setCarname(int carname) {
		this.carname = carname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	  

}
