package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p395al.p417d.p418a.C8575bc;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.b.l */
/* compiled from: PG */
public final /* synthetic */ class C138417l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138421p f376519a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f376520b;

    public /* synthetic */ C138417l(C138421p pVar, C138133o oVar) {
        this.f376519a = pVar;
        this.f376520b = oVar;
    }

    public final C60870cx apply(Object obj) {
        C138421p pVar = this.f376519a;
        C138133o oVar = this.f376520b;
        if (((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(Optional.empty());
        }
        if (pVar.f376525b) {
            C138413h hVar = pVar.f376524a;
            C60870cx e = hVar.f376514a.mo50345e(C138413h.m224823a(oVar));
            C138412g gVar = C138412g.f376513a;
            C60870cx g = C60922j.m93044g(e, C47810es.m84963c(gVar), hVar.f376515b);
            C138416k kVar = new C138416k(pVar, oVar);
            return C60922j.m93044g(g, C47810es.m84963c(kVar), pVar.f376528e);
        }
        C8575bc bcVar = oVar.f375831h;
        if (bcVar == null) {
            bcVar = C8575bc.f29690g;
        }
        if (bcVar.f29694c.size() > 0) {
            return C60856cj.m92900i(Optional.m71637of(C138421p.m224831d(oVar)));
        }
        return C60856cj.m92900i(Optional.empty());
    }
}
