package p3186j$.time;

import com.evernote.android.state.BuildConfig;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.C41024o;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.Temporal;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.temporal.TemporalAdjuster;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.ValueRange;
import p3186j$.time.zone.C41028c;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.ZoneOffset */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, TemporalAdjuster, Comparable<ZoneOffset> {
    public static final ZoneOffset UTC = m71285t(0);

    /* renamed from: d */
    private static final ConcurrentHashMap f107267d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e */
    private static final ConcurrentHashMap f107268e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f */
    public static final ZoneOffset f107269f = m71285t(-64800);

    /* renamed from: g */
    public static final ZoneOffset f107270g = m71285t(64800);

    /* renamed from: b */
    private final int f107271b;

    /* renamed from: c */
    private final transient String f107272c;

    private ZoneOffset(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f107271b = i;
        if (i == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            if (i < 0) {
                str2 = "-";
            } else {
                str2 = "+";
            }
            sb.append(str2);
            if (i2 < 10) {
                str3 = "0";
            } else {
                str3 = BuildConfig.FLAVOR;
            }
            sb.append(str3);
            sb.append(i2);
            String str5 = ":0";
            if (i3 < 10) {
                str4 = str5;
            } else {
                str4 = ":";
            }
            sb.append(str4);
            sb.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb.append(i4 >= 10 ? ":" : str5);
                sb.append(i4);
            }
            str = sb.toString();
        }
        this.f107272c = str;
    }

    /* renamed from: p */
    public static ZoneOffset m71282p(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.mo43002l(C41022m.m71570d());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        String valueOf = String.valueOf(temporalAccessor);
        String name = temporalAccessor.getClass().getName();
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + valueOf + " of type " + name);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p3186j$.time.ZoneOffset m71283r(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            p3186j$.util.Objects.requireNonNull(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = f107268e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (p3186j$.time.ZoneOffset) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int r0 = r7.length()
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == r2) goto L_0x0064
            r2 = 3
            if (r0 == r2) goto L_0x0080
            r4 = 5
            if (r0 == r4) goto L_0x005b
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x0052
            r5 = 7
            if (r0 == r5) goto L_0x0045
            r2 = 9
            if (r0 != r2) goto L_0x0037
            int r0 = m71286u(r7, r3, r1)
            int r2 = m71286u(r7, r6, r3)
            int r3 = m71286u(r7, r5, r3)
            goto L_0x0086
        L_0x0037:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x0045:
            int r0 = m71286u(r7, r3, r1)
            int r2 = m71286u(r7, r2, r1)
            int r3 = m71286u(r7, r4, r1)
            goto L_0x0086
        L_0x0052:
            int r0 = m71286u(r7, r3, r1)
            int r2 = m71286u(r7, r6, r3)
            goto L_0x0085
        L_0x005b:
            int r0 = m71286u(r7, r3, r1)
            int r2 = m71286u(r7, r2, r1)
            goto L_0x0085
        L_0x0064:
            char r0 = r7.charAt(r1)
            char r7 = r7.charAt(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "0"
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
        L_0x0080:
            int r0 = m71286u(r7, r3, r1)
            r2 = 0
        L_0x0085:
            r3 = 0
        L_0x0086:
            char r1 = r7.charAt(r1)
            r4 = 43
            r5 = 45
            if (r1 == r4) goto L_0x00a1
            if (r1 != r5) goto L_0x0093
            goto L_0x00a1
        L_0x0093:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x00a1:
            if (r1 != r5) goto L_0x00ab
            int r7 = -r0
            int r0 = -r2
            int r1 = -r3
            j$.time.ZoneOffset r7 = m71284s(r7, r0, r1)
            return r7
        L_0x00ab:
            j$.time.ZoneOffset r7 = m71284s(r0, r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.ZoneOffset.m71283r(java.lang.String):j$.time.ZoneOffset");
    }

    /* renamed from: s */
    public static ZoneOffset m71284s(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        } else if (i3 < -59 || i3 > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        } else if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return m71285t((i2 * 60) + (i * 3600) + i3);
        } else {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    /* renamed from: t */
    public static ZoneOffset m71285t(int i) {
        if (i < -64800 || i > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % 900 != 0) {
            return new ZoneOffset(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentHashMap concurrentHashMap = f107267d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            f107268e.putIfAbsent(zoneOffset2.f107272c, zoneOffset2);
            return zoneOffset2;
        }
    }

    /* renamed from: u */
    private static int m71286u(CharSequence charSequence, int i, boolean z) {
        if (!z || charSequence.charAt(i - 1) == ':') {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
                throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: ".concat(String.valueOf(charSequence)));
            }
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: ".concat(String.valueOf(charSequence)));
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.mo43347b(this);
    }

    public final int compareTo(Object obj) {
        return ((ZoneOffset) obj).f107271b - this.f107271b;
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        return C40947a.m71099c(this, temporalField);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r4 = ((p3186j$.time.ZoneOffset) r4).f107271b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof p3186j$.time.ZoneOffset
            r2 = 0
            if (r1 == 0) goto L_0x0014
            j$.time.ZoneOffset r4 = (p3186j$.time.ZoneOffset) r4
            int r4 = r4.f107271b
            int r1 = r3.f107271b
            if (r1 != r4) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.ZoneOffset.equals(java.lang.Object):boolean");
    }

    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.f107271b;
        }
        if (!(temporalField instanceof ChronoField)) {
            return C40947a.m71099c(this, temporalField).mo43365a(temporalField, getLong(temporalField));
        }
        throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    public final String getId() {
        return this.f107272c;
    }

    public final long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return (long) this.f107271b;
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo43350g(this);
        }
        throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    /* renamed from: h */
    public final Temporal mo43001h(Temporal temporal) {
        return temporal.mo43043b(ChronoField.OFFSET_SECONDS, (long) this.f107271b);
    }

    public final int hashCode() {
        return this.f107271b;
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        return (nVar == C41022m.m71570d() || nVar == C41022m.m71572f()) ? this : C40947a.m71098b(this, nVar);
    }

    /* renamed from: n */
    public final C41028c mo43198n() {
        return C41028c.m71605j(this);
    }

    /* renamed from: q */
    public final int mo43201q() {
        return this.f107271b;
    }

    public final String toString() {
        return this.f107272c;
    }
}
