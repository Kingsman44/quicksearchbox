package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a;

import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.a.r */
/* compiled from: PG */
public final /* synthetic */ class C77850r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77850r f214429a = new C77850r();

    private /* synthetic */ C77850r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C77566as asVar = (C77566as) obj;
        boolean z = true;
        if (!asVar.mo72698w() && !asVar.mo72696u() && (asVar.mo72690m() != 9 || !asVar.mo72682e().isPresent())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
