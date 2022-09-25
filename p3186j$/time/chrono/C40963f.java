package p3186j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.f */
public final class C40963f extends C40958a implements Serializable {

    /* renamed from: a */
    public static final C40963f f107281a = new C40963f();

    private C40963f() {
    }

    public static boolean isLeapYear(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        if (r2 > 0) goto L_0x00ac;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.time.LocalDate mo43244e(java.util.HashMap r19, p3186j$.time.format.C40972E r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.EPOCH_DAY
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x001c
            java.lang.Object r0 = r0.remove(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            j$.time.LocalDate r0 = p3186j$.time.LocalDate.ofEpochDay(r0)
            goto L_0x04b4
        L_0x001c:
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.PROLEPTIC_MONTH
            java.lang.Object r3 = r0.remove(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            r4 = 1
            if (r3 == 0) goto L_0x0052
            j$.time.format.E r5 = p3186j$.time.format.C40972E.LENIENT
            if (r1 == r5) goto L_0x0032
            long r5 = r3.longValue()
            r2.mo43355l(r5)
        L_0x0032:
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.MONTH_OF_YEAR
            long r5 = r3.longValue()
            r7 = 12
            long r7 = (long) r7
            long r5 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71105i(r5, r7)
            int r6 = (int) r5
            int r6 = r6 + r4
            long r5 = (long) r6
            p3186j$.time.chrono.C40958a.m71319b(r0, r2, r5)
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.YEAR
            long r5 = r3.longValue()
            long r5 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71102f(r5, r7)
            p3186j$.time.chrono.C40958a.m71319b(r0, r2, r5)
        L_0x0052:
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.YEAR_OF_ERA
            java.lang.Object r3 = r0.remove(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            r5 = 0
            r7 = 1
            if (r3 == 0) goto L_0x00e9
            j$.time.format.E r9 = p3186j$.time.format.C40972E.LENIENT
            if (r1 == r9) goto L_0x006b
            long r9 = r3.longValue()
            r2.mo43355l(r9)
        L_0x006b:
            j$.time.temporal.ChronoField r9 = p3186j$.time.temporal.ChronoField.ERA
            java.lang.Object r9 = r0.remove(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 != 0) goto L_0x00b0
            j$.time.temporal.ChronoField r9 = p3186j$.time.temporal.ChronoField.YEAR
            java.lang.Object r10 = r0.get(r9)
            java.lang.Long r10 = (java.lang.Long) r10
            j$.time.format.E r11 = p3186j$.time.format.C40972E.STRICT
            if (r1 != r11) goto L_0x0094
            if (r10 == 0) goto L_0x0090
            long r10 = r10.longValue()
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            long r10 = r3.longValue()
            if (r2 <= 0) goto L_0x00a3
            goto L_0x00ac
        L_0x0090:
            r0.put(r2, r3)
            goto L_0x00fe
        L_0x0094:
            if (r10 == 0) goto L_0x00a8
            long r10 = r10.longValue()
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x009f
            goto L_0x00a8
        L_0x009f:
            long r10 = r3.longValue()
        L_0x00a3:
            long r10 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r7, r10)
            goto L_0x00ac
        L_0x00a8:
            long r10 = r3.longValue()
        L_0x00ac:
            p3186j$.time.chrono.C40958a.m71319b(r0, r9, r10)
            goto L_0x00fe
        L_0x00b0:
            long r10 = r9.longValue()
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00bf
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.YEAR
            long r9 = r3.longValue()
            goto L_0x00d1
        L_0x00bf:
            long r10 = r9.longValue()
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00d5
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.YEAR
            long r9 = r3.longValue()
            long r9 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r7, r9)
        L_0x00d1:
            p3186j$.time.chrono.C40958a.m71319b(r0, r2, r9)
            goto L_0x00fe
        L_0x00d5:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid value for era: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00e9:
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.ERA
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x00fe
            java.lang.Object r3 = r0.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r9 = r3.longValue()
            r2.mo43355l(r9)
        L_0x00fe:
            j$.time.temporal.ChronoField r2 = p3186j$.time.temporal.ChronoField.YEAR
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x04b3
            j$.time.temporal.ChronoField r3 = p3186j$.time.temporal.ChronoField.MONTH_OF_YEAR
            boolean r9 = r0.containsKey(r3)
            r10 = 0
            if (r9 == 0) goto L_0x032e
            j$.time.temporal.ChronoField r9 = p3186j$.time.temporal.ChronoField.DAY_OF_MONTH
            boolean r11 = r0.containsKey(r9)
            if (r11 == 0) goto L_0x01b3
            java.lang.Object r11 = r0.remove(r2)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            int r2 = r2.mo43354k(r11)
            j$.time.format.E r11 = p3186j$.time.format.C40972E.LENIENT
            if (r1 != r11) goto L_0x0153
            java.lang.Object r1 = r0.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            long r5 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r5, r7)
            java.lang.Object r0 = r0.remove(r9)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r0, r7)
            j$.time.LocalDate r2 = p3186j$.time.LocalDate.m71157of(r2, r4, r4)
            j$.time.LocalDate r2 = r2.plusMonths(r5)
            j$.time.LocalDate r0 = r2.plusDays(r0)
            goto L_0x04b4
        L_0x0153:
            java.lang.Object r7 = r0.remove(r3)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            int r3 = r3.mo43354k(r7)
            java.lang.Object r0 = r0.remove(r9)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            int r0 = r9.mo43354k(r7)
            j$.time.format.E r7 = p3186j$.time.format.C40972E.SMART
            if (r1 != r7) goto L_0x01ad
            r1 = 4
            if (r3 == r1) goto L_0x01a7
            r1 = 6
            if (r3 == r1) goto L_0x01a7
            r1 = 9
            if (r3 == r1) goto L_0x01a7
            r1 = 11
            if (r3 != r1) goto L_0x0182
            goto L_0x01a7
        L_0x0182:
            r1 = 2
            if (r3 != r1) goto L_0x01ad
            j$.time.Month r1 = p3186j$.time.Month.FEBRUARY
            long r7 = (long) r2
            int r9 = p3186j$.time.C41006k.f107407a
            r11 = 3
            long r11 = r11 & r7
            int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x01a1
            r11 = 100
            long r11 = r7 % r11
            int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x01a2
            r11 = 400(0x190, double:1.976E-321)
            long r7 = r7 % r11
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x01a1
            goto L_0x01a2
        L_0x01a1:
            r4 = 0
        L_0x01a2:
            int r1 = r1.mo43171n(r4)
            goto L_0x01a9
        L_0x01a7:
            r1 = 30
        L_0x01a9:
            int r0 = java.lang.Math.min(r0, r1)
        L_0x01ad:
            j$.time.LocalDate r0 = p3186j$.time.LocalDate.m71157of(r2, r3, r0)
            goto L_0x04b4
        L_0x01b3:
            j$.time.temporal.ChronoField r5 = p3186j$.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L_0x032e
            j$.time.temporal.ChronoField r6 = p3186j$.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH
            boolean r9 = r0.containsKey(r6)
            java.lang.String r11 = "Strict mode rejected resolved date as it is in a different month"
            if (r9 == 0) goto L_0x0275
            j$.time.temporal.ValueRange r9 = r2.range()
            java.lang.Object r10 = r0.remove(r2)
            java.lang.Long r10 = (java.lang.Long) r10
            long r12 = r10.longValue()
            int r2 = r9.mo43365a(r2, r12)
            j$.time.format.E r9 = p3186j$.time.format.C40972E.LENIENT
            if (r1 != r9) goto L_0x021d
            java.lang.Object r1 = r0.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r9 = r1.longValue()
            long r9 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r9, r7)
            java.lang.Object r1 = r0.remove(r5)
            java.lang.Long r1 = (java.lang.Long) r1
            long r11 = r1.longValue()
            long r11 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r11, r7)
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r0, r7)
            j$.time.LocalDate r2 = p3186j$.time.LocalDate.m71157of(r2, r4, r4)
            j$.time.temporal.ChronoUnit r3 = p3186j$.time.temporal.ChronoUnit.MONTHS
            j$.time.LocalDate r2 = r2.mo43048g(r9, r3)
            j$.time.temporal.ChronoUnit r3 = p3186j$.time.temporal.ChronoUnit.WEEKS
            j$.time.LocalDate r2 = r2.mo43048g(r11, r3)
            j$.time.temporal.ChronoUnit r3 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.LocalDate r0 = r2.mo43048g(r0, r3)
            goto L_0x04b4
        L_0x021d:
            j$.time.temporal.ValueRange r7 = r3.range()
            java.lang.Object r8 = r0.remove(r3)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            int r7 = r7.mo43365a(r3, r8)
            j$.time.temporal.ValueRange r8 = r5.range()
            java.lang.Object r9 = r0.remove(r5)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            int r5 = r8.mo43365a(r5, r9)
            j$.time.temporal.ValueRange r8 = r6.range()
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r9 = r0.longValue()
            int r0 = r8.mo43365a(r6, r9)
            j$.time.LocalDate r2 = p3186j$.time.LocalDate.m71157of(r2, r7, r4)
            int r5 = r5 - r4
            int r5 = r5 * 7
            int r0 = r0 - r4
            int r0 = r0 + r5
            long r4 = (long) r0
            j$.time.temporal.ChronoUnit r0 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.LocalDate r0 = r2.mo43048g(r4, r0)
            j$.time.format.E r2 = p3186j$.time.format.C40972E.STRICT
            if (r1 != r2) goto L_0x04b4
            int r1 = r0.get(r3)
            if (r1 != r7) goto L_0x026f
            goto L_0x04b4
        L_0x026f:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            r0.<init>(r11)
            throw r0
        L_0x0275:
            j$.time.temporal.ChronoField r6 = p3186j$.time.temporal.ChronoField.DAY_OF_WEEK
            boolean r9 = r0.containsKey(r6)
            if (r9 == 0) goto L_0x032e
            j$.time.temporal.ValueRange r9 = r2.range()
            java.lang.Object r12 = r0.remove(r2)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            int r2 = r9.mo43365a(r2, r12)
            j$.time.format.E r9 = p3186j$.time.format.C40972E.LENIENT
            if (r1 != r9) goto L_0x02c7
            java.lang.Object r1 = r0.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r9 = r1.longValue()
            long r12 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r9, r7)
            java.lang.Object r1 = r0.remove(r5)
            java.lang.Long r1 = (java.lang.Long) r1
            long r9 = r1.longValue()
            long r14 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r9, r7)
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r16 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r0, r7)
            j$.time.LocalDate r11 = p3186j$.time.LocalDate.m71157of(r2, r4, r4)
            j$.time.chrono.ChronoLocalDate r0 = p3186j$.time.chrono.C40958a.m71320d(r11, r12, r14, r16)
            goto L_0x04b4
        L_0x02c7:
            j$.time.temporal.ValueRange r7 = r3.range()
            java.lang.Object r8 = r0.remove(r3)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            int r7 = r7.mo43365a(r3, r8)
            j$.time.temporal.ValueRange r8 = r5.range()
            java.lang.Object r9 = r0.remove(r5)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            int r5 = r8.mo43365a(r5, r12)
            j$.time.temporal.ValueRange r8 = r6.range()
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            int r0 = r8.mo43365a(r6, r12)
            j$.time.LocalDate r2 = p3186j$.time.LocalDate.m71157of(r2, r7, r4)
            int r5 = r5 - r4
            int r5 = r5 * 7
            long r4 = (long) r5
            j$.time.temporal.ChronoUnit r6 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.LocalDate r2 = r2.mo43048g(r4, r6)
            j$.time.DayOfWeek r0 = p3186j$.time.DayOfWeek.m71130of(r0)
            int r0 = r0.getValue()
            j$.time.temporal.k r4 = new j$.time.temporal.k
            r4.<init>(r0, r10)
            j$.time.LocalDate r0 = r2.mo43046d(r4)
            j$.time.format.E r2 = p3186j$.time.format.C40972E.STRICT
            if (r1 != r2) goto L_0x04b4
            int r1 = r0.get(r3)
            if (r1 != r7) goto L_0x0328
            goto L_0x04b4
        L_0x0328:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            r0.<init>(r11)
            throw r0
        L_0x032e:
            j$.time.temporal.ChronoField r3 = p3186j$.time.temporal.ChronoField.DAY_OF_YEAR
            boolean r5 = r0.containsKey(r3)
            if (r5 == 0) goto L_0x037e
            j$.time.temporal.ValueRange r5 = r2.range()
            java.lang.Object r6 = r0.remove(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r9 = r6.longValue()
            int r2 = r5.mo43365a(r2, r9)
            j$.time.format.E r5 = p3186j$.time.format.C40972E.LENIENT
            if (r1 != r5) goto L_0x0366
            java.lang.Object r0 = r0.remove(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r0, r7)
            j$.time.LocalDate r2 = p3186j$.time.LocalDate.m71162u(r2, r4)
            j$.time.temporal.ChronoUnit r3 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.LocalDate r0 = r2.mo43048g(r0, r3)
            goto L_0x04b4
        L_0x0366:
            j$.time.temporal.ValueRange r1 = r3.range()
            java.lang.Object r0 = r0.remove(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            int r0 = r1.mo43365a(r3, r4)
            j$.time.LocalDate r0 = p3186j$.time.LocalDate.m71162u(r2, r0)
            goto L_0x04b4
        L_0x037e:
            j$.time.temporal.ChronoField r3 = p3186j$.time.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR
            boolean r5 = r0.containsKey(r3)
            if (r5 == 0) goto L_0x04b3
            j$.time.temporal.ChronoField r5 = p3186j$.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR
            boolean r6 = r0.containsKey(r5)
            java.lang.String r9 = "Strict mode rejected resolved date as it is in a different year"
            if (r6 == 0) goto L_0x041a
            j$.time.temporal.ValueRange r6 = r2.range()
            java.lang.Object r10 = r0.remove(r2)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            int r6 = r6.mo43365a(r2, r10)
            j$.time.format.E r10 = p3186j$.time.format.C40972E.LENIENT
            if (r1 != r10) goto L_0x03d4
            java.lang.Object r1 = r0.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r1, r7)
            java.lang.Object r0 = r0.remove(r5)
            java.lang.Long r0 = (java.lang.Long) r0
            long r9 = r0.longValue()
            long r7 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r9, r7)
            j$.time.LocalDate r0 = p3186j$.time.LocalDate.m71162u(r6, r4)
            j$.time.temporal.ChronoUnit r3 = p3186j$.time.temporal.ChronoUnit.WEEKS
            j$.time.LocalDate r0 = r0.mo43048g(r1, r3)
            j$.time.temporal.ChronoUnit r1 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.LocalDate r0 = r0.mo43048g(r7, r1)
            goto L_0x04b4
        L_0x03d4:
            j$.time.temporal.ValueRange r7 = r3.range()
            java.lang.Object r8 = r0.remove(r3)
            java.lang.Long r8 = (java.lang.Long) r8
            long r10 = r8.longValue()
            int r3 = r7.mo43365a(r3, r10)
            j$.time.temporal.ValueRange r7 = r5.range()
            java.lang.Object r0 = r0.remove(r5)
            java.lang.Long r0 = (java.lang.Long) r0
            long r10 = r0.longValue()
            int r0 = r7.mo43365a(r5, r10)
            j$.time.LocalDate r5 = p3186j$.time.LocalDate.m71162u(r6, r4)
            int r3 = r3 - r4
            int r3 = r3 * 7
            int r0 = r0 - r4
            int r0 = r0 + r3
            long r3 = (long) r0
            j$.time.temporal.ChronoUnit r0 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.LocalDate r0 = r5.mo43048g(r3, r0)
            j$.time.format.E r3 = p3186j$.time.format.C40972E.STRICT
            if (r1 != r3) goto L_0x04b4
            int r1 = r0.get(r2)
            if (r1 != r6) goto L_0x0414
            goto L_0x04b4
        L_0x0414:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            r0.<init>(r9)
            throw r0
        L_0x041a:
            j$.time.temporal.ChronoField r5 = p3186j$.time.temporal.ChronoField.DAY_OF_WEEK
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L_0x04b3
            j$.time.temporal.ValueRange r6 = r2.range()
            java.lang.Object r11 = r0.remove(r2)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            int r6 = r6.mo43365a(r2, r11)
            j$.time.format.E r11 = p3186j$.time.format.C40972E.LENIENT
            if (r1 != r11) goto L_0x045f
            java.lang.Object r1 = r0.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r12 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r1, r7)
            java.lang.Object r0 = r0.remove(r5)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r14 = p3186j$.desugar.sun.nio.p3187fs.C40947a.m71107k(r0, r7)
            j$.time.LocalDate r9 = p3186j$.time.LocalDate.m71162u(r6, r4)
            r10 = 0
            j$.time.chrono.ChronoLocalDate r0 = p3186j$.time.chrono.C40958a.m71320d(r9, r10, r12, r14)
            goto L_0x04b4
        L_0x045f:
            j$.time.temporal.ValueRange r7 = r3.range()
            java.lang.Object r8 = r0.remove(r3)
            java.lang.Long r8 = (java.lang.Long) r8
            long r11 = r8.longValue()
            int r3 = r7.mo43365a(r3, r11)
            j$.time.temporal.ValueRange r7 = r5.range()
            java.lang.Object r0 = r0.remove(r5)
            java.lang.Long r0 = (java.lang.Long) r0
            long r11 = r0.longValue()
            int r0 = r7.mo43365a(r5, r11)
            j$.time.LocalDate r5 = p3186j$.time.LocalDate.m71162u(r6, r4)
            int r3 = r3 - r4
            int r3 = r3 * 7
            long r3 = (long) r3
            j$.time.temporal.ChronoUnit r7 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.LocalDate r3 = r5.mo43048g(r3, r7)
            j$.time.DayOfWeek r0 = p3186j$.time.DayOfWeek.m71130of(r0)
            int r0 = r0.getValue()
            j$.time.temporal.k r4 = new j$.time.temporal.k
            r4.<init>(r0, r10)
            j$.time.LocalDate r0 = r3.mo43046d(r4)
            j$.time.format.E r3 = p3186j$.time.format.C40972E.STRICT
            if (r1 != r3) goto L_0x04b4
            int r1 = r0.get(r2)
            if (r1 != r6) goto L_0x04ad
            goto L_0x04b4
        L_0x04ad:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            r0.<init>(r9)
            throw r0
        L_0x04b3:
            r0 = 0
        L_0x04b4:
            j$.time.LocalDate r0 = (p3186j$.time.LocalDate) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.chrono.C40963f.mo43244e(java.util.HashMap, j$.time.format.E):j$.time.LocalDate");
    }
}
