package com.google.android.libraries.gsa.conversation.p1837a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.a.e */
/* compiled from: PG */
final class C22324e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C22326g f61645a;

    /* renamed from: b */
    final /* synthetic */ C22329j f61646b;

    public C22324e(C22329j jVar, C22326g gVar) {
        this.f61646b = jVar;
        this.f61645a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C22329j jVar = this.f61646b;
        C60870cx a = this.f61645a.mo27552a(C58833ax.m90834k(th));
        String valueOf = String.valueOf(this.f61645a.f61648a.mo27546a());
        C60856cj.m92911t(a, C47810es.m84974n(new C22325f("Failed to stop Audio " + valueOf + " request")), jVar.f61653b);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C58976aa aaVar = C58975e.f156826a;
        this.f61645a.f61648a.mo27546a();
        this.f61645a.f61649b.mo27554b();
    }
}
