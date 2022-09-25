package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.aa */
/* compiled from: PG */
public final class C11839aa implements a {

    /* renamed from: a */
    private final C86124t f38034a;

    /* renamed from: b */
    private final C9309a f38035b;

    static {
        C58974d.m91134h("OfflinePuntBuilder");
    }

    public C11839aa(C86124t tVar, C9309a aVar) {
        this.f38034a = tVar;
        this.f38035b = aVar;
    }

    /* renamed from: a */
    public final C58833ax mo20194a(C61752n nVar, Query query) {
        return C58836b.f156633a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20195b(com.google.speech.grammar.pumpkin.C66525q r6, com.google.android.apps.gsa.shared.search.Query r7) {
        /*
            r5 = this;
            com.google.android.apps.gsa.search.core.i.t r7 = r5.f38034a
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250385cD
            boolean r7 = r7.mo79746e(r0)
            if (r7 == 0) goto L_0x00fe
            if (r6 == 0) goto L_0x00fe
            java.lang.String r7 = r6.f180932b
            int r0 = r7.hashCode()
            r1 = -1781830854(0xffffffff95cb6b3a, float:-8.216022E-26)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L_0x0039
            r1 = -1244661596(0xffffffffb5cff8a4, float:-1.5495066E-6)
            if (r0 == r1) goto L_0x002f
            r1 = 2092670(0x1fee7e, float:2.932455E-39)
            if (r0 == r1) goto L_0x0025
            goto L_0x0043
        L_0x0025:
            java.lang.String r0 = "Call"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0043
            r7 = 0
            goto L_0x0044
        L_0x002f:
            java.lang.String r0 = "Routine"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0043
            r7 = 2
            goto L_0x0044
        L_0x0039:
            java.lang.String r0 = "Travel"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0043
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = -1
        L_0x0044:
            if (r7 == 0) goto L_0x00a6
            if (r7 == r4) goto L_0x0065
            if (r7 == r2) goto L_0x0051
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x0051:
            com.google.android.apps.gsa.a.c.a r6 = r5.f38035b
            android.content.Context r7 = r6.f32300b
            android.content.res.Resources r6 = r6.mo17491a(r7)
            r7 = 2132090288(0x7f151db0, float:1.9820912E38)
            java.lang.String r6 = r6.getString(r7)
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r6)
            goto L_0x00b9
        L_0x0065:
            com.google.protobuf.cq r6 = r6.f180933c
            java.util.Iterator r6 = r6.iterator()
        L_0x006b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0084
            java.lang.Object r7 = r6.next()
            com.google.speech.grammar.pumpkin.m r7 = (com.google.speech.grammar.pumpkin.C66521m) r7
            java.lang.String r0 = r7.f180922b
            java.lang.String r1 = "PUNT_VALIDATOR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006b
            java.lang.String r6 = r7.f180925e
            goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            if (r6 != 0) goto L_0x008e
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x008e:
            com.google.android.apps.gsa.a.c.a r7 = r5.f38035b
            android.content.Context r0 = r7.f32300b
            android.content.res.Resources r7 = r7.mo17491a(r0)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r6
            r6 = 2132086138(0x7f150d7a, float:1.9812495E38)
            java.lang.String r6 = r7.getString(r6, r0)
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r6)
            goto L_0x00b9
        L_0x00a6:
            com.google.android.apps.gsa.a.c.a r6 = r5.f38035b
            android.content.Context r7 = r6.f32300b
            android.content.res.Resources r6 = r6.mo17491a(r7)
            r7 = 2132090103(0x7f151cf7, float:1.9820537E38)
            java.lang.String r6 = r6.getString(r7)
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r6)
        L_0x00b9:
            if (r6 == 0) goto L_0x00fe
            com.google.assistant.e.e.a.j r7 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.e.a.e r7 = (com.google.assistant.p3897e.p3910e.p3911a.C51190e) r7
            com.google.assistant.e.j.dy[] r0 = new com.google.assistant.p3897e.p3921j.C51809dy[r4]
            r0[r3] = r6
            java.util.List r6 = java.util.Arrays.asList(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[r4]
            r1 = 23202(0x5aa2, float:3.2513E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r3] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.assistant.e.j.en r6 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32463b(r6, r0)
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0
            r6.getClass()
            r0.f133275j = r6
            int r6 = r0.f133266a
            r6 = r6 | 128(0x80, float:1.794E-43)
            r0.f133266a = r6
            com.google.protobuf.bv r6 = r7.build()
            com.google.assistant.e.e.a.j r6 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r6
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x00fe:
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11839aa.mo20195b(com.google.speech.grammar.pumpkin.q, com.google.android.apps.gsa.shared.search.Query):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C60870cx mo20196c(C52081en enVar) {
        return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
    }
}
