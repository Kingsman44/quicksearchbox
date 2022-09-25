package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132796d;
import com.google.android.apps.search.fedora.p10099e.C132797e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.aq */
/* compiled from: PG */
public final /* synthetic */ class C100905aq implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C100905aq f281923a = new C100905aq();

    private /* synthetic */ C100905aq() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C132798f fVar = (C132798f) obj;
        C132769a aVar = (C132769a) fVar.toBuilder();
        C132797e eVar = fVar.f362325i;
        if (eVar == null) {
            eVar = C132797e.f362307g;
        }
        C132796d dVar = (C132796d) eVar.toBuilder();
        dVar.copyOnWrite();
        C132797e eVar2 = (C132797e) dVar.instance;
        eVar2.f362309a &= -9;
        eVar2.f362313e = C132797e.f362307g.f362313e;
        dVar.copyOnWrite();
        C132797e eVar3 = (C132797e) dVar.instance;
        eVar3.f362309a &= -17;
        eVar3.f362314f = 0;
        dVar.copyOnWrite();
        C132797e eVar4 = (C132797e) dVar.instance;
        eVar4.f362309a &= -5;
        eVar4.f362312d = C132797e.f362307g.f362312d;
        C132797e eVar5 = (C132797e) dVar.build();
        aVar.copyOnWrite();
        C132798f fVar2 = (C132798f) aVar.instance;
        eVar5.getClass();
        fVar2.f362325i = eVar5;
        fVar2.f362317a |= 64;
        return (C132798f) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
