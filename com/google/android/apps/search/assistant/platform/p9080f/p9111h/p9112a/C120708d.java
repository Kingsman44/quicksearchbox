package com.google.android.apps.search.assistant.platform.p9080f.p9111h.p9112a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2525e.p2529b.p2530a.p2531a.C32888b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.h.a.d */
/* compiled from: PG */
public final /* synthetic */ class C120708d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120710f f335715a;

    public /* synthetic */ C120708d(C120710f fVar) {
        this.f335715a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C120710f fVar = this.f335715a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return C60856cj.m92900i(((C32888b) optional.get()).f88142b);
        }
        if (fVar.f335720c.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i((String) fVar.f335720c.get());
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return C60856cj.m92900i(fVar.f335719b);
    }
}
