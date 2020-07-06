package br.com.amsj.aws.dto.error;

public class ResponseErrorDto {
	
	public ResponseErrorDto(Integer httpStatusCode, String detail) {
		this.httpStatusCode = httpStatusCode;
		this.detail = detail;
	}
	
	Integer httpStatusCode;
	String detail;

	public Integer getHttpStatusCode() {
		return httpStatusCode;
	}

	public String getDetail() {
		return detail;
	}
}
