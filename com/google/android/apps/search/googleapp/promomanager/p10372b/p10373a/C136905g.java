package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import android.content.Context;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.g */
/* compiled from: PG */
public final class C136905g implements C136903e {

    /* renamed from: a */
    private static final C58974d f372610a = C58974d.m91135i("NotificationEnabledPE");

    /* renamed from: b */
    private final Context f372611b;

    public C136905g(Context context) {
        this.f372611b = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        if (r3.getImportance() > 0) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b3, code lost:
        r2 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo113438a(com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s r7, com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj r8) {
        /*
            r6 = this;
            com.google.common.f.a.d r8 = f372610a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8
            r0 = 40882(0x9fb2, float:5.7288E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r0)
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8
            int r0 = r7.f172968a
            com.google.protos.aw.a.a.a.r r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r.m96325a(r0)
            if (r0 != 0) goto L_0x001b
            com.google.protos.aw.a.a.a.r r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r.TYPE_UNSPECIFIED
        L_0x001b:
            java.lang.String r1 = "Evaluating %s Condition Predicate"
            java.lang.String r0 = r0.name()
            r8.mo56389s(r1, r0)
            com.google.protobuf.bt r8 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63878j.f172725c
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r7.mo58887l(r8)
            com.google.protobuf.bf r0 = r7.f169962ag
            com.google.protobuf.bs r8 = r8.f169971d
            boolean r8 = r0.mo58857o(r8)
            java.lang.String r0 = "Invalid configuration"
            r1 = 1
            if (r8 == 0) goto L_0x0069
            com.google.protobuf.bt r8 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63878j.f172725c
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r7.mo58887l(r8)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r2 = r8.f169971d
            java.lang.Object r7 = r7.mo58854l(r2)
            if (r7 != 0) goto L_0x0050
            java.lang.Object r7 = r8.f169969b
            goto L_0x0054
        L_0x0050:
            java.lang.Object r7 = r8.mo58889c(r7)
        L_0x0054:
            com.google.protos.aw.a.a.a.a.b.j r7 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63878j) r7
            int r7 = r7.f172727a
            int r7 = com.google.p4283bv.p4345d.p4350b.p4352b.C56992b.m88249a(r7)
            if (r7 == 0) goto L_0x005f
            goto L_0x006a
        L_0x005f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r0)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92899h(r7)
            return r7
        L_0x0069:
            r7 = 1
        L_0x006a:
            android.content.Context r8 = r6.f372611b
            androidx.core.app.aq r2 = new androidx.core.app.aq
            r2.<init>(r8)
            android.app.NotificationManager r8 = r2.f5622a
            boolean r8 = androidx.core.app.C1793aj.m4937b(r8)
            r2 = 0
            if (r8 == 0) goto L_0x00c4
            if (r7 == 0) goto L_0x00c2
            if (r7 == r1) goto L_0x00c5
            android.content.Context r8 = r6.f372611b
            androidx.core.app.aq r3 = new androidx.core.app.aq
            r3.<init>(r8)
            android.app.NotificationManager r8 = r3.f5622a
            java.util.List r8 = androidx.core.app.C1794ak.m4942e(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x008f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r8.next()
            android.app.NotificationChannel r3 = (android.app.NotificationChannel) r3
            java.lang.String r4 = r3.getId()
            int r5 = r7 + -1
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x008f
            int r7 = r3.getImportance()
            if (r7 <= 0) goto L_0x00b4
            goto L_0x00b3
        L_0x00b2:
            r1 = 0
        L_0x00b3:
            r2 = 1
        L_0x00b4:
            if (r1 != 0) goto L_0x00c0
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r0)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92899h(r7)
            goto L_0x00cd
        L_0x00c0:
            r1 = r2
            goto L_0x00c5
        L_0x00c2:
            r7 = 0
            throw r7
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
        L_0x00cd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a.C136905g.mo113438a(com.google.protos.aw.a.a.a.s, com.google.android.apps.search.googleapp.promomanager.b.dj):com.google.common.util.concurrent.cx");
    }
}
