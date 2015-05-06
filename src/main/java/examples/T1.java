package examples;

import java.util.logging.Logger;

public class T1 {
	public static final Logger LOG = Logger.getLogger("a.b.c");

	public static void main(String[] args) {
		LOG.severe(()-> "TESTING one twwo three!" );
	}
}
