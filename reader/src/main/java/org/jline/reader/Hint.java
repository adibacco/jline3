package org.jline.reader;

import java.util.Objects;

public class Hint extends Candidate {

	public Hint(String suggestion) {
		super("", suggestion, null, "", null, null, false);
	}
	public Hint(String suggestion, String description) {
		super("", suggestion, null, description, null, null, false);
	}
}

