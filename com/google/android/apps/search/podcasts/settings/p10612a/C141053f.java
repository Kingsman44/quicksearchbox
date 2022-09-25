package com.google.android.apps.search.podcasts.settings.p10612a;

import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54315as;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.a.f */
/* compiled from: PG */
final class C141053f implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C141057j f382953a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f382954b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f382955c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f382956d;

    public C141053f(C141057j jVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f382953a = jVar;
        this.f382954b = cxVar;
        this.f382955c = cxVar2;
        this.f382956d = cxVar3;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C141057j jVar = this.f382953a;
        Object r = C60856cj.m92909r(this.f382954b);
        C69664n.m101060f(r, "getDone(preferenceFuture)");
        Object r2 = C60856cj.m92909r(this.f382955c);
        C69664n.m101060f(r2, "getDone(subscriptionItemsFuture)");
        Object r3 = C60856cj.m92909r(this.f382956d);
        C69664n.m101060f(r3, "getDone(accountNameFuture)");
        return jVar.mo116114a((C54315as) obj, (C140450al) r, (List) r2, (String) r3);
    }
}
