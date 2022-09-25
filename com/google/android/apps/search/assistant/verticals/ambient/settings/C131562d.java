package com.google.android.apps.search.assistant.verticals.ambient.settings;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.d */
/* compiled from: PG */
public final /* synthetic */ class C131562d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f359452a;

    public /* synthetic */ C131562d(C58485gu guVar) {
        this.f359452a = guVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f359452a;
        return !((Boolean) obj).booleanValue() ? (C58485gu) Collection.EL.stream(guVar).filter(C131561c.f359451a).collect(C58370cn.f155946a) : guVar;
    }
}
