package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.android.libraries.search.p3055n.p3085h.C39775h;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.b.b.ag */
/* compiled from: PG */
public final /* synthetic */ class C39286ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39319bm f103503a;

    public /* synthetic */ C39286ag(C39319bm bmVar) {
        this.f103503a = bmVar;
    }

    public final C60870cx apply(Object obj) {
        C39319bm bmVar = this.f103503a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60866ct.f164955a;
        }
        C39280aa aaVar = bmVar.f103570g;
        return aaVar.f103471b.mo51512b(new C39343r(aaVar, (C39775h) optional.get()), aaVar.f103473d);
    }
}
