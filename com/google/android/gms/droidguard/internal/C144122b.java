package com.google.android.gms.droidguard.internal;

/* renamed from: com.google.android.gms.droidguard.internal.b */
/* compiled from: PG */
public final /* synthetic */ class C144122b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C144128h f390405a;

    /* renamed from: b */
    public final /* synthetic */ C144133m f390406b;

    /* renamed from: c */
    public final /* synthetic */ long f390407c;

    public /* synthetic */ C144122b(C144128h hVar, C144133m mVar, long j) {
        this.f390405a = hVar;
        this.f390406b = mVar;
        this.f390407c = j;
    }

    public final void run() {
        C144128h hVar = this.f390405a;
        C144133m mVar = this.f390406b;
        long j = this.f390407c;
        C144135o oVar = hVar.f390425a;
        mVar.mo119680c(new C144132l(oVar, "getResults init timeout: " + j + " ms", mVar.f390438f));
    }
}
