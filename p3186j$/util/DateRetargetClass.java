package p3186j$.util;

import java.util.Date;
import p3186j$.time.Instant;

/* renamed from: j$.util.DateRetargetClass */
public final /* synthetic */ class DateRetargetClass {
    public static /* synthetic */ Instant toInstant(Date date) {
        return date instanceof DateRetargetInterface ? ((DateRetargetInterface) date).toInstant() : DesugarDate.toInstant(date);
    }
}
