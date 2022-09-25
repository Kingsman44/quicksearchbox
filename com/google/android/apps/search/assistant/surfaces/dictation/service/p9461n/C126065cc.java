package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.al;
import com.google.android.apps.gsa.nga.api.a.o;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cc */
/* compiled from: PG */
public final /* synthetic */ class C126065cc implements Function {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347434a;

    public /* synthetic */ C126065cc(C126081cs csVar) {
        this.f347434a = csVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Duration duration;
        C126081cs csVar = this.f347434a;
        o oVar = ((al) obj).b;
        if (oVar == null) {
            oVar = o.g;
        }
        if (Collection.EL.stream(oVar.b).anyMatch(C126072cj.f347443a)) {
            duration = csVar.f347479q;
        } else {
            duration = csVar.f347478p;
        }
        Duration minus = duration.minus(csVar.f347477o);
        return minus.isNegative() ? Duration.ZERO : minus;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
