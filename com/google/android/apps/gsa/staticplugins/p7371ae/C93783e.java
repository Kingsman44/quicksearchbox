package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.e */
/* compiled from: PG */
final class C93783e extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C93786h f261723a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93783e(C93786h hVar) {
        super("stopMonitoring", 2, 0);
        this.f261723a = hVar;
    }

    public final void run() {
        synchronized (this.f261723a.f261736f) {
            C93786h hVar = this.f261723a;
            if (hVar.f261737g == this) {
                if (hVar.f261735c.mo56113h()) {
                    C93728an anVar = (C93728an) hVar.f261735c.mo56107c();
                    C58976aa aaVar = C58975e.f156826a;
                    anVar.mo84765i(new C93727am(anVar), "stop");
                }
                this.f261723a.f261737g = null;
            }
        }
    }
}
