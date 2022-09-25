package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97928r;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.podcasts.b.g.v */
/* compiled from: PG */
public final /* synthetic */ class C140158v implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f380822a;

    public /* synthetic */ C140158v(boolean z) {
        this.f380822a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f380822a;
        C97928r rVar = (C97928r) ((C97929s) obj).toBuilder();
        rVar.copyOnWrite();
        C97929s sVar = (C97929s) rVar.instance;
        sVar.f273453a |= 8192;
        sVar.f273466n = z;
        return (C97929s) rVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
