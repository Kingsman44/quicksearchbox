package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.unifiedime.C118587e;
import com.google.android.apps.gsa.unifiedime.C118588f;
import com.google.android.apps.p471d.p472a.p477b.p478a.C9028a;
import com.google.common.p4522b.C58370cn;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.i */
/* compiled from: PG */
public final /* synthetic */ class C126265i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C126265i f347921a = new C126265i();

    private /* synthetic */ C126265i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C9028a aVar = (C9028a) obj;
        C118587e eVar = (C118587e) C118588f.f330859e.createBuilder();
        int b = aVar.mo17317b();
        eVar.copyOnWrite();
        C118588f fVar = (C118588f) eVar.instance;
        fVar.f330861a |= 1;
        fVar.f330862b = b;
        int a = aVar.mo17316a();
        int b2 = aVar.mo17317b();
        eVar.copyOnWrite();
        C118588f fVar2 = (C118588f) eVar.instance;
        fVar2.f330861a |= 2;
        fVar2.f330863c = a - b2;
        eVar.mo103773a((Iterable) Collection.EL.stream(aVar.mo17318c()).map(C126266j.f347922a).collect(C58370cn.f155946a));
        return (C118588f) eVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
