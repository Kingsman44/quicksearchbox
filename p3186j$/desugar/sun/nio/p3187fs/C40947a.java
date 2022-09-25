package p3186j$.desugar.sun.nio.p3187fs;

import p3186j$.time.DateTimeException;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.C41024o;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.ValueRange;
import p3186j$.util.Objects;

/* renamed from: j$.desugar.sun.nio.fs.a */
public abstract /* synthetic */ class C40947a {
    /* renamed from: a */
    public static int m71097a(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        ValueRange e = temporalAccessor.mo42997e(temporalField);
        if (e.mo43370f()) {
            long j = temporalAccessor.getLong(temporalField);
            if (e.mo43371g(j)) {
                return (int) j;
            }
            String valueOf = String.valueOf(temporalField);
            String valueOf2 = String.valueOf(e);
            throw new DateTimeException("Invalid value for " + valueOf + " (valid values " + valueOf2 + "): " + j);
        }
        String valueOf3 = String.valueOf(temporalField);
        throw new C41024o("Invalid field " + valueOf3 + " for get() method, use getLong() instead");
    }

    /* renamed from: b */
    public static Object m71098b(TemporalAccessor temporalAccessor, C41023n nVar) {
        if (nVar == C41022m.m71573g() || nVar == C41022m.m71567a() || nVar == C41022m.m71571e()) {
            return null;
        }
        return nVar.mo43245a(temporalAccessor);
    }

    /* renamed from: c */
    public static ValueRange m71099c(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.mo43348d(temporalAccessor);
        } else if (temporalAccessor.mo42996a(temporalField)) {
            return temporalField.range();
        } else {
            throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    /* renamed from: d */
    public static /* synthetic */ int m71100d(int i, int i2) {
        int i3 = i % i2;
        if (i3 == 0) {
            return 0;
        }
        return (((i ^ i2) >> 31) | 1) > 0 ? i3 : i3 + i2;
    }

    /* renamed from: e */
    public static /* synthetic */ int m71101e(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 - i >= 2 && charSequence.charAt(i) == '+') {
            int i4 = i + 1;
            if (Character.digit(charSequence.charAt(i4), i3) >= 0) {
                i = i4;
            }
        }
        return Integer.parseInt(charSequence.subSequence(i, i2).toString(), i3);
    }

    /* renamed from: f */
    public static /* synthetic */ long m71102f(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    /* renamed from: g */
    public static /* synthetic */ void m71103g(Throwable th, Throwable th2) {
        Class<Throwable> cls = Throwable.class;
        try {
            cls.getDeclaredMethod("addSuppressed", new Class[]{cls}).invoke(th, new Object[]{th2});
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static /* synthetic */ long m71104h(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(-1 ^ j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(j ^ -1) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            boolean z = true;
            boolean z2 = j >= 0;
            if (j2 == Long.MIN_VALUE) {
                z = false;
            }
            if (z || z2) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    /* renamed from: i */
    public static /* synthetic */ long m71105i(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    /* renamed from: j */
    public static /* synthetic */ long m71106j(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        if (z2 || z) {
            return j3;
        }
        throw new ArithmeticException();
    }

    /* renamed from: k */
    public static /* synthetic */ long m71107k(long j, long j2) {
        long j3 = j - j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) >= 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        if (z2 || z) {
            return j3;
        }
        throw new ArithmeticException();
    }
}
