package p3186j$.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.DateTimeException;
import p3186j$.time.DayOfWeek;
import p3186j$.time.LocalDate;
import p3186j$.time.temporal.C41020k;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.chrono.a */
public abstract class C40958a implements C40961d {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    protected C40958a() {
    }

    /* renamed from: b */
    static void m71319b(HashMap hashMap, ChronoField chronoField, long j) {
        Long l = (Long) hashMap.get(chronoField);
        if (l == null || l.longValue() == j) {
            hashMap.put(chronoField, Long.valueOf(j));
            return;
        }
        String valueOf = String.valueOf(chronoField);
        String valueOf2 = String.valueOf(chronoField);
        throw new DateTimeException("Conflict found: " + valueOf + " " + l + " differs from " + valueOf2 + " " + j);
    }

    /* renamed from: d */
    static ChronoLocalDate m71320d(LocalDate localDate, long j, long j2, long j3) {
        long j4;
        LocalDate v = localDate.mo43048g(j, ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        LocalDate v2 = v.mo43048g(j2, chronoUnit);
        if (j3 > 7) {
            j4 = j3 - 1;
            v2 = v2.mo43048g(j4 / 7, chronoUnit);
        } else {
            if (j3 < 1) {
                v2 = v2.mo43048g(C40947a.m71107k(j3, 7) / 7, chronoUnit);
                j4 = j3 + 6;
            }
            return v2.mo43046d(new C41020k(DayOfWeek.m71130of((int) j3).getValue(), 0));
        }
        j3 = (j4 % 7) + 1;
        return v2.mo43046d(new C41020k(DayOfWeek.m71130of((int) j3).getValue(), 0));
    }

    public final int compareTo(Object obj) {
        ((C40961d) obj).getClass();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40958a)) {
            return false;
        }
        ((C40958a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public final String toString() {
        return "ISO";
    }
}
