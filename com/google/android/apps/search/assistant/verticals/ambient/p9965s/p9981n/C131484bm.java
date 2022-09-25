package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83781x;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.bm */
/* compiled from: PG */
public final /* synthetic */ class C131484bm implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131495bx f359327a;

    /* renamed from: b */
    public final /* synthetic */ C131494bw f359328b;

    public /* synthetic */ C131484bm(C131495bx bxVar, C131494bw bwVar) {
        this.f359327a = bxVar;
        this.f359328b = bwVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(((C83781x) obj).f228359b).findFirst().map(new C131483bl(this.f359327a, this.f359328b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
