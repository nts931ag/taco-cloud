package aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "aspectJ.Performance+", defaultImpl = Performence.class)
    public static Encoreable encoreable;
}
