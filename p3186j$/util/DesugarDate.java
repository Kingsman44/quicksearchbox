package p3186j$.util;

import java.util.Date;
import p3186j$.time.Instant;

/* renamed from: j$.util.DesugarDate */
public final /* synthetic */ class DesugarDate {
    public static Date from(Instant instant) {
        try {
            return new Date(instant.toEpochMilli());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Instant toInstant(Date date) {
        return Instant.ofEpochMilli(date.getTime());
    }
}
