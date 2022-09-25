package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138543u;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bm */
/* compiled from: PG */
public final /* synthetic */ class C138438bm implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138445bt f376563a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f376564b;

    public /* synthetic */ C138438bm(C138445bt btVar, C138133o oVar) {
        this.f376563a = btVar;
        this.f376564b = oVar;
    }

    public final Object apply(Object obj) {
        C138445bt btVar = this.f376563a;
        C138133o oVar = this.f376564b;
        C138678v vVar = (C138678v) obj;
        if (vVar.f377199c.size() > 0) {
            btVar.f376589l.mo114267d();
        }
        if (!btVar.f376588k) {
            return vVar;
        }
        C138543u uVar = (C138543u) C138678v.f377195e.createBuilder();
        String str = oVar.f375825b;
        uVar.copyOnWrite();
        C138678v vVar2 = (C138678v) uVar.instance;
        str.getClass();
        vVar2.f377197a |= 1;
        vVar2.f377198b = str;
        return (C138678v) uVar.build();
    }
}
