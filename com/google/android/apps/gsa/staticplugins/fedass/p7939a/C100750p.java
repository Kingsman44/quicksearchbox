package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.protobuf.C63042fg;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.p */
/* compiled from: PG */
public final /* synthetic */ class C100750p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C63042fg f281639a;

    public /* synthetic */ C100750p(C63042fg fgVar) {
        this.f281639a = fgVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63042fg fgVar = this.f281639a;
        C132769a aVar = (C132769a) ((C132798f) obj).toBuilder();
        aVar.copyOnWrite();
        C132798f fVar = (C132798f) aVar.instance;
        fgVar.getClass();
        fVar.f362329m = fgVar;
        fVar.f362317a |= 2048;
        return (C132798f) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
