package io.spring.workshop.tradingservice;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class TradingUser {

	@Id
	private String id;

	private String userName;

	private String fullName;

	public TradingUser() {
	}

	public TradingUser(String id, String userName, String fullName) {
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
	}

	public TradingUser(String userName, String fullName) {
		this.userName = userName;
		this.fullName = fullName;
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		TradingUser that = (TradingUser) o;

		if (!id.equals(that.id)) return false;
		return userName.equals(that.userName);
	}

	@Override
	public int hashCode() {
		int result = id.hashCode();
		result = 31 * result + userName.hashCode();
		return result;
	}
}

