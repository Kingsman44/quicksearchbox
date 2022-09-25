package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.p10712d.C142455fz;
import com.google.android.p10712d.C142461ge;
import com.google.android.p10712d.C142462gf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.j */
/* compiled from: PG */
final class C96607j extends C96586cr {

    /* renamed from: a */
    final /* synthetic */ C96608k f270266a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96607j(C96608k kVar) {
        super(kVar);
        this.f270266a = kVar;
    }

    /* renamed from: a */
    public final boolean mo90252a(C142462gf gfVar) {
        C142455fz a = C142455fz.m231083a(gfVar.f386598a);
        if (a == null) {
            a = C142455fz.OTA_UNKNOWN;
        }
        if (a == C142455fz.OTA_ABORT) {
            C142461ge a2 = C142461ge.m231085a(gfVar.f386599b);
            if (a2 == null) {
                a2 = C142461ge.OTA_STATUS_UNKNOWN;
            }
            if (a2 == C142461ge.OTA_SUCCESS) {
                int i = C96608k.f270267d;
                C58976aa aaVar = C58975e.f156826a;
            } else {
                int i2 = C96608k.f270267d;
                C58976aa aaVar2 = C58975e.f156826a;
                this.f270266a.f270269b = new C96587cs("ERROR_ABORT_FAILED");
            }
            this.f270266a.mo90272c();
            return true;
        }
        int i3 = C96608k.f270267d;
        C58976aa aaVar3 = C58975e.f156826a;
        return false;
    }
}
