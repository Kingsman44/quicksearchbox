package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96025c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.f */
/* compiled from: PG */
public final class C96004f extends C96025c {

    /* renamed from: c */
    private final C95355bf f268800c;

    /* renamed from: d */
    private final C89492cd f268801d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C96004f(com.google.android.apps.gsa.staticplugins.bisto.p7520u.C96056f r10, com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96022br r11, com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96027e r12, com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t r13, com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs r14, com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd r15, java.util.Map r16, com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a r17) {
        /*
            r9 = this;
            r8 = r9
            java.lang.String r0 = "WiredIdleState"
            r6 = r16
            java.lang.Object r0 = r6.get(r0)
            r7 = r0
            com.google.android.apps.gsa.staticplugins.bisto.u.b.d r7 = (com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96026d) r7
            r7.getClass()
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r13
            r8.f268800c = r0
            r0 = r15
            r8.f268801d = r0
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = r17
            java.util.concurrent.ConcurrentLinkedDeque r0 = r0.f268408a
            r0.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.C96004f.<init>(com.google.android.apps.gsa.staticplugins.bisto.u.f, com.google.android.apps.gsa.staticplugins.bisto.u.b.br, com.google.android.apps.gsa.staticplugins.bisto.u.b.e, com.google.android.apps.gsa.staticplugins.bisto.g.t, com.google.android.apps.gsa.staticplugins.bisto.u.b.bs, com.google.android.apps.gsa.shared.bisto.a.cd, java.util.Map, com.google.android.apps.gsa.staticplugins.bisto.r.a):void");
    }

    /* renamed from: o */
    public final String mo89866o() {
        return "WiredDeviceLCManager";
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo89867q(Intent intent, String str) {
        boolean z = false;
        if (((str.hashCode() == 938251674 && str.equals("bisto_set_headphones_enable_state")) ? (char) 0 : 65535) != 0) {
            this.f268858b.mo89848l(intent);
        } else if (!intent.hasExtra("extra_enable_state")) {
            C89655j.m145957a("Enable state missing extras");
        } else {
            boolean booleanExtra = intent.getBooleanExtra("extra_enable_state", false);
            C124633az b = C89636g.m145896b(intent);
            if (b != null) {
                z = true;
            }
            String k = this.f268800c.mo89270k();
            if (booleanExtra) {
                this.f268801d.mo83394aj(k, C124636bb.OPA_ENABLED, b);
                mo89838h(this.f268858b.f268868a, "WiredConnectingState", (Intent) null);
                return;
            }
            C124636bb bbVar = z ? C124636bb.OPA_DISABLED : C124636bb.OPA_DISABLED_BY_USER;
            this.f268801d.mo83400aq(k, 3);
            this.f268801d.mo83394aj(k, bbVar, b);
            if (z) {
                this.f268801d.mo83365G(k);
            }
            mo89838h(this.f268858b.f268868a, "WiredDisconnectingState", (Intent) null);
        }
    }
}
