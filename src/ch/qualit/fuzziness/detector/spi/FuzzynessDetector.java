package ch.qualit.fuzziness.detector.spi;

import java.util.List;

public interface FuzzynessDetector {
	public List<String> validate(String name);
}
