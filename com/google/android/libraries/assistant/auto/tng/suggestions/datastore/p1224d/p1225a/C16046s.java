package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.s */
/* compiled from: PG */
public final /* synthetic */ class C16046s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47501a;

    /* renamed from: b */
    public final /* synthetic */ List f47502b;

    public /* synthetic */ C16046s(C16027ax axVar, List list) {
        this.f47501a = axVar;
        this.f47502b = list;
    }

    public final C60870cx apply(Object obj) {
        C16027ax axVar = this.f47501a;
        C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).filter(new C16004aa(C16027ax.m32837v(this.f47502b))).collect(C58370cn.f155946a);
        return C47633f.m84733g(axVar.f47454e.mo22682b(guVar)).mo51516i(new C16005ab(axVar, guVar), axVar.f47452c);
    }
}
