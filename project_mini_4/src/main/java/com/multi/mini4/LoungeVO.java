package com.multi.mini4;

import java.sql.Timestamp;

public class LoungeVO {
	private int lounge_id;
    private char lounge_type;
    private String lounge_pet_type;
    private int lounge_user_id;
    private String lounge_title;
    private String lounge_content;
    private String lounge_writer;
    private String lounge_hashtag;
    private Timestamp lounge_create_date;
    
	public int getLounge_id() {
		return lounge_id;
	}
	public void setLounge_id(int lounge_id) {
		this.lounge_id = lounge_id;
	}
	public char getLounge_type() {
		return lounge_type;
	}
	public void setLounge_type(char lounge_type) {
		this.lounge_type = lounge_type;
	}
	public String getLounge_pet_type() {
		return lounge_pet_type;
	}
	public void setLounge_pet_type(String lounge_pet_type) {
		this.lounge_pet_type = lounge_pet_type;
	}
	public int getLounge_user_id() {
		return lounge_user_id;
	}
	public void setLounge_user_id(int lounge_user_id) {
		this.lounge_user_id = lounge_user_id;
	}
	public String getLounge_title() {
		return lounge_title;
	}
	public void setLounge_title(String lounge_title) {
		this.lounge_title = lounge_title;
	}
	public String getLounge_content() {
		return lounge_content;
	}
	public void setLounge_content(String lounge_content) {
		this.lounge_content = lounge_content;
	}
	public String getLounge_writer() {
		return lounge_writer;
	}
	public void setLounge_writer(String lounge_writer) {
		this.lounge_writer = lounge_writer;
	}
	public String getLounge_hashtag() {
		return lounge_hashtag;
	}
	public void setLounge_hashtag(String lounge_hashtag) {
		this.lounge_hashtag = lounge_hashtag;
	}
	public Timestamp getLounge_create_date() {
		return lounge_create_date;
	}
	public void setLounge_create_date(Timestamp lounge_create_date) {
		this.lounge_create_date = lounge_create_date;
	}

	@Override
	public String toString() {
		return "LoungeVO [lounge_id=" + lounge_id + ", lounge_type=" + lounge_type + ", lounge_pet_type="
				+ lounge_pet_type + ", lounge_user_id=" + lounge_user_id + ", lounge_title=" + lounge_title
				+ ", lounge_content=" + lounge_content + ", lounge_writer=" + lounge_writer + ", lounge_hashtag="
				+ lounge_hashtag + ", lounge_create_date=" + lounge_create_date + "]";
	}
    
    
    
    


}
