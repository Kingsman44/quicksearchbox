package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.C18777i;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.b.b */
/* compiled from: PG */
public final /* synthetic */ class C18531b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18551v f52508a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f52509b;

    /* renamed from: c */
    public final /* synthetic */ C18718c f52510c;

    /* renamed from: d */
    public final /* synthetic */ C18777i f52511d;

    public /* synthetic */ C18531b(C18551v vVar, C53306j jVar, C18718c cVar, C18777i iVar) {
        this.f52508a = vVar;
        this.f52509b = jVar;
        this.f52510c = cVar;
        this.f52511d = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18551v vVar = this.f52508a;
        C18546q qVar = new C18546q(vVar, this.f52509b, this.f52511d.mo24043b(), this.f52510c);
        return C60922j.m93045h((C60870cx) obj, C47810es.m84966f(qVar), vVar.f52560d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
