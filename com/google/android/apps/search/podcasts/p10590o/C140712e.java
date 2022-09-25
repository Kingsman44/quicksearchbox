package com.google.android.apps.search.podcasts.p10590o;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58839bc;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.podcasts.o.e */
/* compiled from: PG */
public final /* synthetic */ class C140712e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140725r f382127a;

    /* renamed from: b */
    public final /* synthetic */ C58839bc f382128b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f382129c;

    public /* synthetic */ C140712e(C140725r rVar, C58839bc bcVar, Runnable runnable) {
        this.f382127a = rVar;
        this.f382128b = bcVar;
        this.f382129c = runnable;
    }

    public final C60870cx apply(Object obj) {
        C140725r rVar = this.f382127a;
        C58839bc bcVar = this.f382128b;
        Runnable runnable = this.f382129c;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92898g();
        }
        C60870cx d = rVar.f382150b.mo46042d();
        return C47633f.m84733g(d).mo51516i(new C140717j(rVar, bcVar), C60826bg.f164896a).mo51516i(new C140718k(rVar), C60826bg.f164896a).mo51516i(new C140719l(rVar, d), rVar.f382152d).mo51515h(new C140720m(runnable), rVar.f382152d);
    }
}
