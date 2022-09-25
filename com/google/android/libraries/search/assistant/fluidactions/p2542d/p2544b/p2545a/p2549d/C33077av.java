package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.av */
/* compiled from: PG */
public final /* synthetic */ class C33077av implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C33079ax f88549a;

    /* renamed from: b */
    public final /* synthetic */ C33108d f88550b;

    public /* synthetic */ C33077av(C33079ax axVar, C33108d dVar) {
        this.f88549a = axVar;
        this.f88550b = dVar;
    }

    public final Object apply(Object obj) {
        C33079ax axVar = this.f88549a;
        Optional optional = (Optional) obj;
        this.f88550b.mo38533b().mo38549b(7);
        return (optional.isPresent() && axVar.f88555e == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) ? Optional.m71637of(C33118f.m61462c((C52081en) optional.get(), axVar.f88555e, C33079ax.f88552b)) : optional;
    }
}
