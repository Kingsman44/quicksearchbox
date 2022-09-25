package p3186j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.DateTimeException;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalTime;
import p3186j$.time.Period;
import p3186j$.time.ZoneId;
import p3186j$.time.ZoneOffset;
import p3186j$.time.ZonedDateTime;
import p3186j$.time.chrono.C40958a;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.chrono.ChronoLocalDate;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.C41024o;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.ValueRange;
import p3186j$.util.Objects;

/* renamed from: j$.time.format.D */
final class C40971D implements TemporalAccessor {

    /* renamed from: a */
    final HashMap f107296a = new HashMap();

    /* renamed from: b */
    ZoneId f107297b;

    /* renamed from: c */
    C40961d f107298c;

    /* renamed from: d */
    private C40972E f107299d;

    /* renamed from: e */
    private ChronoLocalDate f107300e;

    /* renamed from: f */
    private LocalTime f107301f;

    /* renamed from: g */
    Period f107302g = Period.f107260d;

    C40971D() {
    }

    /* renamed from: h */
    private void m71340h(TemporalAccessor temporalAccessor) {
        Iterator it = this.f107296a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.mo42996a(temporalField)) {
                try {
                    long j = temporalAccessor.getLong(temporalField);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (j == longValue) {
                        it.remove();
                    } else {
                        String valueOf = String.valueOf(temporalField);
                        String valueOf2 = String.valueOf(temporalField);
                        String valueOf3 = String.valueOf(temporalAccessor);
                        throw new DateTimeException("Conflict found: Field " + valueOf + " " + j + " differs from " + valueOf2 + " " + longValue + " derived from " + valueOf3);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    /* renamed from: n */
    private void m71341n() {
        HashMap hashMap = this.f107296a;
        if (hashMap.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f107297b;
            if (zoneId != null) {
                m71342o(zoneId);
                return;
            }
            Long l = (Long) hashMap.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                m71342o(ZoneOffset.m71285t(l.intValue()));
            }
        }
    }

    /* renamed from: o */
    private void m71342o(ZoneId zoneId) {
        HashMap hashMap = this.f107296a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        Instant ofEpochSecond = Instant.ofEpochSecond(((Long) hashMap.remove(chronoField)).longValue());
        ((C40963f) this.f107298c).getClass();
        ZonedDateTime o = ZonedDateTime.m71294o(ofEpochSecond, zoneId);
        m71346s(o.toLocalDate());
        m71347t(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf((long) o.toLocalTime().mo43166x()));
    }

    /* renamed from: p */
    private void m71343p(long j, long j2, long j3, long j4) {
        LocalTime of;
        Period period;
        if (this.f107299d == C40972E.LENIENT) {
            long j5 = C40947a.m71106j(C40947a.m71106j(C40947a.m71106j(C40947a.m71104h(j, 3600000000000L), C40947a.m71104h(j2, 60000000000L)), C40947a.m71104h(j3, 1000000000)), j4);
            of = LocalTime.m71214q(C40947a.m71105i(j5, 86400000000000L));
            period = Period.ofDays((int) C40947a.m71102f(j5, 86400000000000L));
        } else {
            int k = ChronoField.MINUTE_OF_HOUR.mo43354k(j2);
            int k2 = ChronoField.NANO_OF_SECOND.mo43354k(j4);
            if (this.f107299d == C40972E.SMART && j == 24 && k == 0 && j3 == 0 && k2 == 0) {
                of = LocalTime.f107250f;
                period = Period.ofDays(1);
            } else {
                of = LocalTime.m71213of(ChronoField.HOUR_OF_DAY.mo43354k(j), k, ChronoField.SECOND_OF_MINUTE.mo43354k(j3), k2);
                period = Period.f107260d;
            }
        }
        m71345r(of, period);
    }

    /* renamed from: q */
    private void m71344q() {
        long j;
        ChronoField chronoField;
        HashMap hashMap = this.f107296a;
        ChronoField chronoField2 = ChronoField.CLOCK_HOUR_OF_DAY;
        long j2 = 0;
        if (hashMap.containsKey(chronoField2)) {
            long longValue = ((Long) hashMap.remove(chronoField2)).longValue();
            C40972E e = this.f107299d;
            if (e == C40972E.STRICT || (e == C40972E.SMART && longValue != 0)) {
                chronoField2.mo43355l(longValue);
            }
            ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            m71347t(chronoField2, chronoField3, Long.valueOf(longValue));
        }
        ChronoField chronoField4 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (hashMap.containsKey(chronoField4)) {
            long longValue2 = ((Long) hashMap.remove(chronoField4)).longValue();
            C40972E e2 = this.f107299d;
            if (e2 == C40972E.STRICT || (e2 == C40972E.SMART && longValue2 != 0)) {
                chronoField4.mo43355l(longValue2);
            }
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j2 = longValue2;
            }
            m71347t(chronoField4, chronoField5, Long.valueOf(j2));
        }
        ChronoField chronoField6 = ChronoField.AMPM_OF_DAY;
        if (hashMap.containsKey(chronoField6)) {
            ChronoField chronoField7 = ChronoField.HOUR_OF_AMPM;
            if (hashMap.containsKey(chronoField7)) {
                long longValue3 = ((Long) hashMap.remove(chronoField6)).longValue();
                long longValue4 = ((Long) hashMap.remove(chronoField7)).longValue();
                if (this.f107299d == C40972E.LENIENT) {
                    chronoField = ChronoField.HOUR_OF_DAY;
                    j = C40947a.m71106j(C40947a.m71104h(longValue3, (long) 12), longValue4);
                } else {
                    chronoField6.mo43355l(longValue3);
                    chronoField7.mo43355l(longValue3);
                    chronoField = ChronoField.HOUR_OF_DAY;
                    j = (longValue3 * 12) + longValue4;
                }
                m71347t(chronoField6, chronoField, Long.valueOf(j));
            }
        }
        ChronoField chronoField8 = ChronoField.NANO_OF_DAY;
        if (hashMap.containsKey(chronoField8)) {
            long longValue5 = ((Long) hashMap.remove(chronoField8)).longValue();
            if (this.f107299d != C40972E.LENIENT) {
                chronoField8.mo43355l(longValue5);
            }
            m71347t(chronoField8, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            m71347t(chronoField8, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            m71347t(chronoField8, ChronoField.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            m71347t(chronoField8, ChronoField.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        ChronoField chronoField9 = ChronoField.MICRO_OF_DAY;
        if (hashMap.containsKey(chronoField9)) {
            long longValue6 = ((Long) hashMap.remove(chronoField9)).longValue();
            if (this.f107299d != C40972E.LENIENT) {
                chronoField9.mo43355l(longValue6);
            }
            m71347t(chronoField9, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            m71347t(chronoField9, ChronoField.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        ChronoField chronoField10 = ChronoField.MILLI_OF_DAY;
        if (hashMap.containsKey(chronoField10)) {
            long longValue7 = ((Long) hashMap.remove(chronoField10)).longValue();
            if (this.f107299d != C40972E.LENIENT) {
                chronoField10.mo43355l(longValue7);
            }
            m71347t(chronoField10, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            m71347t(chronoField10, ChronoField.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        ChronoField chronoField11 = ChronoField.SECOND_OF_DAY;
        if (hashMap.containsKey(chronoField11)) {
            long longValue8 = ((Long) hashMap.remove(chronoField11)).longValue();
            if (this.f107299d != C40972E.LENIENT) {
                chronoField11.mo43355l(longValue8);
            }
            m71347t(chronoField11, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            m71347t(chronoField11, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            m71347t(chronoField11, ChronoField.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        ChronoField chronoField12 = ChronoField.MINUTE_OF_DAY;
        if (hashMap.containsKey(chronoField12)) {
            long longValue9 = ((Long) hashMap.remove(chronoField12)).longValue();
            if (this.f107299d != C40972E.LENIENT) {
                chronoField12.mo43355l(longValue9);
            }
            m71347t(chronoField12, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            m71347t(chronoField12, ChronoField.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        ChronoField chronoField13 = ChronoField.NANO_OF_SECOND;
        if (hashMap.containsKey(chronoField13)) {
            long longValue10 = ((Long) hashMap.get(chronoField13)).longValue();
            C40972E e3 = this.f107299d;
            C40972E e4 = C40972E.LENIENT;
            if (e3 != e4) {
                chronoField13.mo43355l(longValue10);
            }
            ChronoField chronoField14 = ChronoField.MICRO_OF_SECOND;
            if (hashMap.containsKey(chronoField14)) {
                long longValue11 = ((Long) hashMap.remove(chronoField14)).longValue();
                if (this.f107299d != e4) {
                    chronoField14.mo43355l(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                m71347t(chronoField14, chronoField13, Long.valueOf(longValue10));
            }
            ChronoField chronoField15 = ChronoField.MILLI_OF_SECOND;
            if (hashMap.containsKey(chronoField15)) {
                long longValue12 = ((Long) hashMap.remove(chronoField15)).longValue();
                if (this.f107299d != e4) {
                    chronoField15.mo43355l(longValue12);
                }
                m71347t(chronoField15, chronoField13, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        ChronoField chronoField16 = ChronoField.HOUR_OF_DAY;
        if (hashMap.containsKey(chronoField16)) {
            ChronoField chronoField17 = ChronoField.MINUTE_OF_HOUR;
            if (hashMap.containsKey(chronoField17)) {
                ChronoField chronoField18 = ChronoField.SECOND_OF_MINUTE;
                if (hashMap.containsKey(chronoField18) && hashMap.containsKey(chronoField13)) {
                    m71343p(((Long) hashMap.remove(chronoField16)).longValue(), ((Long) hashMap.remove(chronoField17)).longValue(), ((Long) hashMap.remove(chronoField18)).longValue(), ((Long) hashMap.remove(chronoField13)).longValue());
                }
            }
        }
    }

    /* renamed from: r */
    private void m71345r(LocalTime localTime, Period period) {
        boolean z;
        LocalTime localTime2 = this.f107301f;
        if (localTime2 == null) {
            this.f107301f = localTime;
        } else if (localTime2.equals(localTime)) {
            Period period2 = this.f107302g;
            period2.getClass();
            Period period3 = Period.f107260d;
            boolean z2 = true;
            if (period2 == period3) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                period.getClass();
                if (period != period3) {
                    z2 = false;
                }
                if (!z2 && !this.f107302g.equals(period)) {
                    String valueOf = String.valueOf(this.f107302g);
                    String valueOf2 = String.valueOf(period);
                    throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + valueOf + " " + valueOf2);
                }
            }
        } else {
            String valueOf3 = String.valueOf(this.f107301f);
            String valueOf4 = String.valueOf(localTime);
            throw new DateTimeException("Conflict found: Fields resolved to different times: " + valueOf3 + " " + valueOf4);
        }
        this.f107302g = period;
    }

    /* renamed from: s */
    private void m71346s(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f107300e;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate != null && !chronoLocalDate2.equals(chronoLocalDate)) {
                String valueOf = String.valueOf(this.f107300e);
                String valueOf2 = String.valueOf(chronoLocalDate);
                throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + valueOf + " " + valueOf2);
            }
        } else if (chronoLocalDate != null) {
            if (((C40958a) this.f107298c).equals(chronoLocalDate.getChronology())) {
                this.f107300e = chronoLocalDate;
                return;
            }
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: ".concat(String.valueOf(this.f107298c)));
        }
    }

    /* renamed from: t */
    private void m71347t(ChronoField chronoField, ChronoField chronoField2, Long l) {
        Long l2 = (Long) this.f107296a.put(chronoField2, l);
        if (l2 != null && l2.longValue() != l.longValue()) {
            String valueOf = String.valueOf(chronoField2);
            String valueOf2 = String.valueOf(chronoField2);
            String valueOf3 = String.valueOf(chronoField);
            throw new DateTimeException("Conflict found: " + valueOf + " " + l2 + " differs from " + valueOf2 + " " + l + " while resolving  " + valueOf3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r1.f107300e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f107301f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42996a(p3186j$.time.temporal.TemporalField r2) {
        /*
            r1 = this;
            java.util.HashMap r0 = r1.f107296a
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L_0x002c
            j$.time.chrono.ChronoLocalDate r0 = r1.f107300e
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo42996a(r2)
            if (r0 != 0) goto L_0x002c
        L_0x0012:
            j$.time.LocalTime r0 = r1.f107301f
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.mo42996a(r2)
            if (r0 == 0) goto L_0x001d
            goto L_0x002c
        L_0x001d:
            if (r2 == 0) goto L_0x002a
            boolean r0 = r2 instanceof p3186j$.time.temporal.ChronoField
            if (r0 != 0) goto L_0x002a
            boolean r2 = r2.mo43347b(r1)
            if (r2 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r2 = 0
            goto L_0x002d
        L_0x002c:
            r2 = 1
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.format.C40971D.mo42996a(j$.time.temporal.TemporalField):boolean");
    }

    /* renamed from: e */
    public final /* synthetic */ ValueRange mo42997e(TemporalField temporalField) {
        return C40947a.m71099c(this, temporalField);
    }

    public final /* synthetic */ int get(TemporalField temporalField) {
        return C40947a.m71097a(this, temporalField);
    }

    public final long getLong(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l = (Long) this.f107296a.get(temporalField);
        if (l != null) {
            return l.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f107300e;
        if (chronoLocalDate != null && chronoLocalDate.mo42996a(temporalField)) {
            return this.f107300e.getLong(temporalField);
        }
        LocalTime localTime = this.f107301f;
        if (localTime != null && localTime.mo42996a(temporalField)) {
            return this.f107301f.getLong(temporalField);
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo43350g(this);
        }
        throw new C41024o("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    /* renamed from: l */
    public final Object mo43002l(C41023n nVar) {
        if (nVar == C41022m.m71573g()) {
            return this.f107297b;
        }
        if (nVar == C41022m.m71567a()) {
            return this.f107298c;
        }
        if (nVar == C41022m.m71568b()) {
            ChronoLocalDate chronoLocalDate = this.f107300e;
            if (chronoLocalDate != null) {
                return LocalDate.m71156o(chronoLocalDate);
            }
            return null;
        } else if (nVar == C41022m.m71569c()) {
            return this.f107301f;
        } else {
            if (nVar == C41022m.m71570d()) {
                Long l = (Long) this.f107296a.get(ChronoField.OFFSET_SECONDS);
                if (l != null) {
                    return ZoneOffset.m71285t(l.intValue());
                }
                ZoneId zoneId = this.f107297b;
                return zoneId instanceof ZoneOffset ? zoneId : nVar.mo43245a(this);
            } else if (nVar == C41022m.m71572f()) {
                return nVar.mo43245a(this);
            } else {
                if (nVar == C41022m.m71571e()) {
                    return null;
                }
                return nVar.mo43245a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020e  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43256m(p3186j$.time.format.C40972E r25, java.util.Set r26) {
        /*
            r24 = this;
            r9 = r24
            r0 = r26
            java.util.HashMap r10 = r9.f107296a
            if (r0 == 0) goto L_0x000f
            java.util.Set r1 = r10.keySet()
            r1.retainAll(r0)
        L_0x000f:
            r0 = r25
            r9.f107299d = r0
            r24.m71341n()
            j$.time.chrono.d r0 = r9.f107298c
            j$.time.format.E r1 = r9.f107299d
            j$.time.chrono.f r0 = (p3186j$.time.chrono.C40963f) r0
            j$.time.LocalDate r0 = r0.mo43244e(r10, r1)
            r9.m71346s(r0)
            r24.m71344q()
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x00e6
            r0 = 0
        L_0x002d:
            r1 = 50
            if (r0 >= r1) goto L_0x00c6
            java.util.Set r2 = r10.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c6
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            j$.time.temporal.TemporalField r3 = (p3186j$.time.temporal.TemporalField) r3
            j$.time.format.E r4 = r9.f107299d
            j$.time.temporal.TemporalAccessor r4 = r3.mo43349e(r10, r9, r4)
            if (r4 == 0) goto L_0x00bc
            boolean r1 = r4 instanceof p3186j$.time.chrono.ChronoZonedDateTime
            if (r1 == 0) goto L_0x0087
            j$.time.chrono.ChronoZonedDateTime r4 = (p3186j$.time.chrono.ChronoZonedDateTime) r4
            j$.time.ZoneId r1 = r9.f107297b
            if (r1 != 0) goto L_0x0064
            j$.time.ZoneId r1 = r4.getZone()
            r9.f107297b = r1
            goto L_0x006e
        L_0x0064:
            j$.time.ZoneId r2 = r4.getZone()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0073
        L_0x006e:
            j$.time.LocalDateTime r4 = r4.mo43202c()
            goto L_0x0087
        L_0x0073:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            j$.time.ZoneId r1 = r9.f107297b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r2 = "ChronoZonedDateTime must use the effective parsed zone: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0087:
            boolean r1 = r4 instanceof p3186j$.time.chrono.ChronoLocalDateTime
            if (r1 == 0) goto L_0x009e
            j$.time.chrono.ChronoLocalDateTime r4 = (p3186j$.time.chrono.ChronoLocalDateTime) r4
            j$.time.LocalTime r1 = r4.toLocalTime()
            j$.time.Period r2 = p3186j$.time.Period.f107260d
            r9.m71345r(r1, r2)
            j$.time.LocalDate r1 = r4.mo43126j()
            r9.m71346s(r1)
            goto L_0x00c2
        L_0x009e:
            boolean r1 = r4 instanceof p3186j$.time.chrono.ChronoLocalDate
            if (r1 == 0) goto L_0x00a8
            j$.time.chrono.ChronoLocalDate r4 = (p3186j$.time.chrono.ChronoLocalDate) r4
            r9.m71346s(r4)
            goto L_0x00c2
        L_0x00a8:
            boolean r1 = r4 instanceof p3186j$.time.LocalTime
            if (r1 == 0) goto L_0x00b4
            j$.time.LocalTime r4 = (p3186j$.time.LocalTime) r4
            j$.time.Period r1 = p3186j$.time.Period.f107260d
            r9.m71345r(r4, r1)
            goto L_0x00c2
        L_0x00b4:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.String r1 = "Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime"
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            boolean r3 = r10.containsKey(r3)
            if (r3 != 0) goto L_0x0039
        L_0x00c2:
            int r0 = r0 + 1
            goto L_0x002d
        L_0x00c6:
            if (r0 == r1) goto L_0x00de
            if (r0 <= 0) goto L_0x00e6
            r24.m71341n()
            j$.time.chrono.d r0 = r9.f107298c
            j$.time.format.E r1 = r9.f107299d
            j$.time.chrono.f r0 = (p3186j$.time.chrono.C40963f) r0
            j$.time.LocalDate r0 = r0.mo43244e(r10, r1)
            r9.m71346s(r0)
            r24.m71344q()
            goto L_0x00e6
        L_0x00de:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.String r1 = "One of the parsed fields has an incorrectly implemented resolve method"
            r0.<init>(r1)
            throw r0
        L_0x00e6:
            j$.time.LocalTime r0 = r9.f107301f
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 1000000(0xf4240, double:4.940656E-318)
            r16 = 0
            if (r0 != 0) goto L_0x01c3
            j$.time.temporal.ChronoField r0 = p3186j$.time.temporal.ChronoField.MILLI_OF_SECOND
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L_0x0138
            java.lang.Object r1 = r10.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            j$.time.temporal.ChronoField r3 = p3186j$.time.temporal.ChronoField.MICRO_OF_SECOND
            boolean r4 = r10.containsKey(r3)
            if (r4 == 0) goto L_0x012c
            long r1 = r1 * r12
            java.lang.Object r4 = r10.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r4 = r4 % r12
            long r4 = r4 + r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r9.m71347t(r0, r3, r1)
            r10.remove(r3)
            j$.time.temporal.ChronoField r0 = p3186j$.time.temporal.ChronoField.NANO_OF_SECOND
            long r4 = r4 * r12
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            goto L_0x0134
        L_0x012c:
            j$.time.temporal.ChronoField r0 = p3186j$.time.temporal.ChronoField.NANO_OF_SECOND
            long r1 = r1 * r14
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x0134:
            r10.put(r0, r1)
            goto L_0x0155
        L_0x0138:
            j$.time.temporal.ChronoField r0 = p3186j$.time.temporal.ChronoField.MICRO_OF_SECOND
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L_0x0155
            java.lang.Object r0 = r10.remove(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.NANO_OF_SECOND
            long r0 = r0 * r12
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.put(r2, r0)
        L_0x0155:
            j$.time.temporal.ChronoField r7 = p3186j$.time.temporal.ChronoField.HOUR_OF_DAY
            java.lang.Object r0 = r10.get(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x01c3
            j$.time.temporal.ChronoField r8 = p3186j$.time.temporal.ChronoField.MINUTE_OF_HOUR
            java.lang.Object r1 = r10.get(r8)
            java.lang.Long r1 = (java.lang.Long) r1
            j$.time.temporal.ChronoField r5 = p3186j$.time.temporal.ChronoField.SECOND_OF_MINUTE
            java.lang.Object r2 = r10.get(r5)
            java.lang.Long r2 = (java.lang.Long) r2
            j$.time.temporal.ChronoField r6 = p3186j$.time.temporal.ChronoField.NANO_OF_SECOND
            java.lang.Object r3 = r10.get(r6)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r1 != 0) goto L_0x017d
            if (r2 != 0) goto L_0x0203
            if (r3 != 0) goto L_0x0203
        L_0x017d:
            if (r1 == 0) goto L_0x0185
            if (r2 != 0) goto L_0x0185
            if (r3 == 0) goto L_0x0185
            goto L_0x0203
        L_0x0185:
            if (r1 == 0) goto L_0x018c
            long r18 = r1.longValue()
            goto L_0x018e
        L_0x018c:
            r18 = r16
        L_0x018e:
            if (r2 == 0) goto L_0x0197
            long r1 = r2.longValue()
            r20 = r1
            goto L_0x0199
        L_0x0197:
            r20 = r16
        L_0x0199:
            if (r3 == 0) goto L_0x01a2
            long r1 = r3.longValue()
            r22 = r1
            goto L_0x01a4
        L_0x01a2:
            r22 = r16
        L_0x01a4:
            long r1 = r0.longValue()
            r0 = r24
            r3 = r18
            r11 = r5
            r14 = r6
            r5 = r20
            r15 = r7
            r12 = r8
            r7 = r22
            r0.m71343p(r1, r3, r5, r7)
            r10.remove(r15)
            r10.remove(r12)
            r10.remove(r11)
            r10.remove(r14)
        L_0x01c3:
            j$.time.format.E r0 = r9.f107299d
            j$.time.format.E r1 = p3186j$.time.format.C40972E.LENIENT
            if (r0 == r1) goto L_0x0203
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x0203
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01d7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0203
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            j$.time.temporal.TemporalField r2 = (p3186j$.time.temporal.TemporalField) r2
            boolean r3 = r2 instanceof p3186j$.time.temporal.ChronoField
            if (r3 == 0) goto L_0x01d7
            boolean r3 = r2.isTimeBased()
            if (r3 == 0) goto L_0x01d7
            j$.time.temporal.ChronoField r2 = (p3186j$.time.temporal.ChronoField) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r2.mo43355l(r3)
            goto L_0x01d7
        L_0x0203:
            j$.time.chrono.ChronoLocalDate r0 = r9.f107300e
            if (r0 == 0) goto L_0x020a
            r9.m71340h(r0)
        L_0x020a:
            j$.time.LocalTime r0 = r9.f107301f
            if (r0 == 0) goto L_0x0226
            r9.m71340h(r0)
            j$.time.chrono.ChronoLocalDate r0 = r9.f107300e
            if (r0 == 0) goto L_0x0226
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x0226
            j$.time.chrono.ChronoLocalDate r0 = r9.f107300e
            j$.time.LocalTime r1 = r9.f107301f
            j$.time.LocalDateTime r0 = r0.mo43076f(r1)
            r9.m71340h(r0)
        L_0x0226:
            j$.time.chrono.ChronoLocalDate r0 = r9.f107300e
            if (r0 == 0) goto L_0x0248
            j$.time.LocalTime r0 = r9.f107301f
            if (r0 == 0) goto L_0x0248
            j$.time.Period r0 = r9.f107302g
            r0.getClass()
            j$.time.Period r1 = p3186j$.time.Period.f107260d
            if (r0 != r1) goto L_0x0239
            r11 = 1
            goto L_0x023a
        L_0x0239:
            r11 = 0
        L_0x023a:
            if (r11 != 0) goto L_0x0248
            j$.time.chrono.ChronoLocalDate r0 = r9.f107300e
            j$.time.Period r2 = r9.f107302g
            j$.time.LocalDate r0 = r0.mo43084i(r2)
            r9.f107300e = r0
            r9.f107302g = r1
        L_0x0248:
            j$.time.LocalTime r0 = r9.f107301f
            if (r0 != 0) goto L_0x02a4
            j$.time.temporal.ChronoField r0 = p3186j$.time.temporal.ChronoField.INSTANT_SECONDS
            boolean r0 = r10.containsKey(r0)
            if (r0 != 0) goto L_0x0264
            j$.time.temporal.ChronoField r0 = p3186j$.time.temporal.ChronoField.SECOND_OF_DAY
            boolean r0 = r10.containsKey(r0)
            if (r0 != 0) goto L_0x0264
            j$.time.temporal.ChronoField r0 = p3186j$.time.temporal.ChronoField.SECOND_OF_MINUTE
            boolean r0 = r10.containsKey(r0)
            if (r0 == 0) goto L_0x02a4
        L_0x0264:
            j$.time.temporal.ChronoField r0 = p3186j$.time.temporal.ChronoField.NANO_OF_SECOND
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L_0x028b
            java.lang.Object r0 = r10.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.MICRO_OF_SECOND
            r3 = 1000(0x3e8, double:4.94E-321)
            long r3 = r0 / r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10.put(r2, r3)
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.MILLI_OF_SECOND
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r16 = r0 / r3
            goto L_0x029d
        L_0x028b:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            r10.put(r0, r1)
            j$.time.temporal.ChronoField r0 = p3186j$.time.temporal.ChronoField.MICRO_OF_SECOND
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            r10.put(r0, r1)
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.MILLI_OF_SECOND
        L_0x029d:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r10.put(r2, r0)
        L_0x02a4:
            j$.time.chrono.ChronoLocalDate r0 = r9.f107300e
            if (r0 == 0) goto L_0x02ea
            j$.time.LocalTime r0 = r9.f107301f
            if (r0 == 0) goto L_0x02ea
            j$.time.temporal.ChronoField r0 = p3186j$.time.temporal.ChronoField.OFFSET_SECONDS
            java.lang.Object r0 = r10.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x02cb
            int r0 = r0.intValue()
            j$.time.ZoneOffset r0 = p3186j$.time.ZoneOffset.m71285t(r0)
            j$.time.chrono.ChronoLocalDate r1 = r9.f107300e
            j$.time.LocalTime r2 = r9.f107301f
            j$.time.LocalDateTime r1 = r1.mo43076f(r2)
            j$.time.ZonedDateTime r0 = r1.atZone(r0)
            goto L_0x02dd
        L_0x02cb:
            j$.time.ZoneId r0 = r9.f107297b
            if (r0 == 0) goto L_0x02ea
            j$.time.chrono.ChronoLocalDate r0 = r9.f107300e
            j$.time.LocalTime r1 = r9.f107301f
            j$.time.LocalDateTime r0 = r0.mo43076f(r1)
            j$.time.ZoneId r1 = r9.f107297b
            j$.time.ZonedDateTime r0 = r0.atZone(r1)
        L_0x02dd:
            long r0 = r0.toEpochSecond()
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.INSTANT_SECONDS
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.put(r2, r0)
        L_0x02ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.format.C40971D.mo43256m(j$.time.format.E, java.util.Set):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f107296a);
        sb.append(',');
        sb.append(this.f107298c);
        if (this.f107297b != null) {
            sb.append(',');
            sb.append(this.f107297b);
        }
        if (!(this.f107300e == null && this.f107301f == null)) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f107300e;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.f107301f != null) {
                    sb.append('T');
                }
            }
            sb.append(this.f107301f);
        }
        return sb.toString();
    }
}
