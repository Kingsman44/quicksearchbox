package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.z */
/* compiled from: PG */
public final class C120384z extends C68247h {

    /* renamed from: a */
    private final C68283d f334887a;

    /* renamed from: c */
    private final C68283d f334888c;

    /* renamed from: d */
    private final C68283d f334889d;

    /* renamed from: e */
    private final C68283d f334890e;

    public C120384z(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C120384z.class), aVar);
        this.f334887a = C68236af.m98549d(dVar);
        this.f334888c = C68236af.m98549d(dVar2);
        this.f334889d = C68236af.m98549d(dVar3);
        this.f334890e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C120383y yVar = (C120383y) list.get(0);
        C68283d dVar = this.f334888c;
        C68283d dVar2 = this.f334889d;
        Executor executor = (Executor) list.get(1);
        C60870cx gq = dVar.mo60297gq();
        C60870cx gq2 = dVar2.mo60297gq();
        gq.getClass();
        gq2.getClass();
        executor.getClass();
        return C60856cj.m92900i(new C120382x(gq, gq2, executor));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f334887a.mo60297gq(), this.f334890e.mo60297gq());
    }
}
