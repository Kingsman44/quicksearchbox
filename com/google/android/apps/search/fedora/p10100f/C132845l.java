package com.google.android.apps.search.fedora.p10100f;

import com.google.android.apps.search.fedora.p10099e.C132776ag;
import com.google.android.apps.search.fedora.p10099e.C132779aj;
import com.google.protobuf.C63042fg;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.fedora.f.l */
/* compiled from: PG */
public final /* synthetic */ class C132845l implements Function {

    /* renamed from: a */
    public final /* synthetic */ C63042fg f362449a;

    public /* synthetic */ C132845l(C63042fg fgVar) {
        this.f362449a = fgVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63042fg fgVar = this.f362449a;
        C132776ag agVar = (C132776ag) ((C132779aj) obj).toBuilder();
        agVar.copyOnWrite();
        C132779aj ajVar = (C132779aj) agVar.instance;
        fgVar.getClass();
        ajVar.f362251f = fgVar;
        ajVar.f362246a |= 32;
        return (C132779aj) agVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
