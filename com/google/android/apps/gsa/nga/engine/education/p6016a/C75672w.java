package com.google.android.apps.gsa.nga.engine.education.p6016a;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.w */
/* compiled from: PG */
public final /* synthetic */ class C75672w implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75674y f210042a;

    public /* synthetic */ C75672w(C75674y yVar) {
        this.f210042a = yVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C75674y yVar = this.f210042a;
        return ((Optional) yVar.f210051h.get()).map(new C75658i(yVar, (String) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
