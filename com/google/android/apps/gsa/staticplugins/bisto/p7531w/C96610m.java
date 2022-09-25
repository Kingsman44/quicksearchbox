package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.p10712d.C142452fw;
import com.google.android.p10712d.C142453fx;
import com.google.android.p10712d.C142455fz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.m */
/* compiled from: PG */
public final /* synthetic */ class C96610m implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C96612o f270275a;

    /* renamed from: b */
    public final /* synthetic */ int f270276b;

    public /* synthetic */ C96610m(C96612o oVar, int i) {
        this.f270275a = oVar;
        this.f270276b = i;
    }

    public final void run() {
        C96612o oVar = this.f270275a;
        int i = this.f270276b;
        C58976aa aaVar = C58975e.f156826a;
        C142452fw fwVar = (C142452fw) C142453fx.f386551c.createBuilder();
        fwVar.copyOnWrite();
        C142453fx fxVar = (C142453fx) fwVar.instance;
        fxVar.f386553a |= 1;
        fxVar.f386554b = i;
        if (!oVar.mo90264l(fwVar.build(), C142455fz.OTA_GETSTATE, oVar.f270282e)) {
            oVar.mo90262j(new C96587cs("ERROR_GETTING_HEADSET_STATE failed to ask for state"));
        }
    }
}
