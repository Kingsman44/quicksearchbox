package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cz */
/* compiled from: PG */
public final /* synthetic */ class C108519cz implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C108780dn f301928a;

    /* renamed from: b */
    public final /* synthetic */ int f301929b;

    public /* synthetic */ C108519cz(C108780dn dnVar, int i) {
        this.f301928a = dnVar;
        this.f301929b = i;
    }

    public final void run() {
        C108780dn dnVar = this.f301928a;
        int i = this.f301929b;
        if (i != dnVar.f302505b) {
            C59071e eVar = C109040fj.f303210a;
            C58976aa aaVar = C58975e.f156826a;
            dnVar.f302505b = i;
            if (i == 3) {
                C109040fj fjVar = dnVar.f302504a;
                if (!fjVar.f303298bE && fjVar.f303238X.mo96177e() != 1) {
                    dnVar.f302504a.f303444i.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_VP_CANCEL);
                }
            }
        }
    }
}
