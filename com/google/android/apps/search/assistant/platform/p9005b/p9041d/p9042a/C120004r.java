package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119794ap;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119796ar;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119798at;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.r */
/* compiled from: PG */
public final /* synthetic */ class C120004r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119944aa f334143a;

    /* renamed from: b */
    public final /* synthetic */ C120012z f334144b;

    /* renamed from: c */
    public final /* synthetic */ C119796ar f334145c;

    public /* synthetic */ C120004r(C119944aa aaVar, C120012z zVar, C119796ar arVar) {
        this.f334143a = aaVar;
        this.f334144b = zVar;
        this.f334145c = arVar;
    }

    public final void run() {
        C119944aa aaVar = this.f334143a;
        C120012z zVar = this.f334144b;
        C119796ar arVar = this.f334145c;
        if (!aaVar.f334030e) {
            aaVar.f334030e = true;
            aaVar.f334031f.mo38840a(new C120005s(aaVar));
        }
        if (aaVar.f334029d) {
            zVar.mo104622c();
            return;
        }
        aaVar.f334028c.put(Long.valueOf(zVar.f334154a), zVar);
        C119794ap apVar = (C119794ap) C119798at.f333687d.createBuilder();
        long j = zVar.f334154a;
        apVar.copyOnWrite();
        ((C119798at) apVar.instance).f333691c = j;
        apVar.copyOnWrite();
        C119798at atVar = (C119798at) apVar.instance;
        arVar.getClass();
        atVar.f333690b = arVar;
        atVar.f333689a = 2;
        aaVar.mo104583b((C119798at) apVar.build());
    }
}
