package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C33029c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C33031e f88447a;

    /* renamed from: b */
    public final /* synthetic */ C33108d f88448b;

    public /* synthetic */ C33029c(C33031e eVar, C33108d dVar) {
        this.f88447a = eVar;
        this.f88448b = dVar;
    }

    public final Object apply(Object obj) {
        C33031e eVar = this.f88447a;
        Optional optional = (Optional) obj;
        this.f88448b.mo38533b().mo38549b(2);
        return (optional.isPresent() && eVar.f88452b == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) ? Optional.m71637of(C33118f.m61462c((C52081en) optional.get(), eVar.f88452b, C33031e.f88451a)) : optional;
    }
}
