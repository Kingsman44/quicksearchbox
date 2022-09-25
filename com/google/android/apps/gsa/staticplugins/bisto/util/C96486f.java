package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124619al;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.f */
/* compiled from: PG */
public final /* synthetic */ class C96486f implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f269947a;

    public /* synthetic */ C96486f(boolean z) {
        this.f269947a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f269947a;
        C124619al alVar = (C124619al) ((C124620am) obj).toBuilder();
        alVar.copyOnWrite();
        C124620am amVar = (C124620am) alVar.instance;
        amVar.f343763a |= 4;
        amVar.f343766d = z;
        return (C124620am) alVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
