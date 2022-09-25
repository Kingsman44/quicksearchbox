package com.google.android.apps.gsa.staticplugins.nga.vis;

import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120059e;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.aa */
/* compiled from: PG */
public final /* synthetic */ class C104182aa implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C104203c f289790a;

    public /* synthetic */ C104182aa(C104203c cVar) {
        this.f289790a = cVar;
    }

    public final void run() {
        C104203c cVar = this.f289790a;
        synchronized (cVar.f289873b) {
            C104205e eVar = cVar.f289876e;
            C120059e eVar2 = cVar.f289877f;
            if (eVar2 != null) {
                eVar2.close();
            } else {
                ((C58970a) ((C58970a) C104203c.f289872a.mo56226d()).mo56372aa(21835)).mo56386p("clearEligibilityListener - not subscribed to session conformity");
            }
            if (eVar != null) {
                cVar.f289874c.mo71091h(cVar);
            }
            cVar.f289876e = null;
            cVar.f289877f = null;
        }
    }
}
