package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.h */
/* compiled from: PG */
public final class C95987h extends C95980a {

    /* renamed from: c */
    private final C96023bs f268738c;

    /* renamed from: d */
    private final C95447t f268739d;

    /* renamed from: e */
    private final C89656k f268740e;

    public C95987h(C96023bs bsVar, C95447t tVar, C89656k kVar, C95850a aVar) {
        super(bsVar, "WiredIdleState", tVar, aVar);
        this.f268738c = bsVar;
        this.f268739d = tVar;
        this.f268740e = kVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268738c.mo89831a();
        this.f268738c.mo89840j(false);
    }

    /* renamed from: j */
    public final void mo89847j(String str, Intent intent) {
        if ("WiredConnectingState".equals(str)) {
            this.f268740e.mo83550e();
        }
        super.mo89847j(str, (Intent) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89848l(android.content.Intent r9) {
        /*
            r8 = this;
            boolean r0 = super.mo89848l(r9)
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = r9.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0010
            return r2
        L_0x0010:
            com.google.android.apps.gsa.staticplugins.bisto.g.t r3 = r8.f268739d
            boolean r3 = r3.mo89311z(r9)
            r4 = 0
            java.lang.String r5 = "WiredConnectingState"
            if (r3 == 0) goto L_0x001f
            r8.mo89847j(r5, r4)
            return r1
        L_0x001f:
            int r3 = r0.hashCode()
            r6 = 2
            r7 = 3
            switch(r3) {
                case -1712754119: goto L_0x0047;
                case 938251674: goto L_0x003d;
                case 1854535521: goto L_0x0033;
                case 1931599820: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0051
        L_0x0029:
            java.lang.String r3 = "com.google.android.apps.gsa.shared.bisto.ACTION_DEVICE_BOOT_OR_APP_INSTALL"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0051
            r0 = 0
            goto L_0x0052
        L_0x0033:
            java.lang.String r3 = "ACTION_OOBE_STATUS_UPDATED"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0051
            r0 = 3
            goto L_0x0052
        L_0x003d:
            java.lang.String r3 = "bisto_set_headphones_enable_state"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0051
            r0 = 2
            goto L_0x0052
        L_0x0047:
            java.lang.String r3 = "bisto.QUERY_DEVICE_INFO"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = -1
        L_0x0052:
            if (r0 == 0) goto L_0x006f
            if (r0 == r1) goto L_0x006f
            if (r0 == r6) goto L_0x006f
            if (r0 == r7) goto L_0x005b
            return r2
        L_0x005b:
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r9 = com.google.android.apps.gsa.shared.bisto.p7029b.C89636g.m145896b(r9)
            if (r9 != 0) goto L_0x0062
            return r2
        L_0x0062:
            int r9 = r9.ordinal()
            if (r9 == r1) goto L_0x006b
            if (r9 == r7) goto L_0x006b
            return r2
        L_0x006b:
            r8.mo89847j(r5, r4)
            return r1
        L_0x006f:
            r8.mo89847j(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a.C95987h.mo89848l(android.content.Intent):boolean");
    }
}
