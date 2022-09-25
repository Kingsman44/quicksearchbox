package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9901e;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.e.g */
/* compiled from: PG */
public final /* synthetic */ class C130522g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130531p f357548a;

    /* renamed from: b */
    public final /* synthetic */ C106596h f357549b;

    /* renamed from: c */
    public final /* synthetic */ C53715bm f357550c;

    /* renamed from: d */
    public final /* synthetic */ C123746bm f357551d;

    public /* synthetic */ C130522g(C130531p pVar, C106596h hVar, C53715bm bmVar, C123746bm bmVar2) {
        this.f357548a = pVar;
        this.f357549b = hVar;
        this.f357550c = bmVar;
        this.f357551d = bmVar2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130531p pVar = this.f357548a;
        C131258a aVar = (C131258a) obj;
        try {
            C130524i iVar = new C130524i(pVar, aVar);
            return C60846c.m92878g(aVar.mo110139e(this.f357549b, this.f357550c, this.f357551d), RuntimeException.class, C47810es.m84963c(iVar), pVar.f357567c);
        } catch (RuntimeException e) {
            ((C58970a) ((C58970a) ((C58970a) pVar.f357565a.mo56225c()).mo56382g(e)).mo56372aa(38913)).mo56389s("Producer %s fatally failed.", aVar.getClass().getSimpleName());
            return C60856cj.m92900i(C58485gu.m89845m());
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
