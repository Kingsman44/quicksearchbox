package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abm */
final /* synthetic */ class abm implements Runnable {

    /* renamed from: a */
    private final abn f20203a;

    /* renamed from: b */
    private final int f20204b;

    /* renamed from: c */
    private final long f20205c;

    /* renamed from: d */
    private final long f20206d;

    public abm(abn abn, int i, long j, long j2) {
        this.f20203a = abn;
        this.f20204b = i;
        this.f20205c = j;
        this.f20206d = j2;
    }

    public final void run() {
        abn abn = this.f20203a;
        abn.f20208b.mo14397N(this.f20204b, this.f20205c, this.f20206d);
    }
}
