package p3186j$.time;

import java.io.Serializable;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.chrono.C40958a;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.chrono.ChronoLocalDate;
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
import p3186j$.time.zone.C41026a;
import p3186j$.util.Objects;

/* renamed from: j$.time.LocalDate */
public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
    public static final LocalDate MIN = m71157of(-999999999, 1, 1);

    /* renamed from: d */
    public static final LocalDate f107242d = m71157of(999999999, 12, 31);

    /* renamed from: a */
    private final int f107243a;

    /* renamed from: b */
    private final short f107244b;

    /* renamed from: c */
    private final short f107245c;

    static {
        m71157of(1970, 1, 1);
    }

    private LocalDate(int i, int i2, int i3) {
        this.f107243a = i;
        this.f107244b = (short) i2;
        this.f107245c = (short) i3;
    }

    /* renamed from: n */
    private static LocalDate m71155n(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                C40963f.f107281a.getClass();
                if (C40963f.isLeapYear((long) i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                String name = Month.m71237o(i2).name();
                throw new DateTimeException("Invalid date '" + name + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate now(ZoneId zoneId) {
        Clock system = Clock.system(zoneId);
        Objects.requireNonNull(system, "clock");
        Instant b = system.mo42992b();
        ZoneId a = system.mo42991a();
        Objects.requireNonNull(b, "instant");
        Objects.requireNonNull(a, "zone");
        return ofEpochDay(C40947a.m71102f(b.getEpochSecond() + ((long) a.mo43198n().mo43405d(b).mo43201q()), (long) 86400));
    }

    /* renamed from: o */
    public static LocalDate m71156o(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.mo43002l(C41022m.m71568b());
        if (localDate != null) {
            return localDate;
        }
        String valueOf = String.valueOf(temporalAccessor);
        String name = temporalAccessor.getClass().getName();
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + valueOf + " of type " + name);
    }

    /* renamed from: of */
    public static LocalDate m71157of(int i, int i2, int i3) {
        ChronoField.YEAR.mo43355l((long) i);
        ChronoField.MONTH_OF_YEAR.mo43355l((long) i2);
        ChronoField.DAY_OF_MONTH.mo43355l((long) i3);
        return m71155n(i, i2, i3);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        long j3 = j;
        ChronoField.EPOCH_DAY.mo43355l(j3);
        long j4 = (j3 + 719528) - 60;
        if (j4 < 0) {
            long j5 = ((j4 + 1) / 146097) - 1;
            j2 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j2 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((j6 / 400) + (((j6 / 4) + (j6 * 365)) - (j6 / 100)));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((j6 / 400) + (((j6 / 4) + (365 * j6)) - (j6 / 100)));
        }
        int i = (int) j7;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(ChronoField.YEAR.mo43354k(j6 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    /* renamed from: p */
    private int m71158p(TemporalField temporalField) {
        int i;
        int i2 = C40967f.f107287a[((ChronoField) temporalField).ordinal()];
        int i3 = this.f107243a;
        short s = this.f107245c;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return mo43097q();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((mo43097q() - 1) % 7) + 1;
            case 8:
                throw new C41024o("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((mo43097q() - 1) / 7) + 1;
            case 10:
                return this.f107244b;
            case 11:
                throw new C41024o("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return i + 1;
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.mo43262f(charSequence, new C40966e(0));
    }

    /* renamed from: r */
    private long m71159r() {
        return ((((long) this.f107243a) * 12) + ((long) this.f107244b)) - 1;
    }

    /* renamed from: s */
    private long m71160s(LocalDate localDate) {
        return (((localDate.m71159r() * 32) + ((long) localDate.getDayOfMonth())) - ((m71159r() * 32) + ((long) getDayOfMonth()))) / 32;
    }

    /* renamed from: t */
    public static LocalDate m71161t(int i, Month month, int i2) {
        ChronoField.YEAR.mo43355l((long) i);
        Objects.requireNonNull(month, "month");
        ChronoField.DAY_OF_MONTH.mo43355l((long) i2);
        return m71155n(i, month.getValue(), i2);
    }

    /* renamed from: u */
    public static LocalDate m71162u(int i, int i2) {
        long j = (long) i;
        ChronoField.YEAR.mo43355l(j);
        ChronoField.DAY_OF_YEAR.mo43355l((long) i2);
        C40963f.f107281a.getClass();
        boolean isLeapYear = C40963f.isLeapYear(j);
        if (i2 != 366 || isLeapYear) {
            Month o = Month.m71237o(((i2 - 1) / 31) + 1);
            if (i2 > (o.mo43171n(isLeapYear) + o.mo43170m(isLeapYear)) - 1) {
                o = o.mo43172p();
            }
            return new LocalDate(i, o.getValue(), (i2 - o.mo43170m(isLeapYear)) + 1);
        }
        throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
    }

    /* renamed from: y */
    private static LocalDate m71163y(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new LocalDate(i, i2, i3);
        }
        C40963f.f107281a.getClass();
        i4 = C40963f.isLeapYear((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new LocalDate(i, i2, i3);
    }

    /* renamed from: A */
    public final LocalDate mo43068A(int i) {
        if (this.f107243a == i) {
            return this;
        }
        ChronoField.YEAR.mo43355l((long) i);
        return m71163y(i, this.f107244b, this.f107245c);
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField.isDateBased() : temporalField != null && temporalField.mo43347b(this);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.m71182o(this, LocalTime.f107250f);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        C41026a f;
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime atTime = mo43076f(LocalTime.f107250f);
        if (!(zoneId instanceof ZoneOffset) && (f = zoneId.mo43198n().mo43407f(atTime)) != null && f.mo43402l()) {
            atTime = f.mo43393b();
        }
        return ZonedDateTime.m71297p(atTime, zoneId, (ZoneOffset) null);
    }

    public LocalDateTime atTime(int i, int i2) {
        return mo43076f(LocalTime.m71211of(i, i2));
    }

    /* renamed from: atTime */
    public LocalDateTime mo43076f(LocalTime localTime) {
        return LocalDateTime.m71182o(this, localTime);
    }

    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return mo43089m((LocalDate) chronoLocalDate);
        }
        int i = (toEpochDay() > chronoLocalDate.toEpochDay() ? 1 : (toEpochDay() == chronoLocalDate.toEpochDay() ? 0 : -1));
        if (i != 0) {
            return i;
        }
        C40961d chronology = getChronology();
        C40961d chronology2 = chronoLocalDate.getChronology();
        ((C40958a) chronology).getClass();
        chronology2.getClass();
        return 0;
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        int i;
        long j;
        long j2;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo43348d(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (chronoField.isDateBased()) {
            int i2 = C40967f.f107287a[chronoField.ordinal()];
            if (i2 == 1) {
                i = lengthOfMonth();
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (getMonth() != Month.FEBRUARY || isLeapYear()) {
                        j = 5;
                    } else {
                        j = 4;
                    }
                    return ValueRange.m71512h(1, j);
                } else if (i2 != 4) {
                    return temporalField.range();
                } else {
                    if (getYear() <= 0) {
                        j2 = 1000000000;
                    } else {
                        j2 = 999999999;
                    }
                    return ValueRange.m71512h(1, j2);
                }
            } else if (isLeapYear()) {
                i = 366;
            } else {
                i = 365;
            }
            return ValueRange.m71512h(1, (long) i);
        }
        throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && mo43089m((LocalDate) obj) == 0;
    }

    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? m71158p(temporalField) : C40947a.m71097a(this, temporalField);
    }

    public final C40961d getChronology() {
        return C40963f.f107281a;
    }

    public int getDayOfMonth() {
        return this.f107245c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.m71130of(((int) C40947a.m71105i(toEpochDay() + 3, (long) 7)) + 1);
    }

    public final long getLong(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.EPOCH_DAY ? toEpochDay() : temporalField == ChronoField.PROLEPTIC_MONTH ? m71159r() : (long) m71158p(temporalField) : temporalField.mo43350g(this);
    }

    public Month getMonth() {
        return Month.m71237o(this.f107244b);
    }

    public int getMonthValue() {
        return this.f107244b;
    }

    public int getYear() {
        return this.f107243a;
    }

    /* renamed from: h */
    public final Temporal mo43001h(Temporal temporal) {
        return temporal.mo43043b(ChronoField.EPOCH_DAY, toEpochDay());
    }

    public final int hashCode() {
        int i = this.f107243a;
        return (((i << 11) + (this.f107244b << 6)) + this.f107245c) ^ (i & -2048);
    }

    public boolean isAfter(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            if (mo43089m((LocalDate) chronoLocalDate) > 0) {
                return true;
            }
            return false;
        } else if (toEpochDay() > chronoLocalDate.toEpochDay()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            if (mo43089m((LocalDate) chronoLocalDate) < 0) {
                return true;
            }
            return false;
        } else if (toEpochDay() < chronoLocalDate.toEpochDay()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean isLeapYear() {
        C40963f.f107281a.getClass();
        return C40963f.isLeapYear((long) this.f107243a);
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        if (nVar == C41022m.m71568b()) {
            return this;
        }
        if (nVar == C41022m.m71573g() || nVar == C41022m.m71572f() || nVar == C41022m.m71570d() || nVar == C41022m.m71569c()) {
            return null;
        }
        if (nVar == C41022m.m71567a()) {
            return getChronology();
        }
        if (nVar == C41022m.m71571e()) {
            return ChronoUnit.DAYS;
        }
        return nVar.mo43245a(this);
    }

    public final int lengthOfMonth() {
        short s = this.f107244b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final int mo43089m(LocalDate localDate) {
        int i = this.f107243a - localDate.f107243a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f107244b - localDate.f107244b;
        return i2 == 0 ? this.f107245c - localDate.f107245c : i2;
    }

    /* renamed from: minus */
    public LocalDate mo43054k(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo43048g(Long.MAX_VALUE, temporalUnit).mo43048g(1, temporalUnit) : mo43048g(-j, temporalUnit);
    }

    public LocalDate minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1) : plusDays(-j);
    }

    public LocalDate minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1) : plusWeeks(-j);
    }

    public LocalDate minusYears(long j) {
        return j == Long.MIN_VALUE ? mo43106x(Long.MAX_VALUE).mo43106x(1) : mo43106x(-j);
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.f107245c) + j;
        if (j2 > 0) {
            short s = this.f107244b;
            int i = this.f107243a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long lengthOfMonth = (long) lengthOfMonth();
                if (j2 <= lengthOfMonth) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - lengthOfMonth));
                }
                int i2 = i + 1;
                ChronoField.YEAR.mo43355l((long) i2);
                return new LocalDate(i2, 1, (int) (j2 - lengthOfMonth));
            }
        }
        return ofEpochDay(C40947a.m71106j(toEpochDay(), j));
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f107243a) * 12) + ((long) (this.f107244b - 1)) + j;
        long j3 = (long) 12;
        return m71163y(ChronoField.YEAR.mo43354k(C40947a.m71102f(j2, j3)), ((int) C40947a.m71105i(j2, j3)) + 1, this.f107245c);
    }

    public LocalDate plusWeeks(long j) {
        return plusDays(C40947a.m71104h(j, (long) 7));
    }

    /* renamed from: q */
    public final int mo43097q() {
        return (getMonth().mo43170m(isLeapYear()) + this.f107245c) - 1;
    }

    public long toEpochDay() {
        long j;
        long j2 = (long) this.f107243a;
        long j3 = (long) this.f107244b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / -400) + ((j2 / -4) - (j2 / -100)));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.f107245c - 1));
        if (j3 > 2) {
            j5--;
            if (!isLeapYear()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    public String toString() {
        int i;
        int i2 = this.f107243a;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        String str = "-0";
        short s = this.f107244b;
        sb.append(s < 10 ? str : "-");
        sb.append(s);
        short s2 = this.f107245c;
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        long epochDay;
        long j;
        LocalDate o = m71156o(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, o);
        }
        switch (C40967f.f107288b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return o.toEpochDay() - toEpochDay();
            case 2:
                epochDay = o.toEpochDay() - toEpochDay();
                j = 7;
                break;
            case 3:
                return m71160s(o);
            case 4:
                epochDay = m71160s(o);
                j = 12;
                break;
            case 5:
                epochDay = m71160s(o);
                j = 120;
                break;
            case 6:
                epochDay = m71160s(o);
                j = 1200;
                break;
            case 7:
                epochDay = m71160s(o);
                j = 12000;
                break;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return o.getLong(chronoField) - getLong(chronoField);
            default:
                throw new C41024o("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        return epochDay / j;
    }

    /* renamed from: v */
    public final LocalDate mo43048g(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.mo43358b(this, j);
        }
        switch (C40967f.f107288b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusWeeks(j);
            case 3:
                return plusMonths(j);
            case 4:
                return mo43106x(j);
            case 5:
                return mo43106x(C40947a.m71104h(j, (long) 10));
            case 6:
                return mo43106x(C40947a.m71104h(j, (long) 100));
            case 7:
                return mo43106x(C40947a.m71104h(j, (long) 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return mo43043b(chronoField, C40947a.m71106j(getLong(chronoField), j));
            default:
                throw new C41024o("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    /* renamed from: w */
    public final LocalDate mo43084i(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            Period period = (Period) temporalAmount;
            return plusMonths(period.mo43182c()).plusDays((long) period.mo43181a());
        }
        Objects.requireNonNull(temporalAmount, "amountToAdd");
        return (LocalDate) temporalAmount.mo43005b(this);
    }

    /* renamed from: with */
    public LocalDate mo43046d(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalDate ? (LocalDate) temporalAdjuster : (LocalDate) temporalAdjuster.mo43001h(this);
    }

    /* renamed from: with */
    public LocalDate mo43043b(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.mo43351h(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.mo43355l(j);
        int i = C40967f.f107287a[chronoField.ordinal()];
        int i2 = this.f107243a;
        switch (i) {
            case 1:
                return withDayOfMonth((int) j);
            case 2:
                return mo43107z((int) j);
            case 3:
                return plusWeeks(j - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return mo43068A((int) j);
            case 5:
                return plusDays(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return plusWeeks(j - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return withMonth((int) j);
            case 11:
                return plusMonths(j - m71159r());
            case 12:
                return mo43068A((int) j);
            case 13:
                return getLong(ChronoField.ERA) == j ? this : mo43068A(1 - i2);
            default:
                throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
    }

    public LocalDate withDayOfMonth(int i) {
        return this.f107245c == i ? this : m71157of(this.f107243a, this.f107244b, i);
    }

    public LocalDate withMonth(int i) {
        if (this.f107244b == i) {
            return this;
        }
        ChronoField.MONTH_OF_YEAR.mo43355l((long) i);
        return m71163y(this.f107243a, i, this.f107245c);
    }

    /* renamed from: x */
    public final LocalDate mo43106x(long j) {
        return j == 0 ? this : m71163y(ChronoField.YEAR.mo43354k(((long) this.f107243a) + j), this.f107244b, this.f107245c);
    }

    /* renamed from: z */
    public final LocalDate mo43107z(int i) {
        return mo43097q() == i ? this : m71162u(this.f107243a, i);
    }
}
