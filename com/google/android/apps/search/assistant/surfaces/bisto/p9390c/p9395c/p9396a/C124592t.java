package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124619al;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.t */
/* compiled from: PG */
public final /* synthetic */ class C124592t implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f343704a;

    public /* synthetic */ C124592t(String str) {
        this.f343704a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f343704a;
        C59071e eVar = C124571aq.f343658a;
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
