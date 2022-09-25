package com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g;

import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111648ac;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111649ad;
import com.google.common.p4522b.C58495hd;
import com.google.protos.p4850an.C63389bg;
import com.google.protos.p4850an.p4854c.C63410ak;
import com.google.protos.p4985f.p5046x.C65379d;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.g.o */
/* compiled from: PG */
public final /* synthetic */ class C112052o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f311226a;

    public /* synthetic */ C112052o(C58495hd hdVar) {
        this.f311226a = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58495hd hdVar = this.f311226a;
        C63410ak akVar = (C63410ak) obj;
        int i = akVar.f171364a;
        if ((i & 4096) != 0) {
            C63389bg bgVar = akVar.f171367d;
            if (bgVar == null) {
                bgVar = C63389bg.f171305d;
            }
            if ((bgVar.f171307a & 1) == 0) {
                return Optional.empty();
            }
            C65379d dVar = (C65379d) hdVar.get(bgVar.f171308b);
            if (dVar == null || (dVar.f177778a & 2) == 0) {
                return Optional.empty();
            }
            C111648ac acVar = (C111648ac) C111649ad.f310414d.createBuilder();
            String str = dVar.f177779b;
            acVar.copyOnWrite();
            C111649ad adVar = (C111649ad) acVar.instance;
            str.getClass();
            adVar.f310416a |= 1;
            adVar.f310418c = str;
            acVar.mo99201a(dVar.f177781d);
            return Optional.m71637of((C111649ad) acVar.build());
        } else if ((i & 1024) == 0) {
            return Optional.empty();
        } else {
            C111648ac acVar2 = (C111648ac) C111649ad.f310414d.createBuilder();
            String str2 = akVar.f171365b;
            acVar2.copyOnWrite();
            C111649ad adVar2 = (C111649ad) acVar2.instance;
            str2.getClass();
            adVar2.f310416a |= 1;
            adVar2.f310418c = str2;
            return Optional.m71637of((C111649ad) acVar2.build());
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
