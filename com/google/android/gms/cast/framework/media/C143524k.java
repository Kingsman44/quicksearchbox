package com.google.android.gms.cast.framework.media;

/* renamed from: com.google.android.gms.cast.framework.media.k */
/* compiled from: PG */
public final /* synthetic */ class C143524k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143528o f389178a;

    /* renamed from: b */
    public final /* synthetic */ int f389179b;

    public /* synthetic */ C143524k(C143528o oVar, int i) {
        this.f389178a = oVar;
        this.f389179b = i;
    }

    public final void run() {
        this.f389178a.stopSelf(this.f389179b);
    }
}
