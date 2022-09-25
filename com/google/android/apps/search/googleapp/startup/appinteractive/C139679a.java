package com.google.android.apps.search.googleapp.startup.appinteractive;

/* renamed from: com.google.android.apps.search.googleapp.startup.appinteractive.a */
/* compiled from: PG */
public final /* synthetic */ class C139679a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C139680b f379665a;

    /* renamed from: b */
    public final /* synthetic */ C139682d f379666b;

    public /* synthetic */ C139679a(C139680b bVar, C139682d dVar) {
        this.f379665a = bVar;
        this.f379666b = dVar;
    }

    public final void run() {
        C139680b bVar = this.f379665a;
        C139682d dVar = this.f379666b;
        if (bVar.f379668b.contains(dVar)) {
            dVar.mo115165a();
            bVar.f379668b.remove(dVar);
            bVar.f379669c.remove(dVar);
        }
    }
}
