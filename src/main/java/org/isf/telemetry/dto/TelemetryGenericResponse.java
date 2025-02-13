package org.isf.telemetry.dto;


public class TelemetryGenericResponse<T> {

	private boolean success;
	private T result;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}




}
