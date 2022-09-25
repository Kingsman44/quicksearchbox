package com.google.android.apps.search.podcasts.player.impl;

import com.google.android.apps.search.podcasts.player.p10593b.C140774b;
import com.google.android.apps.search.podcasts.player.p10593b.C140775c;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.z */
/* compiled from: PG */
final class C140847z extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C140806an f382474a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140847z(C140806an anVar) {
        super(0);
        this.f382474a = anVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        C140806an anVar = this.f382474a;
        C140775c cVar = anVar.f382369g;
        C140846y yVar = new C140846y(anVar);
        Executor executor = (Executor) cVar.f382258a.mo17428b();
        executor.getClass();
        return new C140774b(executor, yVar);
    }
}
