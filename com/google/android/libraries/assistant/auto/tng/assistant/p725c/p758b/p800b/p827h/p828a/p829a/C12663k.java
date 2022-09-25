package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13016ad;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13017ae;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4449cd.p4456g.p4458b.C57987f;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.k */
/* compiled from: PG */
final class C12663k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C57987f f39700a;

    public C12663k(C57987f fVar) {
        this.f39700a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C12664l.f39701a.mo56225c()).mo56382g(th)).mo56372aa(44362)).mo56386p("Discovery manager failed to get immersive discovery");
        this.f39700a.f155056f.mo54589f(false);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C16662b bVar = (C16662b) obj;
        C57987f fVar = this.f39700a;
        C13016ad adVar = (C13016ad) C13017ae.f40434c.createBuilder();
        adVar.copyOnWrite();
        C13017ae aeVar = (C13017ae) adVar.instance;
        bVar.getClass();
        aeVar.f40437b = bVar;
        aeVar.f40436a |= 1;
        fVar.f155056f.mo54591h((C13017ae) adVar.build());
        this.f39700a.f155056f.mo54589f(false);
    }
}
