package p3186j$.time;

import java.io.Serializable;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.C41024o;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.time.temporal.Temporal;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.temporal.TemporalAdjuster;
import p3186j$.time.temporal.TemporalAmount;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.TemporalUnit;
import p3186j$.time.temporal.ValueRange;
import p3186j$.util.Objects;

/* renamed from: j$.time.Instant */
public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);

    /* renamed from: a */
    private final long f107240a;

    /* renamed from: b */
    private final int f107241b;

    private Instant(long j, int i) {
        this.f107240a = j;
        this.f107241b = i;
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.getLong(ChronoField.INSTANT_SECONDS), (long) temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            String valueOf = String.valueOf(temporalAccessor);
            String name = temporalAccessor.getClass().getName();
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + valueOf + " of type " + name, e);
        }
    }

    /* renamed from: m */
    private static Instant m71144m(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    /* renamed from: n */
    private Instant m71145n(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(C40947a.m71106j(C40947a.m71106j(this.f107240a, j), j2 / 1000000000), ((long) this.f107241b) + (j2 % 1000000000));
    }

    public static Instant now() {
        return C40955a.f107276b.mo42992b();
    }

    /* renamed from: o */
    private long m71146o(Instant instant) {
        long k = C40947a.m71107k(instant.f107240a, this.f107240a);
        long j = (long) (instant.f107241b - this.f107241b);
        return (k <= 0 || j >= 0) ? (k >= 0 || j <= 0) ? k : k + 1 : k - 1;
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = (long) 1000;
        return m71144m(C40947a.m71102f(j, j2), ((int) C40947a.m71105i(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return m71144m(j, 0);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return m71144m(C40947a.m71106j(j, C40947a.m71102f(j2, 1000000000)), (int) C40947a.m71105i(j2, 1000000000));
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.mo43347b(this);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m71247o(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.m71294o(this, zoneId);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r6 != r4) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r6 != r4) goto L_0x0052;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.time.temporal.Temporal mo43043b(p3186j$.time.temporal.TemporalField r6, long r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p3186j$.time.temporal.ChronoField
            if (r0 == 0) goto L_0x0059
            r0 = r6
            j$.time.temporal.ChronoField r0 = (p3186j$.time.temporal.ChronoField) r0
            r0.mo43355l(r7)
            int[] r1 = p3186j$.time.C40965d.f107284a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            long r2 = r5.f107240a
            int r4 = r5.f107241b
            if (r0 == r1) goto L_0x004c
            r1 = 2
            if (r0 == r1) goto L_0x0046
            r1 = 3
            if (r0 == r1) goto L_0x003d
            r1 = 4
            if (r0 != r1) goto L_0x002b
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0057
            j$.time.Instant r6 = m71144m(r7, r4)
            goto L_0x005f
        L_0x002b:
            j$.time.temporal.o r7 = new j$.time.temporal.o
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r8 = "Unsupported field: "
            java.lang.String r6 = r8.concat(r6)
            r7.<init>(r6)
            throw r7
        L_0x003d:
            int r6 = (int) r7
            r7 = 1000000(0xf4240, float:1.401298E-39)
            int r6 = r6 * r7
            if (r6 == r4) goto L_0x0057
            goto L_0x0052
        L_0x0046:
            int r6 = (int) r7
            int r6 = r6 * 1000
            if (r6 == r4) goto L_0x0057
            goto L_0x0052
        L_0x004c:
            long r0 = (long) r4
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x0057
            int r6 = (int) r7
        L_0x0052:
            j$.time.Instant r6 = m71144m(r2, r6)
            goto L_0x005f
        L_0x0057:
            r6 = r5
            goto L_0x005f
        L_0x0059:
            j$.time.temporal.Temporal r6 = r6.mo43351h(r5, r7)
            j$.time.Instant r6 = (p3186j$.time.Instant) r6
        L_0x005f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.Instant.mo43043b(j$.time.temporal.TemporalField, long):j$.time.temporal.Temporal");
    }

    public int compareTo(Instant instant) {
        int i = (this.f107240a > instant.f107240a ? 1 : (this.f107240a == instant.f107240a ? 0 : -1));
        return i != 0 ? i : this.f107241b - instant.f107241b;
    }

    /* renamed from: d */
    public final Temporal mo43046d(LocalDate localDate) {
        return (Instant) localDate.mo43001h(this);
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        return C40947a.m71099c(this, temporalField);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f107240a == instant.f107240a && this.f107241b == instant.f107241b;
    }

    public int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return C40947a.m71099c(this, temporalField).mo43365a(temporalField, temporalField.mo43350g(this));
        }
        int i = C40965d.f107284a[((ChronoField) temporalField).ordinal()];
        int i2 = this.f107241b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            ChronoField.INSTANT_SECONDS.mo43354k(this.f107240a);
        }
        throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    public long getEpochSecond() {
        return this.f107240a;
    }

    public final long getLong(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo43350g(this);
        }
        int i2 = C40965d.f107284a[((ChronoField) temporalField).ordinal()];
        int i3 = this.f107241b;
        if (i2 == 1) {
            return (long) i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else if (i2 == 3) {
            i = i3 / 1000000;
        } else if (i2 == 4) {
            return this.f107240a;
        } else {
            throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return (long) i;
    }

    public int getNano() {
        return this.f107241b;
    }

    /* renamed from: h */
    public final Temporal mo43001h(Temporal temporal) {
        return temporal.mo43043b(ChronoField.INSTANT_SECONDS, this.f107240a).mo43043b(ChronoField.NANO_OF_SECOND, (long) this.f107241b);
    }

    public int hashCode() {
        long j = this.f107240a;
        return (this.f107241b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    /* renamed from: k */
    public final Temporal mo43054k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? mo43048g(Long.MAX_VALUE, chronoUnit).mo43048g(1, chronoUnit) : mo43048g(-j, chronoUnit);
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        if (nVar == C41022m.m71571e()) {
            return ChronoUnit.NANOS;
        }
        if (nVar == C41022m.m71567a() || nVar == C41022m.m71573g() || nVar == C41022m.m71572f() || nVar == C41022m.m71570d() || nVar == C41022m.m71568b() || nVar == C41022m.m71569c()) {
            return null;
        }
        return nVar.mo43245a(this);
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.mo43008d(this);
    }

    public Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1) : plusMillis(-j);
    }

    public Instant minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1) : plusNanos(-j);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1) : plusSeconds(-j);
    }

    /* renamed from: plus */
    public Instant mo43048g(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.mo43358b(this, j);
        }
        switch (C40965d.f107285b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return m71145n(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusSeconds(C40947a.m71104h(j, (long) 60));
            case 6:
                return plusSeconds(C40947a.m71104h(j, (long) 3600));
            case 7:
                return plusSeconds(C40947a.m71104h(j, (long) 43200));
            case 8:
                return plusSeconds(C40947a.m71104h(j, (long) 86400));
            default:
                throw new C41024o("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.mo43005b(this);
    }

    public Instant plusMillis(long j) {
        return m71145n(j / 1000, (j % 1000) * 1000000);
    }

    public Instant plusNanos(long j) {
        return m71145n(0, j);
    }

    public Instant plusSeconds(long j) {
        return m71145n(j, 0);
    }

    public long toEpochMilli() {
        long h;
        int i;
        int i2 = this.f107241b;
        long j = this.f107240a;
        if (j >= 0 || i2 <= 0) {
            h = C40947a.m71104h(j, (long) 1000);
            i = i2 / 1000000;
        } else {
            h = C40947a.m71104h(j + 1, (long) 1000);
            i = (i2 / 1000000) - 1000;
        }
        return C40947a.m71106j(h, (long) i);
    }

    public String toString() {
        return DateTimeFormatter.f107305j.format(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() <= 86400) {
            long nanos = duration.toNanos();
            if (86400000000000L % nanos == 0) {
                long j = ((this.f107240a % 86400) * 1000000000) + ((long) this.f107241b);
                return plusNanos((C40947a.m71102f(j, nanos) * nanos) - j);
            }
            throw new C41024o("Unit must divide into a standard day without remainder");
        }
        throw new C41024o("Unit is too large to be used for truncation");
    }

    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Instant from = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, from);
        }
        int i = C40965d.f107285b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.f107241b;
        long j = this.f107240a;
        switch (i) {
            case 1:
                return C40947a.m71106j(C40947a.m71104h(C40947a.m71107k(from.f107240a, j), 1000000000), (long) (from.f107241b - i2));
            case 2:
                return C40947a.m71106j(C40947a.m71104h(C40947a.m71107k(from.f107240a, j), 1000000000), (long) (from.f107241b - i2)) / 1000;
            case 3:
                return C40947a.m71107k(from.toEpochMilli(), toEpochMilli());
            case 4:
                return m71146o(from);
            case 5:
                return m71146o(from) / 60;
            case 6:
                return m71146o(from) / 3600;
            case 7:
                return m71146o(from) / 43200;
            case 8:
                return m71146o(from) / 86400;
            default:
                throw new C41024o("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
