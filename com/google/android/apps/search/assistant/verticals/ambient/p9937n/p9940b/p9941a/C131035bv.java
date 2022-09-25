package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130735c;
import com.google.assistant.p3860as.C49794h;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.bv */
/* compiled from: PG */
public final /* synthetic */ class C131035bv implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130696a f358445a;

    public /* synthetic */ C131035bv(C130696a aVar) {
        this.f358445a = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130696a aVar = this.f358445a;
        Duration duration = C131043cc.f358455a;
        ((C130735c) aVar).f357922b = Optional.m71637of((C49794h) obj);
        return aVar.mo109785a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
