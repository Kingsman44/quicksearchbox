package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.g */
/* compiled from: PG */
public final /* synthetic */ class C131052g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131071z f358483a;

    public /* synthetic */ C131052g(C131071z zVar) {
        this.f358483a = zVar;
    }

    public final Object apply(Object obj) {
        C131071z zVar = this.f358483a;
        C58485gu guVar = (C58485gu) obj;
        boolean z = false;
        if (guVar.isEmpty()) {
            guVar = (C58485gu) Collection.EL.stream(zVar.f358517f.f178307a).map(C131055j.f358488a).collect(C58370cn.f155946a);
            if (!guVar.isEmpty()) {
                z = true;
            }
        }
        return new C130988ab(guVar, Boolean.valueOf(z));
    }
}
