package p3186j$.time;

import com.evernote.android.state.BuildConfig;
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
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.TemporalUnit;
import p3186j$.time.temporal.ValueRange;
import p3186j$.util.Objects;

/* renamed from: j$.time.LocalTime */
public final class LocalTime implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX = new LocalTime(23, 59, 59, 999999999);

    /* renamed from: e */
    public static final LocalTime f107249e;

    /* renamed from: f */
    public static final LocalTime f107250f;

    /* renamed from: g */
    private static final LocalTime[] f107251g = new LocalTime[24];

    /* renamed from: a */
    private final byte f107252a;

    /* renamed from: b */
    private final byte f107253b;

    /* renamed from: c */
    private final byte f107254c;

    /* renamed from: d */
    private final int f107255d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = f107251g;
            if (i < localTimeArr.length) {
                localTimeArr[i] = new LocalTime(i, 0, 0, 0);
                i++;
            } else {
                LocalTime localTime = localTimeArr[0];
                f107250f = localTime;
                LocalTime localTime2 = localTimeArr[12];
                f107249e = localTime;
                return;
            }
        }
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.f107252a = (byte) i;
        this.f107253b = (byte) i2;
        this.f107254c = (byte) i3;
        this.f107255d = i4;
    }

    public static LocalTime from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.mo43002l(C41022m.m71569c());
        if (localTime != null) {
            return localTime;
        }
        String valueOf = String.valueOf(temporalAccessor);
        String name = temporalAccessor.getClass().getName();
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + valueOf + " of type " + name);
    }

    /* renamed from: m */
    private static LocalTime m71209m(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f107251g[i] : new LocalTime(i, i2, i3, i4);
    }

    /* renamed from: n */
    private int m71210n(TemporalField temporalField) {
        int i = C41003h.f107403a[((ChronoField) temporalField).ordinal()];
        byte b = this.f107253b;
        int i2 = this.f107255d;
        byte b2 = this.f107252a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new C41024o("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new C41024o("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (mo43165w() / 1000000);
            case 7:
                return this.f107254c;
            case 8:
                return mo43166x();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    public static LocalTime now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant b = clock.mo42992b();
        ZoneId a = clock.mo42991a();
        Objects.requireNonNull(b, "instant");
        Objects.requireNonNull(a, "zone");
        return m71214q((((long) ((int) C40947a.m71105i(b.getEpochSecond() + ((long) a.mo43198n().mo43405d(b).mo43201q()), (long) 86400))) * 1000000000) + ((long) b.getNano()));
    }

    /* renamed from: of */
    public static LocalTime m71211of(int i, int i2) {
        ChronoField.HOUR_OF_DAY.mo43355l((long) i);
        if (i2 == 0) {
            return f107251g[i];
        }
        ChronoField.MINUTE_OF_HOUR.mo43355l((long) i2);
        return new LocalTime(i, i2, 0, 0);
    }

    /* renamed from: of */
    public static LocalTime m71212of(int i, int i2, int i3) {
        ChronoField.HOUR_OF_DAY.mo43355l((long) i);
        if ((i2 | i3) == 0) {
            return f107251g[i];
        }
        ChronoField.MINUTE_OF_HOUR.mo43355l((long) i2);
        ChronoField.SECOND_OF_MINUTE.mo43355l((long) i3);
        return new LocalTime(i, i2, i3, 0);
    }

    /* renamed from: of */
    public static LocalTime m71213of(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.mo43355l((long) i);
        ChronoField.MINUTE_OF_HOUR.mo43355l((long) i2);
        ChronoField.SECOND_OF_MINUTE.mo43355l((long) i3);
        ChronoField.NANO_OF_SECOND.mo43355l((long) i4);
        return m71209m(i, i2, i3, i4);
    }

    public static LocalTime ofSecondOfDay(long j) {
        ChronoField.SECOND_OF_DAY.mo43355l(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return m71209m(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    public static LocalTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f107303h;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.mo43262f(charSequence, new C40966e(1));
    }

    /* renamed from: q */
    public static LocalTime m71214q(long j) {
        ChronoField.NANO_OF_DAY.mo43355l(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m71209m(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    /* renamed from: A */
    public final LocalTime mo43144A(int i) {
        if (this.f107253b == i) {
            return this;
        }
        ChronoField.MINUTE_OF_HOUR.mo43355l((long) i);
        return m71209m(this.f107252a, i, this.f107254c, this.f107255d);
    }

    /* renamed from: B */
    public final LocalTime mo43145B(int i) {
        if (this.f107255d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.mo43355l((long) i);
        return m71209m(this.f107252a, this.f107253b, this.f107254c, i);
    }

    /* renamed from: C */
    public final LocalTime mo43146C(int i) {
        if (this.f107254c == i) {
            return this;
        }
        ChronoField.SECOND_OF_MINUTE.mo43355l((long) i);
        return m71209m(this.f107252a, this.f107253b, i, this.f107255d);
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField.isTimeBased() : temporalField != null && temporalField.mo43347b(this);
    }

    public LocalDateTime atDate(LocalDate localDate) {
        return LocalDateTime.m71182o(localDate, this);
    }

    public int compareTo(LocalTime localTime) {
        int i;
        int i2;
        int i3;
        byte b = localTime.f107252a;
        int i4 = -1;
        byte b2 = this.f107252a;
        if (b2 == b) {
            i = 0;
        } else if (b2 < b) {
            i = -1;
        } else {
            i = 1;
        }
        if (i != 0) {
            return i;
        }
        byte b3 = this.f107253b;
        byte b4 = localTime.f107253b;
        if (b3 == b4) {
            i2 = 0;
        } else if (b3 < b4) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (i2 != 0) {
            return i2;
        }
        byte b5 = this.f107254c;
        byte b6 = localTime.f107254c;
        if (b5 == b6) {
            i3 = 0;
        } else if (b5 < b6) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        if (i3 != 0) {
            return i3;
        }
        int i5 = this.f107255d;
        int i6 = localTime.f107255d;
        if (i5 == i6) {
            i4 = 0;
        } else if (i5 >= i6) {
            i4 = 1;
        }
        return i4;
    }

    /* renamed from: d */
    public final Temporal mo43046d(LocalDate localDate) {
        boolean z = localDate instanceof LocalTime;
        TemporalAccessor temporalAccessor = localDate;
        if (!z) {
            temporalAccessor = localDate.mo43001h(this);
        }
        return (LocalTime) temporalAccessor;
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        return C40947a.m71099c(this, temporalField);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r5 = (p3186j$.time.LocalTime) r5;
        r1 = r5.f107252a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p3186j$.time.LocalTime
            r2 = 0
            if (r1 == 0) goto L_0x0026
            j$.time.LocalTime r5 = (p3186j$.time.LocalTime) r5
            byte r1 = r5.f107252a
            byte r3 = r4.f107252a
            if (r3 != r1) goto L_0x0024
            byte r1 = r4.f107253b
            byte r3 = r5.f107253b
            if (r1 != r3) goto L_0x0024
            byte r1 = r4.f107254c
            byte r3 = r5.f107254c
            if (r1 != r3) goto L_0x0024
            int r1 = r4.f107255d
            int r5 = r5.f107255d
            if (r1 != r5) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            return r0
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.LocalTime.equals(java.lang.Object):boolean");
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? m71210n(temporalField) : C40947a.m71097a(this, temporalField);
    }

    public int getHour() {
        return this.f107252a;
    }

    public final long getLong(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.NANO_OF_DAY ? mo43165w() : temporalField == ChronoField.MICRO_OF_DAY ? mo43165w() / 1000 : (long) m71210n(temporalField) : temporalField.mo43350g(this);
    }

    public int getMinute() {
        return this.f107253b;
    }

    /* renamed from: h */
    public final Temporal mo43001h(Temporal temporal) {
        return temporal.mo43043b(ChronoField.NANO_OF_DAY, mo43165w());
    }

    public final int hashCode() {
        long w = mo43165w();
        return (int) (w ^ (w >>> 32));
    }

    public boolean isAfter(LocalTime localTime) {
        return compareTo(localTime) > 0;
    }

    public boolean isBefore(LocalTime localTime) {
        return compareTo(localTime) < 0;
    }

    /* renamed from: k */
    public final Temporal mo43054k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? mo43048g(Long.MAX_VALUE, chronoUnit).mo43048g(1, chronoUnit) : mo43048g(-j, chronoUnit);
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        if (nVar == C41022m.m71567a() || nVar == C41022m.m71573g() || nVar == C41022m.m71572f() || nVar == C41022m.m71570d()) {
            return null;
        }
        if (nVar == C41022m.m71569c()) {
            return this;
        }
        if (nVar == C41022m.m71568b()) {
            return null;
        }
        return nVar == C41022m.m71571e() ? ChronoUnit.NANOS : nVar.mo43245a(this);
    }

    /* renamed from: o */
    public final int mo43157o() {
        return this.f107255d;
    }

    /* renamed from: p */
    public final int mo43158p() {
        return this.f107254c;
    }

    /* renamed from: r */
    public final LocalTime mo43048g(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.mo43358b(this, j);
        }
        switch (C41003h.f107404b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return mo43163u(j);
            case 2:
                return mo43163u((j % 86400000000L) * 1000);
            case 3:
                return mo43163u((j % 86400000) * 1000000);
            case 4:
                return mo43164v(j);
            case 5:
                return mo43161t(j);
            case 6:
                return mo43160s(j);
            case 7:
                return mo43160s((j % 2) * 12);
            default:
                throw new C41024o("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    /* renamed from: s */
    public final LocalTime mo43160s(long j) {
        if (j == 0) {
            return this;
        }
        return m71209m(((((int) (j % 24)) + this.f107252a) + 24) % 24, this.f107253b, this.f107254c, this.f107255d);
    }

    /* renamed from: t */
    public final LocalTime mo43161t(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f107252a * 60) + this.f107253b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : m71209m(i2 / 60, i2 % 60, this.f107254c, this.f107255d);
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f107252a;
        sb.append(b < 10 ? "0" : BuildConfig.FLAVOR);
        sb.append(b);
        String str = ":0";
        byte b2 = this.f107253b;
        sb.append(b2 < 10 ? str : ":");
        sb.append(b2);
        byte b3 = this.f107254c;
        int i2 = this.f107255d;
        if (b3 > 0 || i2 > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final LocalTime mo43163u(long j) {
        if (j == 0) {
            return this;
        }
        long w = mo43165w();
        long j2 = (((j % 86400000000000L) + w) + 86400000000000L) % 86400000000000L;
        return w == j2 ? this : m71209m((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        long j;
        LocalTime from = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, from);
        }
        long w = from.mo43165w() - mo43165w();
        switch (C41003h.f107404b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return w;
            case 2:
                j = 1000;
                break;
            case 3:
                j = 1000000;
                break;
            case 4:
                j = 1000000000;
                break;
            case 5:
                j = 60000000000L;
                break;
            case 6:
                j = 3600000000000L;
                break;
            case 7:
                j = 43200000000000L;
                break;
            default:
                throw new C41024o("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        return w / j;
    }

    /* renamed from: v */
    public final LocalTime mo43164v(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f107253b * 60) + (this.f107252a * 3600) + this.f107254c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : m71209m(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f107255d);
    }

    /* renamed from: w */
    public final long mo43165w() {
        return (((long) this.f107254c) * 1000000000) + (((long) this.f107253b) * 60000000000L) + (((long) this.f107252a) * 3600000000000L) + ((long) this.f107255d);
    }

    /* renamed from: x */
    public final int mo43166x() {
        return (this.f107253b * 60) + (this.f107252a * 3600) + this.f107254c;
    }

    /* renamed from: y */
    public final LocalTime mo43043b(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.mo43351h(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.mo43355l(j);
        int i = C41003h.f107403a[chronoField.ordinal()];
        byte b = this.f107252a;
        switch (i) {
            case 1:
                return mo43145B((int) j);
            case 2:
                return m71214q(j);
            case 3:
                return mo43145B(((int) j) * 1000);
            case 4:
                return m71214q(j * 1000);
            case 5:
                return mo43145B(((int) j) * 1000000);
            case 6:
                return m71214q(j * 1000000);
            case 7:
                return mo43146C((int) j);
            case 8:
                return mo43164v(j - ((long) mo43166x()));
            case 9:
                return mo43144A((int) j);
            case 10:
                return mo43161t(j - ((long) ((b * 60) + this.f107253b)));
            case 11:
                return mo43160s(j - ((long) (b % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return mo43160s(j - ((long) (b % 12)));
            case 13:
                return mo43168z((int) j);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                return mo43168z((int) j);
            case 15:
                return mo43160s((j - ((long) (b / 12))) * 12);
            default:
                throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    /* renamed from: z */
    public final LocalTime mo43168z(int i) {
        if (this.f107252a == i) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.mo43355l((long) i);
        return m71209m(i, this.f107253b, this.f107254c, this.f107255d);
    }
}
