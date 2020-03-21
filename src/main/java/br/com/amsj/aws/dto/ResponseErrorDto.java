package br.com.amsj.aws.dto;

public class ResponseErrorDto {
	
	String httpStatus = "500";
	String detail = "Error";

	 public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
