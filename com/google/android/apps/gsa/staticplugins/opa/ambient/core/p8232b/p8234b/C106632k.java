package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import com.google.android.libraries.search.assistant.p2566g.C33412g;
import com.google.android.libraries.search.assistant.p2566g.C33413h;
import com.google.assistant.p3860as.C49794h;
import com.google.assistant.p3860as.C49795i;
import com.google.assistant.p3860as.C49796j;
import com.google.assistant.p3886c.p3887a.C50676l;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.k */
/* compiled from: PG */
public final /* synthetic */ class C106632k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106632k f297284a = new C106632k();

    private /* synthetic */ C106632k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C50676l lVar = (C50676l) obj;
        C33412g gVar = (C33412g) C33413h.f89483e.createBuilder();
        C49795i iVar = (C49795i) C49796j.f128630d.createBuilder();
        String str = lVar.f131829b;
        iVar.copyOnWrite();
        C49796j jVar = (C49796j) iVar.instance;
        str.getClass();
        jVar.f128632a |= 1;
        jVar.f128633b = str;
        C49794h a = C49794h.m85713a(lVar.f131831d);
        if (a == null) {
            a = C49794h.UNDEFINED;
        }
        iVar.copyOnWrite();
        C49796j jVar2 = (C49796j) iVar.instance;
        jVar2.f128634c = a.f128629T;
        jVar2.f128632a |= 2;
        gVar.copyOnWrite();
        C33413h hVar = (C33413h) gVar.instance;
        C49796j jVar3 = (C49796j) iVar.build();
        jVar3.getClass();
        hVar.f89486b = jVar3;
        hVar.f89485a |= 1;
        double d = lVar.f131830c;
        gVar.copyOnWrite();
        C33413h hVar2 = (C33413h) gVar.instance;
        hVar2.f89485a |= 2;
        hVar2.f89487c = d;
        float f = lVar.f131832e;
        gVar.copyOnWrite();
        C33413h hVar3 = (C33413h) gVar.instance;
        hVar3.f89485a |= 4;
        hVar3.f89488d = f;
        return (C33413h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
