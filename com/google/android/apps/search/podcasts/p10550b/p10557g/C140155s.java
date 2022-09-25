package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97928r;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.podcasts.b.g.s */
/* compiled from: PG */
public final /* synthetic */ class C140155s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C140641b f380818a;

    public /* synthetic */ C140155s(C140641b bVar) {
        this.f380818a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C140641b bVar = this.f380818a;
        C97929s sVar = (C97929s) obj;
        C97928r rVar = (C97928r) sVar.toBuilder();
        long max = Math.max(bVar.f381980g, sVar.f273469q);
        rVar.copyOnWrite();
        C97929s sVar2 = (C97929s) rVar.instance;
        sVar2.f273453a |= 65536;
        sVar2.f273469q = max;
        return (C97929s) rVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
