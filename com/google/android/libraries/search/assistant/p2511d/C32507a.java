package com.google.android.libraries.search.assistant.p2511d;

/* renamed from: com.google.android.libraries.search.assistant.d.a */
/* compiled from: PG */
public final /* synthetic */ class C32507a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32541d f87082a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f87083b;

    public /* synthetic */ C32507a(C32541d dVar, Runnable runnable) {
        this.f87082a = dVar;
        this.f87083b = runnable;
    }

    public final void run() {
        C32541d dVar = this.f87082a;
        dVar.f87158a.remove(this.f87083b);
    }
}
