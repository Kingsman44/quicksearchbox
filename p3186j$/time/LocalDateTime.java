package p3186j$.time;

import java.io.Serializable;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.chrono.C40958a;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.chrono.ChronoLocalDateTime;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.C41024o;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.time.temporal.Temporal;
import p3186j$.time.temporal.TemporalAdjuster;
import p3186j$.time.temporal.TemporalAmount;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.TemporalUnit;
import p3186j$.time.temporal.ValueRange;
import p3186j$.util.Objects;

/* renamed from: j$.time.LocalDateTime */
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime MAX = m71182o(LocalDate.f107242d, LocalTime.MAX);

    /* renamed from: c */
    public static final LocalDateTime f107246c = m71182o(LocalDate.MIN, LocalTime.f107249e);

    /* renamed from: a */
    private final LocalDate f107247a;

    /* renamed from: b */
    private final LocalTime f107248b;

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f107247a = localDate;
        this.f107248b = localTime;
    }

    /* renamed from: n */
    private int m71181n(LocalDateTime localDateTime) {
        int m = this.f107247a.mo43089m(localDateTime.mo43126j());
        return m == 0 ? this.f107248b.compareTo(localDateTime.toLocalTime()) : m;
    }

    public static LocalDateTime now(ZoneId zoneId) {
        Clock system = Clock.system(zoneId);
        Objects.requireNonNull(system, "clock");
        Instant b = system.mo42992b();
        return m71187p(b.getEpochSecond(), b.getNano(), system.mo42991a().mo43198n().mo43405d(b));
    }

    /* renamed from: o */
    public static LocalDateTime m71182o(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    /* renamed from: of */
    public static LocalDateTime m71183of(int i, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.m71157of(i, i2, i3), LocalTime.m71211of(i4, i5));
    }

    /* renamed from: of */
    public static LocalDateTime m71184of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new LocalDateTime(LocalDate.m71157of(i, i2, i3), LocalTime.m71212of(i4, i5, i6));
    }

    /* renamed from: of */
    public static LocalDateTime m71185of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.m71157of(i, i2, i3), LocalTime.m71213of(i4, i5, i6, i7));
    }

    /* renamed from: of */
    public static LocalDateTime m71186of(int i, Month month, int i2, int i3, int i4) {
        return new LocalDateTime(LocalDate.m71161t(i, month, i2), LocalTime.m71211of(i3, i4));
    }

    /* renamed from: p */
    public static LocalDateTime m71187p(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = (long) i;
        ChronoField.NANO_OF_SECOND.mo43355l(j2);
        long q = j + ((long) zoneOffset.mo43201q());
        long j3 = (long) 86400;
        return new LocalDateTime(LocalDate.ofEpochDay(C40947a.m71102f(q, j3)), LocalTime.m71214q((((long) ((int) C40947a.m71105i(q, j3))) * 1000000000) + j2));
    }

    /* renamed from: s */
    private LocalDateTime m71188s(LocalDate localDate, long j, long j2, long j3, long j4) {
        LocalDate localDate2 = localDate;
        LocalTime localTime = this.f107248b;
        if ((j | j2 | j3 | j4) == 0) {
            return m71189w(localDate2, localTime);
        }
        long j5 = j2 / 1440;
        long j6 = j / 24;
        long j7 = j6 + j5 + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = (long) 1;
        long j9 = (j2 % 1440) * 60000000000L;
        long j10 = ((j % 24) * 3600000000000L) + j9 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long w = localTime.mo43165w();
        long j11 = (j10 * j8) + w;
        long f = C40947a.m71102f(j11, 86400000000000L) + (j7 * j8);
        long i = C40947a.m71105i(j11, 86400000000000L);
        if (i != w) {
            localTime = LocalTime.m71214q(i);
        }
        return m71189w(localDate2.plusDays(f), localTime);
    }

    /* renamed from: w */
    private LocalDateTime m71189w(LocalDate localDate, LocalTime localTime) {
        return (this.f107247a == localDate && this.f107248b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    /* renamed from: A */
    public final LocalDateTime mo43108A(int i) {
        return m71189w(this.f107247a, this.f107248b.mo43146C(i));
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.mo43347b(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.isTimeBased();
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.m71297p(this, zoneId, (ZoneOffset) null);
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo43348d(this);
        }
        if (!((ChronoField) temporalField).isTimeBased()) {
            return this.f107247a.mo42997e(temporalField);
        }
        LocalTime localTime = this.f107248b;
        localTime.getClass();
        return C40947a.m71099c(localTime, temporalField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f107247a.equals(localDateTime.f107247a) && this.f107248b.equals(localDateTime.f107248b);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.f107248b.get(temporalField) : this.f107247a.get(temporalField) : C40947a.m71097a(this, temporalField);
    }

    public final C40961d getChronology() {
        mo43126j().getClass();
        return C40963f.f107281a;
    }

    public int getDayOfMonth() {
        return this.f107247a.getDayOfMonth();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f107247a.getDayOfWeek();
    }

    public int getHour() {
        return this.f107248b.getHour();
    }

    public final long getLong(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.f107248b.getLong(temporalField) : this.f107247a.getLong(temporalField) : temporalField.mo43350g(this);
    }

    public int getMinute() {
        return this.f107248b.getMinute();
    }

    public Month getMonth() {
        return this.f107247a.getMonth();
    }

    public int getMonthValue() {
        return this.f107247a.getMonthValue();
    }

    public int getNano() {
        return this.f107248b.mo43157o();
    }

    public int getSecond() {
        return this.f107248b.mo43158p();
    }

    public int getYear() {
        return this.f107247a.getYear();
    }

    /* renamed from: h */
    public final Temporal mo43001h(Temporal temporal) {
        return temporal.mo43043b(ChronoField.EPOCH_DAY, mo43126j().toEpochDay()).mo43043b(ChronoField.NANO_OF_DAY, toLocalTime().mo43165w());
    }

    public final int hashCode() {
        return this.f107247a.hashCode() ^ this.f107248b.hashCode();
    }

    public boolean isAfter(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (!(chronoLocalDateTime instanceof LocalDateTime)) {
            long epochDay = mo43126j().toEpochDay();
            long epochDay2 = chronoLocalDateTime.mo43126j().toEpochDay();
            if (epochDay > epochDay2) {
                return true;
            }
            if (epochDay != epochDay2 || toLocalTime().mo43165w() <= chronoLocalDateTime.toLocalTime().mo43165w()) {
                return false;
            }
            return true;
        } else if (m71181n((LocalDateTime) chronoLocalDateTime) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBefore(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (!(chronoLocalDateTime instanceof LocalDateTime)) {
            long epochDay = mo43126j().toEpochDay();
            long epochDay2 = chronoLocalDateTime.mo43126j().toEpochDay();
            if (epochDay < epochDay2) {
                return true;
            }
            if (epochDay != epochDay2 || toLocalTime().mo43165w() >= chronoLocalDateTime.toLocalTime().mo43165w()) {
                return false;
            }
            return true;
        } else if (m71181n((LocalDateTime) chronoLocalDateTime) < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public final Temporal mo43054k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? mo43048g(Long.MAX_VALUE, chronoUnit).mo43048g(1, chronoUnit) : mo43048g(-j, chronoUnit);
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        if (nVar == C41022m.m71568b()) {
            return this.f107247a;
        }
        if (nVar == C41022m.m71573g() || nVar == C41022m.m71572f() || nVar == C41022m.m71570d()) {
            return null;
        }
        if (nVar == C41022m.m71569c()) {
            return toLocalTime();
        }
        if (nVar == C41022m.m71567a()) {
            return getChronology();
        }
        if (nVar == C41022m.m71571e()) {
            return ChronoUnit.NANOS;
        }
        return nVar.mo43245a(this);
    }

    /* renamed from: m */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return m71181n((LocalDateTime) chronoLocalDateTime);
        }
        int compareTo = mo43126j().compareTo(chronoLocalDateTime.mo43126j());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        C40961d chronology = getChronology();
        C40961d chronology2 = chronoLocalDateTime.getChronology();
        ((C40958a) chronology).getClass();
        chronology2.getClass();
        return 0;
    }

    public LocalDateTime minus(TemporalAmount temporalAmount) {
        LocalDate localDate;
        long j;
        if (temporalAmount instanceof Period) {
            Period period = (Period) temporalAmount;
            LocalDate localDate2 = this.f107247a;
            localDate2.getClass();
            if (period instanceof Period) {
                long c = period.mo43182c();
                if (c == Long.MIN_VALUE) {
                    localDate2 = localDate2.plusMonths(Long.MAX_VALUE);
                    j = 1;
                } else {
                    j = -c;
                }
                localDate = localDate2.plusMonths(j).minusDays((long) period.mo43181a());
            } else {
                Objects.requireNonNull(period, "amountToSubtract");
                localDate = (LocalDate) period.mo43008d(localDate2);
            }
            return m71189w(localDate, this.f107248b);
        }
        Objects.requireNonNull(temporalAmount, "amountToSubtract");
        return (LocalDateTime) temporalAmount.mo43008d(this);
    }

    public LocalDateTime plus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return m71189w(this.f107247a.mo43084i((Period) temporalAmount), this.f107248b);
        }
        Objects.requireNonNull(temporalAmount, "amountToAdd");
        return (LocalDateTime) temporalAmount.mo43005b(this);
    }

    public LocalDateTime plusDays(long j) {
        return m71189w(this.f107247a.plusDays(j), this.f107248b);
    }

    public LocalDateTime plusHours(long j) {
        return m71188s(this.f107247a, j, 0, 0, 0);
    }

    /* renamed from: q */
    public final LocalDateTime mo43048g(long j, TemporalUnit temporalUnit) {
        long j2 = j;
        TemporalUnit temporalUnit2 = temporalUnit;
        if (!(temporalUnit2 instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit2.mo43358b(this, j2);
        }
        switch (C41002g.f107402a[((ChronoUnit) temporalUnit2).ordinal()]) {
            case 1:
                return m71188s(this.f107247a, 0, 0, 0, j);
            case 2:
                LocalDateTime plusDays = plusDays(j2 / 86400000000L);
                return plusDays.m71188s(plusDays.f107247a, 0, 0, 0, (j2 % 86400000000L) * 1000);
            case 3:
                LocalDateTime plusDays2 = plusDays(j2 / 86400000);
                return plusDays2.m71188s(plusDays2.f107247a, 0, 0, 0, (j2 % 86400000) * 1000000);
            case 4:
                return mo43133r(j);
            case 5:
                return m71188s(this.f107247a, 0, j, 0, 0);
            case 6:
                return plusHours(j);
            case 7:
                return plusDays(j2 / 256).plusHours((j2 % 256) * 12);
            default:
                return m71189w(this.f107247a.mo43048g(j2, temporalUnit2), this.f107248b);
        }
    }

    /* renamed from: r */
    public final LocalDateTime mo43133r(long j) {
        return m71188s(this.f107247a, 0, 0, j, 0);
    }

    /* renamed from: t */
    public final long mo43134t(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((mo43126j().toEpochDay() * 86400) + ((long) toLocalTime().mo43166x())) - ((long) zoneOffset.mo43201q());
    }

    /* renamed from: toLocalDate */
    public LocalDate mo43126j() {
        return this.f107247a;
    }

    public LocalTime toLocalTime() {
        return this.f107248b;
    }

    public final String toString() {
        String localDate = this.f107247a.toString();
        String localTime = this.f107248b.toString();
        return localDate + "T" + localTime;
    }

    /* renamed from: u */
    public final LocalDateTime mo43138u(TemporalUnit temporalUnit) {
        LocalTime localTime = this.f107248b;
        localTime.getClass();
        if (temporalUnit != ChronoUnit.NANOS) {
            Duration duration = temporalUnit.getDuration();
            if (duration.getSeconds() <= 86400) {
                long nanos = duration.toNanos();
                if (86400000000000L % nanos == 0) {
                    localTime = LocalTime.m71214q((localTime.mo43165w() / nanos) * nanos);
                } else {
                    throw new C41024o("Unit must divide into a standard day without remainder");
                }
            } else {
                throw new C41024o("Unit is too large to be used for truncation");
            }
        }
        return m71189w(this.f107247a, localTime);
    }

    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDateTime localDateTime;
        long j;
        long j2;
        long j3;
        long j4;
        if (temporal instanceof LocalDateTime) {
            localDateTime = (LocalDateTime) temporal;
        } else if (temporal instanceof ZonedDateTime) {
            localDateTime = ((ZonedDateTime) temporal).mo43202c();
        } else if (temporal instanceof OffsetDateTime) {
            localDateTime = ((OffsetDateTime) temporal).toLocalDateTime();
        } else {
            try {
                localDateTime = new LocalDateTime(LocalDate.m71156o(temporal), LocalTime.from(temporal));
            } catch (DateTimeException e) {
                String valueOf = String.valueOf(temporal);
                String name = temporal.getClass().getName();
                throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + valueOf + " of type " + name, e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTime);
        }
        boolean isTimeBased = temporalUnit.isTimeBased();
        LocalTime localTime = this.f107248b;
        LocalDate localDate = this.f107247a;
        if (isTimeBased) {
            LocalDate localDate2 = localDateTime.f107247a;
            localDate.getClass();
            long epochDay = localDate2.toEpochDay() - localDate.toEpochDay();
            LocalTime localTime2 = localDateTime.f107248b;
            if (epochDay == 0) {
                return localTime.until(localTime2, temporalUnit);
            }
            long w = localTime2.mo43165w() - localTime.mo43165w();
            if (epochDay > 0) {
                j2 = epochDay - 1;
                j = w + 86400000000000L;
            } else {
                j2 = epochDay + 1;
                j = w - 86400000000000L;
            }
            switch (C41002g.f107402a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    j2 = C40947a.m71104h(j2, 86400000000000L);
                    break;
                case 2:
                    j3 = C40947a.m71104h(j2, 86400000000L);
                    j4 = 1000;
                    break;
                case 3:
                    j3 = C40947a.m71104h(j2, 86400000);
                    j4 = 1000000;
                    break;
                case 4:
                    j3 = C40947a.m71104h(j2, (long) 86400);
                    j4 = 1000000000;
                    break;
                case 5:
                    j3 = C40947a.m71104h(j2, (long) 1440);
                    j4 = 60000000000L;
                    break;
                case 6:
                    j3 = C40947a.m71104h(j2, (long) 24);
                    j4 = 3600000000000L;
                    break;
                case 7:
                    j3 = C40947a.m71104h(j2, (long) 2);
                    j4 = 43200000000000L;
                    break;
            }
            j2 = j3;
            j /= j4;
            return C40947a.m71106j(j2, j);
        }
        LocalDate localDate3 = localDateTime.f107247a;
        boolean isAfter = localDate3.isAfter(localDate);
        LocalTime localTime3 = localDateTime.f107248b;
        if (isAfter && localTime3.isBefore(localTime)) {
            localDate3 = localDate3.minusDays(1);
        } else if (localDate3.isBefore(localDate) && localTime3.isAfter(localTime)) {
            localDate3 = localDate3.plusDays(1);
        }
        return localDate.until(localDate3, temporalUnit);
    }

    /* renamed from: v */
    public final LocalDateTime mo43046d(LocalDate localDate) {
        return localDate instanceof LocalDate ? m71189w(localDate, this.f107248b) : localDate instanceof LocalTime ? m71189w(this.f107247a, (LocalTime) localDate) : localDate instanceof LocalDateTime ? (LocalDateTime) localDate : (LocalDateTime) localDate.mo43001h(this);
    }

    public LocalDateTime withHour(int i) {
        return m71189w(this.f107247a, this.f107248b.mo43168z(i));
    }

    /* renamed from: x */
    public final LocalDateTime mo43043b(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDateTime) temporalField.mo43351h(this, j);
        }
        boolean isTimeBased = ((ChronoField) temporalField).isTimeBased();
        LocalTime localTime = this.f107248b;
        LocalDate localDate = this.f107247a;
        return isTimeBased ? m71189w(localDate, localTime.mo43043b(temporalField, j)) : m71189w(localDate.mo43043b(temporalField, j), localTime);
    }

    /* renamed from: y */
    public final LocalDateTime mo43142y(int i) {
        return m71189w(this.f107247a, this.f107248b.mo43144A(i));
    }

    /* renamed from: z */
    public final LocalDateTime mo43143z(int i) {
        return m71189w(this.f107247a, this.f107248b.mo43145B(i));
    }
}
