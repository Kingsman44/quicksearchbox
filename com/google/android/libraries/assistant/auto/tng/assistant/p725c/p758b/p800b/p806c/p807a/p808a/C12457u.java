package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a.p808a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12224f;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.a.u */
/* compiled from: PG */
public final class C12457u extends C68247h {

    /* renamed from: a */
    private final C68283d f39338a;

    /* renamed from: c */
    private final C68283d f39339c;

    public C12457u(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C12457u.class), aVar);
        this.f39338a = C68236af.m98549d(dVar);
        this.f39339c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        Executor executor = (Executor) list.get(1);
        C58976aa aaVar = C58975e.f156826a;
        if (optional.isPresent()) {
            return C60922j.m93044g(((C12224f) optional.get()).mo20495c(), C47810es.m84963c(C12452p.f39327a), executor);
        }
        return C60856cj.m92900i(Optional.empty());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39338a.mo60297gq(), this.f39339c.mo60297gq());
    }
}
