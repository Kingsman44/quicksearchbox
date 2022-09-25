package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124619al;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.l */
/* compiled from: PG */
public final /* synthetic */ class C96492l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C96492l f269961a = new C96492l();

    private /* synthetic */ C96492l() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C124619al alVar = (C124619al) ((C124620am) obj).toBuilder();
        alVar.copyOnWrite();
        C124620am amVar = (C124620am) alVar.instance;
        amVar.f343763a |= 8;
        amVar.f343767e = false;
        alVar.copyOnWrite();
        C124620am amVar2 = (C124620am) alVar.instance;
        amVar2.f343763a |= 4;
        amVar2.f343766d = false;
        return (C124620am) alVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
