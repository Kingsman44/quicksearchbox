package com.google.android.apps.search.assistant.verticals.ambient.settings;

import com.google.android.apps.gsa.assistant.settings.features.d.ak;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.h */
/* compiled from: PG */
public final /* synthetic */ class C131566h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131567i f359462a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f359463b;

    public /* synthetic */ C131566h(C131567i iVar, C58485gu guVar) {
        this.f359462a = iVar;
        this.f359463b = guVar;
    }

    public final Object apply(Object obj) {
        ak akVar = (ak) obj;
        return (C58485gu) Collection.EL.stream(this.f359463b).filter(new C131563e(akVar)).filter(new C131564f(this.f359462a, akVar)).collect(C58370cn.f155946a);
    }
}
