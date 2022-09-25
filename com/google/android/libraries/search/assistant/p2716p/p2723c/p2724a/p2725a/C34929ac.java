package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4152bb.p4153a.C55064en;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C34929ac implements Function {

    /* renamed from: a */
    public final /* synthetic */ C34942ap f92594a;

    /* renamed from: b */
    public final /* synthetic */ long f92595b;

    public /* synthetic */ C34929ac(C34942ap apVar, long j) {
        this.f92594a = apVar;
        this.f92595b = j;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C34942ap apVar = this.f92594a;
        long j = this.f92595b;
        String str = (String) obj;
        if ("com.google.android.dialer".equals(str)) {
            C60870cx e = apVar.f92612c.mo39817e(j, Optional.empty());
            C34956j jVar = C34956j.f92639a;
            C60870cx g = C60922j.m93044g(e, C47810es.m84963c(jVar), apVar.f92611b);
            C34957k kVar = new C34957k(str);
            return C60922j.m93044g(g, C47810es.m84963c(kVar), apVar.f92611b);
        } else if (!"com.whatsapp".equals(str)) {
            return C60856cj.m92900i(C55064en.f144858f);
        } else {
            C60870cx e2 = apVar.f92612c.mo39817e(j, Optional.m71637of("vnd.android.cursor.item/vnd.com.whatsapp.voip.call"));
            C34958l lVar = C34958l.f92641a;
            C60870cx g2 = C60922j.m93044g(e2, C47810es.m84963c(lVar), apVar.f92611b);
            C34960n nVar = new C34960n(str);
            return C60922j.m93044g(g2, C47810es.m84963c(nVar), apVar.f92611b);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
