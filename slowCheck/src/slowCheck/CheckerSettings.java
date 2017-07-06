package slowCheck;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author peter
 */
public class CheckerSettings {
  public static final CheckerSettings DEFAULT_SETTINGS = new CheckerSettings(100, null);
  final int iterationCount;
  @Nullable final Long randomSeed;

  private CheckerSettings(int iterationCount, @Nullable Long randomSeed) {
    this.iterationCount = iterationCount;
    this.randomSeed = randomSeed;
  }

  @NotNull
  public CheckerSettings withSeed(long randomSeed) {
    return new CheckerSettings(iterationCount, randomSeed);
  }

  @NotNull
  public CheckerSettings withIterationCount(int iterationCount) {
    return new CheckerSettings(iterationCount, randomSeed);
  }
}
