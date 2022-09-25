package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124454ay;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.o */
/* compiled from: PG */
public final /* synthetic */ class C76201o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76164aa f211208a;

    /* renamed from: b */
    public final /* synthetic */ C124454ay f211209b;

    public /* synthetic */ C76201o(C76164aa aaVar, C124454ay ayVar) {
        this.f211208a = aaVar;
        this.f211209b = ayVar;
    }

    public final void run() {
        C76164aa aaVar = this.f211208a;
        C124454ay ayVar = this.f211209b;
        C76167ad adVar = aaVar.f211154k;
        if (adVar != null) {
            C76185av avVar = (C76185av) adVar;
            avVar.mo72118b("onTranscription", new C76174ak(avVar, ayVar));
        }
    }
}
