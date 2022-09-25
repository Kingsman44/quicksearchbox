package p3186j$.time;

import java.io.Serializable;
import java.util.regex.Pattern;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.temporal.TemporalAmount;
import p3186j$.util.List;
import p3186j$.util.Objects;

/* renamed from: j$.time.Period */
public final class Period implements TemporalAmount, Serializable {

    /* renamed from: d */
    public static final Period f107260d = new Period(0);

    /* renamed from: a */
    private final int f107261a = 0;

    /* renamed from: b */
    private final int f107262b = 0;

    /* renamed from: c */
    private final int f107263c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        List.CC.m71633d(ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS);
    }

    private Period(int i) {
        this.f107263c = i;
    }

    /* renamed from: e */
    private static void m71258e(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        C40961d dVar = (C40961d) temporalAccessor.mo43002l(C41022m.m71567a());
        if (dVar != null && !C40963f.f107281a.equals(dVar)) {
            throw new DateTimeException("Chronology mismatch, expected: ISO, actual: ISO");
        }
    }

    public static Period ofDays(int i) {
        return (i | 0) == 0 ? f107260d : new Period(i);
    }

    /* renamed from: a */
    public final int mo43181a() {
        return this.f107263c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.time.temporal.Temporal mo43005b(p3186j$.time.temporal.Temporal r6) {
        /*
            r5 = this;
            m71258e(r6)
            int r0 = r5.f107262b
            if (r0 != 0) goto L_0x000f
            int r0 = r5.f107261a
            if (r0 == 0) goto L_0x001f
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = p3186j$.time.temporal.ChronoUnit.YEARS
            goto L_0x001b
        L_0x000f:
            long r0 = r5.mo43182c()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            j$.time.temporal.ChronoUnit r2 = p3186j$.time.temporal.ChronoUnit.MONTHS
        L_0x001b:
            j$.time.temporal.Temporal r6 = r6.mo43048g(r0, r2)
        L_0x001f:
            int r0 = r5.f107263c
            if (r0 == 0) goto L_0x002a
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.temporal.Temporal r6 = r6.mo43048g(r0, r2)
        L_0x002a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.Period.mo43005b(j$.time.temporal.Temporal):j$.time.temporal.Temporal");
    }

    /* renamed from: c */
    public final long mo43182c() {
        return (((long) this.f107261a) * 12) + ((long) this.f107262b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.time.temporal.Temporal mo43008d(p3186j$.time.temporal.Temporal r6) {
        /*
            r5 = this;
            m71258e(r6)
            int r0 = r5.f107262b
            if (r0 != 0) goto L_0x000f
            int r0 = r5.f107261a
            if (r0 == 0) goto L_0x001f
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = p3186j$.time.temporal.ChronoUnit.YEARS
            goto L_0x001b
        L_0x000f:
            long r0 = r5.mo43182c()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            j$.time.temporal.ChronoUnit r2 = p3186j$.time.temporal.ChronoUnit.MONTHS
        L_0x001b:
            j$.time.temporal.Temporal r6 = r6.mo43054k(r0, r2)
        L_0x001f:
            int r0 = r5.f107263c
            if (r0 == 0) goto L_0x002a
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.temporal.Temporal r6 = r6.mo43054k(r0, r2)
        L_0x002a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.Period.mo43008d(j$.time.temporal.Temporal):j$.time.temporal.Temporal");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r5 = (p3186j$.time.Period) r5;
        r1 = r5.f107261a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p3186j$.time.Period
            r2 = 0
            if (r1 == 0) goto L_0x0020
            j$.time.Period r5 = (p3186j$.time.Period) r5
            int r1 = r5.f107261a
            int r3 = r4.f107261a
            if (r3 != r1) goto L_0x001e
            int r1 = r4.f107262b
            int r3 = r5.f107262b
            if (r1 != r3) goto L_0x001e
            int r1 = r4.f107263c
            int r5 = r5.f107263c
            if (r1 != r5) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            return r0
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.Period.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f107263c, 16) + Integer.rotateLeft(this.f107262b, 8) + this.f107261a;
    }

    public final String toString() {
        if (this == f107260d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.f107261a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f107262b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f107263c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
