package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p337aa.C6619f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.ap */
/* compiled from: PG */
public final /* synthetic */ class C138946ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138963bf f377896a;

    public /* synthetic */ C138946ap(C138963bf bfVar) {
        this.f377896a = bfVar;
    }

    public final C60870cx apply(Object obj) {
        C138963bf bfVar = this.f377896a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60866ct.f164955a;
        }
        C6619f fVar = (C6619f) optional.get();
        C60870cx a = bfVar.f377922d.mo114645a();
        C138948ar arVar = new C138948ar(bfVar, fVar);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(arVar), bfVar.f377926h);
        C60931s f = C47810es.m84966f(new C138950at(bfVar, fVar));
        return C60922j.m93045h(g, C47810es.m84966f(f), bfVar.f377926h);
    }
}
