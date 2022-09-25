package p3186j$.time.format;

import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p3186j$.time.zone.C41032g;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.w */
final class C40998w extends C40997v {

    /* renamed from: i */
    private static final ConcurrentHashMap f107385i = new ConcurrentHashMap();

    /* renamed from: e */
    private final C40974G f107386e;

    /* renamed from: f */
    private final boolean f107387f;

    /* renamed from: g */
    private final HashMap f107388g = new HashMap();

    /* renamed from: h */
    private final HashMap f107389h = new HashMap();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C40998w(p3186j$.time.format.C40974G r5, boolean r6) {
        /*
            r4 = this;
            j$.time.temporal.n r0 = p3186j$.time.temporal.C41022m.m71572f()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ZoneText("
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.<init>(r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f107388g = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f107389h = r0
            java.lang.String r0 = "textStyle"
            java.lang.Object r5 = p3186j$.util.Objects.requireNonNull(r5, r0)
            j$.time.format.G r5 = (p3186j$.time.format.C40974G) r5
            r4.f107386e = r5
            r4.f107387f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.format.C40998w.<init>(j$.time.format.G, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C40991p mo43317a(C40999x xVar) {
        C40991p pVar;
        C40974G g = C40974G.NARROW;
        C40974G g2 = this.f107386e;
        if (g2 == g) {
            return super.mo43317a(xVar);
        }
        Locale i = xVar.mo43325i();
        boolean k = xVar.mo43327k();
        Set a = C41032g.m71614a();
        int size = a.size();
        HashMap hashMap = k ? this.f107388g : this.f107389h;
        Map.Entry entry = (Map.Entry) hashMap.get(i);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (pVar = (C40991p) ((SoftReference) entry.getValue()).get()) == null) {
            pVar = C40991p.m71428f(xVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(i).getZoneStrings();
            int length = zoneStrings.length;
            int i2 = 0;
            while (true) {
                int i3 = 2;
                if (i2 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i2];
                String str = strArr[0];
                if (a.contains(str)) {
                    pVar.mo43313a(str, str);
                    String a2 = C40975H.m71380a(str, i);
                    if (g2 == C40974G.FULL) {
                        i3 = 1;
                    }
                    while (i3 < strArr.length) {
                        pVar.mo43313a(strArr[i3], a2);
                        i3 += 2;
                    }
                }
                i2++;
            }
            hashMap.put(i, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(pVar)));
        }
        return pVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: j$.util.concurrent.ConcurrentHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: j$.util.concurrent.ConcurrentHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        if (r8 == null) goto L_0x009d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ec  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43294b(p3186j$.time.format.C41001z r14, java.lang.StringBuilder r15) {
        /*
            r13 = this;
            j$.time.temporal.n r0 = p3186j$.time.temporal.C41022m.m71573g()
            java.lang.Object r0 = r14.mo43344f(r0)
            j$.time.ZoneId r0 = (p3186j$.time.ZoneId) r0
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.String r2 = r0.getId()
            boolean r3 = r0 instanceof p3186j$.time.ZoneOffset
            r4 = 1
            if (r3 != 0) goto L_0x00ed
            j$.time.temporal.TemporalAccessor r3 = r14.mo43342d()
            boolean r5 = r13.f107387f
            r6 = 2
            if (r5 != 0) goto L_0x0074
            j$.time.temporal.ChronoField r5 = p3186j$.time.temporal.ChronoField.INSTANT_SECONDS
            boolean r5 = r3.mo42996a(r5)
            if (r5 == 0) goto L_0x0035
            j$.time.zone.c r0 = r0.mo43198n()
            j$.time.Instant r3 = p3186j$.time.Instant.from(r3)
            boolean r0 = r0.mo43409h(r3)
            goto L_0x0075
        L_0x0035:
            j$.time.temporal.ChronoField r5 = p3186j$.time.temporal.ChronoField.EPOCH_DAY
            boolean r7 = r3.mo42996a(r5)
            if (r7 == 0) goto L_0x0074
            j$.time.temporal.ChronoField r7 = p3186j$.time.temporal.ChronoField.NANO_OF_DAY
            boolean r8 = r3.mo42996a(r7)
            if (r8 == 0) goto L_0x0074
            long r8 = r3.getLong(r5)
            j$.time.LocalDate r5 = p3186j$.time.LocalDate.ofEpochDay(r8)
            long r7 = r3.getLong(r7)
            j$.time.LocalTime r3 = p3186j$.time.LocalTime.m71214q(r7)
            j$.time.LocalDateTime r3 = r5.mo43076f(r3)
            j$.time.zone.c r5 = r0.mo43198n()
            j$.time.zone.a r5 = r5.mo43407f(r3)
            if (r5 != 0) goto L_0x0074
            j$.time.zone.c r5 = r0.mo43198n()
            j$.time.ZonedDateTime r0 = r3.atZone(r0)
            j$.time.Instant r0 = r0.toInstant()
            boolean r0 = r5.mo43409h(r0)
            goto L_0x0075
        L_0x0074:
            r0 = 2
        L_0x0075:
            java.util.Locale r14 = r14.mo43341c()
            j$.time.format.G r3 = p3186j$.time.format.C40974G.NARROW
            r5 = 0
            j$.time.format.G r7 = r13.f107386e
            if (r7 != r3) goto L_0x0081
            goto L_0x00ea
        L_0x0081:
            j$.util.concurrent.ConcurrentHashMap r3 = f107385i
            java.lang.Object r8 = r3.get(r2)
            java.lang.ref.SoftReference r8 = (java.lang.ref.SoftReference) r8
            r9 = 5
            r10 = 3
            if (r8 == 0) goto L_0x009d
            java.lang.Object r5 = r8.get()
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x009d
            java.lang.Object r8 = r5.get(r14)
            java.lang.String[] r8 = (java.lang.String[]) r8
            if (r8 != 0) goto L_0x00d7
        L_0x009d:
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r2)
            r11 = 7
            java.lang.String[] r11 = new java.lang.String[r11]
            r11[r1] = r2
            java.lang.String r12 = r8.getDisplayName(r1, r4, r14)
            r11[r4] = r12
            java.lang.String r12 = r8.getDisplayName(r1, r1, r14)
            r11[r6] = r12
            java.lang.String r6 = r8.getDisplayName(r4, r4, r14)
            r11[r10] = r6
            r6 = 4
            java.lang.String r1 = r8.getDisplayName(r4, r1, r14)
            r11[r6] = r1
            r11[r9] = r2
            r1 = 6
            r11[r1] = r2
            if (r5 != 0) goto L_0x00cb
            j$.util.concurrent.ConcurrentHashMap r5 = new j$.util.concurrent.ConcurrentHashMap
            r5.<init>()
        L_0x00cb:
            r5.put(r14, r11)
            java.lang.ref.SoftReference r14 = new java.lang.ref.SoftReference
            r14.<init>(r5)
            r3.put(r2, r14)
            r8 = r11
        L_0x00d7:
            int r14 = r7.mo43292b()
            if (r0 == 0) goto L_0x00e7
            if (r0 == r4) goto L_0x00e3
            int r14 = r14 + r9
            r5 = r8[r14]
            goto L_0x00ea
        L_0x00e3:
            int r14 = r14 + r10
            r5 = r8[r14]
            goto L_0x00ea
        L_0x00e7:
            int r14 = r14 + r4
            r5 = r8[r14]
        L_0x00ea:
            if (r5 == 0) goto L_0x00ed
            r2 = r5
        L_0x00ed:
            r15.append(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.format.C40998w.mo43294b(j$.time.format.z, java.lang.StringBuilder):boolean");
    }
}
