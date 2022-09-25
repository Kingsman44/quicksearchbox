package com.google.android.libraries.search.location;

import com.google.android.gms.location.C144889at;

/* renamed from: com.google.android.libraries.search.location.l */
/* compiled from: PG */
public final /* synthetic */ class C38706l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C38712r f102203a;

    /* renamed from: b */
    public final /* synthetic */ C144889at f102204b;

    public /* synthetic */ C38706l(C38712r rVar, C144889at atVar) {
        this.f102203a = rVar;
        this.f102204b = atVar;
    }

    public final void run() {
        C38712r rVar = this.f102203a;
        C144889at atVar = this.f102204b;
        if (rVar.f102225e.containsKey(atVar)) {
            rVar.f102221a.ifPresent(new C38705k(rVar, atVar));
            rVar.f102225e.remove(atVar);
        }
    }
}
