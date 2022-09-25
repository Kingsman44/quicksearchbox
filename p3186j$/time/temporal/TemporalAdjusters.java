package p3186j$.time.temporal;

import p3186j$.time.DayOfWeek;

/* renamed from: j$.time.temporal.TemporalAdjusters */
public final class TemporalAdjusters {
    public static TemporalAdjuster next(DayOfWeek dayOfWeek) {
        return new C41020k(dayOfWeek.getValue(), 1);
    }
}
