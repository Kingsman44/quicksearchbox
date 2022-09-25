package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.aw */
/* compiled from: PG */
public final class C113048aw {

    /* renamed from: a */
    public C58485gu f313237a = C58485gu.m89845m();

    private C113048aw() {
    }

    /* renamed from: a */
    public static C113091d m187028a(C113103p pVar) {
        if (pVar.f313380a.size() == 0) {
            return C113091d.f313351e;
        }
        return (C113091d) pVar.f313380a.get(pVar.f313380a.size() - 1);
    }

    /* renamed from: c */
    public static C113048aw m187029c(int i) {
        C113048aw awVar = new C113048aw();
        awVar.f313237a = (C58485gu) Stream.CC.generate(C113047av.f313236a).limit((long) i).collect(C58370cn.f155946a);
        return awVar;
    }

    /* renamed from: d */
    public static Optional m187030d(C113045at atVar, C113103p pVar) {
        if (atVar.f313233b.isEmpty() || atVar.f313234c.isEmpty()) {
            return Optional.empty();
        }
        int intValue = ((Integer) atVar.f313233b.get()).intValue();
        C113091d dVar = (C113091d) pVar.f313380a.get(((Integer) atVar.f313234c.get()).intValue());
        if (intValue > 0) {
            dVar = C113052b.m187047c(dVar, (C113091d) pVar.f313380a.get(intValue - 1));
        }
        return Optional.m71637of(dVar);
    }

    /* renamed from: e */
    public static Optional m187031e(C113045at atVar, C113103p pVar) {
        if (atVar.f313232a.isEmpty()) {
            return Optional.empty();
        }
        int intValue = ((Integer) atVar.f313232a.get()).intValue();
        C113091d dVar = (C113091d) pVar.f313380a.get(intValue);
        if (intValue > 0) {
            dVar = C113052b.m187047c(dVar, (C113091d) pVar.f313380a.get(intValue - 1));
        }
        return Optional.m71637of(dVar);
    }

    /* renamed from: b */
    public final C113103p mo99822b() {
        C113102o oVar = (C113102o) C113103p.f313378b.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(this.f313237a).map(C113046au.f313235a).collect(C58370cn.f155946a);
        oVar.copyOnWrite();
        C113103p pVar = (C113103p) oVar.instance;
        C62971cq cqVar = pVar.f313380a;
        if (!cqVar.mo58948c()) {
            pVar.f313380a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) pVar.f313380a);
        return (C113103p) oVar.build();
    }
}
