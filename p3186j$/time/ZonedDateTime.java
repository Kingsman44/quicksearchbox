package p3186j$.time;

import java.io.Serializable;
import java.util.List;
import p3186j$.time.chrono.C40958a;
import p3186j$.time.chrono.C40959b;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.chrono.ChronoZonedDateTime;
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
import p3186j$.time.zone.C41026a;
import p3186j$.time.zone.C41028c;
import p3186j$.util.Objects;

/* renamed from: j$.time.ZonedDateTime */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f107273a;

    /* renamed from: b */
    private final ZoneOffset f107274b;

    /* renamed from: c */
    private final ZoneId f107275c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f107273a = localDateTime;
        this.f107274b = zoneOffset;
        this.f107275c = zoneId;
    }

    /* renamed from: m */
    private static ZonedDateTime m71293m(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.mo43198n().mo43405d(Instant.ofEpochSecond(j, (long) i));
        return new ZonedDateTime(LocalDateTime.m71187p(j, i, d), zoneId, d);
    }

    /* renamed from: o */
    public static ZonedDateTime m71294o(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m71293m(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    /* renamed from: of */
    public static ZonedDateTime m71295of(int i, int i2, int i3, int i4, int i5, int i6, int i7, ZoneId zoneId) {
        return m71297p(LocalDateTime.m71185of(i, i2, i3, i4, i5, i6, i7), zoneId, (ZoneOffset) null);
    }

    /* renamed from: of */
    public static ZonedDateTime m71296of(LocalDate localDate, LocalTime localTime, ZoneId zoneId) {
        return m71297p(LocalDateTime.m71182o(localDate, localTime), zoneId, (ZoneOffset) null);
    }

    /* renamed from: p */
    public static ZonedDateTime m71297p(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Object requireNonNull;
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        C41028c n = zoneId.mo43198n();
        List g = n.mo43408g(localDateTime);
        if (g.size() == 1) {
            requireNonNull = g.get(0);
        } else {
            if (g.size() == 0) {
                C41026a f = n.mo43407f(localDateTime);
                localDateTime = localDateTime.mo43133r(f.mo43396e().getSeconds());
                zoneOffset = f.mo43398g();
            } else if (zoneOffset == null || !g.contains(zoneOffset)) {
                requireNonNull = Objects.requireNonNull((ZoneOffset) g.get(0), "offset");
            }
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        zoneOffset = (ZoneOffset) requireNonNull;
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    /* renamed from: r */
    private ZonedDateTime m71298r(LocalDateTime localDateTime) {
        return m71297p(localDateTime, this.f107275c, this.f107274b);
    }

    /* renamed from: s */
    private ZonedDateTime m71299s(ZoneOffset zoneOffset) {
        if (!zoneOffset.equals(this.f107274b)) {
            ZoneId zoneId = this.f107275c;
            C41028c n = zoneId.mo43198n();
            LocalDateTime localDateTime = this.f107273a;
            if (n.mo43408g(localDateTime).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        return (temporalField instanceof ChronoField) || (temporalField != null && temporalField.mo43347b(this));
    }

    /* renamed from: b */
    public final Temporal mo43043b(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (ZonedDateTime) temporalField.mo43351h(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = C41009n.f107412a[chronoField.ordinal()];
        return i != 1 ? i != 2 ? m71298r(this.f107273a.mo43043b(temporalField, j)) : m71299s(ZoneOffset.m71285t(chronoField.mo43354k(j))) : m71293m(j, mo43222n(), this.f107275c);
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? temporalField.range() : this.f107273a.mo42997e(temporalField) : temporalField.mo43348d(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.f107273a.equals(zonedDateTime.f107273a) && this.f107274b.equals(zonedDateTime.f107274b) && this.f107275c.equals(zonedDateTime.f107275c);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return C40959b.m71321a(this, temporalField);
        }
        int i = C41009n.f107412a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f107273a.get(temporalField) : this.f107274b.mo43201q();
        }
        throw new C41024o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final C40961d getChronology() {
        toLocalDate().getClass();
        return C40963f.f107281a;
    }

    public int getDayOfMonth() {
        return this.f107273a.getDayOfMonth();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f107273a.getDayOfWeek();
    }

    public int getHour() {
        return this.f107273a.getHour();
    }

    public final long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo43350g(this);
        }
        int i = C41009n.f107412a[((ChronoField) temporalField).ordinal()];
        return i != 1 ? i != 2 ? this.f107273a.getLong(temporalField) : (long) this.f107274b.mo43201q() : toEpochSecond();
    }

    public int getMinute() {
        return this.f107273a.getMinute();
    }

    public int getMonthValue() {
        return this.f107273a.getMonthValue();
    }

    public final ZoneOffset getOffset() {
        return this.f107274b;
    }

    public int getSecond() {
        return this.f107273a.getSecond();
    }

    public int getYear() {
        return this.f107273a.getYear();
    }

    public ZoneId getZone() {
        return this.f107275c;
    }

    /* renamed from: h */
    public final int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int i = (toEpochSecond() > chronoZonedDateTime.toEpochSecond() ? 1 : (toEpochSecond() == chronoZonedDateTime.toEpochSecond() ? 0 : -1));
        if (i != 0) {
            return i;
        }
        int o = toLocalTime().mo43157o() - chronoZonedDateTime.toLocalTime().mo43157o();
        if (o != 0) {
            return o;
        }
        int m = mo43202c().compareTo(chronoZonedDateTime.mo43202c());
        if (m != 0) {
            return m;
        }
        int compareTo = getZone().getId().compareTo(chronoZonedDateTime.getZone().getId());
        if (compareTo != 0) {
            return compareTo;
        }
        C40961d chronology = getChronology();
        C40961d chronology2 = chronoZonedDateTime.getChronology();
        ((C40958a) chronology).getClass();
        chronology2.getClass();
        return 0;
    }

    public final int hashCode() {
        return (this.f107273a.hashCode() ^ this.f107274b.hashCode()) ^ Integer.rotateLeft(this.f107275c.hashCode(), 3);
    }

    public boolean isAfter(ChronoZonedDateTime chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        return epochSecond > epochSecond2 || (epochSecond == epochSecond2 && toLocalTime().mo43157o() > chronoZonedDateTime.toLocalTime().mo43157o());
    }

    public boolean isBefore(ChronoZonedDateTime chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        return epochSecond < epochSecond2 || (epochSecond == epochSecond2 && toLocalTime().mo43157o() < chronoZonedDateTime.toLocalTime().mo43157o());
    }

    public boolean isEqual(ChronoZonedDateTime chronoZonedDateTime) {
        return toEpochSecond() == chronoZonedDateTime.toEpochSecond() && toLocalTime().mo43157o() == chronoZonedDateTime.toLocalTime().mo43157o();
    }

    /* renamed from: k */
    public final Temporal mo43054k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? mo43048g(Long.MAX_VALUE, chronoUnit).mo43048g(1, chronoUnit) : mo43048g(-j, chronoUnit);
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        if (nVar == C41022m.m71568b()) {
            return toLocalDate();
        }
        if (nVar == C41022m.m71572f() || nVar == C41022m.m71573g()) {
            return getZone();
        }
        if (nVar == C41022m.m71570d()) {
            return getOffset();
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

    public ZonedDateTime minus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return m71298r(this.f107273a.minus((Period) temporalAmount));
        }
        Objects.requireNonNull(temporalAmount, "amountToSubtract");
        return (ZonedDateTime) temporalAmount.mo43008d(this);
    }

    /* renamed from: n */
    public final int mo43222n() {
        return this.f107273a.getNano();
    }

    public ZonedDateTime plus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return m71298r(this.f107273a.plus((Period) temporalAmount));
        }
        Objects.requireNonNull(temporalAmount, "amountToAdd");
        return (ZonedDateTime) temporalAmount.mo43005b(this);
    }

    public ZonedDateTime plusDays(long j) {
        return m71298r(this.f107273a.plusDays(j));
    }

    /* renamed from: q */
    public final ZonedDateTime mo43048g(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.mo43358b(this, j);
        }
        boolean isDateBased = temporalUnit.isDateBased();
        LocalDateTime q = this.f107273a.mo43048g(j, temporalUnit);
        if (isDateBased) {
            return m71298r(q);
        }
        Objects.requireNonNull(q, "localDateTime");
        ZoneOffset zoneOffset = this.f107274b;
        Objects.requireNonNull(zoneOffset, "offset");
        ZoneId zoneId = this.f107275c;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.mo43198n().mo43408g(q).contains(zoneOffset)) {
            return new ZonedDateTime(q, zoneId, zoneOffset);
        }
        return m71293m(q.mo43134t(zoneOffset), q.getNano(), zoneId);
    }

    public final long toEpochSecond() {
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().mo43166x())) - ((long) this.f107274b.mo43201q());
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), (long) toLocalTime().mo43157o());
    }

    public LocalDate toLocalDate() {
        return this.f107273a.mo43126j();
    }

    /* renamed from: toLocalDateTime */
    public LocalDateTime mo43202c() {
        return this.f107273a;
    }

    public LocalTime toLocalTime() {
        return this.f107273a.toLocalTime();
    }

    public final String toString() {
        String localDateTime = this.f107273a.toString();
        ZoneOffset zoneOffset = this.f107274b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.f107275c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    public ZonedDateTime truncatedTo(TemporalUnit temporalUnit) {
        return m71298r(this.f107273a.mo43138u(temporalUnit));
    }

    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTime;
        if (temporal instanceof ZonedDateTime) {
            zonedDateTime = (ZonedDateTime) temporal;
        } else {
            try {
                ZoneId m = ZoneId.m71278m(temporal);
                ChronoField chronoField = ChronoField.INSTANT_SECONDS;
                if (temporal.mo42996a(chronoField)) {
                    zonedDateTime = m71293m(temporal.getLong(chronoField), temporal.get(ChronoField.NANO_OF_SECOND), m);
                } else {
                    zonedDateTime = m71296of(LocalDate.m71156o(temporal), LocalTime.from(temporal), m);
                }
            } catch (DateTimeException e) {
                String valueOf = String.valueOf(temporal);
                String name = temporal.getClass().getName();
                throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + valueOf + " of type " + name, e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, zonedDateTime);
        }
        ZonedDateTime withZoneSameInstant = zonedDateTime.withZoneSameInstant(this.f107275c);
        boolean isDateBased = temporalUnit.isDateBased();
        LocalDateTime localDateTime = this.f107273a;
        if (isDateBased) {
            return localDateTime.until(withZoneSameInstant.f107273a, temporalUnit);
        }
        return OffsetDateTime.m71246n(localDateTime, this.f107274b).until(OffsetDateTime.m71246n(withZoneSameInstant.f107273a, withZoneSameInstant.f107274b), temporalUnit);
    }

    /* renamed from: with */
    public ZonedDateTime mo43046d(TemporalAdjuster temporalAdjuster) {
        boolean z = temporalAdjuster instanceof LocalDate;
        LocalDateTime localDateTime = this.f107273a;
        if (z) {
            return m71298r(LocalDateTime.m71182o((LocalDate) temporalAdjuster, localDateTime.toLocalTime()));
        }
        if (temporalAdjuster instanceof LocalTime) {
            return m71298r(LocalDateTime.m71182o(localDateTime.mo43126j(), (LocalTime) temporalAdjuster));
        }
        if (temporalAdjuster instanceof LocalDateTime) {
            return m71298r((LocalDateTime) temporalAdjuster);
        }
        boolean z2 = temporalAdjuster instanceof OffsetDateTime;
        ZoneId zoneId = this.f107275c;
        if (z2) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) temporalAdjuster;
            return m71297p(offsetDateTime.toLocalDateTime(), zoneId, offsetDateTime.getOffset());
        } else if (!(temporalAdjuster instanceof Instant)) {
            return temporalAdjuster instanceof ZoneOffset ? m71299s((ZoneOffset) temporalAdjuster) : (ZonedDateTime) temporalAdjuster.mo43001h(this);
        } else {
            Instant instant = (Instant) temporalAdjuster;
            return m71293m(instant.getEpochSecond(), instant.getNano(), zoneId);
        }
    }

    public ZonedDateTime withHour(int i) {
        return m71298r(this.f107273a.withHour(i));
    }

    public ZonedDateTime withMinute(int i) {
        return m71298r(this.f107273a.mo43142y(i));
    }

    public ZonedDateTime withNano(int i) {
        return m71298r(this.f107273a.mo43143z(i));
    }

    public ZonedDateTime withSecond(int i) {
        return m71298r(this.f107273a.mo43108A(i));
    }

    public ZonedDateTime withZoneSameInstant(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f107275c.equals(zoneId)) {
            return this;
        }
        ZoneOffset zoneOffset = this.f107274b;
        LocalDateTime localDateTime = this.f107273a;
        return m71293m(localDateTime.mo43134t(zoneOffset), localDateTime.getNano(), zoneId);
    }
}
