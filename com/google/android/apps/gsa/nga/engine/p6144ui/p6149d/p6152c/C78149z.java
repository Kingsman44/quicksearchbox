package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6152c;

import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128078b;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128081bc;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128082bd;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.c.z */
/* compiled from: PG */
public final /* synthetic */ class C78149z implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C78123ad f215178a;

    /* renamed from: b */
    public final /* synthetic */ C128082bd f215179b;

    public /* synthetic */ C78149z(C78123ad adVar, C128082bd bdVar) {
        this.f215178a = adVar;
        this.f215179b = bdVar;
    }

    public final void run() {
        C128081bc bcVar;
        C78123ad adVar = this.f215178a;
        C128082bd bdVar = this.f215179b;
        if (bdVar.f352416a == 1) {
            bcVar = (C128081bc) bdVar.f352417b;
        } else {
            bcVar = C128081bc.f352410c;
        }
        C128078b a = C128078b.m209211a(bcVar.f352413b);
        if (a == null) {
            a = C128078b.CLIENT_UNKNOWN;
        }
        if (a.equals(C128078b.CLIENT_UNKNOWN)) {
            adVar.mo73093d(C78147x.f215176a);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C128078b a2 = C128078b.m209211a(bcVar.f352413b);
        if (a2 == null) {
            a2 = C128078b.CLIENT_UNKNOWN;
        }
        a2.name();
        C128078b a3 = C128078b.m209211a(bcVar.f352413b);
        if (a3 == null) {
            a3 = C128078b.CLIENT_UNKNOWN;
        }
        adVar.f215128e = a3;
        adVar.f215125b.mo73096b(adVar.f215128e);
        C83363m mVar = adVar.f215124a;
        C78145v vVar = adVar.f215127d;
        C83358h h = C83349aj.m132653h(vVar.f215170a.mo73079c(), vVar.f215173d.f215213a, vVar.f215174e.f215217a, vVar.f215171b, vVar.f215172c, C78142s.f215167a);
        C70862aj ajVar = adVar.f215126c;
        Objects.requireNonNull(ajVar);
        mVar.mo76663c(h, new C78148y(ajVar));
    }
}
