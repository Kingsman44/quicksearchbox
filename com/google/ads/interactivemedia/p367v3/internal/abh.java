package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abh */
/* compiled from: PG */
final class abh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ abi f20188a;

    /* renamed from: b */
    private float f20189b;

    /* renamed from: c */
    private float f20190c;

    /* renamed from: d */
    private boolean f20191d;

    /* renamed from: e */
    private boolean f20192e;

    public /* synthetic */ abh(abi abi) {
        this.f20188a = abi;
    }

    /* renamed from: a */
    public final void mo14384a(float f, float f2, boolean z) {
        this.f20189b = f;
        this.f20190c = f2;
        this.f20191d = z;
        if (!this.f20192e) {
            this.f20192e = true;
            this.f20188a.post(this);
        }
    }

    public final void run() {
        this.f20192e = false;
    }
}
