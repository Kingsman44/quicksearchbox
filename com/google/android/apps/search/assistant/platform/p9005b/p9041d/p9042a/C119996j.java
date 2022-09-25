package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119874do;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33435c;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33437e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60904dr;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.j */
/* compiled from: PG */
public final class C119996j {

    /* renamed from: a */
    public final C68214a f334119a;

    /* renamed from: b */
    public final C69464a f334120b;

    /* renamed from: c */
    public final C70862aj f334121c;

    /* renamed from: d */
    public final C68214a f334122d;

    /* renamed from: e */
    public final C68214a f334123e;

    /* renamed from: f */
    public boolean f334124f = false;

    /* renamed from: g */
    public final C33437e f334125g;

    /* renamed from: h */
    public C33435c f334126h;

    /* renamed from: i */
    private final Executor f334127i;

    public C119996j(C119981bh bhVar, C33437e eVar, Executor executor, C68214a aVar, C69464a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f334127i = new C60904dr(executor);
        this.f334125g = eVar;
        this.f334121c = ((C119990d) bhVar).f334112b;
        this.f334119a = aVar;
        this.f334120b = aVar2;
        this.f334122d = aVar3;
        this.f334123e = aVar4;
    }

    /* renamed from: a */
    public final void mo104613a(Throwable th) {
        this.f334127i.execute(C47810es.m84977q(new C119994h(this, th)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo104614b(C119874do doVar) {
        this.f334127i.execute(C47810es.m84977q(new C119993g(this, doVar)));
    }
}
