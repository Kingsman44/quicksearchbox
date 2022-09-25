package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78059be;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.i */
/* compiled from: PG */
public final class C77289i implements C76591c {

    /* renamed from: a */
    private static final C58974d f213173a = C58974d.m91136j();

    /* renamed from: b */
    private final C78059be f213174b;

    /* renamed from: c */
    private final C77291k f213175c;

    /* renamed from: d */
    private final C77301u f213176d;

    public C77289i(C78059be beVar, C77291k kVar, C77301u uVar) {
        this.f213174b = beVar;
        this.f213175c = kVar;
        this.f213176d = uVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.SET_RINGER));
        h.mo72277g("Set_ringer_mode", C90126fx.f251262fW);
        h.mo72244c(C58485gu.m89846n("Set_ringer_mode"));
        ((C76541a) h).f211766c = 10103;
        return h.mo72276f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0143  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo71712b(com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg r8, com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n r9) {
        /*
            r7 = this;
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "mode"
            r3 = 0
            r1[r3] = r2
            com.google.android.apps.gsa.nga.engine.o.c.ah r2 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r8 = r8.mo72265g(r2, r1)
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0024
            com.google.common.f.a.d r8 = f213173a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "Missing ring mode"
            r0 = 3859(0xf13, float:5.408E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56372aa(r0)).mo56386p(r9)
            com.google.common.util.concurrent.cx r8 = com.google.android.apps.gsa.nga.shared.p6358n.C81442m.f222851a
            return r8
        L_0x0024:
            com.google.android.apps.gsa.nga.shared.aa.e.n r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n.f220656k
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.e.l r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l) r1
            com.google.android.apps.gsa.nga.engine.o.e.f.u r2 = r7.f213176d
            com.google.protos.an.d.b.p r4 = com.google.protos.p4850an.p4855d.p4857b.C63490p.RING_VOLUME
            boolean r2 = r2.mo72511o(r4)
            if (r2 == 0) goto L_0x004a
            com.google.android.apps.gsa.nga.engine.o.e.f.u r8 = r7.f213176d
            java.util.Locale r9 = r9.mo71342q()
            r8.mo72501e(r1, r9)
            com.google.protobuf.bv r8 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r8
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x004a:
            java.lang.Object r2 = r8.get()
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r2.hashCode()
            r5 = -1986416409(0xffffffff8999b0e7, float:-3.699977E-33)
            r6 = 2
            if (r4 == r5) goto L_0x0079
            r5 = -1848997803(0xffffffff91ca8855, float:-3.1954002E-28)
            if (r4 == r5) goto L_0x006f
            r5 = 1169293647(0x45b2014f, float:5696.1636)
            if (r4 == r5) goto L_0x0065
            goto L_0x0083
        L_0x0065:
            java.lang.String r4 = "VIBRATE"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0083
            r2 = 1
            goto L_0x0084
        L_0x006f:
            java.lang.String r4 = "SILENT"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0083
            r2 = 2
            goto L_0x0084
        L_0x0079:
            java.lang.String r4 = "NORMAL"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0083
            r2 = 0
            goto L_0x0084
        L_0x0083:
            r2 = -1
        L_0x0084:
            if (r2 == 0) goto L_0x0143
            if (r2 == r0) goto L_0x00ba
            if (r2 == r6) goto L_0x00a6
            com.google.common.f.a.d r9 = f213173a
            com.google.common.f.x r9 = r9.mo56225c()
            java.lang.Object r8 = r8.get()
            r0 = 3857(0xf11, float:5.405E-42)
            java.lang.String r2 = "Ring mode %s unknown"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r9).mo56372aa(r0)).mo56389s(r2, r8)
            com.google.protobuf.bv r8 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r8
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x00a6:
            com.google.android.apps.gsa.nga.engine.o.e.f.u r8 = r7.f213176d
            com.google.protos.an.d.b.p r2 = com.google.protos.p4850an.p4855d.p4857b.C63490p.RING_VOLUME
            r8.mo72506j(r1, r2, r0)
            com.google.android.apps.gsa.nga.engine.o.e.f.u r8 = r7.f213176d
            com.google.protos.an.d.b.p r0 = com.google.protos.p4850an.p4855d.p4857b.C63490p.RING_VOLUME
            java.util.Locale r2 = r9.mo71342q()
            r8.mo72499c(r1, r0, r2)
            goto L_0x0155
        L_0x00ba:
            com.google.android.apps.gsa.nga.engine.o.e.f.k r8 = r7.f213175c
            android.content.Context r8 = r8.f213177a
            java.lang.String r2 = "notification"
            java.lang.Object r8 = r8.getSystemService(r2)
            r8.getClass()
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            boolean r8 = r8.isNotificationPolicyAccessGranted()
            if (r8 == 0) goto L_0x0125
            r8 = 23103(0x5a3f, float:3.2374E-41)
            r1.mo74319k(r8)
            com.google.android.apps.gsa.nga.shared.aa.e.a.aq r8 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq.f220357c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.e.a.ao r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao) r8
            com.google.android.apps.gsa.nga.shared.aa.e.a.bd r2 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80309bd.f220388b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.e.a.bc r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80308bc) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.nga.shared.aa.e.a.bd r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80309bd) r4
            r4.f220390a = r0
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.e.a.aq r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq) r0
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.nga.shared.aa.e.a.bd r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80309bd) r2
            r2.getClass()
            r0.f220360b = r2
            r2 = 13
            r0.f220359a = r2
            com.google.android.apps.gsa.nga.shared.p6358n.C81442m.m129555q(r1, r8)
            com.google.android.apps.gsa.nga.engine.o.e.f.u r8 = r7.f213176d
            java.util.Locale r0 = r9.mo71342q()
            com.google.android.apps.gsa.nga.engine.am.t r2 = r8.f213203a
            com.google.android.apps.gsa.nga.shared.u.c r8 = r8.f213204b
            java.lang.Object[] r2 = new java.lang.Object[r3]
            android.content.Context r8 = r8.mo75121a(r0)
            r0 = 2132089812(0x7f151bd4, float:1.9819946E38)
            java.lang.String r8 = r8.getString(r0, r2)
            com.google.assistant.e.j.dy r8 = com.google.android.apps.gsa.nga.engine.am.t.r(r8)
            com.google.android.apps.gsa.nga.shared.p6358n.C81442m.m129557s(r1, r8)
            goto L_0x0155
        L_0x0125:
            com.google.android.apps.gsa.nga.engine.ui.answer.be r8 = r7.f213174b
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"
            r0.<init>(r2)
            r2 = 2132089751(0x7f151b97, float:1.9819823E38)
            java.util.Locale r9 = r9.mo71342q()
            r8.mo73040b(r2, r1, r0, r9)
            com.google.protobuf.bv r8 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r8
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x0143:
            com.google.android.apps.gsa.nga.engine.o.e.f.u r8 = r7.f213176d
            com.google.protos.an.d.b.p r0 = com.google.protos.p4850an.p4855d.p4857b.C63490p.RING_VOLUME
            r8.mo72506j(r1, r0, r3)
            com.google.android.apps.gsa.nga.engine.o.e.f.u r8 = r7.f213176d
            com.google.protos.an.d.b.p r0 = com.google.protos.p4850an.p4855d.p4857b.C63490p.RING_VOLUME
            java.util.Locale r2 = r9.mo71342q()
            r8.mo72499c(r1, r0, r2)
        L_0x0155:
            com.google.android.apps.gsa.nga.engine.o.e.f.u r8 = r7.f213176d
            com.google.protos.an.d.b.p r0 = com.google.protos.p4850an.p4855d.p4857b.C63490p.RING_VOLUME
            java.util.Locale r9 = r9.mo71342q()
            r8.mo72505i(r0, r1, r9)
            com.google.protobuf.bv r8 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r8
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f.C77289i.mo71712b(com.google.android.apps.gsa.nga.engine.o.c.bg, com.google.android.apps.gsa.nga.engine.am.u.n):com.google.common.util.concurrent.cx");
    }
}
