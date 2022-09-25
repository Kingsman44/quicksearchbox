package com.google.android.libraries.search.assistant.p2511d;

/* renamed from: com.google.android.libraries.search.assistant.d.ab */
/* compiled from: PG */
public final /* synthetic */ class C32527ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32534ai f87130a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f87131b;

    public /* synthetic */ C32527ab(C32534ai aiVar, Throwable th) {
        this.f87130a = aiVar;
        this.f87131b = th;
    }

    public final void run() {
        C32534ai aiVar = this.f87130a;
        Throwable th = this.f87131b;
        if (!aiVar.f87144d) {
            aiVar.f87144d = true;
            aiVar.f87145e = th;
            aiVar.f87142b.mo38141b();
        }
    }
}
