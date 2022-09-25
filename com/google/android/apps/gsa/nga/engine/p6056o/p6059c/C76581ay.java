package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.evernote.android.state.BuildConfig;
import com.google.knowledge.p4661a.p4662a.C61758t;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.ay */
/* compiled from: PG */
public final /* synthetic */ class C76581ay implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76581ay f211821a = new C76581ay();

    private /* synthetic */ C76581ay() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61758t tVar = (C61758t) obj;
        return tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
