package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c.C131192j;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.s */
/* compiled from: PG */
public final /* synthetic */ class C131360s implements C131192j {

    /* renamed from: a */
    public final /* synthetic */ C131342ac f359098a;

    public /* synthetic */ C131360s(C131342ac acVar) {
        this.f359098a = acVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        if ((r4 == null ? com.google.assistant.p4016z.C53729n.f141051i : r4).f141055c != false) goto L_0x006e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo110113a(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            com.google.android.apps.search.assistant.verticals.ambient.s.i.ac r1 = r0.f359098a
            r2 = r17
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            int r3 = r2.size()
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000f:
            if (r6 >= r3) goto L_0x0079
            java.lang.Object r9 = r2.get(r6)
            com.google.assistant.z.aq r9 = (com.google.assistant.p4016z.C53692aq) r9
            com.google.assistant.z.b r10 = r9.f140946h
            if (r10 != 0) goto L_0x001d
            com.google.assistant.z.b r10 = com.google.assistant.p4016z.C53702b.f140971f
        L_0x001d:
            com.google.protobuf.cq r10 = r10.f140976d
            java.util.Iterator r10 = r10.iterator()
        L_0x0023:
            int r11 = r6 + 1
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0077
            java.lang.Object r11 = r10.next()
            com.google.assistant.z.d r11 = (com.google.assistant.p4016z.C53719d) r11
            com.google.assistant.z.n r12 = r11.f141034e
            if (r12 != 0) goto L_0x0037
            com.google.assistant.z.n r12 = com.google.assistant.p4016z.C53729n.f141051i
        L_0x0037:
            int r12 = r12.f141059g
            if (r12 == 0) goto L_0x006b
            long r13 = (long) r12
            long r4 = r1.f359065j
            int r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r15 <= 0) goto L_0x0043
            goto L_0x006b
        L_0x0043:
            if (r8 == 0) goto L_0x004a
            int r4 = r8.f141059g
            if (r12 < r4) goto L_0x004a
            goto L_0x006b
        L_0x004a:
            com.google.assistant.z.n r4 = r11.f141034e
            if (r4 != 0) goto L_0x0051
            com.google.assistant.z.n r5 = com.google.assistant.p4016z.C53729n.f141051i
            goto L_0x0052
        L_0x0051:
            r5 = r4
        L_0x0052:
            boolean r5 = r5.f141054b
            if (r5 != 0) goto L_0x006e
            if (r4 != 0) goto L_0x005b
            com.google.assistant.z.n r5 = com.google.assistant.p4016z.C53729n.f141051i
            goto L_0x005c
        L_0x005b:
            r5 = r4
        L_0x005c:
            boolean r5 = r5.f141056d
            if (r5 != 0) goto L_0x006e
            if (r4 != 0) goto L_0x0065
            com.google.assistant.z.n r5 = com.google.assistant.p4016z.C53729n.f141051i
            goto L_0x0066
        L_0x0065:
            r5 = r4
        L_0x0066:
            boolean r5 = r5.f141055c
            if (r5 == 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            long r4 = r11.f141031b
            goto L_0x0023
        L_0x006e:
            if (r4 != 0) goto L_0x0072
            com.google.assistant.z.n r4 = com.google.assistant.p4016z.C53729n.f141051i
        L_0x0072:
            long r7 = r11.f141031b
            r8 = r4
            r7 = r9
            goto L_0x0023
        L_0x0077:
            r6 = r11
            goto L_0x000f
        L_0x0079:
            if (r7 == 0) goto L_0x0223
            if (r8 != 0) goto L_0x007f
            goto L_0x0223
        L_0x007f:
            com.google.common.base.cr r2 = r1.f359066k
            java.lang.Object r2 = r2.mo6453a()
            com.google.common.b.hd r2 = (com.google.common.p4522b.C58495hd) r2
            java.lang.String r3 = "signup_deeplink_prefix"
            r4 = 0
            java.lang.Object r2 = r2.getOrDefault(r3, r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0098
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x0235
        L_0x0098:
            long r3 = r8.f141057e
            java.lang.String r5 = r8.f141058f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = "."
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            j$.util.Optional r2 = r1.mo110150a(r2)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00d1
            com.google.common.f.a.d r2 = r1.f359056a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Cannot resolve intent."
            r4 = 39228(0x993c, float:5.497E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x0235
        L_0x00d1:
            com.google.android.apps.gsa.opa.smartspace.ak r3 = com.google.android.apps.gsa.opa.smartspace.C83739ak.f228230q
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.opa.smartspace.ab r3 = (com.google.android.apps.gsa.opa.smartspace.C83730ab) r3
            com.google.assistant.c.cr r4 = com.google.assistant.p3886c.C50794cr.LOYALTY_CARD
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.opa.smartspace.ak r5 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r5
            int r4 = r4.f132222T
            r5.f228239h = r4
            int r4 = r5.f228232a
            r4 = r4 | 64
            r5.f228232a = r4
            com.google.android.apps.search.assistant.verticals.ambient.s.m.e r4 = r1.f359061f
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r7)
            java.lang.String r4 = r4.mo110160a(r5)
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.opa.smartspace.ak r5 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r5
            r4.getClass()
            int r6 = r5.f228232a
            r7 = 2
            r6 = r6 | r7
            r5.f228232a = r6
            r5.f228234c = r4
            android.content.Context r4 = r1.f359060e
            r5 = 2132084037(0x7f150545, float:1.9808233E38)
            java.lang.String r4 = r4.getString(r5)
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.opa.smartspace.ak r5 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r5
            r4.getClass()
            int r6 = r5.f228232a
            r6 = r6 | 8
            r5.f228232a = r6
            r5.f228236e = r4
            com.google.android.apps.search.assistant.verticals.ambient.s.m.a r4 = r1.f359062g
            com.google.assistant.ag.c.z r4 = r4.mo110159a()
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.opa.smartspace.ak r5 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r5
            r4.getClass()
            r5.f228240i = r4
            int r4 = r5.f228232a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r5.f228232a = r4
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.gsa.opa.smartspace.ak r4 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r4
            r2.getClass()
            int r5 = r4.f228232a
            r5 = r5 | 32
            r4.f228232a = r5
            r4.f228238g = r2
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.android.apps.gsa.opa.smartspace.ak r2 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r2
            int r4 = r2.f228232a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r2.f228232a = r4
            r4 = 0
            r2.f228241j = r4
            com.google.android.apps.gsa.opa.smartspace.af r2 = com.google.android.apps.gsa.opa.smartspace.C83734af.f228216e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.opa.smartspace.ac r2 = (com.google.android.apps.gsa.opa.smartspace.C83731ac) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.opa.smartspace.af r4 = (com.google.android.apps.gsa.opa.smartspace.C83734af) r4
            int r5 = r4.f228218a
            r6 = 1
            r5 = r5 | r6
            r4.f228218a = r5
            java.lang.String r5 = "https://www.gstatic.com/images/icons/material/system_gm/2x/place_white_24dp.png"
            r4.f228219b = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.opa.smartspace.af r4 = (com.google.android.apps.gsa.opa.smartspace.C83734af) r4
            r4.f228220c = r7
            int r5 = r4.f228218a
            r5 = r5 | r7
            r4.f228218a = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.opa.smartspace.af r4 = (com.google.android.apps.gsa.opa.smartspace.C83734af) r4
            int r5 = r4.f228218a
            r5 = r5 | 4
            r4.f228218a = r5
            r4.f228221d = r6
            r3.mo77053a(r2)
            com.google.android.apps.gsa.opa.smartspace.af r2 = com.google.android.apps.gsa.opa.smartspace.C83734af.f228216e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.opa.smartspace.ac r2 = (com.google.android.apps.gsa.opa.smartspace.C83731ac) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.opa.smartspace.af r4 = (com.google.android.apps.gsa.opa.smartspace.C83734af) r4
            int r5 = r4.f228218a
            r5 = r5 | r6
            r4.f228218a = r5
            java.lang.String r5 = "https://www.gstatic.com/images/icons/material/system_gm/2x/place_black_24dp.png"
            r4.f228219b = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.opa.smartspace.af r4 = (com.google.android.apps.gsa.opa.smartspace.C83734af) r4
            r4.f228220c = r6
            int r5 = r4.f228218a
            r5 = r5 | r7
            r4.f228218a = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.opa.smartspace.af r4 = (com.google.android.apps.gsa.opa.smartspace.C83734af) r4
            int r5 = r4.f228218a
            r5 = r5 | 4
            r4.f228218a = r5
            r4.f228221d = r6
            r3.mo77053a(r2)
            int r2 = r8.f141053a
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x020a
            com.google.android.apps.gsa.opa.smartspace.ah r2 = com.google.android.apps.gsa.opa.smartspace.C83736ah.f228222c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.opa.smartspace.ag r2 = (com.google.android.apps.gsa.opa.smartspace.C83735ag) r2
            java.lang.String r4 = r8.f141060h
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.gsa.opa.smartspace.ah r5 = (com.google.android.apps.gsa.opa.smartspace.C83736ah) r5
            r4.getClass()
            r5.f228224a = r6
            r5.f228225b = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.gsa.opa.smartspace.ak r4 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.opa.smartspace.ah r2 = (com.google.android.apps.gsa.opa.smartspace.C83736ah) r2
            r2.getClass()
            r4.f228247p = r2
            int r2 = r4.f228232a
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r4.f228232a = r2
        L_0x020a:
            com.google.common.f.a.d r2 = r1.f359056a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r4 = "Generated a sign-up card."
            r5 = 39227(0x993b, float:5.4969E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.protobuf.bv r2 = r3.build()
            com.google.android.apps.gsa.opa.smartspace.ak r2 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r2
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            goto L_0x0235
        L_0x0223:
            com.google.common.f.a.d r2 = r1.f359056a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Found no place that supports sign-up."
            r4 = 39226(0x993a, float:5.4967E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
        L_0x0235:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0244
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x02a6
        L_0x0244:
            com.google.android.apps.search.assistant.verticals.ambient.s.i.q r3 = r1.f359057b
            j$.util.Optional r4 = r3.f359094e
            com.google.android.apps.search.assistant.verticals.ambient.s.i.p r5 = new com.google.android.apps.search.assistant.verticals.ambient.s.i.p
            r5.<init>(r3)
            java.lang.Object r4 = r4.orElseGet(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0271
            com.google.common.f.a.d r3 = r3.f359090a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Pay module is not available."
            r5 = 39215(0x992f, float:5.4952E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r3)
            goto L_0x0297
        L_0x0271:
            com.google.common.f.a.d r4 = r3.f359090a
            com.google.common.f.x r4 = r4.mo56224b()
            java.lang.String r5 = "Fetching loyalty cards from Google Pay."
            r6 = 39214(0x992e, float:5.495E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r4).mo56372aa(r6)).mo56386p(r5)
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r4 = r3.mo110151a(r4, r5)
            com.google.android.apps.search.assistant.verticals.ambient.s.i.d r5 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i.C131345d.f359071a
            com.google.common.util.concurrent.db r3 = r3.f359092c
            com.google.common.base.ah r5 = com.google.apps.tiktok.tracing.C47810es.m84963c(r5)
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60922j.m93044g(r4, r5, r3)
        L_0x0297:
            com.google.android.apps.search.assistant.verticals.ambient.s.i.t r4 = new com.google.android.apps.search.assistant.verticals.ambient.s.i.t
            r4.<init>(r1, r2)
            com.google.common.util.concurrent.da r1 = r1.f359058c
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r4)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r3, r2, r1)
        L_0x02a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i.C131360s.mo110113a(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
