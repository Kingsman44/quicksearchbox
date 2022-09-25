package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.db */
/* compiled from: PG */
public final /* synthetic */ class C79246db implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79246db f217710a = new C79246db();

    private /* synthetic */ C79246db() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79311i iVar = (C79311i) obj;
        if (iVar.mo73870a().equals(C79310h.URL)) {
            return "com.android.chrome";
        }
        return iVar.mo73873d();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
