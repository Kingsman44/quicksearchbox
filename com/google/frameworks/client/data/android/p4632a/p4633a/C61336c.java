package com.google.frameworks.client.data.android.p4632a.p4633a;

/* renamed from: com.google.frameworks.client.data.android.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C61336c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61338e f165872a;

    /* renamed from: b */
    public final /* synthetic */ C61337d f165873b;

    public /* synthetic */ C61336c(C61338e eVar, C61337d dVar) {
        this.f165872a = eVar;
        this.f165873b = dVar;
    }

    public final void run() {
        C61338e eVar = this.f165872a;
        C61337d dVar = this.f165873b;
        synchronized (eVar.f165878d) {
            eVar.f165878d.remove(dVar);
        }
    }
}
