package com.google.android.libraries.search.location;

import com.google.android.gms.location.C144889at;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.libraries.search.location.h */
/* compiled from: PG */
public final /* synthetic */ class C38702h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C38712r f102193a;

    /* renamed from: b */
    public final /* synthetic */ C144889at f102194b;

    public /* synthetic */ C38702h(C38712r rVar, C144889at atVar) {
        this.f102193a = rVar;
        this.f102194b = atVar;
    }

    public final void run() {
        C38712r rVar = this.f102193a;
        rVar.f102226f.execute(C47810es.m84977q(new C38706l(rVar, this.f102194b)));
    }
}
