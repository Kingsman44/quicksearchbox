package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.p816a.p817a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.C12581c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a.a.u */
/* compiled from: PG */
public final class C12558u extends C68247h {

    /* renamed from: a */
    private final C68283d f39498a;

    /* renamed from: c */
    private final C68283d f39499c;

    /* renamed from: d */
    private final C68283d f39500d;

    public C12558u(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12558u.class), aVar);
        this.f39498a = C68236af.m98549d(dVar);
        this.f39499c = C68236af.m98549d(dVar2);
        this.f39500d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C12581c cVar = (C12581c) list.get(0);
        C12154a aVar = (C12154a) list.get(1);
        Executor executor = (Executor) list.get(2);
        if ((cVar.mo20650c().f48067a & 128) == 0 || (cVar.mo20650c().f48067a & 512) == 0) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92905n(C47810es.m84965e(new C12553p(cVar, aVar)), executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39498a.mo60297gq(), this.f39499c.mo60297gq(), this.f39500d.mo60297gq());
    }
}
