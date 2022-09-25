package com.google.android.libraries.search.location;

import com.google.android.gms.location.C144889at;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;

/* renamed from: com.google.android.libraries.search.location.i */
/* compiled from: PG */
public final /* synthetic */ class C38703i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C38712r f102195a;

    /* renamed from: b */
    public final /* synthetic */ C144889at f102196b;

    /* renamed from: c */
    public final /* synthetic */ C39226b f102197c;

    public /* synthetic */ C38703i(C38712r rVar, C144889at atVar, C39226b bVar) {
        this.f102195a = rVar;
        this.f102196b = atVar;
        this.f102197c = bVar;
    }

    public final void run() {
        C38712r rVar = this.f102195a;
        C144889at atVar = this.f102196b;
        C39226b bVar = this.f102197c;
        if (rVar.f102225e.containsKey(atVar)) {
            rVar.f102221a.ifPresent(new C38704j(rVar, atVar, bVar));
        }
    }
}
