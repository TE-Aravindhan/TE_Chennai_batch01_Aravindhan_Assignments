package com.te.assignments.throwkeyword;

public class FolderAlreadyExists extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FolderAlreadyExists(String mesg) {
		super(mesg);
	}
}
