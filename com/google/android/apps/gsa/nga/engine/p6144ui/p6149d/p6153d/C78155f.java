package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6153d;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.d.f */
/* compiled from: PG */
public final /* synthetic */ class C78155f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78156g f215197a;

    /* renamed from: b */
    public final /* synthetic */ C75077bo f215198b;

    public /* synthetic */ C78155f(C78156g gVar, C75077bo boVar) {
        this.f215197a = gVar;
        this.f215198b = boVar;
    }

    public final void run() {
        C78156g gVar = this.f215197a;
        C75077bo boVar = this.f215198b;
        if (boVar.mo71458b().equals(bl.d)) {
            gVar.f215202d = boVar.mo71464h();
            return;
        }
        if (gVar.f215202d.isPresent()) {
            C78156g.m125469d(gVar.mo73106c(((ac) gVar.f215202d.get()).b()), C51986gl.f136421f);
        }
        gVar.f215202d = Optional.empty();
    }
}
