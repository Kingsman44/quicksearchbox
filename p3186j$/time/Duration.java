package p3186j$.time;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.format.DateTimeParseException;
import p3186j$.time.temporal.C41024o;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.time.temporal.Temporal;
import p3186j$.time.temporal.TemporalAmount;
import p3186j$.time.temporal.TemporalUnit;
import p3186j$.util.Objects;

/* renamed from: j$.time.Duration */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);

    /* renamed from: c */
    private static final BigInteger f107237c = BigInteger.valueOf(1000000000);

    /* renamed from: a */
    private final long f107238a;

    /* renamed from: b */
    private final int f107239b;

    private Duration(long j, int i) {
        this.f107238a = j;
        this.f107239b = i;
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.until(temporal2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long until = temporal.until(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long j2 = temporal2.getLong(chronoField) - temporal.getLong(chronoField);
                if (until > 0 && j2 < 0) {
                    until++;
                } else if (until < 0 && j2 > 0) {
                    until--;
                }
                j = j2;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(until, j);
        }
    }

    /* renamed from: e */
    private static Duration m71136e(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    /* renamed from: g */
    private static Duration m71137g(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(f107237c);
        if (divideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(divideAndRemainder[0].longValue(), (long) divideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: ".concat(String.valueOf(bigIntegerExact)));
    }

    /* renamed from: h */
    private static long m71138h(CharSequence charSequence, int i, int i2, int i3, String str) {
        if (i < 0 || i2 < 0) {
            return 0;
        }
        if (i2 - i >= 2) {
            try {
                if (charSequence.charAt(i) == '+') {
                    int i4 = i + 1;
                    if (Character.digit(charSequence.charAt(i4), 10) >= 0) {
                        i = i4;
                    }
                }
            } catch (ArithmeticException | NumberFormatException e) {
                throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: ".concat(str), charSequence).initCause(e));
            }
        }
        return C40947a.m71104h(Long.parseLong(charSequence.subSequence(i, i2).toString(), 10), (long) i3);
    }

    /* renamed from: k */
    private Duration m71139k(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(C40947a.m71106j(C40947a.m71106j(this.f107238a, j), j2 / 1000000000), ((long) this.f107239b) + (j2 % 1000000000));
    }

    /* renamed from: l */
    private BigDecimal m71140l() {
        return BigDecimal.valueOf(this.f107238a).add(BigDecimal.valueOf((long) this.f107239b, 9));
    }

    /* renamed from: of */
    public static Duration m71141of(long j, TemporalUnit temporalUnit) {
        return ZERO.plus(j, temporalUnit);
    }

    public static Duration ofDays(long j) {
        return m71136e(C40947a.m71104h(j, (long) 86400), 0);
    }

    public static Duration ofHours(long j) {
        return m71136e(C40947a.m71104h(j, (long) 3600), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return m71136e(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return m71136e(C40947a.m71104h(j, (long) 60), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return m71136e(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return m71136e(j, 0);
    }

    public static Duration ofSeconds(long j, long j2) {
        return m71136e(C40947a.m71106j(j, C40947a.m71102f(j2, 1000000000)), (int) C40947a.m71105i(j2, 1000000000));
    }

    public static Duration parse(CharSequence charSequence) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        CharSequence charSequence2 = charSequence;
        Objects.requireNonNull(charSequence2, "text");
        Matcher matcher = C40957c.f107279a.matcher(charSequence2);
        if (matcher.matches()) {
            int start = matcher.start(3);
            int end = matcher.end(3);
            int i3 = 1;
            if (start >= 0 && end == start + 1 && charSequence2.charAt(start) == 'T') {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int start2 = matcher.start(1);
                int end2 = matcher.end(1);
                if (start2 >= 0 && end2 == start2 + 1 && charSequence2.charAt(start2) == '-') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int start3 = matcher.start(2);
                int end3 = matcher.end(2);
                int start4 = matcher.start(4);
                int end4 = matcher.end(4);
                int start5 = matcher.start(5);
                int end5 = matcher.end(5);
                int start6 = matcher.start(6);
                int end6 = matcher.end(6);
                int start7 = matcher.start(7);
                int end7 = matcher.end(7);
                if (start3 >= 0 || start4 >= 0 || start5 >= 0 || start6 >= 0) {
                    long h = m71138h(charSequence2, start3, end3, 86400, "days");
                    long h2 = m71138h(charSequence2, start4, end4, 3600, "hours");
                    long h3 = m71138h(charSequence2, start5, end5, 60, "minutes");
                    long h4 = m71138h(charSequence2, start6, end6, 1, "seconds");
                    if (start6 < 0 || charSequence2.charAt(start6) != '-') {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        i3 = -1;
                    }
                    if (start7 < 0 || end7 < 0 || (i2 = end7 - start7) == 0) {
                        i = 0;
                    } else {
                        try {
                            int e = C40947a.m71101e(charSequence2, start7, end7, 10);
                            for (i2 = end7 - start7; i2 < 9; i2++) {
                                e *= 10;
                            }
                            i = e * i3;
                        } catch (ArithmeticException | NumberFormatException e2) {
                            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence2).initCause(e2));
                        }
                    }
                    try {
                        long j = C40947a.m71106j(h, C40947a.m71106j(h2, C40947a.m71106j(h3, h4)));
                        long j2 = (long) i;
                        if (z2) {
                            return ofSeconds(j, j2).negated();
                        }
                        return ofSeconds(j, j2);
                    } catch (ArithmeticException e3) {
                        throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: overflow", charSequence2).initCause(e3));
                    }
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Duration", charSequence2);
    }

    public Duration abs() {
        return isNegative() ? negated() : this;
    }

    /* renamed from: b */
    public final Temporal mo43005b(Temporal temporal) {
        long j = this.f107238a;
        if (j != 0) {
            temporal = temporal.mo43048g(j, ChronoUnit.SECONDS);
        }
        int i = this.f107239b;
        return i != 0 ? temporal.mo43048g((long) i, ChronoUnit.NANOS) : temporal;
    }

    public int compareTo(Duration duration) {
        int i = (this.f107238a > duration.f107238a ? 1 : (this.f107238a == duration.f107238a ? 0 : -1));
        return i != 0 ? i : this.f107239b - duration.f107239b;
    }

    /* renamed from: d */
    public final Temporal mo43008d(Temporal temporal) {
        long j = this.f107238a;
        if (j != 0) {
            temporal = temporal.mo43054k(j, ChronoUnit.SECONDS);
        }
        int i = this.f107239b;
        return i != 0 ? temporal.mo43054k((long) i, ChronoUnit.NANOS) : temporal;
    }

    public long dividedBy(Duration duration) {
        Objects.requireNonNull(duration, "divisor");
        return m71140l().divideToIntegralValue(duration.m71140l()).longValueExact();
    }

    public Duration dividedBy(long j) {
        if (j != 0) {
            return j == 1 ? this : m71137g(m71140l().divide(BigDecimal.valueOf(j), RoundingMode.DOWN));
        }
        throw new ArithmeticException("Cannot divide by zero");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f107238a == duration.f107238a && this.f107239b == duration.f107239b;
    }

    public int getNano() {
        return this.f107239b;
    }

    public long getSeconds() {
        return this.f107238a;
    }

    public int hashCode() {
        long j = this.f107238a;
        return (this.f107239b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isNegative() {
        return this.f107238a < 0;
    }

    public boolean isZero() {
        return (((long) this.f107239b) | this.f107238a) == 0;
    }

    public Duration minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1, temporalUnit) : plus(-j, temporalUnit);
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? m71139k(Long.MAX_VALUE, (long) (-nano)).m71139k(1, 0) : m71139k(-seconds, (long) (-nano));
    }

    public Duration minusDays(long j) {
        if (j != Long.MIN_VALUE) {
            return m71139k(C40947a.m71104h(-j, (long) 86400), 0);
        }
        long j2 = (long) 86400;
        Duration k = m71139k(C40947a.m71104h(Long.MAX_VALUE, j2), 0);
        k.getClass();
        return k.m71139k(C40947a.m71104h(1, j2), 0);
    }

    public Duration minusHours(long j) {
        if (j != Long.MIN_VALUE) {
            return m71139k(C40947a.m71104h(-j, (long) 3600), 0);
        }
        long j2 = (long) 3600;
        Duration k = m71139k(C40947a.m71104h(Long.MAX_VALUE, j2), 0);
        k.getClass();
        return k.m71139k(C40947a.m71104h(1, j2), 0);
    }

    public Duration minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1) : plusMillis(-j);
    }

    public Duration minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1) : plusMinutes(-j);
    }

    public Duration multipliedBy(long j) {
        return j == 0 ? ZERO : j == 1 ? this : m71137g(m71140l().multiply(BigDecimal.valueOf(j)));
    }

    public Duration negated() {
        return multipliedBy(-1);
    }

    public Duration plus(long j, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return m71139k(C40947a.m71104h(j, (long) 86400), 0);
        }
        if (temporalUnit.isDurationEstimated()) {
            throw new C41024o("Unit must not have an estimated duration");
        } else if (j == 0) {
            return this;
        } else {
            if (temporalUnit instanceof ChronoUnit) {
                int i = C40956b.f107278a[((ChronoUnit) temporalUnit).ordinal()];
                if (i == 1) {
                    return plusNanos(j);
                }
                if (i == 2) {
                    return plusSeconds((j / 1000000000) * 1000).plusNanos((j % 1000000000) * 1000);
                }
                if (i == 3) {
                    return plusMillis(j);
                }
                if (i != 4) {
                    return plusSeconds(C40947a.m71104h(temporalUnit.getDuration().f107238a, j));
                }
                return plusSeconds(j);
            }
            Duration multipliedBy = temporalUnit.getDuration().multipliedBy(j);
            return plusSeconds(multipliedBy.getSeconds()).plusNanos((long) multipliedBy.getNano());
        }
    }

    public Duration plus(Duration duration) {
        return m71139k(duration.getSeconds(), (long) duration.getNano());
    }

    public Duration plusMillis(long j) {
        return m71139k(j / 1000, (j % 1000) * 1000000);
    }

    public Duration plusMinutes(long j) {
        return m71139k(C40947a.m71104h(j, (long) 60), 0);
    }

    public Duration plusNanos(long j) {
        return m71139k(0, j);
    }

    public Duration plusSeconds(long j) {
        return m71139k(j, 0);
    }

    public long toDays() {
        return this.f107238a / 86400;
    }

    public long toHours() {
        return this.f107238a / 3600;
    }

    public int toHoursPart() {
        return (int) (toHours() % 24);
    }

    public long toMillis() {
        long j = (long) this.f107239b;
        long j2 = this.f107238a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return C40947a.m71106j(C40947a.m71104h(j2, (long) 1000), j / 1000000);
    }

    public long toMinutes() {
        return this.f107238a / 60;
    }

    public int toMinutesPart() {
        return (int) (toMinutes() % 60);
    }

    public long toNanos() {
        long j = (long) this.f107239b;
        long j2 = this.f107238a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return C40947a.m71106j(C40947a.m71104h(j2, 1000000000), j);
    }

    public long toSeconds() {
        return this.f107238a;
    }

    public int toSecondsPart() {
        return (int) (this.f107238a % 60);
    }

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.f107238a;
        int i = this.f107239b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            sb.append(j < 0 ? 2000000000 - ((long) i) : ((long) i) + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
