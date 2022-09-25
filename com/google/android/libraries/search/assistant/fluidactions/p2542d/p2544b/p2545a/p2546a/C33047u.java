package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.u */
/* compiled from: PG */
public final /* synthetic */ class C33047u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C32985ag f88494a;

    public /* synthetic */ C33047u(C32985ag agVar) {
        this.f88494a = agVar;
    }

    public final Object apply(Object obj) {
        C32985ag agVar = this.f88494a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        agVar.f88373d = (String) optional.get();
        ((C59052c) ((C59052c) C32985ag.f88370a.mo56224b()).mo56372aa(50794)).mo56389s("provider is resolved by aum, %s", agVar.f88373d);
        agVar.f88372c.mo38465J(agVar.f88373d);
        return Optional.m71637of(agVar.f88373d);
    }
}
