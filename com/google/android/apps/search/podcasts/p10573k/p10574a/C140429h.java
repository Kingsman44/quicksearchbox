package com.google.android.apps.search.podcasts.p10573k.p10574a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.podcasts.k.a.h */
/* compiled from: PG */
public final /* synthetic */ class C140429h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C140431j f381452a;

    public /* synthetic */ C140429h(C140431j jVar) {
        this.f381452a = jVar;
    }

    public final void run() {
        C140431j jVar = this.f381452a;
        C140433l lVar = jVar.f381455a;
        if (lVar.f381471m != null) {
            long c = (lVar.f381463e + C140433l.f381460b) - lVar.f381469k.mo26871c();
            if (c >= 0) {
                jVar.mo115668a(c);
                return;
            }
            jVar.f381455a.f381471m = null;
            C58976aa aaVar = C58975e.f156826a;
            try {
                jVar.f381455a.f381465g.unbindService(jVar);
            } catch (IllegalArgumentException e) {
                C59104x d = C140433l.f381459a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PodcastNotifSvcConn");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(41614)).mo56386p("IAE when unbinding.");
            }
        }
    }
}
