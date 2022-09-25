package com.google.android.apps.search.assistant.verticals.automation.routines.p10034g;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131869l;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131871n;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131872o;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.g.c */
/* compiled from: PG */
public final /* synthetic */ class C131897c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C131869l f360170a;

    public /* synthetic */ C131897c(C131869l lVar) {
        this.f360170a = lVar;
    }

    public final void accept(Object obj) {
        C131869l lVar = this.f360170a;
        C131871n nVar = (C131871n) obj;
        lVar.copyOnWrite();
        C131872o oVar = (C131872o) lVar.instance;
        C131872o oVar2 = C131872o.f360114d;
        nVar.getClass();
        oVar.f360118c = nVar;
        oVar.f360116a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
