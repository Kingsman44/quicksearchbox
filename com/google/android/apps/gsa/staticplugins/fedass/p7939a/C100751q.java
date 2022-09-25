package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.q */
/* compiled from: PG */
public final /* synthetic */ class C100751q implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f281640a;

    public /* synthetic */ C100751q(boolean z) {
        this.f281640a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f281640a;
        C132769a aVar = (C132769a) ((C132798f) obj).toBuilder();
        aVar.copyOnWrite();
        C132798f fVar = (C132798f) aVar.instance;
        fVar.f362317a |= 16;
        fVar.f362323g = z;
        return (C132798f) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
