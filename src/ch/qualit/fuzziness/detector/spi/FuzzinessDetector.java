package ch.qualit.fuzziness.detector.spi;

import java.util.List;

public interface FuzzinessDetector {
	public List<String> validate(String name);
}
