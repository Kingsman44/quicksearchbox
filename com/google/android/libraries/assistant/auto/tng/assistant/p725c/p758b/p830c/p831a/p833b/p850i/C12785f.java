package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p850i;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.common.p928n.C13294a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.i.f */
/* compiled from: PG */
public final class C12785f implements C36197b {

    /* renamed from: a */
    public final C12781b f39955a;

    /* renamed from: b */
    public final C12154a f39956b;

    /* renamed from: c */
    private final C13294a f39957c;

    /* renamed from: d */
    private final C16850a f39958d;

    /* renamed from: e */
    private final Executor f39959e;

    public C12785f(C12781b bVar, C12154a aVar, C13294a aVar2, C16850a aVar3, Executor executor) {
        this.f39955a = bVar;
        this.f39956b = aVar;
        this.f39957c = aVar2;
        this.f39958d = aVar3;
        this.f39959e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20788a(C35470f fVar, String[] strArr) {
        this.f39957c.mo21012a(strArr);
        C60870cx b = this.f39958d.mo23063b();
        C12782c cVar = new C12782c(this);
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(cVar), this.f39959e);
        C12783d dVar = new C12783d(this);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(dVar), this.f39959e);
        C12784e eVar = C12784e.f39954a;
        return C60922j.m93044g(h, C47810es.m84963c(eVar), this.f39959e);
    }
}
