package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C34949c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C34942ap f92626a;

    public /* synthetic */ C34949c(C34942ap apVar) {
        this.f92626a = apVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C34942ap apVar = this.f92626a;
        Map.Entry entry = (Map.Entry) obj;
        C34966t tVar = new C34966t(entry);
        return C60922j.m93044g((C60870cx) entry.getValue(), C47810es.m84963c(tVar), apVar.f92611b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
