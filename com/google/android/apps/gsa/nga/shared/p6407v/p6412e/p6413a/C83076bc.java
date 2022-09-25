package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.common.p4522b.C58370cn;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.bc */
/* compiled from: PG */
public final class C83076bc implements Function {

    /* renamed from: a */
    private final C83088g f226686a;

    public C83076bc(C83088g gVar) {
        this.f226686a = gVar;
    }

    /* renamed from: a */
    public final C80401n apply(C80401n nVar) {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74314f((Iterable) Collection.EL.stream(nVar.f220658a).map(this.f226686a).collect(C58370cn.f155946a));
        lVar.mo74313e((Iterable) Collection.EL.stream(nVar.f220659b).map(C83070ax.f226680a).collect(C58370cn.f155946a));
        lVar.mo74315g(nVar.f220660c);
        boolean z = nVar.f220663f;
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220663f = z;
        int b = C80403p.m128151b(nVar.f220664g);
        boolean z2 = true;
        if (b == 0) {
            b = 1;
        }
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(b);
        boolean z3 = nVar.f220662e != null;
        C83071ay ayVar = C83071ay.f226681a;
        Objects.requireNonNull(lVar);
        C83080bg.m132478b(z3, ayVar, new C83072az(lVar));
        if (nVar.f220666i == null) {
            z2 = false;
        }
        C83074ba baVar = C83074ba.f226684a;
        Objects.requireNonNull(lVar);
        C83080bg.m132478b(z2, baVar, new C83075bb(lVar));
        for (Map.Entry entry : Collections.unmodifiableMap(nVar.f220661d).entrySet()) {
            lVar.mo74320l((String) entry.getKey(), apply((C80401n) entry.getValue()));
        }
        return (C80401n) lVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
