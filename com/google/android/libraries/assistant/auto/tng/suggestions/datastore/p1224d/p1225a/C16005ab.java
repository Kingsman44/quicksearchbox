package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C16005ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47416a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f47417b;

    public /* synthetic */ C16005ab(C16027ax axVar, C58485gu guVar) {
        this.f47416a = axVar;
        this.f47417b = guVar;
    }

    public final C60870cx apply(Object obj) {
        C16027ax axVar = this.f47416a;
        Void voidR = (Void) obj;
        C58485gu guVar = (C58485gu) Collection.EL.stream(this.f47417b).map(C16019ap.f47436a).collect(C58370cn.f155946a);
        C60870cx b = axVar.f47455f.mo22707b(guVar);
        C16020aq aqVar = new C16020aq(axVar, guVar);
        return C60922j.m93045h(b, C47810es.m84966f(aqVar), axVar.f47452c);
    }
}
