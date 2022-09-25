package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.speech.p5218j.C66864cj;
import com.google.speech.p5218j.C66865ck;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.bt */
/* compiled from: PG */
public final /* synthetic */ class C79691bt implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79691bt f218548a = new C79691bt();

    private /* synthetic */ C79691bt() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C66865ck ckVar = (C66865ck) obj;
        String str = ckVar.f181793e;
        int a = C66864cj.m97368a(ckVar.f181792d);
        return (a != 0 && a == 2) ? String.valueOf(str).concat("(\\s.+)?") : str;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
