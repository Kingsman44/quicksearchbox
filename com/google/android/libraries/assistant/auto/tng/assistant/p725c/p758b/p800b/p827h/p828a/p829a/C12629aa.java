package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a.p789a.C12321e;
import com.google.android.libraries.assistant.auto.tng.common.p931p.C13314n;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.aa */
/* compiled from: PG */
public final class C12629aa extends C68247h {

    /* renamed from: a */
    private final C68283d f39618a;

    /* renamed from: c */
    private final C68283d f39619c;

    /* renamed from: d */
    private final C68283d f39620d;

    public C12629aa(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12629aa.class), aVar);
        this.f39618a = C68236af.m98549d(dVar);
        this.f39619c = C68236af.m98549d(dVar2);
        this.f39620d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f39618a;
        Executor executor = (Executor) list.get(1);
        C57987f fVar = new C57987f();
        C46459k.m82829b(C13314n.m29569a(((C12321e) list.get(0)).f39128b.f42150i, executor).mo20440jJ(new C12675w(fVar)), "Network state stream failed", new Object[0]);
        C60856cj.m92911t(dVar.mo60297gq(), C47810es.m84974n(new C12676x(fVar, executor)), executor);
        return C60856cj.m92900i(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39619c.mo60297gq(), this.f39620d.mo60297gq());
    }
}
