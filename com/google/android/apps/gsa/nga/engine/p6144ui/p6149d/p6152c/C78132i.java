package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6152c;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128108i;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128109j;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128116q;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.c.i */
/* compiled from: PG */
public final /* synthetic */ class C78132i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f215148a;

    public /* synthetic */ C78132i(C70862aj ajVar) {
        this.f215148a = ajVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C70862aj ajVar = this.f215148a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C78134k.m125453a(ajVar);
            return;
        }
        C80590x a = C80590x.m128211a(((C80581o) optional.get()).f221191a);
        if (a == null) {
            a = C80590x.UNRECOGNIZED;
        }
        if (a != C80590x.OOBE) {
            C78134k.m125453a(ajVar);
            return;
        }
        C128108i iVar = (C128108i) C128109j.f352484c.createBuilder();
        C128116q qVar = C128116q.ONBOARDING_TYPE_OOBE;
        iVar.copyOnWrite();
        C128109j jVar = (C128109j) iVar.instance;
        jVar.f352487b = qVar.f352498c;
        jVar.f352486a |= 1;
        ajVar.mo20123c((C128109j) iVar.build());
        ajVar.mo20121a();
    }
}
