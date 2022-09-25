package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.v */
/* compiled from: PG */
public final /* synthetic */ class C33048v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C32985ag f88495a;

    public /* synthetic */ C33048v(C32985ag agVar) {
        this.f88495a = agVar;
    }

    public final Object apply(Object obj) {
        C32985ag agVar = this.f88495a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        agVar.f88374e = (String) optional.get();
        agVar.f88372c.mo38462G(agVar.f88374e);
        return Optional.m71637of(agVar.f88374e);
    }
}
