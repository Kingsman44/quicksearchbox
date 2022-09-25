package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.p10712d.C142442fm;
import com.google.android.p10712d.C142443fn;
import com.google.android.p10712d.C142455fz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.i */
/* compiled from: PG */
public final /* synthetic */ class C96606i implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C96608k f270265a;

    public /* synthetic */ C96606i(C96608k kVar) {
        this.f270265a = kVar;
    }

    public final void run() {
        C96608k kVar = this.f270265a;
        if (kVar.f270270c.hasNext()) {
            int intValue = ((Integer) kVar.f270270c.next()).intValue();
            kVar.mo90265m();
            C142442fm fmVar = (C142442fm) C142443fn.f386520c.createBuilder();
            fmVar.copyOnWrite();
            C142443fn fnVar = (C142443fn) fmVar.instance;
            fnVar.f386522a |= 1;
            fnVar.f386523b = intValue;
            if (!kVar.mo90264l(fmVar.build(), C142455fz.OTA_ABORT, kVar.f270268a)) {
                C58976aa aaVar = C58975e.f156826a;
                kVar.f270269b = new C96587cs("ERROR_SENDING_ABORT");
                kVar.mo90272c();
            }
        } else if (kVar.f270269b == null) {
            kVar.mo90265m();
            kVar.mo90261i(C118826c.f331422a);
        } else {
            kVar.mo90262j(kVar.f270269b);
        }
    }
}
