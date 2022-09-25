package p3186j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.Clock;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneOffset;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.zone.c */
public final class C41028c implements Serializable {

    /* renamed from: i */
    private static final long[] f107473i = new long[0];

    /* renamed from: j */
    private static final C41027b[] f107474j = new C41027b[0];

    /* renamed from: k */
    private static final LocalDateTime[] f107475k = new LocalDateTime[0];

    /* renamed from: l */
    private static final C41026a[] f107476l = new C41026a[0];

    /* renamed from: a */
    private final long[] f107477a;

    /* renamed from: b */
    private final ZoneOffset[] f107478b;

    /* renamed from: c */
    private final long[] f107479c;

    /* renamed from: d */
    private final LocalDateTime[] f107480d;

    /* renamed from: e */
    private final ZoneOffset[] f107481e;

    /* renamed from: f */
    private final C41027b[] f107482f;

    /* renamed from: g */
    private final TimeZone f107483g;

    /* renamed from: h */
    private final transient ConcurrentHashMap f107484h = new ConcurrentHashMap();

    private C41028c(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f107478b = zoneOffsetArr;
        zoneOffsetArr[0] = zoneOffset;
        long[] jArr = f107473i;
        this.f107477a = jArr;
        this.f107479c = jArr;
        this.f107480d = f107475k;
        this.f107481e = zoneOffsetArr;
        this.f107482f = f107474j;
        this.f107483g = null;
    }

    C41028c(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f107478b = zoneOffsetArr;
        zoneOffsetArr[0] = m71606k(timeZone.getRawOffset());
        long[] jArr = f107473i;
        this.f107477a = jArr;
        this.f107479c = jArr;
        this.f107480d = f107475k;
        this.f107481e = zoneOffsetArr;
        this.f107482f = f107474j;
        this.f107483g = timeZone;
    }

    /* renamed from: a */
    private static Object m71601a(LocalDateTime localDateTime, C41026a aVar) {
        LocalDateTime d = aVar.mo43395d();
        boolean l = aVar.mo43402l();
        boolean isBefore = localDateTime.isBefore(d);
        return l ? isBefore ? aVar.mo43399h() : localDateTime.isBefore(aVar.mo43393b()) ? aVar : aVar.mo43398g() : !isBefore ? aVar.mo43398g() : localDateTime.isBefore(aVar.mo43393b()) ? aVar.mo43399h() : aVar;
    }

