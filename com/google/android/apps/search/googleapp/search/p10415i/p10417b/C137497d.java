package com.google.android.apps.search.googleapp.search.p10415i.p10417b;

import com.google.android.gms.droidguard.C144112b;

/* renamed from: com.google.android.apps.search.googleapp.search.i.b.d */
/* compiled from: PG */
public final /* synthetic */ class C137497d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C137500g f373970a;

    public /* synthetic */ C137497d(C137500g gVar) {
        this.f373970a = gVar;
    }

    public final void run() {
        C137500g gVar = this.f373970a;
        synchronized (gVar.f373985l) {
            C144112b bVar = gVar.f373987n;
            if (bVar != null) {
                bVar.close();
                gVar.f373987n = null;
            }
            gVar.f373986m = null;
        }
    }
}
