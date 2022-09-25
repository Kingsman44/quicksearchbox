package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.C18629e;
import com.google.android.libraries.assistant.pcp.C18958m;
import com.google.android.libraries.assistant.pcp.C18997n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.b.c */
/* compiled from: PG */
public final /* synthetic */ class C18532c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18551v f52512a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f52513b;

    public /* synthetic */ C18532c(C18551v vVar, C53306j jVar) {
        this.f52512a = vVar;
        this.f52513b = jVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18551v vVar = this.f52512a;
        C18543n nVar = new C18543n(this.f52513b);
        C60870cx g = C60922j.m93044g((C60870cx) obj, C47810es.m84963c(nVar), vVar.f52560d);
        C18958m b = C18997n.m36420b();
        ((C18629e) b).f52654a = g;
        return b.mo24092a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
