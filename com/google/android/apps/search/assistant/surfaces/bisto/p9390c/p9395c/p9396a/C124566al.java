package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124619al;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124706dr;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.al */
/* compiled from: PG */
public final /* synthetic */ class C124566al implements Function {

    /* renamed from: a */
    public final /* synthetic */ C124706dr f343651a;

    public /* synthetic */ C124566al(C124706dr drVar) {
        this.f343651a = drVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C124706dr drVar = this.f343651a;
        C59071e eVar = C124571aq.f343658a;
        C124619al alVar = (C124619al) ((C124620am) obj).toBuilder();
        boolean z = drVar.f344043c;
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
