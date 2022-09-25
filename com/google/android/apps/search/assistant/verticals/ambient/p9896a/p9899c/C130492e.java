package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9899c;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.c.e */
/* compiled from: PG */
public final /* synthetic */ class C130492e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130499l f357480a;

    /* renamed from: b */
    public final /* synthetic */ C106596h f357481b;

    /* renamed from: c */
    public final /* synthetic */ C53715bm f357482c;

    public /* synthetic */ C130492e(C130499l lVar, C106596h hVar, C53715bm bmVar) {
        this.f357480a = lVar;
        this.f357481b = hVar;
        this.f357482c = bmVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130499l lVar = this.f357480a;
        C131258a aVar = (C131258a) obj;
        C131258a aVar2 = aVar;
        C60870cx a = lVar.f357491b.mo109708a(aVar2, this.f357481b, this.f357482c, (Object) null, Optional.empty());
        C130494g gVar = new C130494g(lVar, aVar);
        return C60846c.m92878g(a, RuntimeException.class, C47810es.m84963c(gVar), lVar.f357492c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
