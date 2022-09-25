package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126986g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126992m;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127047e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127048f;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.r */
/* compiled from: PG */
final class C127029r implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f349794a;

    /* renamed from: b */
    final /* synthetic */ C127032u f349795b;

    public C127029r(C127032u uVar, C70862aj ajVar) {
        this.f349795b = uVar;
        this.f349794a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C127032u.f349799a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ConvControllerService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37350)).mo56386p("Failed to start conversation");
        if (!(th instanceof CancellationException)) {
            C127032u uVar = this.f349795b;
            C126986g gVar = (C126986g) C126988i.f349669h.createBuilder();
            C126985f fVar = C126985f.ERROR_GENERIC;
            gVar.copyOnWrite();
            C126988i iVar = (C126988i) gVar.instance;
            iVar.f349676f = fVar.f349668l;
            iVar.f349671a |= 1;
            C126992m mVar = C126992m.f349681d;
            gVar.copyOnWrite();
            C126988i iVar2 = (C126988i) gVar.instance;
            mVar.getClass();
            iVar2.f349675e = mVar;
            iVar2.f349674d = 7;
            C46459k.m82829b(uVar.f349802d.mo107971b((C126988i) gVar.build()), "Failed to update error store", new Object[0]);
        }
        this.f349794a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C119834cb cbVar = (C119834cb) obj;
        C70862aj ajVar = this.f349794a;
        C127047e eVar = (C127047e) C127048f.f349844c.createBuilder();
        eVar.copyOnWrite();
        C127048f fVar = (C127048f) eVar.instance;
        cbVar.getClass();
        fVar.f349847b = cbVar;
        fVar.f349846a = 2;
        ajVar.mo20123c((C127048f) eVar.build());
        this.f349794a.mo20121a();
    }
}
