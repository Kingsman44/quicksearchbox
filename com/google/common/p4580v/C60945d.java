package com.google.common.p4580v;

import com.google.common.p4573p.C60718h;
import java.math.RoundingMode;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.common.v.d */
/* compiled from: PG */
public final class C60945d {

    /* renamed from: a */
    private static final Instant f165062a = Instant.ofEpochMilli(Long.MAX_VALUE);

    /* renamed from: b */
    private static final Instant f165063b = Instant.ofEpochMilli(Long.MIN_VALUE);

    /* renamed from: c */
    private static final long f165064c = Instant.MIN.getEpochSecond();

    /* renamed from: d */
    private static final long f165065d = Instant.MAX.getEpochSecond();

    static {
        m93099d(Long.MAX_VALUE);
        m93099d(Long.MIN_VALUE);
        m93101f(Long.MAX_VALUE);
        m93101f(Long.MIN_VALUE);
    }

    /* renamed from: a */
    public static long m93096a(Instant instant) {
        if (instant.getEpochSecond() < -9223372036854L) {
            return C60718h.m92647a(C60718h.m92648b(instant.getEpochSecond() + 1, 1000000), (long) ((instant.getNano() / 1000) - 1000000));
        }
        return C60718h.m92647a(C60718h.m92648b(instant.getEpochSecond(), 1000000), (long) (instant.getNano() / 1000));
    }

    /* renamed from: b */
    public static long m93097b(Instant instant) {
        if (instant.isAfter(f165062a)) {
            return Long.MAX_VALUE;
        }
        if (instant.isBefore(f165063b)) {
            return Long.MIN_VALUE;
        }
        return instant.toEpochMilli();
    }

    /* renamed from: c */
    public static long m93098c(Instant instant) {
        if (instant.getEpochSecond() < -9223372036L) {
            return C60718h.m92647a(C60718h.m92648b(instant.getEpochSecond() + 1, 1000000000), (long) (instant.getNano() - 1000000000));
        }
        return C60718h.m92647a(C60718h.m92648b(instant.getEpochSecond(), 1000000000), (long) instant.getNano());
    }

    /* renamed from: d */
    public static Instant m93099d(long j) {
        return Instant.ofEpochSecond(C60718h.m92650d(j, 1000000, RoundingMode.FLOOR), (long) (((int) C60718h.m92651e(j, 1000000)) * 1000));
    }

    /* renamed from: e */
    public static Instant m93100e(Instant instant, Duration duration) {
        long f = C60718h.m92652f(instant.getEpochSecond(), duration.getSeconds());
        int nano = instant.getNano() + duration.getNano();
        if (nano >= 1000000000) {
            nano -= 1000000000;
            f = C60718h.m92652f(f, 1);
        }
        if (f > f165065d) {
            return Instant.MAX;
        }
        if (f < f165064c) {
            return Instant.MIN;
        }
        return Instant.ofEpochSecond(f, (long) nano);
    }

    /* renamed from: f */
    public static void m93101f(long j) {
        Instant.ofEpochSecond(C60718h.m92650d(j, 1000000000, RoundingMode.FLOOR), (long) ((int) C60718h.m92651e(j, 1000000000)));
    }
}
