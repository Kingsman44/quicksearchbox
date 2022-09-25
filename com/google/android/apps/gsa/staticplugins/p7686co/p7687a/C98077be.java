package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.be */
/* compiled from: PG */
public final /* synthetic */ class C98077be implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C98102cc f273846a;

    /* renamed from: b */
    public final /* synthetic */ String f273847b;

    public /* synthetic */ C98077be(C98102cc ccVar, String str) {
        this.f273846a = ccVar;
        this.f273847b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C98102cc ccVar = this.f273846a;
        String str = this.f273847b;
        synchronized (ccVar.f273894b) {
            String str2 = (String) ccVar.f273910r.f273875a;
            if (str != null && str.equalsIgnoreCase(str2)) {
                cxVar = C118826c.f331423b;
            } else if (str2 == null) {
                cxVar = C118826c.f331423b;
            } else {
                C58976aa aaVar = C58975e.f156826a;
                ccVar.f273905m.mo85270f("changing account", C90996e.f254198a);
                cxVar = ccVar.mo90952A();
            }
        }
        return cxVar;
    }
}
