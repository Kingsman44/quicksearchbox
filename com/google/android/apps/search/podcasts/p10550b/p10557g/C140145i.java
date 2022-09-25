package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97928r;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.podcasts.b.g.i */
/* compiled from: PG */
public final /* synthetic */ class C140145i implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f380804a;

    public /* synthetic */ C140145i(boolean z) {
        this.f380804a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f380804a;
        C97928r rVar = (C97928r) ((C97929s) obj).toBuilder();
        rVar.copyOnWrite();
        C97929s sVar = (C97929s) rVar.instance;
        sVar.f273453a |= 4096;
        sVar.f273465m = z;
        return (C97929s) rVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
