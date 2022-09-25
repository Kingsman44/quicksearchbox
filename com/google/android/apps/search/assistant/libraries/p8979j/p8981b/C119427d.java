package com.google.android.apps.search.assistant.libraries.p8979j.p8981b;

import com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119424i;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.apps.tiktok.tracing.C47810es;
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

/* renamed from: com.google.android.apps.search.assistant.libraries.j.b.d */
/* compiled from: PG */
public final class C119427d extends C68247h {

    /* renamed from: a */
    private final C68283d f332938a;

    /* renamed from: c */
    private final C68283d f332939c;

    /* renamed from: d */
    private final C68283d f332940d;

    public C119427d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C119427d.class), aVar);
        this.f332938a = C68236af.m98549d(dVar);
        this.f332939c = C68236af.m98549d(dVar2);
        this.f332940d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        C119424i iVar = (C119424i) list.get(1);
        Executor executor = (Executor) list.get(2);
        if (optional.isPresent()) {
            return C60922j.m93044g(iVar.mo104340a((C18496n) optional.get()), C47810es.m84963c(C119425b.f332934a), executor);
        }
        return C60856cj.m92900i(Optional.empty());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f332938a.mo60297gq(), this.f332939c.mo60297gq(), this.f332940d.mo60297gq());
    }
}
