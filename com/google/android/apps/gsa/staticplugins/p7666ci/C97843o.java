package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123719am;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62909aq;
import com.google.protobuf.C62910ar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.o */
/* compiled from: PG */
public final /* synthetic */ class C97843o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C97846r f273210a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f273211b;

    public /* synthetic */ C97843o(C97846r rVar, AtomicInteger atomicInteger) {
        this.f273210a = rVar;
        this.f273211b = atomicInteger;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C97846r rVar = this.f273210a;
        AtomicInteger atomicInteger = this.f273211b;
        C58976aa aaVar = C58975e.f156826a;
        atomicInteger.get();
        C123719am amVar = (C123719am) C123726at.f341743h.createBuilder();
        amVar.copyOnWrite();
        C123726at atVar = (C123726at) amVar.instance;
        atVar.f341750e = 2;
        atVar.f341746a |= 4;
        C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
        long a = rVar.f273224g.mo79743a(C90017bw.f247951bM);
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169860a = a;
        amVar.copyOnWrite();
        C123726at atVar2 = (C123726at) amVar.instance;
        C62910ar arVar = (C62910ar) aqVar.build();
        arVar.getClass();
        atVar2.f341752g = arVar;
        atVar2.f341746a |= 16;
        amVar.mo106109a((Iterable) Collection.EL.stream((List) obj).map(C97830f.f273192a).collect(Collectors.toList()));
        C47633f i = C47633f.m84733g(rVar.f273219b.mo29164d(C97837i.f273203a, ((long) atomicInteger.get()) * ((long) rVar.f273228k), TimeUnit.SECONDS)).mo51516i(new C97838j(rVar, (C123726at) amVar.build()), rVar.f273219b);
        atomicInteger.getAndIncrement();
        return i;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
