package com.google.android.libraries.search.assistant.proactive;

import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.proactive.aj */
/* compiled from: PG */
public final /* synthetic */ class C36214aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36219ao f94603a;

    /* renamed from: b */
    public final /* synthetic */ aas f94604b;

    /* renamed from: c */
    public final /* synthetic */ List f94605c;

    public /* synthetic */ C36214aj(C36219ao aoVar, aas aas, List list) {
        this.f94603a = aoVar;
        this.f94604b = aas;
        this.f94605c = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00df, code lost:
        if (r8 < r9.f126968c) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0111, code lost:
        if (r8 >= r9.f126968c) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.libraries.search.assistant.proactive.ao r1 = r0.f94603a
            com.google.assistant.e.j.aas r2 = r0.f94604b
            java.util.List r3 = r0.f94605c
            r4 = r18
            com.google.assistant.ag.c.ew r4 = (com.google.assistant.p3803ag.p3809c.C49057ew) r4
            boolean r5 = r2.f134677o
            com.google.android.libraries.search.assistant.proactive.am r6 = new com.google.android.libraries.search.assistant.proactive.am
            r6.<init>()
            com.google.protobuf.cq r4 = r4.f126898a
            int r7 = r4.size()
            int r7 = r7 + -1
            java.util.Iterator r3 = r3.iterator()
            r9 = 0
        L_0x0020:
            boolean r10 = r3.hasNext()
            r11 = 3
            if (r10 == 0) goto L_0x0139
            java.lang.Object r10 = r3.next()
            com.google.assistant.ag.c.gi r10 = (com.google.assistant.p3803ag.p3809c.C49097gi) r10
            com.google.android.libraries.f.a r12 = r1.f94620d
            long r12 = r12.mo26870b()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.HOURS
            int r15 = r10.f126976e
            r16 = r9
            long r8 = (long) r15
            long r8 = r14.toMillis(r8)
            long r12 = r12 - r8
        L_0x003f:
            if (r7 < 0) goto L_0x00ae
            java.lang.Object r8 = r4.get(r7)
            com.google.assistant.ag.c.eu r8 = (com.google.assistant.p3803ag.p3809c.C49055eu) r8
            long r8 = r8.f126890b
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ae
            java.lang.Object r8 = r4.get(r7)
            com.google.assistant.ag.c.eu r8 = (com.google.assistant.p3803ag.p3809c.C49055eu) r8
            boolean r8 = r8.f126895g
            if (r8 == 0) goto L_0x0059
            if (r5 == 0) goto L_0x00ab
        L_0x0059:
            java.lang.Object r8 = r4.get(r7)
            com.google.assistant.ag.c.eu r8 = (com.google.assistant.p3803ag.p3809c.C49055eu) r8
            com.google.assistant.ag.c.gh r9 = r10.f126973b
            if (r9 != 0) goto L_0x0065
            com.google.assistant.ag.c.gh r9 = com.google.assistant.p3803ag.p3809c.C49096gh.f126964d
        L_0x0065:
            int r9 = r9.f126966a
            if (r9 == 0) goto L_0x0085
            com.google.assistant.ag.c.gh r9 = r10.f126973b
            if (r9 != 0) goto L_0x006f
            com.google.assistant.ag.c.gh r9 = com.google.assistant.p3803ag.p3809c.C49096gh.f126964d
        L_0x006f:
            int r9 = r9.f126966a
            int r14 = r8.f126894f
            if (r9 != r14) goto L_0x0085
            com.google.android.libraries.search.assistant.proactive.al r9 = r6.f94610a
            r9.mo40023b(r8)
            boolean r9 = com.google.android.libraries.search.assistant.proactive.C36217am.m64623a(r2, r8)
            if (r9 == 0) goto L_0x0085
            com.google.android.libraries.search.assistant.proactive.al r9 = r6.f94611b
            r9.mo40023b(r8)
        L_0x0085:
            com.google.assistant.ag.c.gh r9 = r10.f126973b
            if (r9 != 0) goto L_0x008c
            com.google.assistant.ag.c.gh r14 = com.google.assistant.p3803ag.p3809c.C49096gh.f126964d
            goto L_0x008d
        L_0x008c:
            r14 = r9
        L_0x008d:
            int r14 = r14.f126967b
            if (r14 == 0) goto L_0x00ab
            if (r9 != 0) goto L_0x0095
            com.google.assistant.ag.c.gh r9 = com.google.assistant.p3803ag.p3809c.C49096gh.f126964d
        L_0x0095:
            int r9 = r9.f126967b
            int r14 = r8.f126892d
            if (r9 != r14) goto L_0x00ab
            com.google.android.libraries.search.assistant.proactive.al r9 = r6.f94612c
            r9.mo40023b(r8)
            boolean r9 = com.google.android.libraries.search.assistant.proactive.C36217am.m64623a(r2, r8)
            if (r9 == 0) goto L_0x00ab
            com.google.android.libraries.search.assistant.proactive.al r9 = r6.f94613d
            r9.mo40023b(r8)
        L_0x00ab:
            int r7 = r7 + -1
            goto L_0x003f
        L_0x00ae:
            com.google.assistant.ag.c.gh r8 = r10.f126973b
            if (r8 != 0) goto L_0x00b4
            com.google.assistant.ag.c.gh r8 = com.google.assistant.p3803ag.p3809c.C49096gh.f126964d
        L_0x00b4:
            int r8 = r8.f126966a
            if (r8 == 0) goto L_0x00e1
            int r8 = r10.f126975d
            if (r8 == 0) goto L_0x00c7
            com.google.android.libraries.search.assistant.proactive.al r8 = r6.f94610a
            int r8 = r8.mo40022a(r10)
            int r9 = r10.f126975d
            if (r8 < r9) goto L_0x00c7
            goto L_0x0113
        L_0x00c7:
            com.google.assistant.ag.c.gh r8 = r10.f126973b
            if (r8 != 0) goto L_0x00cd
            com.google.assistant.ag.c.gh r8 = com.google.assistant.p3803ag.p3809c.C49096gh.f126964d
        L_0x00cd:
            int r8 = r8.f126968c
            if (r8 == 0) goto L_0x00e1
            com.google.android.libraries.search.assistant.proactive.al r8 = r6.f94611b
            int r8 = r8.mo40022a(r10)
            com.google.assistant.ag.c.gh r9 = r10.f126973b
            if (r9 != 0) goto L_0x00dd
            com.google.assistant.ag.c.gh r9 = com.google.assistant.p3803ag.p3809c.C49096gh.f126964d
        L_0x00dd:
            int r9 = r9.f126968c
            if (r8 >= r9) goto L_0x0113
        L_0x00e1:
            com.google.assistant.ag.c.gh r8 = r10.f126973b
            if (r8 != 0) goto L_0x00e7
            com.google.assistant.ag.c.gh r8 = com.google.assistant.p3803ag.p3809c.C49096gh.f126964d
        L_0x00e7:
            int r8 = r8.f126967b
            if (r8 == 0) goto L_0x0135
            int r8 = r10.f126975d
            if (r8 == 0) goto L_0x00f9
            com.google.android.libraries.search.assistant.proactive.al r8 = r6.f94612c
            int r8 = r8.mo40022a(r10)
            int r9 = r10.f126975d
            if (r8 >= r9) goto L_0x0113
        L_0x00f9:
            com.google.assistant.ag.c.gh r8 = r10.f126973b
            if (r8 != 0) goto L_0x00ff
            com.google.assistant.ag.c.gh r8 = com.google.assistant.p3803ag.p3809c.C49096gh.f126964d
        L_0x00ff:
            int r8 = r8.f126968c
            if (r8 == 0) goto L_0x0135
            com.google.android.libraries.search.assistant.proactive.al r8 = r6.f94613d
            int r8 = r8.mo40022a(r10)
            com.google.assistant.ag.c.gh r9 = r10.f126973b
            if (r9 != 0) goto L_0x010f
            com.google.assistant.ag.c.gh r9 = com.google.assistant.p3803ag.p3809c.C49096gh.f126964d
        L_0x010f:
            int r9 = r9.f126968c
            if (r8 < r9) goto L_0x0135
        L_0x0113:
            int r8 = r10.f126977f
            int r9 = com.google.assistant.p3803ag.p3809c.C49094gf.m85366a(r8)
            if (r9 != 0) goto L_0x011c
            goto L_0x0127
        L_0x011c:
            r12 = 2
            if (r9 != r12) goto L_0x0127
            com.google.android.libraries.search.assistant.proactive.ac r1 = new com.google.android.libraries.search.assistant.proactive.ac
            int r2 = r10.f126972a
            r1.<init>(r12, r2)
            goto L_0x014a
        L_0x0127:
            int r8 = com.google.assistant.p3803ag.p3809c.C49094gf.m85366a(r8)
            if (r8 == 0) goto L_0x0135
            if (r8 != r11) goto L_0x0135
            if (r16 != 0) goto L_0x0135
            int r9 = r10.f126972a
            goto L_0x0020
        L_0x0135:
            r9 = r16
            goto L_0x0020
        L_0x0139:
            r16 = r9
            com.google.android.libraries.search.assistant.proactive.ac r1 = new com.google.android.libraries.search.assistant.proactive.ac
            if (r16 <= 0) goto L_0x0145
            r8 = r16
            r1.<init>(r11, r8)
            goto L_0x014a
        L_0x0145:
            r2 = 1
            r3 = 0
            r1.<init>(r2, r3)
        L_0x014a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.proactive.C36214aj.apply(java.lang.Object):java.lang.Object");
    }
}
