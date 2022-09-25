package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9102c.p9103a;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120579c;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120580d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.c.a.g */
/* compiled from: PG */
public final class C120608g extends C68247h {

    /* renamed from: a */
    private final C68283d f335464a;

    /* renamed from: c */
    private final C68283d f335465c;

    /* renamed from: d */
    private final C68283d f335466d;

    /* renamed from: e */
    private final C68283d f335467e;

    public C120608g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C120608g.class), aVar);
        this.f335464a = C68236af.m98549d(dVar);
        this.f335465c = C68236af.m98549d(dVar2);
        this.f335466d = C68236af.m98549d(dVar3);
        this.f335467e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f335464a;
        C68283d dVar2 = this.f335465c;
        C59071e eVar = C120607f.f335463a;
        C120580d a = ((C120579c) list.get(1)).mo104844a(C120578b.HYBRID);
        C60870cx gq = dVar.mo60297gq();
        return C47633f.m84733g(dVar2.mo60297gq()).mo51516i(new C120602a(eVar, a, gq, (Executor) list.get(0)), C60826bg.f164896a).mo51514f(Exception.class, new C120603b(eVar, a, gq), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f335466d.mo60297gq(), this.f335467e.mo60297gq());
    }
}
