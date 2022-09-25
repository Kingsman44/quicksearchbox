package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127051i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127052j;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127053k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62912at;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.s */
/* compiled from: PG */
final class C127030s implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f349796a;

    /* renamed from: b */
    final /* synthetic */ C127051i f349797b;

    public C127030s(C70862aj ajVar, C127051i iVar) {
        this.f349796a = ajVar;
        this.f349797b = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C127032u.f349799a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ConvControllerService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37351)).mo56386p("Failed to stop conversation");
        this.f349796a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C70862aj ajVar = this.f349796a;
        C127052j jVar = (C127052j) C127053k.f349869e.createBuilder();
        C119834cb cbVar = this.f349797b.f349867b;
        if (cbVar == null) {
            cbVar = C119834cb.f333765b;
        }
        jVar.copyOnWrite();
        C127053k kVar = (C127053k) jVar.instance;
        cbVar.getClass();
        kVar.f349874d = cbVar;
        kVar.f349871a |= 1;
        C62912at atVar = C62912at.f169862a;
        jVar.copyOnWrite();
        C127053k kVar2 = (C127053k) jVar.instance;
        atVar.getClass();
        kVar2.f349873c = atVar;
        kVar2.f349872b = 2;
        ajVar.mo20123c((C127053k) jVar.build());
        this.f349796a.mo20121a();
    }
}
