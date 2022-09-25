package com.google.android.apps.search.assistant.verticals.p9880a.p9892h;

import com.google.assistant.p3825an.p3830c.p3831a.C49261ag;
import com.google.assistant.p3825an.p3830c.p3831a.C49287bf;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.assistant.p3825an.p3830c.p3831a.C49329f;
import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.b */
/* compiled from: PG */
public final /* synthetic */ class C130421b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f357382a;

    public /* synthetic */ C130421b(C58495hd hdVar) {
        this.f357382a = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58495hd hdVar = this.f357382a;
        C49330g gVar = (C49330g) obj;
        if (!hdVar.containsKey(gVar.f127491b)) {
            return gVar;
        }
        C49301bt btVar = (C49301bt) hdVar.get(gVar.f127491b);
        C49329f fVar = (C49329f) gVar.toBuilder();
        C49261ag agVar = btVar.f127427c;
        if (agVar == null) {
            agVar = C49261ag.f127334e;
        }
        C49287bf bfVar = agVar.f127338c;
        if (bfVar == null) {
            bfVar = C49287bf.f127390b;
        }
        String str = bfVar.f127392a;
        fVar.copyOnWrite();
        C49330g gVar2 = (C49330g) fVar.instance;
        str.getClass();
        gVar2.f127490a |= 512;
        gVar2.f127501l = str;
        C49261ag agVar2 = btVar.f127427c;
        if (agVar2 == null) {
            agVar2 = C49261ag.f127334e;
        }
        String str2 = agVar2.f127339d;
        fVar.copyOnWrite();
        C49330g gVar3 = (C49330g) fVar.instance;
        str2.getClass();
        gVar3.f127490a |= 2048;
        gVar3.f127503n = str2;
        C49261ag agVar3 = btVar.f127427c;
        if (agVar3 == null) {
            agVar3 = C49261ag.f127334e;
        }
        String str3 = agVar3.f127336a;
        fVar.copyOnWrite();
        C49330g gVar4 = (C49330g) fVar.instance;
        str3.getClass();
        gVar4.f127490a |= 1024;
        gVar4.f127502m = str3;
        return (C49330g) fVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
