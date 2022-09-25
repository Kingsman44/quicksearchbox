package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.l */
/* compiled from: PG */
public final class C95917l extends C95909d {

    /* renamed from: c */
    public static final C59071e f268562c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.l");

    /* renamed from: d */
    private final C95355bf f268563d;

    /* renamed from: e */
    private final C22871g f268564e;

    /* renamed from: f */
    private final C96023bs f268565f;

    /* renamed from: g */
    private final C89492cd f268566g;

    /* renamed from: h */
    private C60870cx f268567h;

    public C95917l(C96023bs bsVar, C22871g gVar, C89492cd cdVar, C95346ax axVar, C95850a aVar) {
        super(bsVar, "ConnectingLCState", axVar, cdVar, aVar);
        this.f268563d = axVar;
        this.f268564e = gVar;
        this.f268565f = bsVar;
        this.f268566g = cdVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268565f.mo89831a();
        if (this.f268563d.mo89278w()) {
            C59104x b = f268562c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConnectingLCState");
            ((C59052c) ((C59052c) b).mo56372aa(15840)).mo56386p("Already connected, moving to INIT");
            mo89847j("InitState", (Intent) null);
            return;
        }
        C59104x b2 = f268562c.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ConnectingLCState");
        ((C59052c) ((C59052c) b2).mo56372aa(15839)).mo56386p("Connecting");
        C60870cx e = this.f268563d.mo89264e();
        this.f268567h = e;
        C90875ai.m148465b(new C95915j(this), e, this.f268564e, "onConnected").mo85223a(new C95916k(this));
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        C60870cx cxVar = this.f268567h;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        this.f268567h = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r0.equals("android.bluetooth.device.action.ACL_DISCONNECTED") != false) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89848l(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r2 = r0.hashCode()
            r3 = 1821585647(0x6c9330ef, float:1.4235454E27)
            r4 = -1
            r5 = 1
            if (r2 == r3) goto L_0x0023
            r1 = 2116862345(0x7e2cc189, float:5.7408027E37)
            if (r2 == r1) goto L_0x0019
            goto L_0x002c
        L_0x0019:
            java.lang.String r1 = "android.bluetooth.device.action.BOND_STATE_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002c
            r1 = 1
            goto L_0x002d
        L_0x0023:
            java.lang.String r2 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = -1
        L_0x002d:
            java.lang.String r0 = "ConnectingLCState"
            if (r1 == 0) goto L_0x0055
            if (r1 == r5) goto L_0x0035
            goto L_0x00c4
        L_0x0035:
            java.lang.String r1 = "android.bluetooth.device.extra.BOND_STATE"
            int r1 = r7.getIntExtra(r1, r4)
            com.google.common.f.e r2 = f268562c
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r0)
            java.lang.String r0 = "bondState: %d"
            r3 = 15848(0x3de8, float:2.2208E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r3)).mo56387q(r0, r1)
            r0 = 12
            if (r1 != r0) goto L_0x00c4
            r6.mo89852m()
            return r5
        L_0x0055:
            com.google.android.apps.gsa.shared.bisto.a.cd r1 = r6.f268566g
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r2 = r6.f268563d
            java.lang.String r2 = r2.mo89270k()
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r1 = r1.mo83401b(r2)
            if (r1 != 0) goto L_0x007a
            com.google.common.f.e r1 = f268562c
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r0)
            java.lang.String r0 = "Null bistoDeviceInfo"
            r2 = 15847(0x3de7, float:2.2206E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r0)
            boolean r7 = super.mo89848l(r7)
            return r7
        L_0x007a:
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r2 = r1.mo106513k()
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r3 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.CAR_ACCESSORY
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00c4
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r2 = r1.mo106520r()
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r3 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az.OOBE_FINISHED
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00a5
            com.google.common.f.e r7 = f268562c
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r1, r0)
            java.lang.String r0 = "ACTION_ACL_DISCONNECTED for car accessory when connecting. Ignoring"
            r1 = 15846(0x3de6, float:2.2205E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            return r5
        L_0x00a5:
            com.google.android.apps.search.assistant.surfaces.bisto.d.e r1 = r1.mo106508g()
            com.google.android.apps.search.assistant.surfaces.bisto.d.e r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e.INPUT_ONLY_MODE
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00c4
            com.google.common.f.e r7 = f268562c
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r1, r0)
            java.lang.String r0 = "ACL_DISCONNECTED for input-only device. Ignoring"
            r1 = 15845(0x3de5, float:2.2204E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            return r5
        L_0x00c4:
            boolean r7 = super.mo89848l(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95917l.mo89848l(android.content.Intent):boolean");
    }
}
