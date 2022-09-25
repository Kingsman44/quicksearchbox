package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import com.google.android.apps.gsa.search.core.p6519al.p6650ci.C85125e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.tasks.C118549h;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.h */
/* compiled from: PG */
public final class C88635h implements C118549h {

    /* renamed from: a */
    private final C85125e f239617a;

    /* renamed from: b */
    private final C68214a f239618b;

    /* renamed from: c */
    private final C86124t f239619c;

    public C88635h(C85125e eVar, C68214a aVar, C86124t tVar) {
        this.f239617a = eVar;
        this.f239618b = aVar;
        this.f239619c = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0230, code lost:
        if ((r8 / r2) >= 0.5d) goto L_0x0236;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo65234a(com.google.android.apps.gsa.tasks.C118476ak r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.searchbox.p6943b.C88539c.f239298a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r3 = r0.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 != 0) goto L_0x0242
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f239619c
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250164ao
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x0236
            dagger.a r0 = r1.f239618b
            java.lang.Object r0 = r0.mo27525b()
            r2 = r0
            com.google.android.apps.gsa.searchbox.client.gsa.a.i r2 = (com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88636i) r2
            r4 = 0
            com.google.android.apps.gsa.search.core.preferences.r r0 = r2.f239621b     // Catch:{ ct -> 0x0049 }
            java.lang.String r5 = "searchbox_usage_histogram"
            byte[] r0 = r0.mo80079e(r5, r4)     // Catch:{ ct -> 0x0049 }
            if (r0 != 0) goto L_0x0036
            goto L_0x005e
        L_0x0036:
            com.google.android.apps.gsa.shared.an.n r5 = com.google.android.apps.gsa.shared.p6990an.C89223n.f241914b     // Catch:{ ct -> 0x0049 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r0)     // Catch:{ ct -> 0x0049 }
            com.google.android.apps.gsa.shared.an.n r0 = (com.google.android.apps.gsa.shared.p6990an.C89223n) r0     // Catch:{ ct -> 0x0049 }
            com.google.protobuf.cq r5 = r0.f241916a     // Catch:{ ct -> 0x0049 }
            int r5 = r5.size()     // Catch:{ ct -> 0x0049 }
            if (r5 > 0) goto L_0x0047
            goto L_0x005e
        L_0x0047:
            r4 = r0
            goto L_0x005e
        L_0x0049:
            r0 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88636i.f239620a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "SearchboxUsagePattern"
            r5.mo56378ag(r6, r7)
            java.lang.String r6 = "invalid SearchboxUsageHistogram proto in main pref"
            r7 = 9837(0x266d, float:1.3785E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r7)).mo56386p(r6)
        L_0x005e:
            if (r4 != 0) goto L_0x0062
            goto L_0x0233
        L_0x0062:
            org.c.a.d r0 = new org.c.a.d
            com.google.android.libraries.f.a r2 = r2.f239622c
            long r5 = r2.mo26870b()
            r0.<init>((long) r5)
            org.c.a.a r2 = r0.f191963b
            org.c.a.o r2 = r2.mo63327E()
            long r5 = r0.f191962a
            r7 = 30
            long r5 = r2.mo63673f(r5, r7)
            org.c.a.d r2 = r0.mo63546d(r5)
            com.google.protobuf.cq r5 = r4.f241916a
            java.util.Iterator r5 = r5.iterator()
            r8 = 0
        L_0x0087:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0221
            java.lang.Object r10 = r5.next()
            com.google.android.apps.gsa.shared.an.m r10 = (com.google.android.apps.gsa.shared.p6990an.C89222m) r10
            int r11 = r10.f241910a
            int r11 = com.google.android.apps.gsa.shared.p6990an.C89221l.m145120a(r11)
            if (r11 != 0) goto L_0x009c
            r11 = 1
        L_0x009c:
            long r12 = r10.f241911b
            com.google.protobuf.cq r14 = r10.f241912c
            int r14 = r14.size()
            if (r14 == 0) goto L_0x021b
            com.google.protobuf.cq r14 = r10.f241912c
            r15 = 0
            java.lang.Object r14 = r14.get(r15)
            com.google.android.apps.gsa.shared.an.i r14 = (com.google.android.apps.gsa.shared.p6990an.C89218i) r14
            int r14 = r14.f241902a
            int r14 = com.google.android.apps.gsa.shared.p6990an.C89221l.m145120a(r14)
            if (r14 != 0) goto L_0x00b8
            r14 = 1
        L_0x00b8:
            long r11 = com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88636i.m143290a(r12, r11, r14)
            com.google.protobuf.cq r13 = r10.f241912c
            java.util.Iterator r13 = r13.iterator()
        L_0x00c2:
            boolean r14 = r13.hasNext()
            r15 = 0
            if (r14 == 0) goto L_0x00eb
            java.lang.Object r14 = r13.next()
            com.google.android.apps.gsa.shared.an.i r14 = (com.google.android.apps.gsa.shared.p6990an.C89218i) r14
            long r6 = r14.f241903b
            r23 = r4
            long r3 = r14.f241904c
            int r14 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r14 < 0) goto L_0x021d
            int r14 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r14 > 0) goto L_0x021d
            int r6 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r6 < 0) goto L_0x021d
            int r6 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e8
            goto L_0x021d
        L_0x00e8:
            r4 = r23
            goto L_0x00c2
        L_0x00eb:
            r23 = r4
            int r3 = r10.f241910a
            int r3 = com.google.android.apps.gsa.shared.p6990an.C89221l.m145120a(r3)
            if (r3 != 0) goto L_0x00f6
            r3 = 1
        L_0x00f6:
            int r3 = r3 + -1
            r4 = 5
            r6 = 4
            r7 = 3
            r11 = 2
            r12 = 1
            if (r3 == r12) goto L_0x0149
            if (r3 == r11) goto L_0x0139
            if (r3 == r7) goto L_0x0129
            if (r3 == r6) goto L_0x0119
            if (r3 == r4) goto L_0x0109
            r3 = r2
            goto L_0x0158
        L_0x0109:
            org.c.a.c r3 = new org.c.a.c
            org.c.a.a r12 = r2.f191963b
            org.c.a.e r12 = r12.mo63367w()
            r3.<init>(r2, r12)
            org.c.a.d r3 = r3.mo63527c()
            goto L_0x0158
        L_0x0119:
            org.c.a.c r3 = new org.c.a.c
            org.c.a.a r12 = r2.f191963b
            org.c.a.e r12 = r12.mo63352i()
            r3.<init>(r2, r12)
            org.c.a.d r3 = r3.mo63527c()
            goto L_0x0158
        L_0x0129:
            org.c.a.c r3 = new org.c.a.c
            org.c.a.a r12 = r2.f191963b
            org.c.a.e r12 = r12.mo63353j()
            r3.<init>(r2, r12)
            org.c.a.d r3 = r3.mo63527c()
            goto L_0x0158
        L_0x0139:
            org.c.a.c r3 = new org.c.a.c
            org.c.a.a r12 = r2.f191963b
            org.c.a.e r12 = r12.mo63357n()
            r3.<init>(r2, r12)
            org.c.a.d r3 = r3.mo63527c()
            goto L_0x0158
        L_0x0149:
            org.c.a.c r3 = new org.c.a.c
            org.c.a.a r12 = r2.f191963b
            org.c.a.e r12 = r12.mo63361r()
            r3.<init>(r2, r12)
            org.c.a.d r3 = r3.mo63527c()
        L_0x0158:
            com.google.protobuf.cq r12 = r10.f241912c
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
            r17 = 0
        L_0x0162:
            boolean r19 = r12.hasNext()
            if (r19 == 0) goto L_0x0217
            java.lang.Object r19 = r12.next()
            r15 = r19
            com.google.android.apps.gsa.shared.an.i r15 = (com.google.android.apps.gsa.shared.p6990an.C89218i) r15
            int r4 = r15.f241905d
            double r6 = (double) r4
            java.lang.Double.isNaN(r6)
            double r17 = r17 + r6
            long r6 = r10.f241911b
            int r4 = r10.f241910a
            int r4 = com.google.android.apps.gsa.shared.p6990an.C89221l.m145120a(r4)
            if (r4 != 0) goto L_0x0183
            r4 = 1
        L_0x0183:
            int r11 = r15.f241902a
            int r11 = com.google.android.apps.gsa.shared.p6990an.C89221l.m145120a(r11)
            if (r11 != 0) goto L_0x018c
            r11 = 1
        L_0x018c:
            long r6 = com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88636i.m143290a(r6, r4, r11)
            int r4 = r15.f241902a
            int r4 = com.google.android.apps.gsa.shared.p6990an.C89221l.m145120a(r4)
            if (r4 != 0) goto L_0x0199
            r4 = 1
        L_0x0199:
            int r4 = r4 + -1
            r11 = 1
            if (r4 == r11) goto L_0x01ec
            r11 = 2
            if (r4 == r11) goto L_0x01dd
            r11 = 3
            if (r4 == r11) goto L_0x01ce
            r20 = 86400000(0x5265c00, double:4.2687272E-316)
            r11 = 4
            if (r4 == r11) goto L_0x01c2
            r11 = 5
            if (r4 == r11) goto L_0x01b2
            r16 = r12
            r11 = 0
            goto L_0x01f9
        L_0x01b2:
            org.c.a.n r4 = new org.c.a.n
            r4.<init>(r3, r0)
            r16 = r12
            long r11 = r4.f191964b
            long r11 = r11 / r20
            r20 = 7
            long r11 = r11 / r20
            goto L_0x01f9
        L_0x01c2:
            r16 = r12
            org.c.a.n r4 = new org.c.a.n
            r4.<init>(r3, r0)
            long r11 = r4.f191964b
            long r11 = r11 / r20
            goto L_0x01f9
        L_0x01ce:
            r16 = r12
            org.c.a.n r4 = new org.c.a.n
            r4.<init>(r3, r0)
            long r11 = r4.f191964b
            r20 = 3600000(0x36ee80, double:1.7786363E-317)
            long r11 = r11 / r20
            goto L_0x01f9
        L_0x01dd:
            r16 = r12
            org.c.a.n r4 = new org.c.a.n
            r4.<init>(r3, r0)
            long r11 = r4.f191964b
            r20 = 60000(0xea60, double:2.9644E-319)
            long r11 = r11 / r20
            goto L_0x01f9
        L_0x01ec:
            r16 = r12
            org.c.a.n r4 = new org.c.a.n
            r4.<init>(r3, r0)
            long r11 = r4.f191964b
            r20 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r20
        L_0x01f9:
            long r11 = r11 % r6
            long r6 = r15.f241903b
            int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x020d
            long r6 = r15.f241904c
            int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x020d
            int r4 = r15.f241905d
            double r6 = (double) r4
            java.lang.Double.isNaN(r6)
            double r13 = r13 + r6
        L_0x020d:
            r12 = r16
            r4 = 5
            r6 = 4
            r7 = 3
            r11 = 2
            r15 = 0
            goto L_0x0162
        L_0x0217:
            double r13 = r13 / r17
            double r8 = r8 + r13
            goto L_0x021d
        L_0x021b:
            r23 = r4
        L_0x021d:
            r4 = r23
            goto L_0x0087
        L_0x0221:
            com.google.protobuf.cq r0 = r4.f241916a
            int r0 = r0.size()
            double r2 = (double) r0
            java.lang.Double.isNaN(r2)
            double r8 = r8 / r2
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0233
            goto L_0x0236
        L_0x0233:
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        L_0x0236:
            com.google.android.apps.gsa.search.core.al.ci.e r2 = r1.f239617a
            r3 = 1
            r4 = 2
            r5 = 0
            r6 = -1
            com.google.common.util.concurrent.cx r0 = r2.mo78723a(r3, r4, r5, r6)
            return r0
        L_0x0242:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.searchbox.p6943b.C88539c.f239298a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x0258
            java.lang.Object r0 = r2.f169969b
            goto L_0x025c
        L_0x0258:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x025c:
            com.google.android.apps.gsa.searchbox.b.b r0 = (com.google.android.apps.gsa.searchbox.p6943b.C88538b) r0
            java.lang.String r5 = r0.f239294b
            int r2 = r0.f239295c
            int r12 = com.google.android.apps.gsa.search.core.p6519al.p6650ci.C85122b.m136375a(r2)
            if (r12 != 0) goto L_0x026a
            r3 = 1
            goto L_0x026b
        L_0x026a:
            r3 = r12
        L_0x026b:
            int r2 = r0.f239297e
            int r2 = com.google.android.apps.gsa.search.core.p6519al.p6650ci.C85124d.m136376a(r2)
            if (r2 != 0) goto L_0x0275
            r4 = 1
            goto L_0x0276
        L_0x0275:
            r4 = r2
        L_0x0276:
            long r6 = r0.f239296d
            com.google.android.apps.gsa.search.core.al.ci.e r2 = r1.f239617a
            com.google.common.util.concurrent.cx r0 = r2.mo78723a(r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88635h.mo65234a(com.google.android.apps.gsa.tasks.ak):com.google.common.util.concurrent.cx");
    }
}
