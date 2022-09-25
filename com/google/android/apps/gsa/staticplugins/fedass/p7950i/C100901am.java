package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132796d;
import com.google.android.apps.search.fedora.p10099e.C132797e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.common.p4526f.C59052c;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.am */
/* compiled from: PG */
public final /* synthetic */ class C100901am implements Function {

    /* renamed from: a */
    public final /* synthetic */ C100907as f281915a;

    public /* synthetic */ C100901am(C100907as asVar) {
        this.f281915a = asVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C132798f fVar = (C132798f) obj;
        C100888a aVar = (C100888a) this.f281915a;
        C8476as asVar = aVar.f281880b;
        if (asVar == null) {
            ((C59052c) ((C59052c) C100908at.f281924a.mo56225c()).mo56372aa(19701)).mo56386p("Pack metadata cannot be null.");
            return fVar;
        }
        C132797e eVar = fVar.f362325i;
        if (eVar == null) {
            eVar = C132797e.f362307g;
        }
        C132796d dVar = (C132796d) eVar.toBuilder();
        String str = aVar.f281879a;
        dVar.copyOnWrite();
        C132797e eVar2 = (C132797e) dVar.instance;
        eVar2.f362309a |= 1;
        eVar2.f362310b = str;
        String str2 = asVar.f29417b;
        dVar.copyOnWrite();
        C132797e eVar3 = (C132797e) dVar.instance;
        str2.getClass();
        eVar3.f362309a |= 4;
        eVar3.f362312d = str2;
        int i = asVar.f29419d;
        dVar.copyOnWrite();
        C132797e eVar4 = (C132797e) dVar.instance;
        eVar4.f362309a |= 2;
        eVar4.f362311c = i;
        C132797e eVar5 = (C132797e) dVar.build();
        C132769a aVar2 = (C132769a) fVar.toBuilder();
        aVar2.copyOnWrite();
        C132798f fVar2 = (C132798f) aVar2.instance;
        eVar5.getClass();
        fVar2.f362325i = eVar5;
        fVar2.f362317a |= 64;
        return (C132798f) aVar2.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
