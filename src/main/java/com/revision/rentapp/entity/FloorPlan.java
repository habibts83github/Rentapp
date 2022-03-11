package com.revision.rentapp.entity;

import javax.persistence.*;


@Entity
@Table(name="floorplans")
public class FloorPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="type")
	private String type;
	
	@Column(name="bed")
	private int bed;

	@Column(name="bath")
	private double bath;

	@Column(name="sqft")
	private int sqft;
	
	@Column(name="rent")
	private double rent;
}
