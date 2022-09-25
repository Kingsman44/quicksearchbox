package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import android.media.MediaRouter;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.C95458i;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95763ba;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95764bb;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.am */
/* compiled from: PG */
public final class C95895am extends C95910e implements C95763ba {

    /* renamed from: c */
    public static final C59071e f268491c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.am");

    /* renamed from: d */
    public final C95346ax f268492d;

    /* renamed from: e */
    public final C95848i f268493e;

    /* renamed from: f */
    public C60870cx f268494f;

    /* renamed from: g */
    private final C96023bs f268495g;

    /* renamed from: h */
    private final C22871g f268496h;

    /* renamed from: i */
    private final C95458i f268497i;

    /* renamed from: j */
    private final C95764bb f268498j;

    public C95895am(C95346ax axVar, C96023bs bsVar, C89492cd cdVar, C22871g gVar, C95458i iVar, C95848i iVar2, C95764bb bbVar, C95850a aVar) {
        super(axVar, bsVar, "TwsReconnectingInteractingState", cdVar, iVar2, aVar);
        this.f268492d = axVar;
        this.f268495g = bsVar;
        this.f268496h = gVar;
        this.f268497i = iVar;
        this.f268493e = iVar2;
        this.f268498j = bbVar;
    }

    /* renamed from: d */
    public final void mo89753d(int i, int i2) {
        if (i2 != 0) {
            C59104x b = f268491c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TwsRecInteractState");
            ((C59052c) ((C59052c) b).mo56372aa(15905)).mo56386p("phoneCallDetected; destroyInteractingComponent");
            this.f268495g.mo89836f();
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        if (this.f268498j.f268131a != 0) {
            C59104x b = f268491c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TwsRecInteractState");
            ((C59052c) ((C59052c) b).mo56372aa(15899)).mo56386p("phoneCallDetected; destroyInteractingComponent");
            this.f268495g.mo89836f();
        }
        this.f268498j.mo89754a(this);
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        this.f268498j.mo89756c(this);
        C60870cx cxVar = this.f268494f;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f268494f = null;
        }
    }

    /* renamed from: io */
    public final void mo89849io(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
        C59104x b = f268491c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TwsRecInteractState");
        ((C59052c) ((C59052c) b).mo56372aa(15904)).mo56360M("Ignored: onAudioRouteChange: route: %s, BT: %b, Usb: %b, Local: %b", routeInfo, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    /* renamed from: ip */
    public final void mo89286ip(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: j */
    public final void mo89847j(String str, Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (!str.equals("DispatchingState")) {
            this.f268497i.mo89376E(this.f268492d.mo89270k(), false, false);
            this.f268495g.mo89836f();
        }
        super.mo89847j(str, (Intent) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r0.equals("bisto_force_role_change") != false) goto L_0x0050;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89848l(android.content.Intent r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getAction()
            r1 = 0
            java.lang.String r2 = "TwsRecInteractState"
            if (r0 != 0) goto L_0x001c
            com.google.common.f.e r9 = f268491c
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r0, r2)
            java.lang.String r0 = "Null action"
            r2 = 15910(0x3e26, float:2.2295E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56386p(r0)
            return r1
        L_0x001c:
            int r3 = r0.hashCode()
            r4 = 3
            r5 = 2
            r6 = -1
            r7 = 1
            switch(r3) {
                case -1500049779: goto L_0x0046;
                case 1244161670: goto L_0x003c;
                case 1821585647: goto L_0x0032;
                case 2116862345: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x004f
        L_0x0028:
            java.lang.String r1 = "android.bluetooth.device.action.BOND_STATE_CHANGED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x004f
            r1 = 1
            goto L_0x0050
        L_0x0032:
            java.lang.String r1 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x004f
            r1 = 2
            goto L_0x0050
        L_0x003c:
            java.lang.String r1 = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x004f
            r1 = 3
            goto L_0x0050
        L_0x0046:
            java.lang.String r3 = "bisto_force_role_change"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = -1
        L_0x0050:
            if (r1 == 0) goto L_0x0096
            if (r1 == r7) goto L_0x0070
            if (r1 == r5) goto L_0x005d
            if (r1 == r4) goto L_0x005d
            boolean r9 = super.mo89848l(r9)
            return r9
        L_0x005d:
            com.google.common.f.e r9 = f268491c
            com.google.common.f.x r9 = r9.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r1, r2)
            java.lang.String r1 = "%s in TWS RC state. Ignoring"
            r2 = 15909(0x3e25, float:2.2293E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56389s(r1, r0)
            return r7
        L_0x0070:
            java.lang.String r0 = "android.bluetooth.device.extra.BOND_STATE"
            int r9 = r9.getIntExtra(r0, r6)
            com.google.common.f.e r0 = f268491c
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "bondState: %d"
            r2 = 15908(0x3e24, float:2.2292E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56387q(r1, r9)
            r0 = 12
            if (r9 != r0) goto L_0x0095
            r8.mo89852m()
            java.lang.String r9 = "WaitingToReconnectState"
            r0 = 0
            r8.mo89847j(r9, r0)
        L_0x0095:
            return r7
        L_0x0096:
            java.lang.String r0 = "bisto_role_change_delay"
            r3 = 0
            long r0 = r9.getLongExtra(r0, r3)
            com.google.common.f.e r9 = f268491c
            com.google.common.f.x r9 = r9.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r3, r2)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r2 = 15907(0x3e23, float:2.229E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r2)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            java.lang.String r2 = "TWS role change request. Delay: %d"
            r9.mo56388r(r2, r0)
            com.google.android.apps.gsa.staticplugins.bisto.g.ax r9 = r8.f268492d
            com.google.common.util.concurrent.cx r9 = r9.mo89266g(r0)
            r8.f268494f = r9
            com.google.android.libraries.gsa.k.g r0 = r8.f268496h
            com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ak r1 = new com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ak
            r1.<init>(r8)
            java.lang.String r2 = "onReconnect"
            com.google.android.apps.gsa.shared.util.c.ag r9 = com.google.android.apps.gsa.shared.util.p7159c.C90875ai.m148465b(r1, r9, r0, r2)
            com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.al r0 = new com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.al
            r0.<init>(r8)
            r9.mo85223a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95895am.mo89848l(android.content.Intent):boolean");
    }
}
