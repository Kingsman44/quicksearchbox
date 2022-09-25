package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.p10415i.C137509k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61366ah;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bj */
/* compiled from: PG */
public final /* synthetic */ class C138435bj implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138445bt f376559a;

    public /* synthetic */ C138435bj(C138445bt btVar) {
        this.f376559a = btVar;
    }

    public final C60870cx apply(Object obj) {
        C138445bt btVar = this.f376559a;
        int i = ((C61366ah) obj).f165947c;
        if (i >= 200 && i <= 299) {
            return btVar.mo114249b();
        }
        C137509k kVar = new C137509k(i);
        if (i != 401) {
            return C60856cj.m92899h(kVar);
        }
        return C47638k.m84751b(btVar.f376581d.mo51024a(btVar.f376580c)).mo51520a(C47810es.m84978r(new C138433bh(kVar)), btVar.f376583f);
    }
}
