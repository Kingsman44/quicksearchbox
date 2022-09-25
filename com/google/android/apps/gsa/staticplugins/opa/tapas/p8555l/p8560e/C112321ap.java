package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58480gp;
import com.google.research.p5181a.p5182a.C66280c;
import com.google.research.p5181a.p5182a.C66281d;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ap */
/* compiled from: PG */
public final /* synthetic */ class C112321ap implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58480gp f311696a;

    public /* synthetic */ C112321ap(C58480gp gpVar) {
        this.f311696a = gpVar;
    }

    public final void accept(Object obj, Object obj2) {
        C58480gp gpVar = this.f311696a;
        C121537f fVar = C112331az.f311704a;
        C66280c cVar = (C66280c) C66281d.f180252d.createBuilder();
        int intValue = ((Integer) obj).intValue();
        cVar.copyOnWrite();
        C66281d dVar = (C66281d) cVar.instance;
        dVar.f180254a |= 1;
        dVar.f180255b = intValue;
        long longValue = ((Number) obj2).longValue();
        cVar.copyOnWrite();
        C66281d dVar2 = (C66281d) cVar.instance;
        dVar2.f180254a |= 2;
        dVar2.f180256c = longValue;
        gpVar.mo55395g((C66281d) cVar.build());
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
