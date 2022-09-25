package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124619al;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.d */
/* compiled from: PG */
public final /* synthetic */ class C96484d implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f269942a;

    public /* synthetic */ C96484d(boolean z) {
        this.f269942a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f269942a;
        C124619al alVar = (C124619al) ((C124620am) obj).toBuilder();
        alVar.copyOnWrite();
        C124620am amVar = (C124620am) alVar.instance;
        amVar.f343763a |= 8;
        amVar.f343767e = z;
        return (C124620am) alVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
