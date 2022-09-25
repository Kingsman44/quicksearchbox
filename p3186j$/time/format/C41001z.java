package p3186j$.time.format;

import java.util.Locale;
import p3186j$.time.DateTimeException;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.z */
final class C41001z {

    /* renamed from: a */
    private TemporalAccessor f107399a;

    /* renamed from: b */
    private DateTimeFormatter f107400b;

    /* renamed from: c */
    private int f107401c;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C41001z(p3186j$.time.temporal.TemporalAccessor r10, p3186j$.time.format.DateTimeFormatter r11) {
        /*
            r9 = this;
            r9.<init>()
            j$.time.chrono.d r0 = r11.mo43258b()
            j$.time.ZoneId r1 = r11.mo43261e()
            if (r0 != 0) goto L_0x0011
            if (r1 != 0) goto L_0x0011
            goto L_0x011a
        L_0x0011:
            j$.time.temporal.n r2 = p3186j$.time.temporal.C41022m.m71567a()
            java.lang.Object r2 = r10.mo43002l(r2)
            j$.time.chrono.d r2 = (p3186j$.time.chrono.C40961d) r2
            j$.time.temporal.n r3 = p3186j$.time.temporal.C41022m.m71573g()
            java.lang.Object r3 = r10.mo43002l(r3)
            j$.time.ZoneId r3 = (p3186j$.time.ZoneId) r3
            boolean r4 = p3186j$.util.Objects.equals(r0, r2)
            r5 = 0
            if (r4 == 0) goto L_0x002d
            r0 = r5
        L_0x002d:
            boolean r4 = p3186j$.util.Objects.equals(r1, r3)
            if (r4 == 0) goto L_0x0034
            r1 = r5
        L_0x0034:
            if (r0 != 0) goto L_0x003a
            if (r1 != 0) goto L_0x003a
            goto L_0x011a
        L_0x003a:
            if (r0 == 0) goto L_0x003e
            r4 = r0
            goto L_0x003f
        L_0x003e:
            r4 = r2
        L_0x003f:
            if (r1 == 0) goto L_0x00b8
            j$.time.temporal.ChronoField r6 = p3186j$.time.temporal.ChronoField.INSTANT_SECONDS
            boolean r6 = r10.mo42996a(r6)
            if (r6 == 0) goto L_0x0060
            j$.time.chrono.f r0 = p3186j$.time.chrono.C40963f.f107281a
            java.lang.Object r0 = p3186j$.util.Objects.requireNonNullElse(r4, r0)
            j$.time.chrono.d r0 = (p3186j$.time.chrono.C40961d) r0
            j$.time.Instant r10 = p3186j$.time.Instant.from(r10)
            j$.time.chrono.f r0 = (p3186j$.time.chrono.C40963f) r0
            r0.getClass()
            j$.time.ZonedDateTime r10 = p3186j$.time.ZonedDateTime.m71294o(r10, r1)
            goto L_0x011a
        L_0x0060:
            j$.time.zone.c r6 = r1.mo43198n()     // Catch:{ d -> 0x0071 }
            boolean r7 = r6.mo43411i()     // Catch:{ d -> 0x0071 }
            if (r7 == 0) goto L_0x0072
            j$.time.Instant r7 = p3186j$.time.Instant.EPOCH     // Catch:{ d -> 0x0071 }
            j$.time.ZoneOffset r6 = r6.mo43405d(r7)     // Catch:{ d -> 0x0071 }
            goto L_0x0073
        L_0x0071:
        L_0x0072:
            r6 = r1
        L_0x0073:
            boolean r6 = r6 instanceof p3186j$.time.ZoneOffset
            if (r6 == 0) goto L_0x00b8
            j$.time.temporal.ChronoField r6 = p3186j$.time.temporal.ChronoField.OFFSET_SECONDS
            boolean r7 = r10.mo42996a(r6)
            if (r7 == 0) goto L_0x00b8
            int r6 = r10.get(r6)
            j$.time.zone.c r7 = r1.mo43198n()
            j$.time.Instant r8 = p3186j$.time.Instant.EPOCH
            j$.time.ZoneOffset r7 = r7.mo43405d(r8)
            int r7 = r7.mo43201q()
            if (r6 != r7) goto L_0x0094
            goto L_0x00b8
        L_0x0094:
            j$.time.DateTimeException r11 = new j$.time.DateTimeException
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to apply override zone '"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "' because the temporal object being formatted has a different offset but does not represent an instant: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L_0x00b8:
            if (r1 == 0) goto L_0x00bb
            r3 = r1
        L_0x00bb:
            if (r0 == 0) goto L_0x0114
            j$.time.temporal.ChronoField r1 = p3186j$.time.temporal.ChronoField.EPOCH_DAY
            boolean r1 = r10.mo42996a(r1)
            if (r1 == 0) goto L_0x00d0
            r0 = r4
            j$.time.chrono.f r0 = (p3186j$.time.chrono.C40963f) r0
            r0.getClass()
            j$.time.LocalDate r5 = p3186j$.time.LocalDate.m71156o(r10)
            goto L_0x0114
        L_0x00d0:
            j$.time.chrono.f r1 = p3186j$.time.chrono.C40963f.f107281a
            if (r0 != r1) goto L_0x00d6
            if (r2 == 0) goto L_0x0114
        L_0x00d6:
            j$.time.temporal.ChronoField[] r1 = p3186j$.time.temporal.ChronoField.values()
            int r2 = r1.length
            r6 = 0
        L_0x00dc:
            if (r6 >= r2) goto L_0x0114
            r7 = r1[r6]
            boolean r8 = r7.isDateBased()
            if (r8 == 0) goto L_0x0111
            boolean r7 = r10.mo42996a(r7)
            if (r7 != 0) goto L_0x00ed
            goto L_0x0111
        L_0x00ed:
            j$.time.DateTimeException r11 = new j$.time.DateTimeException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to apply override chronology '"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "' because the temporal object being formatted contains date fields but does not represent a whole date: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L_0x0111:
            int r6 = r6 + 1
            goto L_0x00dc
        L_0x0114:
            j$.time.format.y r0 = new j$.time.format.y
            r0.<init>(r5, r10, r4, r3)
            r10 = r0
        L_0x011a:
            r9.f107399a = r10
            r9.f107400b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.format.C41001z.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43339a() {
        this.f107401c--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C40970C mo43340b() {
        return this.f107400b.mo43259c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Locale mo43341c() {
        return this.f107400b.mo43260d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final TemporalAccessor mo43342d() {
        return this.f107399a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Long mo43343e(TemporalField temporalField) {
        if (this.f107401c <= 0 || this.f107399a.mo42996a(temporalField)) {
            return Long.valueOf(this.f107399a.getLong(temporalField));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object mo43344f(C41023n nVar) {
        Object l = this.f107399a.mo43002l(nVar);
        if (l != null || this.f107401c != 0) {
            return l;
        }
        String valueOf = String.valueOf(nVar);
        String valueOf2 = String.valueOf(this.f107399a);
        throw new DateTimeException("Unable to extract " + valueOf + " from temporal " + valueOf2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo43345g() {
        this.f107401c++;
    }

    public final String toString() {
        return this.f107399a.toString();
    }
}
