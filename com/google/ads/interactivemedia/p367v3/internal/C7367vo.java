package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vo */
/* compiled from: PG */
public abstract class C7367vo extends C7382wc {

    /* renamed from: a */
    public final long f24064a;

    /* renamed from: b */
    public final long f24065b;

    /* renamed from: m */
    private C7369vq f24066m;

    /* renamed from: n */
    private int[] f24067n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7367vo(abx abx, acb acb, C6864cy cyVar, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(abx, acb, cyVar, i, obj, j, j2, j5);
        this.f24064a = j3;
        this.f24065b = j4;
    }

    /* renamed from: a */
    public final void mo16670a(C7369vq vqVar) {
        this.f24066m = vqVar;
        this.f24067n = vqVar.mo16673a();
    }

    /* renamed from: d */
    public final int mo16671d(int i) {
        return ((int[]) ary.m19466s(this.f24067n))[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C7369vq mo16672e() {
        C7369vq vqVar = this.f24066m;
        ary.m19466s(vqVar);
        return vqVar;
    }
}
