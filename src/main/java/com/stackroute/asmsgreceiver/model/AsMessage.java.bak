package com.stackroute.asmsgreceiver.model;

public class AsMessage {
	private String circlename;
	private long circleid;
	private long senderid;
	private String msgtext;
	private long msgtype;
	
	public AsMessage() {
		
	}
	
	public AsMessage(String circlename, long circleid, long senderid, String msgtext, long msgtype) {
		this.setCirclename(circlename);
		this.setCircleid(circleid);
		this.setSenderid(senderid);
		this.setMsgtext(msgtext);
		this.setMsgtype(msgtype);
	}

	public String getCirclename() {
		return circlename;
	}

	public void setCirclename(String circlename) {
		this.circlename = circlename;
	}

	public long getCircleid() {
		return circleid;
	}

	public void setCircleid(long circleid) {
		this.circleid = circleid;
	}

	public long getSenderid() {
		return senderid;
	}

	public void setSenderid(long senderid) {
		this.senderid = senderid;
	}

	public String getMsgtext() {
		return msgtext;
	}

	public void setMsgtext(String msgtext) {
		this.msgtext = msgtext;
	}

	public long getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(long msgtype) {
		this.msgtype = msgtype;
	}
	
	public String toString() {
		String info = String.format("{ 'circlename': %s, 'circleid': %d, 'senderid': %d, 'msgtext': %s, 'msgtype': %d"
				+ "}", circlename, circleid, senderid, msgtext, msgtype );
		return info;
	}

}
