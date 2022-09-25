package com.google.android.apps.search.podcasts.settings.p10612a;

import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54315as;
import java.util.List;
import java.util.concurrent.Callable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.a.g */
/* compiled from: PG */
final class C141054g implements Callable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f382957a;

    /* renamed from: b */
    final /* synthetic */ C141057j f382958b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f382959c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f382960d;

    /* renamed from: e */
    final /* synthetic */ C60870cx f382961e;

    public C141054g(C60870cx cxVar, C141057j jVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4) {
        this.f382957a = cxVar;
        this.f382958b = jVar;
        this.f382959c = cxVar2;
        this.f382960d = cxVar3;
        this.f382961e = cxVar4;
    }

    public final /* synthetic */ Object call() {
        C46688af afVar = (C46688af) C60856cj.m92909r(this.f382957a);
        if (afVar != null) {
            return afVar.mo50737d(new C141053f(this.f382958b, this.f382959c, this.f382960d, this.f382961e));
        }
        C141057j jVar = this.f382958b;
        Object r = C60856cj.m92909r(this.f382959c);
        C69664n.m101060f(r, "getDone(preferenceFuture)");
        Object r2 = C60856cj.m92909r(this.f382960d);
        C69664n.m101060f(r2, "getDone(subscriptionItemsFuture)");
        Object r3 = C60856cj.m92909r(this.f382961e);
        C69664n.m101060f(r3, "getDone(accountNameFuture)");
        return C46688af.m83205b(jVar.mo116114a((C54315as) null, (C140450al) r, (List) r2, (String) r3), this.f382958b.f382968e.mo26870b());
    }
}
