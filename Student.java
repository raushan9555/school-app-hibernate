package com.ty.school.dto;
	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Student {
		@Id
		private int rol;
		private String name;
		private double percentage;
		public int getRol() {
			return rol;
		}
		public void setRol(int rol) {
			this.rol = rol;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPercentage() {
			return percentage;
		}
		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}

	}

