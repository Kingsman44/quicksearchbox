package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61539c;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
import com.google.protobuf.C62942bv;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.b */
/* compiled from: PG */
public final class C33787b {

    /* renamed from: a */
    public final C33850di f90237a;

    public C33787b(C33850di diVar) {
        this.f90237a = diVar;
    }

    /* renamed from: a */
    public final Object mo39076a(Bundle bundle, int i, C69577g gVar) {
        C33850di diVar;
        if (bundle != null) {
            C33850di diVar2 = this.f90237a;
            C61541e eVar = C33487a.f89616a;
            C69664n.m101060f(eVar, "BUNDLE_KEYS");
            diVar = (C33850di) C61539c.m94271a(diVar2, eVar, bundle);
        } else {
            diVar = this.f90237a;
        }
        C33820cf cfVar = (C33820cf) C33821cg.f90277b.createBuilder();
        C69664n.m101060f(cfVar, "newBuilder()");
        C69664n.m101061g(cfVar, "builder");
        cfVar.copyOnWrite();
        ((C33821cg) cfVar.instance).f90279a = i;
        C62942bv build = cfVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return diVar.mo39099l((C33821cg) build, new C70334de(), gVar);
    }
}
