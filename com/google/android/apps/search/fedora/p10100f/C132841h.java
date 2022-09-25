package com.google.android.apps.search.fedora.p10100f;

import com.google.android.apps.search.fedora.p10099e.C132776ag;
import com.google.android.apps.search.fedora.p10099e.C132779aj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.fedora.f.h */
/* compiled from: PG */
public final /* synthetic */ class C132841h implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f362445a;

    public /* synthetic */ C132841h(boolean z) {
        this.f362445a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f362445a;
        C132776ag agVar = (C132776ag) ((C132779aj) obj).toBuilder();
        agVar.copyOnWrite();
        C132779aj ajVar = (C132779aj) agVar.instance;
        ajVar.f362246a |= 64;
        ajVar.f362252g = z;
        return (C132779aj) agVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
