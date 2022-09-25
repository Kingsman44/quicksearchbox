package com.google.common.p4580v;

import com.google.common.base.C58838bb;
import com.google.common.p4573p.C60713c;
import com.google.common.p4573p.C60718h;
import java.math.RoundingMode;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.common.v.c */
/* compiled from: PG */
public final class C60944c {

    /* renamed from: a */
    static final Duration f165055a;

    /* renamed from: b */
    public static final Duration f165056b = Duration.ofSeconds(Long.MAX_VALUE, 999999999);

    /* renamed from: c */
    private static final double f165057c;

    /* renamed from: d */
    private static final Duration f165058d = Duration.ofMillis(Long.MAX_VALUE);

    /* renamed from: e */
    private static final Duration f165059e = Duration.ofMillis(Long.MIN_VALUE);

    /* renamed from: f */
    private static final Duration f165060f = Duration.ofNanos(Long.MAX_VALUE);

    /* renamed from: g */
    private static final Duration f165061g = Duration.ofNanos(Long.MIN_VALUE);

    static {
        Duration ofSeconds = Duration.ofSeconds(Long.MIN_VALUE);
        f165055a = ofSeconds;
        f165057c = (double) ofSeconds.getSeconds();
        Duration.m71141of(Long.MAX_VALUE, ChronoUnit.MICROS);
        Duration.m71141of(Long.MIN_VALUE, ChronoUnit.MICROS);
    }

    /* renamed from: a */
    public static double m93088a(Duration duration) {
        double seconds = (double) duration.getSeconds();
        double nano = (double) duration.getNano();
        Double.isNaN(nano);
        Double.isNaN(seconds);
        return seconds + (nano / 1.0E9d);
    }

    /* renamed from: b */
    public static long m93089b(Duration duration) {
        if (duration.getSeconds() < -9223372036854L) {
            return C60718h.m92647a(C60718h.m92648b(duration.getSeconds() + 1, 1000000), (long) ((duration.getNano() / 1000) - 1000000));
        }
        return C60718h.m92647a(C60718h.m92648b(duration.getSeconds(), 1000000), (long) (duration.getNano() / 1000));
    }

    /* renamed from: c */
    public static long m93090c(Duration duration) {
        if (duration.compareTo(f165058d) >= 0) {
            return Long.MAX_VALUE;
        }
        if (duration.compareTo(f165059e) <= 0) {
            return Long.MIN_VALUE;
        }
        try {
            return duration.toMillis();
        } catch (ArithmeticException unused) {
            if (duration.isNegative()) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
    }

    /* renamed from: d */
    public static long m93091d(Duration duration) {
        if (duration.compareTo(f165060f) >= 0) {
            return Long.MAX_VALUE;
        }
        if (duration.compareTo(f165061g) <= 0) {
            return Long.MIN_VALUE;
        }
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            if (duration.isNegative()) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
    }

    /* renamed from: e */
    public static Duration m93092e(long j) {
        return Duration.m71141of(j, ChronoUnit.MICROS);
    }

    /* renamed from: f */
    public static Duration m93093f(double d) {
        if (d >= 9.223372036854776E18d) {
            return f165056b;
        }
        if (d <= f165057c) {
            return f165055a;
        }
        long b = C60713c.m92640b(d, RoundingMode.FLOOR);
        double d2 = (double) b;
        Double.isNaN(d2);
        return Duration.ofSeconds(b, C60713c.m92640b((d - d2) * 1.0E9d, RoundingMode.FLOOR));
    }

    /* renamed from: g */
    public static boolean m93094g(Duration duration) {
        return !duration.isNegative() && !duration.isZero();
    }

    /* renamed from: h */
    public static void m93095h(Duration duration) {
        C58838bb.m90873h(!duration.isNegative(), "duration (%s) must not be negative", duration);
    }
}
