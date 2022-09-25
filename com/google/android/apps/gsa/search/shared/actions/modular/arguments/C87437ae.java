package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.p4152bb.p4153a.C55077f;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55293n;
import com.google.p4152bb.p4153a.C55305nl;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.ae */
/* compiled from: PG */
public final class C87437ae {
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x00d9, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.search.shared.contact.C87515c m141905a(com.google.p4152bb.p4153a.C55240la r7, int r8) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.apps.gsa.shared.util.bu r1 = new com.google.android.apps.gsa.shared.util.bu
            r1.<init>()
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55274mh.f145587e
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r7.mo58887l(r2)
            com.google.protobuf.bf r3 = r7.f169962ag
            com.google.protobuf.bs r4 = r2.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x001f
            java.lang.Object r2 = r2.f169969b
            goto L_0x0023
        L_0x001f:
            java.lang.Object r2 = r2.mo58889c(r3)
        L_0x0023:
            com.google.bb.a.mh r2 = (com.google.p4152bb.p4153a.C55274mh) r2
            if (r2 == 0) goto L_0x002f
            int r2 = r2.f145590b
            if (r2 == r8) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            com.google.android.apps.gsa.search.shared.contact.c r7 = com.google.android.apps.gsa.search.shared.contact.C87515c.PERSON
            return r7
        L_0x002f:
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55284mr.f145623d
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r7.mo58887l(r2)
            com.google.protobuf.bf r3 = r7.f169962ag
            com.google.protobuf.bs r4 = r2.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x0045
            java.lang.Object r2 = r2.f169969b
            goto L_0x0049
        L_0x0045:
            java.lang.Object r2 = r2.mo58889c(r3)
        L_0x0049:
            com.google.bb.a.mr r2 = (com.google.p4152bb.p4153a.C55284mr) r2
            if (r2 == 0) goto L_0x0055
            int r2 = r2.f145626b
            if (r2 == r8) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            com.google.android.apps.gsa.search.shared.contact.c r7 = com.google.android.apps.gsa.search.shared.contact.C87515c.PHONE_NUMBER
            return r7
        L_0x0055:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r7.mo58887l(r3)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r4 = r3.f169971d
            java.lang.Object r7 = r7.mo58854l(r4)
            if (r7 != 0) goto L_0x0070
            java.lang.Object r7 = r3.f169969b
            goto L_0x0074
        L_0x0070:
            java.lang.Object r7 = r3.mo58889c(r7)
        L_0x0074:
            com.google.bb.a.jw r7 = (com.google.p4152bb.p4153a.C55208jw) r7
            r3 = 16
            if (r7 != 0) goto L_0x007b
            goto L_0x00c3
        L_0x007b:
            int r4 = r7.f145318a
            r4 = r4 & r3
            if (r4 == 0) goto L_0x0089
            com.google.bb.a.he r4 = r7.f145324g
            if (r4 != 0) goto L_0x0086
            com.google.bb.a.he r4 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0086:
            r2.add(r4)
        L_0x0089:
            int r4 = r7.f145318a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x0098
            com.google.bb.a.he r4 = r7.f145322e
            if (r4 != 0) goto L_0x0095
            com.google.bb.a.he r4 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0095:
            r2.add(r4)
        L_0x0098:
            com.google.protobuf.cq r7 = r7.f145327j
            java.util.Iterator r7 = r7.iterator()
        L_0x009e:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x00c3
            java.lang.Object r4 = r7.next()
            com.google.bb.a.f r4 = (com.google.p4152bb.p4153a.C55077f) r4
            int r5 = r4.f144893a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x00b9
            com.google.bb.a.he r5 = r4.f144896d
            if (r5 != 0) goto L_0x00b6
            com.google.bb.a.he r5 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x00b6:
            r2.add(r5)
        L_0x00b9:
            com.google.bb.a.n r4 = r4.f144899g
            if (r4 != 0) goto L_0x00bf
            com.google.bb.a.n r4 = com.google.p4152bb.p4153a.C55293n.f145650k
        L_0x00bf:
            m141907c(r4, r2)
            goto L_0x009e
        L_0x00c3:
            java.util.Iterator r7 = r2.iterator()
        L_0x00c7:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x013a
            java.lang.Object r2 = r7.next()
            com.google.bb.a.he r2 = (com.google.p4152bb.p4153a.C55136he) r2
            com.google.protobuf.cq r2 = r2.f145138g
            java.util.Iterator r2 = r2.iterator()
        L_0x00d9:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00c7
            java.lang.Object r4 = r2.next()
            com.google.bb.a.hc r4 = (com.google.p4152bb.p4153a.C55134hc) r4
            int r5 = r4.f145121a
            r6 = r5 & 2
            if (r6 == 0) goto L_0x00d9
            r5 = r5 & 1
            if (r5 == 0) goto L_0x00d9
            int r5 = r4.f145122b
            if (r5 != r8) goto L_0x00d9
            com.google.bb.a.hb r5 = com.google.p4152bb.p4153a.C55133hb.NONE
            int r4 = r4.f145123c
            com.google.bb.a.hb r4 = com.google.p4152bb.p4153a.C55133hb.m87600a(r4)
            if (r4 != 0) goto L_0x00ff
            com.google.bb.a.hb r4 = com.google.p4152bb.p4153a.C55133hb.NONE
        L_0x00ff:
            int r4 = r4.ordinal()
            r5 = 15
            if (r4 == r5) goto L_0x0131
            if (r4 == r3) goto L_0x0128
            switch(r4) {
                case 9: goto L_0x011f;
                case 10: goto L_0x0116;
                case 11: goto L_0x010d;
                default: goto L_0x010c;
            }
        L_0x010c:
            goto L_0x00d9
        L_0x010d:
            com.google.android.apps.gsa.search.shared.contact.c r4 = com.google.android.apps.gsa.search.shared.contact.C87515c.PHONE_NUMBER
            boolean r4 = r1.mo85112a(r4)
            if (r4 != 0) goto L_0x00d9
            goto L_0x0139
        L_0x0116:
            com.google.android.apps.gsa.search.shared.contact.c r4 = com.google.android.apps.gsa.search.shared.contact.C87515c.POSTAL_ADDRESS
            boolean r4 = r1.mo85112a(r4)
            if (r4 != 0) goto L_0x00d9
            goto L_0x0139
        L_0x011f:
            com.google.android.apps.gsa.search.shared.contact.c r4 = com.google.android.apps.gsa.search.shared.contact.C87515c.EMAIL
            boolean r4 = r1.mo85112a(r4)
            if (r4 != 0) goto L_0x00d9
            goto L_0x0139
        L_0x0128:
            com.google.android.apps.gsa.search.shared.contact.c r4 = com.google.android.apps.gsa.search.shared.contact.C87515c.APP_SPECIFIC_ENDPOINT_ID
            boolean r4 = r1.mo85112a(r4)
            if (r4 != 0) goto L_0x00d9
            goto L_0x0139
        L_0x0131:
            com.google.android.apps.gsa.search.shared.contact.c r4 = com.google.android.apps.gsa.search.shared.contact.C87515c.GAIA_ID
            boolean r4 = r1.mo85112a(r4)
            if (r4 != 0) goto L_0x00d9
        L_0x0139:
            return r0
        L_0x013a:
            java.lang.Object r7 = r1.f253868a
            com.google.android.apps.gsa.search.shared.contact.c r7 = (com.google.android.apps.gsa.search.shared.contact.C87515c) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87437ae.m141905a(com.google.bb.a.la, int):com.google.android.apps.gsa.search.shared.contact.c");
    }

    /* renamed from: b */
    public static C87515c m141906b(C55305nl nlVar, int i) {
        if (nlVar.f145692b.size() == 0) {
            return null;
        }
        return m141905a((C55240la) nlVar.f145692b.get(0), i);
    }

    /* renamed from: c */
    private static void m141907c(C55293n nVar, List list) {
        if (nVar != null) {
            if ((nVar.f145652a & 16) != 0) {
                C55136he heVar = nVar.f145657f;
                if (heVar == null) {
                    heVar = C55136he.f145130j;
                }
                list.add(heVar);
            }
            if ((nVar.f145652a & 8) != 0) {
                C55136he heVar2 = nVar.f145656e;
                if (heVar2 == null) {
                    heVar2 = C55136he.f145130j;
                }
                list.add(heVar2);
            }
            for (C55077f fVar : nVar.f145660i) {
                if ((fVar.f144893a & 4) != 0) {
                    C55136he heVar3 = fVar.f144896d;
                    if (heVar3 == null) {
                        heVar3 = C55136he.f145130j;
                    }
                    list.add(heVar3);
                    C55293n nVar2 = fVar.f144899g;
                    if (nVar2 == null) {
                        nVar2 = C55293n.f145650k;
                    }
                    m141907c(nVar2, list);
                }
            }
        }
    }
}
