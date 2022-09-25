package com.google.android.apps.gsa.nga.engine.p6038j;

import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.al */
/* compiled from: PG */
public final /* synthetic */ class C76175al implements UnaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C76175al f211165a = new C76175al();

    private /* synthetic */ C76175al() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76180aq aqVar = (C76180aq) obj;
        if (aqVar.f211171a.equals("idle")) {
            return aqVar;
        }
        C76185av avVar = aqVar.f211172b;
        avVar.f211178b.mo71597f(avVar.f211179c);
        return new C76182as(aqVar.f211172b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
