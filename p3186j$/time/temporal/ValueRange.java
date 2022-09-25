package p3186j$.time.temporal;

import java.io.Serializable;
import p3186j$.time.DateTimeException;

/* renamed from: j$.time.temporal.ValueRange */
public final class ValueRange implements Serializable {

    /* renamed from: a */
    private final long f107421a;

    /* renamed from: b */
    private final long f107422b;

    /* renamed from: c */
    private final long f107423c;

    /* renamed from: d */
    private final long f107424d;

    private ValueRange(long j, long j2, long j3, long j4) {
        this.f107421a = j;
        this.f107422b = j2;
        this.f107423c = j3;
        this.f107424d = j4;
    }

    /* renamed from: c */
    private String m71511c(TemporalField temporalField, long j) {
        if (temporalField != null) {
            String valueOf = String.valueOf(temporalField);
            String valueOf2 = String.valueOf(this);
            return "Invalid value for " + valueOf + " (valid values " + valueOf2 + "): " + j;
        }
        String valueOf3 = String.valueOf(this);
        return "Invalid value (valid values " + valueOf3 + "): " + j;
    }

    /* renamed from: h */
    public static ValueRange m71512h(long j, long j2) {
        if (j <= j2) {
            return new ValueRange(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: i */
    public static ValueRange m71513i(long j, long j2, long j3) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j2 > j3) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (1 <= j3) {
            return new ValueRange(j, 1, j2, j3);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    /* renamed from: j */
    public static ValueRange m71514j(long j, long j2) {
        return m71513i(1, j, j2);
    }

    /* renamed from: a */
    public final int mo43365a(TemporalField temporalField, long j) {
        boolean z;
        if (!mo43370f() || !mo43371g(j)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return (int) j;
        }
        throw new DateTimeException(m71511c(temporalField, j));
    }

    /* renamed from: b */
    public final void mo43366b(TemporalField temporalField, long j) {
        if (!mo43371g(j)) {
            throw new DateTimeException(m71511c(temporalField, j));
        }
    }

    /* renamed from: d */
    public final long mo43367d() {
        return this.f107424d;
    }

    /* renamed from: e */
    public final boolean mo43368e() {
        return this.f107421a == this.f107422b && this.f107423c == this.f107424d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueRange)) {
            return false;
        }
        ValueRange valueRange = (ValueRange) obj;
        return this.f107421a == valueRange.f107421a && this.f107422b == valueRange.f107422b && this.f107423c == valueRange.f107423c && this.f107424d == valueRange.f107424d;
    }

    /* renamed from: f */
    public final boolean mo43370f() {
        return getMinimum() >= -2147483648L && this.f107424d <= 2147483647L;
    }

    /* renamed from: g */
    public final boolean mo43371g(long j) {
        return j >= getMinimum() && j <= this.f107424d;
    }

    public long getMinimum() {
        return this.f107421a;
    }

    public final int hashCode() {
        long j = this.f107422b;
        long j2 = this.f107421a + (j << 16) + (j >> 48);
        long j3 = this.f107423c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.f107424d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.f107421a;
        sb.append(j);
        long j2 = this.f107422b;
        if (j != j2) {
            sb.append('/');
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.f107423c;
        sb.append(j3);
        long j4 = this.f107424d;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        return sb.toString();
    }
}
