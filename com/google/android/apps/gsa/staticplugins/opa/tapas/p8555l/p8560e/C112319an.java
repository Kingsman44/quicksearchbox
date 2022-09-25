package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58480gp;
import com.google.research.p5181a.p5182a.C66292o;
import com.google.research.p5181a.p5182a.C66293p;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.an */
/* compiled from: PG */
public final /* synthetic */ class C112319an implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58480gp f311693a;

    public /* synthetic */ C112319an(C58480gp gpVar) {
        this.f311693a = gpVar;
    }

    public final void accept(Object obj, Object obj2) {
        C58480gp gpVar = this.f311693a;
        String str = (String) obj;
        C121537f fVar = C112331az.f311704a;
        C66292o oVar = (C66292o) C66293p.f180286d.createBuilder();
        int intValue = ((Integer) obj2).intValue();
        oVar.copyOnWrite();
        C66293p pVar = (C66293p) oVar.instance;
        pVar.f180288a |= 1;
        pVar.f180289b = intValue;
        oVar.copyOnWrite();
        C66293p pVar2 = (C66293p) oVar.instance;
        str.getClass();
        pVar2.f180288a |= 2;
        pVar2.f180290c = str;
        gpVar.mo55395g((C66293p) oVar.build());
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
