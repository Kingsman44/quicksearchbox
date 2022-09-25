package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127285e;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127290j;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.n */
/* compiled from: PG */
public final /* synthetic */ class C127320n implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C127323q f350648a;

    /* renamed from: b */
    public final /* synthetic */ C127289i f350649b;

    public /* synthetic */ C127320n(C127323q qVar, C127289i iVar) {
        this.f350648a = qVar;
        this.f350649b = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C127323q qVar = this.f350648a;
        C127289i iVar = this.f350649b;
        C127308b bVar = (C127308b) obj;
        if (bVar != null && bVar.f350605a.equals(iVar.f350564b)) {
            return bVar;
        }
        C69664n.m101061g(iVar, "queryContext");
        C127285e eVar = iVar.f350570h;
        if (eVar == null) {
            eVar = C127285e.f350551c;
        }
        C69664n.m101060f(eVar, "queryContext.interactionInfo");
        C127326t tVar = new C127326t(C127290j.m208210a(eVar));
        Object obj2 = qVar.f350654d.mo65467a(qVar.f350655e.mo108011a(tVar), qVar.f350656f.mo108011a(tVar), qVar.f350657g).f350667d.get();
        C69664n.m101060f(obj2, "searchParamsGraphComponentSupplier.get()");
        return new C127308b(iVar.f350564b, (C127325s) obj2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
