package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124619al;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.h */
/* compiled from: PG */
public final /* synthetic */ class C94910h implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f265477a;

    public /* synthetic */ C94910h(String str) {
        this.f265477a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f265477a;
        C124619al alVar = (C124619al) ((C124620am) obj).toBuilder();
        alVar.copyOnWrite();
        C124620am amVar = (C124620am) alVar.instance;
        str.getClass();
        amVar.f343763a |= 1;
        amVar.f343764b = str;
        alVar.copyOnWrite();
        C124620am amVar2 = (C124620am) alVar.instance;
        amVar2.f343763a &= -5;
        amVar2.f343766d = false;
        alVar.copyOnWrite();
        C124620am amVar3 = (C124620am) alVar.instance;
        amVar3.f343763a &= -9;
        amVar3.f343767e = false;
        return (C124620am) alVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
