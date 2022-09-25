package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.s */
/* compiled from: PG */
public final /* synthetic */ class C100753s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C100719ab f281643a;

    /* renamed from: b */
    public final /* synthetic */ boolean f281644b;

    public /* synthetic */ C100753s(C100719ab abVar, boolean z) {
        this.f281643a = abVar;
        this.f281644b = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C100719ab abVar = this.f281643a;
        boolean z = this.f281644b;
        C132769a aVar = (C132769a) ((C132798f) obj).toBuilder();
        aVar.copyOnWrite();
        C132798f fVar = (C132798f) aVar.instance;
        fVar.f362317a |= 1;
        fVar.f362318b = z;
        long b = abVar.f281603b.mo26870b();
        aVar.copyOnWrite();
        C132798f fVar2 = (C132798f) aVar.instance;
        fVar2.f362317a |= 2;
        fVar2.f362319c = b;
        return (C132798f) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
