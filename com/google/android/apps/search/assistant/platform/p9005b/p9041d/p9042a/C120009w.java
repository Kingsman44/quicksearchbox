package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119794ap;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119798at;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.w */
/* compiled from: PG */
public final /* synthetic */ class C120009w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C120012z f334151a;

    public /* synthetic */ C120009w(C120012z zVar) {
        this.f334151a = zVar;
    }

    public final void run() {
        C120012z zVar = this.f334151a;
        C119944aa aaVar = zVar.f334156c;
        if (!aaVar.f334029d) {
            C119794ap apVar = (C119794ap) C119798at.f333687d.createBuilder();
            long j = zVar.f334154a;
            apVar.copyOnWrite();
            ((C119798at) apVar.instance).f333691c = j;
            C62912at atVar = C62912at.f169862a;
            apVar.copyOnWrite();
            C119798at atVar2 = (C119798at) apVar.instance;
            atVar.getClass();
            atVar2.f333690b = atVar;
            atVar2.f333689a = 4;
            aaVar.mo104583b((C119798at) apVar.build());
            zVar.f334156c.f334028c.remove(Long.valueOf(zVar.f334154a));
        }
    }
}
