package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48717by;
import com.google.assistant.p3781ad.p3789d.p3791b.C48718bz;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4522b.C58370cn;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.ce */
/* compiled from: PG */
public final /* synthetic */ class C113084ce implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C113088ci f313337a;

    public /* synthetic */ C113084ce(C113088ci ciVar) {
        this.f313337a = ciVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C113088ci ciVar = this.f313337a;
        List list = (List) obj;
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        long b = ciVar.f313343a.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        C48717by byVar = (C48717by) C48718bz.f126051b.createBuilder();
        byVar.mo53176a((Iterable) Stream.CC.concat(Collection.EL.stream((List) list.get(0)), Collection.EL.stream((List) list.get(1))).filter(C113086cg.f313339a).sorted(Comparator.CC.comparingLong(C113087ch.f313340a)).collect(C58370cn.f155946a));
        bvVar.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar.instance;
        C48718bz bzVar = (C48718bz) byVar.build();
        bzVar.getClass();
        bxVar.f125707b = bzVar;
        bxVar.f125706a = 15;
        return (C48635bx) bvVar.build();
    }
}
