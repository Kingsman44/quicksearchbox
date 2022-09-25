package p3186j$.time.temporal;

import p3186j$.time.DayOfWeek;
import p3186j$.time.LocalDate;

/* renamed from: j$.time.temporal.f */
enum C41015f implements TemporalField {
    ;
    
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int[] f107434a = null;

    static {
        f107434a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r5 == false) goto L_0x0058;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m71550l(p3186j$.time.LocalDate r5) {
        /*
            j$.time.DayOfWeek r0 = r5.getDayOfWeek()
            int r0 = r0.ordinal()
            int r1 = r5.mo43097q()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L_0x001c
            int r0 = r0 + 7
        L_0x001c:
            if (r1 >= r0) goto L_0x003d
            r0 = 180(0xb4, float:2.52E-43)
            j$.time.LocalDate r5 = r5.mo43107z(r0)
            r0 = 1
            j$.time.LocalDate r5 = r5.minusYears(r0)
            int r5 = m71554p(r5)
            int r5 = m71555q(r5)
            long r2 = (long) r5
            j$.time.temporal.ValueRange r5 = p3186j$.time.temporal.ValueRange.m71512h(r0, r2)
            long r0 = r5.mo43367d()
            int r5 = (int) r0
            goto L_0x0059
        L_0x003d:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L_0x0057
            if (r0 == r3) goto L_0x0053
            r3 = -2
            if (r0 != r3) goto L_0x0051
            boolean r5 = r5.isLeapYear()
            if (r5 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r5 = 0
            goto L_0x0054
        L_0x0053:
            r5 = 1
        L_0x0054:
            if (r5 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r2 = r1
        L_0x0058:
            r5 = r2
        L_0x0059:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.temporal.C41015f.m71550l(j$.time.LocalDate):int");
    }

    /* renamed from: o */
    static ValueRange m71553o(LocalDate localDate) {
        return ValueRange.m71512h(1, (long) m71555q(m71554p(localDate)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static int m71554p(LocalDate localDate) {
        int year = localDate.getYear();
        int q = localDate.mo43097q();
        if (q <= 3) {
            return q - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (q < 363) {
            return year;
        }
        return ((q - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static int m71555q(int i) {
        LocalDate of = LocalDate.m71157of(i, 1, 1);
        if (of.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (of.getDayOfWeek() != DayOfWeek.WEDNESDAY || !of.isLeapYear()) ? 52 : 53;
        }
        return 53;
    }

    public final boolean isDateBased() {
        return true;
    }

    public final boolean isTimeBased() {
        return false;
    }
}
