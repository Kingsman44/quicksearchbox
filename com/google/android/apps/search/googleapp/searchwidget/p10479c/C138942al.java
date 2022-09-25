package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.al */
/* compiled from: PG */
public final /* synthetic */ class C138942al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138963bf f377890a;

    /* renamed from: b */
    public final /* synthetic */ List f377891b;

    public /* synthetic */ C138942al(C138963bf bfVar, List list) {
        this.f377890a = bfVar;
        this.f377891b = list;
    }

    public final C60870cx apply(Object obj) {
        C138963bf bfVar = this.f377890a;
        List list = this.f377891b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60866ct.f164955a;
        }
        C60870cx d = bfVar.f377924f.mo46042d();
        C138947aq aqVar = new C138947aq(bfVar, list, (C63042fg) optional.get());
        return C60922j.m93045h(d, C47810es.m84966f(aqVar), bfVar.f377926h);
    }
}
