package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.Executor;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.ax */
/* compiled from: PG */
final class C120447ax extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ Executor f334998a;

    /* renamed from: b */
    final /* synthetic */ C71548cy f334999b;

    /* renamed from: c */
    final /* synthetic */ C120441as f335000c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120447ax(Executor executor, C71548cy cyVar, C120441as asVar) {
        super(0);
        this.f334998a = executor;
        this.f334999b = cyVar;
        this.f335000c = asVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        mo104755b();
        return C69788q.f186170a;
    }

    /* renamed from: b */
    public final void mo104755b() {
        this.f334998a.execute(C47810es.m84977q(new C120446aw(this.f334999b, this.f335000c)));
    }
}
