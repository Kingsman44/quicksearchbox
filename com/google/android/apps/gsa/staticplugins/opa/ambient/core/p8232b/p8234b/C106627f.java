package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.libraries.search.assistant.p2566g.C33412g;
import com.google.android.libraries.search.assistant.p2566g.C33413h;
import com.google.assistant.p3860as.C49794h;
import com.google.assistant.p3860as.C49795i;
import com.google.assistant.p3860as.C49796j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.f */
/* compiled from: PG */
public final /* synthetic */ class C106627f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106627f f297272a = new C106627f();

    private /* synthetic */ C106627f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130701b bVar = (C130701b) obj;
        C33412g gVar = (C33412g) C33413h.f89483e.createBuilder();
        C49795i iVar = (C49795i) C49796j.f128630d.createBuilder();
        String h = bVar.mo109797h();
        iVar.copyOnWrite();
        C49796j jVar = (C49796j) iVar.instance;
        h.getClass();
        jVar.f128632a |= 1;
        jVar.f128633b = h;
        iVar.copyOnWrite();
        C49796j jVar2 = (C49796j) iVar.instance;
        jVar2.f128634c = ((C49794h) bVar.mo109795f().orElse(C49794h.UNDEFINED)).f128629T;
        jVar2.f128632a |= 2;
        gVar.copyOnWrite();
        C33413h hVar = (C33413h) gVar.instance;
        C49796j jVar3 = (C49796j) iVar.build();
        jVar3.getClass();
        hVar.f89486b = jVar3;
        hVar.f89485a |= 1;
        double a = bVar.mo109791a();
        gVar.copyOnWrite();
        C33413h hVar2 = (C33413h) gVar.instance;
        hVar2.f89485a |= 2;
        hVar2.f89487c = a;
        float floatValue = ((Float) bVar.mo109796g().orElse(Float.valueOf(-1.0f))).floatValue();
        gVar.copyOnWrite();
        C33413h hVar3 = (C33413h) gVar.instance;
        hVar3.f89485a |= 4;
        hVar3.f89488d = floatValue;
        return (C33413h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
