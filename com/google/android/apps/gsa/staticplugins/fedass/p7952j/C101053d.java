package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.d */
/* compiled from: PG */
public final /* synthetic */ class C101053d implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f282191a;

    public /* synthetic */ C101053d(boolean z) {
        this.f282191a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f282191a;
        C132769a aVar = (C132769a) ((C132798f) obj).toBuilder();
        aVar.copyOnWrite();
        C132798f fVar = (C132798f) aVar.instance;
        fVar.f362317a |= 4;
        fVar.f362320d = z;
        return (C132798f) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
