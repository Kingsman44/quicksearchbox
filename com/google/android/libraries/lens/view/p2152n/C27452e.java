package com.google.android.libraries.lens.view.p2152n;

/* renamed from: com.google.android.libraries.lens.view.n.e */
/* compiled from: PG */
public final /* synthetic */ class C27452e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27456i f75102a;

    /* renamed from: b */
    public final /* synthetic */ long f75103b;

    public /* synthetic */ C27452e(C27456i iVar, long j) {
        this.f75102a = iVar;
        this.f75103b = j;
    }

    public final void run() {
        C27456i iVar = this.f75102a;
        iVar.mo32989d("selected_frames_timestamp.txt", Long.toString(iVar.mo32987a(this.f75103b)));
    }
}
