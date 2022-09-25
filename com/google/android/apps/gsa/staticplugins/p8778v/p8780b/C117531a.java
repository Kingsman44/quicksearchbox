package com.google.android.apps.gsa.staticplugins.p8778v.p8780b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.v.b.a */
/* compiled from: PG */
public final /* synthetic */ class C117531a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f326217a;

    public /* synthetic */ C117531a(ArrayList arrayList) {
        this.f326217a = arrayList;
    }

    public final Object call() {
        ArrayList arrayList = this.f326217a;
        C59071e eVar = C117532b.f326218a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C60870cx cxVar = (C60870cx) arrayList.get(i);
            if (cxVar.isCancelled()) {
                C58976aa aaVar = C58975e.f156826a;
            } else if (C90877ak.m148479m(cxVar, Throwable.class)) {
                C59104x c = C117532b.f326218a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BcastRcvrSessionCntrl");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(C90877ak.m148477k(cxVar, Throwable.class))).mo56372aa(18291)).mo56386p("Broadcast handler failed.");
            }
        }
        return C118826c.f331422a;
    }
}
