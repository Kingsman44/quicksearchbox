package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7494l.C95482c;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.o */
/* compiled from: PG */
public final class C95920o extends C95909d {

    /* renamed from: c */
    public static final C59071e f268570c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.o");

    /* renamed from: d */
    public boolean f268571d;

    /* renamed from: e */
    public boolean f268572e;

    /* renamed from: f */
    private final C95355bf f268573f;

    /* renamed from: g */
    private final C22871g f268574g;

    /* renamed from: h */
    private final C96023bs f268575h;

    /* renamed from: i */
    private final C95482c f268576i;

    public C95920o(C96023bs bsVar, C95346ax axVar, C22871g gVar, C89492cd cdVar, C95482c cVar, C95850a aVar) {
        super(bsVar, "DisconnectingState", axVar, cdVar, aVar);
        this.f268573f = axVar;
        this.f268574g = gVar;
        this.f268575h = bsVar;
        this.f268576i = cVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268575h.mo89831a();
        this.f268575h.mo89840j(false);
        this.f268576i.f267193d = false;
        this.f268571d = false;
        this.f268572e = false;
        C90875ai.m148465b(new C95918m(this), this.f268573f.mo89265f("DisconnectingState"), this.f268574g, "Disconnect complete").mo85223a(new C95919n(this));
    }

    /* renamed from: ip */
    public final void mo89286ip(String str, boolean z) {
        C59104x b = f268570c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DisconnectingState");
        ((C59052c) ((C59052c) b).mo56372aa(15851)).mo56389s("onConnectionChange: %b", Boolean.valueOf(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0.equals("ACTION_OOBE_STATUS_UPDATED") == false) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89848l(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r2 = r0.hashCode()
            r3 = -301431627(0xffffffffee0884b5, float:-1.0562599E28)
            r4 = -1
            r5 = 2
            r6 = 1
            if (r2 == r3) goto L_0x0032
            r3 = 1244161670(0x4a286686, float:2759073.5)
            if (r2 == r3) goto L_0x0028
            r3 = 1854535521(0x6e89f761, float:2.1349255E28)
            if (r2 == r3) goto L_0x001f
            goto L_0x003c
        L_0x001f:
            java.lang.String r2 = "ACTION_OOBE_STATUS_UPDATED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003c
            goto L_0x003d
        L_0x0028:
            java.lang.String r1 = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003c
            r1 = 2
            goto L_0x003d
        L_0x0032:
            java.lang.String r1 = "android.bluetooth.device.action.ACL_CONNECTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x003c:
            r1 = -1
        L_0x003d:
            if (r1 == 0) goto L_0x005b
            if (r1 == r6) goto L_0x0058
            if (r1 == r5) goto L_0x0048
            boolean r8 = super.mo89848l(r8)
            return r8
        L_0x0048:
            java.lang.String r0 = "android.bluetooth.profile.extra.STATE"
            int r0 = r8.getIntExtra(r0, r4)
            if (r0 != r5) goto L_0x0053
            r7.f268572e = r6
            return r6
        L_0x0053:
            boolean r8 = super.mo89848l(r8)
            return r8
        L_0x0058:
            r7.f268572e = r6
            return r6
        L_0x005b:
            r7.f268571d = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95920o.mo89848l(android.content.Intent):boolean");
    }
}
