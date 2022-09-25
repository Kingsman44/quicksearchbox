package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.o */
/* compiled from: PG */
public final /* synthetic */ class C123897o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123904v f342219a;

    /* renamed from: b */
    public final /* synthetic */ C123623b f342220b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f342221c;

    /* renamed from: d */
    public final /* synthetic */ int f342222d;

    public /* synthetic */ C123897o(C123904v vVar, C123623b bVar, C53306j jVar, int i) {
        this.f342219a = vVar;
        this.f342220b = bVar;
        this.f342221c = jVar;
        this.f342222d = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123904v vVar = this.f342219a;
        C60870cx c = this.f342220b.mo106076c(this.f342221c, this.f342222d, (String) obj, C123751br.f341826e.getParserForType());
        C123896n nVar = new C123896n(vVar);
        return C60922j.m93045h(c, C47810es.m84966f(nVar), vVar.f342242f);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
