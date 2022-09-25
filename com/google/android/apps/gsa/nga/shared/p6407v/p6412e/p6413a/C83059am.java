package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.common.p4522b.C58370cn;
import com.google.nlp.p4735b.p4736a.C62840g;
import com.google.nlp.p4735b.p4736a.C62841h;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.am */
/* compiled from: PG */
public final class C83059am implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C62841h hVar = (C62841h) obj;
        C62840g gVar = (C62840g) C62841h.f169700j.createBuilder();
        int i = hVar.f169702a;
        Objects.requireNonNull(hVar);
        C83050ad adVar = new C83050ad(hVar);
        Objects.requireNonNull(gVar);
        boolean z = true;
        C83080bg.m132478b(1 == (i & 1), adVar, new C83056aj(gVar));
        boolean z2 = (hVar.f169702a & 2) != 0;
        Objects.requireNonNull(hVar);
        C83057ak akVar = new C83057ak(hVar);
        Objects.requireNonNull(gVar);
        C83080bg.m132478b(z2, akVar, new C83058al(gVar));
        boolean z3 = (hVar.f169702a & 4) != 0;
        Objects.requireNonNull(hVar);
        C83105x xVar = new C83105x(hVar);
        Objects.requireNonNull(gVar);
        C83080bg.m132478b(z3, xVar, new C83106y(gVar));
        boolean z4 = (hVar.f169702a & 8) != 0;
        Objects.requireNonNull(hVar);
        C83107z zVar = new C83107z(hVar);
        Objects.requireNonNull(gVar);
        C83080bg.m132478b(z4, zVar, new C83047aa(gVar));
        boolean z5 = (hVar.f169702a & 16) != 0;
        Objects.requireNonNull(hVar);
        C83048ab abVar = new C83048ab(hVar);
        Objects.requireNonNull(gVar);
        C83080bg.m132478b(z5, abVar, new C83049ac(gVar));
        boolean z6 = (hVar.f169702a & 32) != 0;
        Objects.requireNonNull(hVar);
        C83051ae aeVar = new C83051ae(hVar);
        Objects.requireNonNull(gVar);
        C83080bg.m132478b(z6, aeVar, new C83052af(gVar));
        if ((hVar.f169702a & 64) == 0) {
            z = false;
        }
        Objects.requireNonNull(hVar);
        C83053ag agVar = new C83053ag(hVar);
        Objects.requireNonNull(gVar);
        C83080bg.m132478b(z, agVar, new C83054ah(gVar));
        Iterable iterable = (Iterable) Collection.EL.stream(hVar.f169707f).map(C83055ai.f226667a).collect(C58370cn.f155946a);
        gVar.copyOnWrite();
        C62841h hVar2 = (C62841h) gVar.instance;
        C62971cq cqVar = hVar2.f169707f;
        if (!cqVar.mo58948c()) {
            hVar2.f169707f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) hVar2.f169707f);
        return (C62841h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
