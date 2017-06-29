package com.stackroute.asmsgreceiver.model;

public class AsMessage {
	private long messageid;
	private String circlename;
	private long circleid;
	private long senderid;
	private String msgtext;
	private long msgtype;
	
	public AsMessage() {
		
	}
	
	public AsMessage(long messageid, String circlename, long circleid, long senderid, String msgtext, long msgtype) {
		this.setMessageid(messageid);
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
		String info = String.format("{ 'messageid': %d, 'circlename': %s, 'circleid': %d, 'senderid': %d, 'msgtext': %s, 'msgtype': %d"
				+ "}", messageid, circlename, circleid, senderid, msgtext, msgtype );
		return info;
	}

	public long getMessageid() {
		return messageid;
	}

	public void setMessageid(long messageid) {
		this.messageid = messageid;
	}

}
