package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a.p808a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12221c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12223e;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.C13368a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.a.o */
/* compiled from: PG */
public final class C12451o extends C68247h {

    /* renamed from: a */
    private final C68283d f39323a;

    /* renamed from: c */
    private final C68283d f39324c;

    /* renamed from: d */
    private final C68283d f39325d;

    /* renamed from: e */
    private final C68283d f39326e;

    public C12451o(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C12451o.class), aVar);
        this.f39323a = C68236af.m98549d(dVar);
        this.f39324c = C68236af.m98549d(dVar2);
        this.f39325d = C68236af.m98549d(dVar3);
        this.f39326e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C12221c cVar = (C12221c) list.get(1);
        C12223e eVar = (C12223e) list.get(2);
        Executor executor = (Executor) list.get(3);
        if (!((C13368a) list.get(0)).f41117b.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(Optional.empty());
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return C60922j.m93044g(cVar.mo20498a(eVar), C47810es.m84963c(C12449m.f39320a), executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39323a.mo60297gq(), this.f39324c.mo60297gq(), this.f39325d.mo60297gq(), this.f39326e.mo60297gq());
    }
}
