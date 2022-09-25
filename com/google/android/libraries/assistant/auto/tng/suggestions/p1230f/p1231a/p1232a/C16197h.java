package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1232a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.C16189a;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.a.a.h */
/* compiled from: PG */
public final class C16197h implements C16189a {

    /* renamed from: a */
    private final C21370a f47760a;

    public C16197h(C21370a aVar) {
        this.f47760a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        if (r1.isBefore(p3186j$.time.Instant.ofEpochSecond(r5).plusSeconds(180)) == false) goto L_0x00ac;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo22848a(java.util.List r12, com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.s r1 = r13.mo22546d()
            com.google.bj.b.a.h r1 = r1.f48224d
            if (r1 != 0) goto L_0x000f
            com.google.bj.b.a.h r1 = com.google.p4184bj.p4189b.p4190a.C55876h.f148687c
        L_0x000f:
            int r1 = r1.f148689a
            r2 = 2
            if (r1 != r2) goto L_0x002a
            com.google.android.libraries.assistant.auto.tng.suggestions.k.s r1 = r13.mo22546d()
            com.google.bj.b.a.h r1 = r1.f48224d
            if (r1 != 0) goto L_0x001e
            com.google.bj.b.a.h r1 = com.google.p4184bj.p4189b.p4190a.C55876h.f148687c
        L_0x001e:
            int r3 = r1.f148689a
            if (r3 != r2) goto L_0x0027
            java.lang.Object r1 = r1.f148690b
            com.google.bj.b.a.e r1 = (com.google.p4184bj.p4189b.p4190a.C55873e) r1
            goto L_0x002b
        L_0x0027:
            com.google.bj.b.a.e r1 = com.google.p4184bj.p4189b.p4190a.C55873e.f148682b
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 == 0) goto L_0x015b
            com.google.protobuf.cq r3 = r1.f148684a
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x015b
            com.google.protobuf.cq r3 = r1.f148684a
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            com.google.bj.b.a.d r3 = (com.google.p4184bj.p4189b.p4190a.C55872d) r3
            long r5 = r3.f148681c
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0048
            goto L_0x015b
        L_0x0048:
            com.google.protobuf.cq r1 = r1.f148684a
            java.lang.Object r1 = r1.get(r4)
            com.google.bj.b.a.d r1 = (com.google.p4184bj.p4189b.p4190a.C55872d) r1
            long r5 = r1.f148681c
            j$.time.Instant r1 = p3186j$.time.Instant.ofEpochSecond(r5)
            com.google.android.libraries.f.a r3 = r11.f47760a
            long r5 = r3.mo26870b()
            j$.time.Instant r3 = p3186j$.time.Instant.ofEpochMilli(r5)
            r5 = 600(0x258, double:2.964E-321)
            j$.time.Instant r3 = r3.plusSeconds(r5)
            boolean r3 = r1.isBefore(r3)
            if (r3 != 0) goto L_0x015b
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.aq r3 = r13.mo22544b()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r3 = r3.mo22733g()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap r5 = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap.COOLWALK
            if (r3 == r5) goto L_0x0079
            goto L_0x00ac
        L_0x0079:
            com.google.common.base.ax r3 = r13.mo22550g()
            com.google.android.libraries.assistant.auto.tng.suggestions.f.a.a.g r5 = com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1232a.C16196g.f47759a
            com.google.common.base.ax r3 = r3.mo56106b(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.lang.Object r3 = r3.mo56109e(r5)
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.getEpochSecond()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x015b
            j$.time.Instant r3 = p3186j$.time.Instant.ofEpochSecond(r5)
            r5 = 180(0xb4, double:8.9E-322)
            j$.time.Instant r3 = r3.plusSeconds(r5)
            boolean r3 = r1.isBefore(r3)
            if (r3 == 0) goto L_0x00ac
            goto L_0x015b
        L_0x00ac:
            java.util.Iterator r12 = r12.iterator()
        L_0x00b0:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x015b
            java.lang.Object r3 = r12.next()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.n r3 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n) r3
            com.google.android.libraries.assistant.auto.tng.suggestions.k.aa r5 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa.SHARE_ETA
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r6 = r3.mo22747b()
            int r6 = r6.f48080e
            com.google.android.libraries.assistant.auto.tng.suggestions.k.aa r6 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa.m33331a(r6)
            if (r6 != 0) goto L_0x00cc
            com.google.android.libraries.assistant.auto.tng.suggestions.k.aa r6 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa.UNKNOWN_ACTION_TYPE
        L_0x00cc:
            if (r5 != r6) goto L_0x00b0
            r5 = 3
            android.icu.text.DateFormat r5 = android.icu.text.DateFormat.getTimeInstance(r5)
            java.util.Date r6 = p3186j$.util.DesugarDate.from(r1)
            java.lang.String r5 = r5.format(r6)
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo22749d()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r6 = r3.mo22747b()
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ae r6 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16331ae) r6
            com.google.android.libraries.assistant.auto.tng.suggestions.k.bg r7 = r13.mo22547e()
            java.lang.String r7 = r7.f48164d
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r8 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r8
            r7.getClass()
            int r9 = r8.f48076a
            r9 = r9 | r2
            r8.f48076a = r9
            r8.f48078c = r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r6 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag) r6
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.a r7 = new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.a
            r7.<init>()
            java.lang.String r8 = r3.mo22752f()
            r7.mo22677c(r8)
            java.lang.String r8 = r3.mo22749d()
            java.lang.String r8 = com.google.common.base.C58837ba.m90858g(r8)
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r4] = r5
            java.lang.String r8 = java.lang.String.format(r8, r10)
            r7.f47529b = r8
            java.lang.String r8 = r3.mo22750e()
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r4] = r5
            java.lang.String r5 = java.lang.String.format(r8, r9)
            r7.mo22676b(r5)
            java.lang.String r5 = r3.mo22753g()
            r7.mo22678d(r5)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m r3 = r3.mo22746a()
            r7.mo22680f(r3)
            com.google.android.libraries.f.a r3 = r11.f47760a
            long r8 = r3.mo26870b()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r7.f47530c = r3
            r7.mo22679e(r6)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.n r3 = r7.mo22675a()
            r0.add(r3)
            goto L_0x00b0
        L_0x015b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1232a.C16197h.mo22848a(java.util.List, com.google.android.libraries.assistant.auto.tng.suggestions.a.b.d):java.util.List");
    }
}
