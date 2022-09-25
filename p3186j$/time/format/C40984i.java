package p3186j$.time.format;

import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneOffset;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.i */
final class C40984i implements C40982g {
    C40984i() {
    }

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        StringBuilder sb2 = sb;
        Long e = zVar.mo43343e(ChronoField.INSTANT_SECONDS);
        TemporalAccessor d = zVar.mo43342d();
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long valueOf = d.mo42996a(chronoField) ? Long.valueOf(zVar.mo43342d().getLong(chronoField)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int k = chronoField.mo43354k(valueOf != null ? valueOf.longValue() : 0);
        if (longValue >= -62167219200L) {
            long j = (longValue - 315569520000L) + 62167219200L;
            long f = C40947a.m71102f(j, 315569520000L) + 1;
            LocalDateTime p = LocalDateTime.m71187p(C40947a.m71105i(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (f > 0) {
                sb2.append('+');
                sb2.append(f);
            }
            sb2.append(p);
            if (p.getSecond() == 0) {
                sb2.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime p2 = LocalDateTime.m71187p(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb2.append(p2);
            if (p2.getSecond() == 0) {
                sb2.append(":00");
            }
            if (j3 < 0) {
                if (p2.getYear() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb2.insert(length, j3);
                } else {
                    sb2.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (k > 0) {
            sb2.append('.');
            int i2 = 100000000;
            while (true) {
                if (k <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = k / i2;
                sb2.append((char) (i3 + 48));
                k -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb2.append('Z');
        return true;
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4 = i;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.mo43269a(DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.mo43275e('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder.mo43281l(chronoField, 2);
        dateTimeFormatterBuilder.mo43275e(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.mo43281l(chronoField2, 2);
        dateTimeFormatterBuilder.mo43275e(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.mo43281l(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i5 = 0;
        dateTimeFormatterBuilder.mo43273b(chronoField4, 0, 9, true);
        dateTimeFormatterBuilder.mo43275e('Z');
        C40981f h = dateTimeFormatterBuilder.toFormatter().mo43264h(false);
        C40999x d = xVar.mo43321d();
        int d2 = h.mo43295d(d, charSequence, i4);
        if (d2 < 0) {
            return d2;
        }
        long longValue = d.mo43326j(ChronoField.YEAR).longValue();
        int intValue = d.mo43326j(ChronoField.MONTH_OF_YEAR).intValue();
        int intValue2 = d.mo43326j(ChronoField.DAY_OF_MONTH).intValue();
        int intValue3 = d.mo43326j(chronoField).intValue();
        int intValue4 = d.mo43326j(chronoField2).intValue();
        Long j = d.mo43326j(chronoField3);
        Long j2 = d.mo43326j(chronoField4);
        int intValue5 = j != null ? j.intValue() : 0;
        int intValue6 = j2 != null ? j2.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i2 = intValue5;
            i5 = 1;
            i3 = 0;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            xVar.mo43332p();
            i3 = intValue3;
            i2 = 59;
        } else {
            i3 = intValue3;
            i2 = intValue5;
        }
        try {
            C40999x xVar2 = xVar;
            int i6 = i;
            return xVar2.mo43331o(chronoField4, (long) intValue6, i6, xVar2.mo43331o(ChronoField.INSTANT_SECONDS, C40947a.m71104h(longValue / 10000, 315569520000L) + LocalDateTime.m71185of(((int) longValue) % 10000, intValue, intValue2, i3, intValue4, i2, 0).plusDays((long) i5).mo43134t(ZoneOffset.UTC), i6, d2));
        } catch (RuntimeException unused) {
            return i4 ^ -1;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
