package p3186j$.time;

import java.io.Serializable;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.chrono.C40963f;
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

/* renamed from: j$.time.OffsetDateTime */
public final class OffsetDateTime implements Temporal, TemporalAdjuster, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f107258a;

    /* renamed from: b */
    private final ZoneOffset f107259b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f107246c;
        ZoneOffset zoneOffset = ZoneOffset.f107270g;
        localDateTime.getClass();
        m71246n(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f107269f;
        localDateTime2.getClass();
        m71246n(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f107258a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f107259b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    /* renamed from: m */
    public static OffsetDateTime m71245m(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAccessor;
        }
        try {
            ZoneOffset p = ZoneOffset.m71282p(temporalAccessor);
            LocalDate localDate = (LocalDate) temporalAccessor.mo43002l(C41022m.m71568b());
            LocalTime localTime = (LocalTime) temporalAccessor.mo43002l(C41022m.m71569c());
            if (localDate == null || localTime == null) {
                return m71247o(Instant.from(temporalAccessor), p);
            }
            return new OffsetDateTime(LocalDateTime.m71182o(localDate, localTime), p);
        } catch (DateTimeException e) {
            String valueOf = String.valueOf(temporalAccessor);
            String name = temporalAccessor.getClass().getName();
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + valueOf + " of type " + name, e);
        }
    }

    /* renamed from: n */
    public static OffsetDateTime m71246n(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    /* renamed from: o */
    public static OffsetDateTime m71247o(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset d = zoneId.mo43198n().mo43405d(instant);
        return new OffsetDateTime(LocalDateTime.m71187p(instant.getEpochSecond(), instant.getNano(), d), d);
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f107304i;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.mo43262f(charSequence, new C40966e(2));
    }

    /* renamed from: q */
    private OffsetDateTime m71248q(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f107258a != localDateTime || !this.f107259b.equals(zoneOffset)) ? new OffsetDateTime(localDateTime, zoneOffset) : this;
    }

    /* renamed from: a */
    public final boolean mo42996a(TemporalField temporalField) {
        return (temporalField instanceof ChronoField) || (temporalField != null && temporalField.mo43347b(this));
    }

    /* renamed from: b */
    public final Temporal mo43043b(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (OffsetDateTime) temporalField.mo43351h(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = C41005j.f107406a[chronoField.ordinal()];
        ZoneOffset zoneOffset = this.f107259b;
        LocalDateTime localDateTime = this.f107258a;
        if (i == 1) {
            return m71247o(Instant.ofEpochSecond(j, (long) localDateTime.getNano()), zoneOffset);
        }
        if (i != 2) {
            return m71248q(localDateTime.mo43043b(temporalField, j), zoneOffset);
        }
        return m71248q(localDateTime, ZoneOffset.m71285t(chronoField.mo43354k(j)));
    }

    public final int compareTo(Object obj) {
        int i;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        ZoneOffset zoneOffset = offsetDateTime.f107259b;
        ZoneOffset zoneOffset2 = this.f107259b;
        if (zoneOffset2.equals(zoneOffset)) {
            i = toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f107258a;
            long t = localDateTime.mo43134t(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime.f107259b;
            LocalDateTime localDateTime2 = offsetDateTime.f107258a;
            int i2 = (t > localDateTime2.mo43134t(zoneOffset3) ? 1 : (t == localDateTime2.mo43134t(zoneOffset3) ? 0 : -1));
            if (i2 == 0) {
                i = localDateTime.toLocalTime().mo43157o() - localDateTime2.toLocalTime().mo43157o();
            } else {
                i = i2;
            }
        }
        if (i == 0) {
            return toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime());
        }
        return i;
    }

    /* renamed from: d */
    public final Temporal mo43046d(LocalDate localDate) {
        boolean z = localDate instanceof LocalDate;
        ZoneOffset zoneOffset = this.f107259b;
        LocalDateTime localDateTime = this.f107258a;
        if (z || (localDate instanceof LocalTime) || (localDate instanceof LocalDateTime)) {
            return m71248q(localDateTime.mo43046d(localDate), zoneOffset);
        }
        if (localDate instanceof Instant) {
            return m71247o((Instant) localDate, zoneOffset);
        }
        if (localDate instanceof ZoneOffset) {
            return m71248q(localDateTime, (ZoneOffset) localDate);
        }
        boolean z2 = localDate instanceof OffsetDateTime;
        TemporalAccessor temporalAccessor = localDate;
        if (!z2) {
            temporalAccessor = localDate.mo43001h(this);
        }
        return (OffsetDateTime) temporalAccessor;
    }

    /* renamed from: e */
    public final ValueRange mo42997e(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? temporalField.range() : this.f107258a.mo42997e(temporalField) : temporalField.mo43348d(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f107258a.equals(offsetDateTime.f107258a) && this.f107259b.equals(offsetDateTime.f107259b);
    }

    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return C40947a.m71097a(this, temporalField);
        }
        int i = C41005j.f107406a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f107258a.get(temporalField) : this.f107259b.mo43201q();
        }
        throw new C41024o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo43350g(this);
        }
        int i = C41005j.f107406a[((ChronoField) temporalField).ordinal()];
        ZoneOffset zoneOffset = this.f107259b;
        LocalDateTime localDateTime = this.f107258a;
        if (i == 1) {
            return localDateTime.mo43134t(zoneOffset);
        }
        if (i != 2) {
            return localDateTime.getLong(temporalField);
        }
        return (long) zoneOffset.mo43201q();
    }

    public final ZoneOffset getOffset() {
        return this.f107259b;
    }

    /* renamed from: h */
    public final Temporal mo43001h(Temporal temporal) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        LocalDateTime localDateTime = this.f107258a;
        return temporal.mo43043b(chronoField, localDateTime.mo43126j().toEpochDay()).mo43043b(ChronoField.NANO_OF_DAY, localDateTime.toLocalTime().mo43165w()).mo43043b(ChronoField.OFFSET_SECONDS, (long) this.f107259b.mo43201q());
    }

    public final int hashCode() {
        return this.f107258a.hashCode() ^ this.f107259b.hashCode();
    }

    /* renamed from: k */
    public final Temporal mo43054k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? mo43048g(Long.MAX_VALUE, chronoUnit).mo43048g(1, chronoUnit) : mo43048g(-j, chronoUnit);
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        if (nVar == C41022m.m71570d() || nVar == C41022m.m71572f()) {
            return this.f107259b;
        }
        if (nVar == C41022m.m71573g()) {
            return null;
        }
        C41023n b = C41022m.m71568b();
        LocalDateTime localDateTime = this.f107258a;
        if (nVar == b) {
            return localDateTime.mo43126j();
        }
        if (nVar == C41022m.m71569c()) {
            return localDateTime.toLocalTime();
        }
        if (nVar == C41022m.m71567a()) {
            return C40963f.f107281a;
        }
        if (nVar == C41022m.m71571e()) {
            return ChronoUnit.NANOS;
        }
        return nVar.mo43245a(this);
    }

    /* renamed from: p */
    public final OffsetDateTime mo43048g(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? m71248q(this.f107258a.mo43048g(j, temporalUnit), this.f107259b) : (OffsetDateTime) temporalUnit.mo43358b(this, j);
    }

    public Instant toInstant() {
        LocalDateTime localDateTime = this.f107258a;
        return Instant.ofEpochSecond(localDateTime.mo43134t(this.f107259b), (long) localDateTime.toLocalTime().mo43157o());
    }

    public LocalDateTime toLocalDateTime() {
        return this.f107258a;
    }

    public final String toString() {
        String localDateTime = this.f107258a.toString();
        String zoneOffset = this.f107259b.toString();
        return localDateTime + zoneOffset;
    }

    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime m = m71245m(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, m);
        }
        ZoneOffset zoneOffset = m.f107259b;
        ZoneOffset zoneOffset2 = this.f107259b;
        if (!zoneOffset2.equals(zoneOffset)) {
            m = new OffsetDateTime(m.f107258a.mo43133r((long) (zoneOffset2.mo43201q() - zoneOffset.mo43201q())), zoneOffset2);
        }
        return this.f107258a.until(m.f107258a, temporalUnit);
    }
}