    /* renamed from: b */
    private C41026a[] m71602b(int i) {
        long j;
        int i2 = i;
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.f107484h;
        C41026a[] aVarArr = (C41026a[]) concurrentHashMap.get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        TimeZone timeZone = this.f107483g;
        if (timeZone != null) {
            C41026a[] aVarArr2 = f107476l;
            if (i2 < 1800) {
                return aVarArr2;
            }
            long t = LocalDateTime.m71183of(i2 - 1, 12, 31, 0, 0).mo43134t(this.f107478b[0]);
            int offset = timeZone.getOffset(t * 1000);
            long j2 = 31968000 + t;
            while (t < j2) {
                long j3 = 7776000 + t;
                long j4 = t;
                if (offset != timeZone.getOffset(j3 * 1000)) {
                    t = j4;
                    while (j3 - t > 1) {
                        long j5 = j2;
                        long f = C40947a.m71102f(j3 + t, 2);
                        int i3 = offset;
                        if (timeZone.getOffset(f * 1000) == i3) {
                            t = f;
                        } else {
                            j3 = f;
                        }
                        offset = i3;
                        j2 = j5;
                    }
                    j = j2;
                    int i4 = offset;
                    if (timeZone.getOffset(t * 1000) == i4) {
                        t = j3;
                    }
                    ZoneOffset k = m71606k(i4);
                    offset = timeZone.getOffset(t * 1000);
                    ZoneOffset k2 = m71606k(offset);
                    if (m71603c(t, k2) == i2) {
                        aVarArr2 = (C41026a[]) Arrays.copyOf(aVarArr2, aVarArr2.length + 1);
                        aVarArr2[aVarArr2.length - 1] = new C41026a(t, k, k2);
                    }
                } else {
                    j = j2;
                    int i5 = offset;
                    t = j3;
                }
                j2 = j;
            }
            if (1916 <= i2 && i2 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, aVarArr2);
            }
            return aVarArr2;
        }
        C41027b[] bVarArr = this.f107482f;
        C41026a[] aVarArr3 = new C41026a[bVarArr.length];
        if (bVarArr.length <= 0) {
            if (i2 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, aVarArr3);
            }
            return aVarArr3;
        }
        C41027b bVar = bVarArr[0];
        throw null;
    }

    /* renamed from: c */
    private static int m71603c(long j, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(C40947a.m71102f(j + ((long) zoneOffset.mo43201q()), (long) 86400)).getYear();
    }

    /* renamed from: e */
    private Object m71604e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f107478b;
        int i = 0;
        TimeZone timeZone = this.f107483g;
        if (timeZone != null) {
            C41026a[] b = m71602b(localDateTime.getYear());
            if (b.length == 0) {
                return m71606k(timeZone.getOffset(localDateTime.mo43134t(zoneOffsetArr[0]) * 1000));
            }
            int length = b.length;
            while (i < length) {
                C41026a aVar = b[i];
                Object a = m71601a(localDateTime, aVar);
                if ((a instanceof C41026a) || a.equals(aVar.mo43399h())) {
                    return a;
                }
                i++;
                obj = a;
            }
            return obj;
        } else if (this.f107479c.length == 0) {
            return zoneOffsetArr[0];
        } else {
            int length2 = this.f107482f.length;
            LocalDateTime[] localDateTimeArr = this.f107480d;
            if (length2 <= 0 || !localDateTime.isAfter(localDateTimeArr[localDateTimeArr.length - 1])) {
                int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
                ZoneOffset[] zoneOffsetArr2 = this.f107481e;
                if (binarySearch == -1) {
                    return zoneOffsetArr2[0];
                }
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                } else if (binarySearch < localDateTimeArr.length - 1) {
                    int i2 = binarySearch + 1;
                    if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i2])) {
                        binarySearch = i2;
                    }
                }
                if ((binarySearch & 1) != 0) {
                    return zoneOffsetArr2[(binarySearch / 2) + 1];
                }
                LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
                LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
                int i3 = binarySearch / 2;
                ZoneOffset zoneOffset = zoneOffsetArr2[i3];
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3 + 1];
                return zoneOffset2.mo43201q() > zoneOffset.mo43201q() ? new C41026a(localDateTime2, zoneOffset, zoneOffset2) : new C41026a(localDateTime3, zoneOffset, zoneOffset2);
            }
            C41026a[] b2 = m71602b(localDateTime.getYear());
            int length3 = b2.length;
            while (i < length3) {
                C41026a aVar2 = b2[i];
                Object a2 = m71601a(localDateTime, aVar2);
                if ((a2 instanceof C41026a) || a2.equals(aVar2.mo43399h())) {
                    return a2;
                }
                i++;
                obj = a2;
            }
            return obj;
        }
    }

    /* renamed from: j */
    public static C41028c m71605j(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new C41028c(zoneOffset);
    }

    /* renamed from: k */
    private static ZoneOffset m71606k(int i) {
        return ZoneOffset.m71285t(i / 1000);
    }

    /* renamed from: d */
    public final ZoneOffset mo43405d(Instant instant) {
        TimeZone timeZone = this.f107483g;
        if (timeZone != null) {
            return m71606k(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f107479c;
        if (jArr.length == 0) {
            return this.f107478b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f107482f.length;
        ZoneOffset[] zoneOffsetArr = this.f107481e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return zoneOffsetArr[binarySearch + 1];
        }
        C41026a[] b = m71602b(m71603c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        C41026a aVar = null;
        for (int i = 0; i < b.length; i++) {
            aVar = b[i];
            if (epochSecond < aVar.toEpochSecond()) {
                return aVar.mo43399h();
            }
        }
        return aVar.mo43398g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41028c)) {
            return false;
        }
        C41028c cVar = (C41028c) obj;
        return Objects.equals(this.f107483g, cVar.f107483g) && Arrays.equals(this.f107477a, cVar.f107477a) && Arrays.equals(this.f107478b, cVar.f107478b) && Arrays.equals(this.f107479c, cVar.f107479c) && Arrays.equals(this.f107481e, cVar.f107481e) && Arrays.equals(this.f107482f, cVar.f107482f);
    }

    /* renamed from: f */
    public final C41026a mo43407f(LocalDateTime localDateTime) {
        Object e = m71604e(localDateTime);
        if (e instanceof C41026a) {
            return (C41026a) e;
        }
        return null;
    }

    /* renamed from: g */
    public final List mo43408g(LocalDateTime localDateTime) {
        Object e = m71604e(localDateTime);
        return e instanceof C41026a ? ((C41026a) e).mo43401k() : Collections.singletonList((ZoneOffset) e);
    }

    /* renamed from: h */
    public final boolean mo43409h(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.f107483g;
        if (timeZone != null) {
            zoneOffset = m71606k(timeZone.getRawOffset());
        } else {
            int length = this.f107479c.length;
            ZoneOffset[] zoneOffsetArr = this.f107478b;
            if (length == 0) {
                zoneOffset = zoneOffsetArr[0];
            } else {
                int binarySearch = Arrays.binarySearch(this.f107477a, instant.getEpochSecond());
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                }
                zoneOffset = zoneOffsetArr[binarySearch + 1];
            }
        }
        return !zoneOffset.equals(mo43405d(instant));
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f107483g) ^ Arrays.hashCode(this.f107477a)) ^ Arrays.hashCode(this.f107478b)) ^ Arrays.hashCode(this.f107479c)) ^ Arrays.hashCode(this.f107481e)) ^ Arrays.hashCode(this.f107482f);
    }

    /* renamed from: i */
    public final boolean mo43411i() {
        C41026a aVar;
        TimeZone timeZone = this.f107483g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
                return false;
            }
            Instant now = Instant.now();
            long epochSecond = now.getEpochSecond();
            if (now.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                epochSecond++;
            }
            int c = m71603c(epochSecond, mo43405d(now));
            C41026a[] b = m71602b(c);
            int length = b.length - 1;
            while (true) {
                if (length < 0) {
                    if (c > 1800) {
                        C41026a[] b2 = m71602b(c - 1);
                        int length2 = b2.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                long min = Math.min(epochSecond - 31104000, (Clock.m71126d().mo42993c() / 1000) + 31968000);
                                int offset = timeZone.getOffset((epochSecond - 1) * 1000);
                                long epochDay = LocalDate.m71157of(1800, 1, 1).toEpochDay() * 86400;
                                while (true) {
                                    if (epochDay > min) {
                                        break;
                                    }
                                    int offset2 = timeZone.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int c2 = m71603c(min, m71606k(offset2));
                                        C41026a[] b3 = m71602b(c2 + 1);
                                        int length3 = b3.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                C41026a[] b4 = m71602b(c2);
                                                aVar = b4[b4.length - 1];
                                                break;
                                            } else if (epochSecond > b3[length3].toEpochSecond()) {
                                                aVar = b3[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    } else {
                                        min -= 7776000;
                                    }
                                }
                            } else if (epochSecond > b2[length2].toEpochSecond()) {
                                aVar = b2[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                    aVar = null;
                } else if (epochSecond > b[length].toEpochSecond()) {
                    aVar = b[length];
                    break;
                } else {
                    length--;
                }
            }
            if (aVar == null) {
                return true;
            }
            return false;
        } else if (this.f107479c.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb;
        TimeZone timeZone = this.f107483g;
        if (timeZone != null) {
            valueOf = timeZone.getID();
            sb = new StringBuilder("ZoneRules[timeZone=");
        } else {
            ZoneOffset[] zoneOffsetArr = this.f107478b;
            valueOf = String.valueOf(zoneOffsetArr[zoneOffsetArr.length - 1]);
            sb = new StringBuilder("ZoneRules[currentStandardOffset=");
        }
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
