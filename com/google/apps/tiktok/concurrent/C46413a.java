package com.google.apps.tiktok.concurrent;

/* renamed from: com.google.apps.tiktok.concurrent.a */
/* compiled from: PG */
public final /* synthetic */ class C46413a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46429b f121468a;

    /* renamed from: b */
    public final /* synthetic */ int f121469b;

    public /* synthetic */ C46413a(C46429b bVar, int i) {
        this.f121468a = bVar;
        this.f121469b = i;
    }

    public final void run() {
        this.f121468a.stopSelf(this.f121469b);
    }
}
