package com.caesarcipher.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DecipherAPIResponse {

	@JsonProperty("code")
	private String code;

	@JsonProperty("score")
	private int score;

	@JsonProperty("decipher")
	private String decipher;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getDecipher() {
		return decipher;
	}

	public void setDecipher(String decipher) {
		this.decipher = decipher;
	}
}
