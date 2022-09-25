package com.google.android.apps.gsa.staticplugins.nga.vis;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.w */
/* compiled from: PG */
public final /* synthetic */ class C104223w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C104196ao f289895a;

    public /* synthetic */ C104223w(C104196ao aoVar) {
        this.f289895a = aoVar;
    }

    public final void run() {
        C104196ao aoVar = this.f289895a;
        if (aoVar.f289819b.mo94008c()) {
            C104203c cVar = aoVar.f289819b;
            C120124o oVar = aoVar.f289818a;
            synchronized (cVar.f289873b) {
                if (cVar.f289876e == null) {
                    cVar.f289874c.mo71090g(cVar);
                    cVar.f289877f = cVar.f289875d.mo104655a(C120124o.CLASSIC, oVar, new C104202b(cVar));
                }
                cVar.f289876e = aoVar;
            }
            return;
        }
        aoVar.mo93986g();
    }
}
