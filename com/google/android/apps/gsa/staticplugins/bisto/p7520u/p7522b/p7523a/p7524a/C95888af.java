package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142402e;
import com.google.android.p10712d.C142429f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.af */
/* compiled from: PG */
public final class C95888af extends C95914i {

    /* renamed from: c */
    public static final C59071e f268470c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.af");

    /* renamed from: d */
    private final C96023bs f268471d;

    /* renamed from: e */
    private final C95355bf f268472e;

    /* renamed from: f */
    private final C22871g f268473f;

    /* renamed from: g */
    private final C89492cd f268474g;

    public C95888af(C95346ax axVar, C96023bs bsVar, C89492cd cdVar, C22871g gVar, C95848i iVar, C95850a aVar) {
        super(axVar, bsVar, "OobeEnableAuxState", cdVar, iVar, aVar);
        this.f268471d = bsVar;
        this.f268472e = axVar;
        this.f268473f = gVar;
        this.f268474g = cdVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268471d.mo89831a();
        this.f268471d.mo89840j(true);
        this.f268471d.mo89842l();
        C95355bf bfVar = this.f268472e;
        C142402e eVar = (C142402e) C142429f.f386490d.createBuilder();
        eVar.copyOnWrite();
        C142429f fVar = (C142429f) eVar.instance;
        fVar.f386492a |= 1;
        fVar.f386493b = true;
        eVar.copyOnWrite();
        C142429f fVar2 = (C142429f) eVar.instance;
        fVar2.f386492a |= 2;
        fVar2.f386494c = true;
        bfVar.mo89257D(10, 4, ((C142429f) eVar.build()).toByteArray());
    }

    /* renamed from: ip */
    public final void mo89286ip(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89848l(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getAction()
            java.lang.String r1 = "OobeEnableAuxState"
            if (r0 != 0) goto L_0x001f
            com.google.common.f.e r0 = f268470c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r1)
            java.lang.String r1 = "Null action"
            r2 = 15879(0x3e07, float:2.2251E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            boolean r7 = super.mo89848l(r7)
            return r7
        L_0x001f:
            int r2 = r0.hashCode()
            r3 = -377527494(0xffffffffe97f633a, float:-1.9296542E25)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L_0x0049
            r3 = 1821585647(0x6c9330ef, float:1.4235454E27)
            if (r2 == r3) goto L_0x003f
            r3 = 1854535521(0x6e89f761, float:2.1349255E28)
            if (r2 == r3) goto L_0x0035
            goto L_0x0053
        L_0x0035:
            java.lang.String r2 = "ACTION_OOBE_STATUS_UPDATED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x003f:
            java.lang.String r2 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0053
            r0 = 0
            goto L_0x0054
        L_0x0049:
            java.lang.String r2 = "android.bluetooth.device.action.UUID"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0053
            r0 = 2
            goto L_0x0054
        L_0x0053:
            r0 = -1
        L_0x0054:
            if (r0 == 0) goto L_0x00c9
            if (r0 == r5) goto L_0x007b
            if (r0 == r4) goto L_0x005f
            boolean r7 = super.mo89848l(r7)
            return r7
        L_0x005f:
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r7 = r6.f268472e
            com.google.common.util.concurrent.cx r7 = r7.mo89264e()
            com.google.android.libraries.gsa.k.g r0 = r6.f268473f
            com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ad r1 = new com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ad
            r1.<init>(r6)
            java.lang.String r2 = "Connect to device"
            com.google.android.apps.gsa.shared.util.c.ag r7 = com.google.android.apps.gsa.shared.util.p7159c.C90875ai.m148465b(r1, r7, r0, r2)
            com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ae r0 = new com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ae
            r0.<init>(r6)
            r7.mo85223a(r0)
            return r5
        L_0x007b:
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r7 = com.google.android.apps.gsa.shared.bisto.p7029b.C89636g.m145896b(r7)
            if (r7 != 0) goto L_0x0094
            com.google.common.f.e r7 = f268470c
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r1)
            java.lang.String r0 = "OobeState is null"
            r1 = 15875(0x3e03, float:2.2246E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            goto L_0x00c9
        L_0x0094:
            int r7 = r7.ordinal()
            r0 = 0
            if (r7 == r5) goto L_0x00c4
            if (r7 == r4) goto L_0x009e
            goto L_0x00c9
        L_0x009e:
            com.google.android.apps.gsa.shared.bisto.a.cd r7 = r6.f268474g
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r1 = r6.f268472e
            java.lang.String r1 = r1.mo89270k()
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r7 = r7.mo83401b(r1)
            if (r7 == 0) goto L_0x00be
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r7 = r7.mo106513k()
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r1 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.CAR_ACCESSORY
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x00be
            java.lang.String r7 = "CarAccessoryOobeState"
            r6.mo89847j(r7, r0)
            goto L_0x00c9
        L_0x00be:
            java.lang.String r7 = "DisconnectingState"
            r6.mo89847j(r7, r0)
            goto L_0x00c9
        L_0x00c4:
            java.lang.String r7 = "HotwordInitState"
            r6.mo89847j(r7, r0)
        L_0x00c9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95888af.mo89848l(android.content.Intent):boolean");
    }
}
